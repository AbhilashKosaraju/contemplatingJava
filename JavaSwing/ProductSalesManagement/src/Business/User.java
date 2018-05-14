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
public class User {

    private int userId;
    private String userName;
    private String pass;
    private String department;
    private String Role;
    private boolean Active;
    private Person person;
    private int actionFlag;
    private static int count = 0;

    public User() {
        count++;
        this.userId = count;
    }

    public void setActionFlag(int ActionFlag) {
        this.actionFlag = ActionFlag;
    }

    public int getActionFlag() {
        return actionFlag;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean Active) {
        this.Active = Active;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return this.userName;
    }
}
