package com.sd.dao.v2;

import java.util.List;
import java.util.Iterator;

public class DaoMainV2 {
    public static void main(String args[]){
        PersonDaoImpl personDaoImpl = new PersonDaoImpl();
        PersonVO person = new PersonVO();
        
        person.setName("js1");
        person.setAddress("1 Hongji-dong");
        personDaoImpl.insert(person);

        person.setName("js2");
        person.setAddress("2 Hongji-dong");
        personDaoImpl.insert(person);

        List persons=personDaoImpl.findAll();
        Iterator iter=persons.iterator();
        
        while(iter.hasNext()) {
            person=(PersonVO)iter.next();
            System.out.println(person.toString());
        }

        personDaoImpl.delete(person);

        person.setId(2);
        person.setName("js2 updated");
        person.setAddress("2 Hongji-dong updated");
        personDaoImpl.update(person);

        person=personDaoImpl.findById(2);
        System.out.println("found by id..."+person);

        personDaoImpl.close();
    }
}