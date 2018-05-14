/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author AbhilashKosaraju
 */
public class Person {

    private int personId;
    private String firstName;
    private String lastName;
    private String Address;
    private int actionFlag;

    public Person(int count) {
        this.personId = count + 1;
    }

    public int getPersonId() {
        return personId;
    }

    public void setActionFlag(int ActionFlag) {
        this.actionFlag = ActionFlag;
    }

    public int getActionFlag() {
        return actionFlag;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return this.firstName;
    }

}
