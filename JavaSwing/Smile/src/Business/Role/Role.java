/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Sudeep
 */
public abstract class Role {

    public enum RoleType {

        AdminRole("Admin Role"), // Individual Enterprise Admin
        CompanyAdminRole("Company Admin Role"), // Company Enterprise Admin
        UniversityAdminRole("University Admin Role"), // University Enterprise Admin
        NGOAdminRole("NGO Admin Role"), // NGO Enterprise Admin
         
        MemberOrganizationAdminRole("Member Admin Role"), // Member Organization Admin
        TeamEventOrganizationAdminRole("Team Event Admin Role"), // TeamEvent Initiative Organization Admin
        
        MemberRole("Member"), // Member Role        
        EventCreatorRole("Event Creator Role"),  // Event Creator Role
        CompanyMemberRole("Company Member Role");// Company Member Role
        
        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }

    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
