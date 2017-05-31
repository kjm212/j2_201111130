package com.sd.dao.v1;

public class DaoMainV1 {
   public static void main(String[] args) {
      PersonDao personDao = new PersonDaoImpl();
   
     for (Person person:personDao.getAllPersons()) {
         System.out.println("reading... "+person.getId() +", "+person.getName());
      }

      Person person =personDao.getAllPersons().get(0);
      person.setName("js new");
      personDao.updatePerson(person);

      personDao.getPerson(0);
      System.out.println(person.getId() +", "+person.getName());
   }
}