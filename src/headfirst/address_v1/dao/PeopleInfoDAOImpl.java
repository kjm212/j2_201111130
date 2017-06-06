package headfirst.address_v1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import headfirst.address_v1.entity.PeopleInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PeopleInfoDAOImpl implements PeopleInfoDAO {
  Connection conn=ConnectionFactory.getConnection();
  PreparedStatement pstmt=null;
  Statement stmt = null;
  ResultSet rs=null;
  private ArrayList<PeopleInfo> peoples;
  private static PeopleInfoDAOImpl instance;
  
  public static synchronized PeopleInfoDAOImpl getInstance(){
    if(instance == null){
      instance = new PeopleInfoDAOImpl();
    }
    return instance;
  }
  
  public void initPeople(){
    try {
      peoples = new ArrayList<PeopleInfo>();
      stmt = conn.createStatement();
      String sql;
      sql = "SELECT * FROM PEOPLE";
      rs = stmt.executeQuery(sql);
      
      while(rs.next()){
        peoples.add(new PeopleInfo(rs.getString("name"),rs.getString("phone"),rs.getString("address")));
        System.out.println(rs.getString("name")+"*"+rs.getString("phone")+"*"+rs.getString("address"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
  public ArrayList<PeopleInfo> getPeoples(){
    return this.peoples;
  }
  
  public void insert(PeopleInfo person) {
    try {
      pstmt = conn.prepareStatement("INSERT INTO people(name,phone,address) VALUES(?,?,?)");
      pstmt.setString(1, person.getName());
      pstmt.setString(2, person.getPhone());
      pstmt.setString(3,  person.getAddress());
      System.out.println("* inserting..."+person.getName()+person.getPhone()+person.getAddress());
      pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
  public void update(PeopleInfo person) {
    try {
      pstmt = conn.prepareStatement("UPDATE people SET name=?,phone=?,address=? WHERE name=?"); 
      pstmt.setString(1, person.getName());
      pstmt.setString(2, person.getPhone());
      pstmt.setString(3, person.getAddress());
      pstmt.setString(4, person.getName());
      System.out.println("* updating..."+person.getName());
      pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  public void delete(String name) {
    try {
      pstmt = conn.prepareStatement("DELETE FROM people WHERE name=?");
      pstmt.setString(1, name);
      int rows=pstmt.executeUpdate();
      if (rows == 0) {  
        System.out.println("!can not delete..."+name+" does not exist!");
      } else if (rows > 0) {  
        System.out.println("* deleting..."+name);
      } 
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
  public void close() {
    System.out.println("* closing all...");
    try {
      if (rs != null) rs.close();
      if (pstmt != null) pstmt.close();
      if (conn != null) conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}