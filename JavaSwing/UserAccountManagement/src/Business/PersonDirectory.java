/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person;
import java.util.ArrayList;

public class PersonDirectory {

    private ArrayList<Person> personDirectory;

    public PersonDirectory() {
        personDirectory = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public Person addPerson() {
        Person p = new Person();
        personDirectory.add(p);
        return p;
    }

    public void deletePerson(Person P) {
        personDirectory.remove(P);
    }

    public Person searchPerson(String Id) {
        for (Person p : personDirectory) {
            if (p.getUserName().toLowerCase().equals(Id)) {
                return p;
            }
        }
        return null;
    }

}
