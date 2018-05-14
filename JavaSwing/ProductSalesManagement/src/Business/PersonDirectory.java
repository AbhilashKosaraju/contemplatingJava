/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author AbhilashKosaraju
 */
public class PersonDirectory {

    private ArrayList<Person> personDirectory;

    public PersonDirectory() {
        personDirectory = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public Person addPerson() {
        Person person = new Person(personDirectory.size());
        personDirectory.add(person);
        return person;
    }

}
