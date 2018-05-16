/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Sudeep
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Member.getValue())){
            organization = new MemberOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.TeamInitiative.getValue())){
          organization = new TeamInitiativeOrganization();
            organizationList.add(organization);  
        }
        else if (type.getValue().equals(Organization.Type.CompanyMember.getValue())){
          organization = new CompanyMemberOrganization();
            organizationList.add(organization);  
        }
        
        return organization;
    }
}
