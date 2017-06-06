package headfirst.address_v1.dao;

import java.util.List;
import java.util.ArrayList;
import headfirst.address_v1.entity.PeopleInfo;

public interface PeopleInfoDAO {
  public void initPeople();
  public void insert(PeopleInfo person);
  public void update(PeopleInfo person);
  public void delete(String name);
  public ArrayList<PeopleInfo> getPeoples();
}
