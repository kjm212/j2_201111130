package com.sd.dao.v1;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
    List<Person> persons;
    
    public PersonDaoImpl() {
        persons = new ArrayList<Person>();        
    }

    public void insertPerson(Person p){
      persons.add(p);
    }
    
    public List<Person> getAllPersons(){
      return persons;
    }
    
    public Person getPerson(int id){
      return persons.get(id);
    }
    
    public void updatePerson(Person p){
      persons.get(p.getId()).setName(p.getName());
    }
    
    public void deletePerson(int id){
      persons.remove(id);
    }
    
    public void deletePerson(Person p){
      persons.remove(p.getId());
    }
}