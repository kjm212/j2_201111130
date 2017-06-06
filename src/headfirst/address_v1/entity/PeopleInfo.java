package headfirst.address_v1.entity;

public class PeopleInfo {
  private String name;
  private String phone;
  private String address;
  
  public PeopleInfo(){}
  
  public PeopleInfo(String name, String phone, String address){
    this.name = name;
    this.phone = phone;
    this.address = address;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public void setPhone(String phone){
    this.phone = phone;
  }
  
  public void setAddress(String address){
    this.address = address;
  }
  
  public String getName(){
    return this.name;
  }
  
  public String getPhone(){
    return this.phone;
  }
  
  public String getAddress(){
    return this.address;
  }
}
