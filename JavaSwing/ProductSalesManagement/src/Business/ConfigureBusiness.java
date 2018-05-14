/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import UtilityServices.Utility;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author AbhilashKosaraju
 */
public class ConfigureBusiness {

    private UserDirectory userDirectory;
    private PersonDirectory personDirectory;
    private SupplierDirectory supplierDirectory;
    private MarketOfferCatalog marketOfferCatalog;
    private MarketList marketList;

    public ConfigureBusiness() {
        this.userDirectory = new UserDirectory();
        this.personDirectory = new PersonDirectory();
        this.supplierDirectory = new SupplierDirectory();
        this.marketOfferCatalog = new MarketOfferCatalog();
        this.marketList = new MarketList();

        ProductCatalog pc = new ProductCatalog();
        String csvFile = "person_HW6Data.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {
            System.out.println("---------------------------------------Populating Objects--------------------------------------------\n");
            br = new BufferedReader(new FileReader(csvFile));
            int section = 0, flag = 0, sflag = 0, sflag2 = 0;
            while ((line = br.readLine()) != null) {
                String[] csvElement = line.split(cvsSplitBy);

                if (csvElement[0].equals("CSV1")) {
                    section = 1;
                    continue;
                }
                if (csvElement[0].equals("CSV2")) {
                    section = 2;
                    continue;
                }
                if (csvElement[0].equals("CSV3")) {
                    section = 3;
                    continue;
                }
                if (csvElement[0].equals("CSV4")) {
                    section = 4;
                    continue;
                }
                switch (section) {
                    case 1:
                        Person person = personDirectory.addPerson();
                        person.setFirstName(csvElement[0]);
                        person.setLastName(csvElement[1]);
                        person.setAddress(csvElement[2]);
                        break;
                    case 2:
                        User user = userDirectory.addUser();
                        user.setUserName(csvElement[0]);
                        user.setDepartment(csvElement[1]);
                        user.setRole(csvElement[2]);
                        user.setPass(Utility.getHash(csvElement[3]));
                        user.setActive(true);
                        break;
                    case 3: {
                        Supplier s = supplierDirectory.addSupplier();
                        s.setSupplyName(csvElement[0]);
                        break;
                    }
                    case 4: {
                        if (csvElement[2].equals("matrix") && sflag2 == 0) {
                            flag = 0;
                            sflag = 1;
                            sflag2 = 1;
                        }
                        if (flag == 0) {
                            pc = new ProductCatalog();
                            supplierDirectory.getSupplierlist().get(sflag).setProductCatalog(pc);
                            flag = 1;
                        }
                        Product p = supplierDirectory.getSupplierlist().get(sflag).getProductCatalog().addProduct();
                        p.setProdName(csvElement[0]);
                        p.setPrice(Integer.parseInt(csvElement[1]));
                        break;
                    }
                    default:
                        break;
                }
            }
            int i = 0;
            for (User u : userDirectory.getUserDirectory()) {
                u.setPerson(personDirectory.getPersonDirectory().get(i));
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

}
