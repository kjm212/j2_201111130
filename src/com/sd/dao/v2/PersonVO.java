package com.sd.dao.v2;

public class PersonVO{
    private int id;
    private String name;
    private String address;
   
    public PersonVO(){}
    
    public PersonVO(int id, String name){
        this.id=id;
        this.name=name;
    }
    
    public void setAddress(String address){
      this.address = address;
    }
    
    public String getAddress(){
      return address;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    
    public String toString(){
      return "id = " + id + " name = " + name + " address = " + address;
    }
}