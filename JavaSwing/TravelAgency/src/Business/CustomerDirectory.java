package Business;

import Business.Customer;
import java.util.ArrayList;

/**
 *
 * @author AbhilashKosaraju
 */
public class CustomerDirectory {

    private static ArrayList<Customer> Directory;
    private static ArrayList<Customer> UserDirectory;

    public static ArrayList<Customer> getUserDirectory() {
        return UserDirectory;
    }

    public static void setUserDirectory(ArrayList<Customer> UserDirectory) {
        CustomerDirectory.UserDirectory = UserDirectory;
    }

    public CustomerDirectory() {
        Directory = new ArrayList<Customer>();
    }

    public static Customer addCustomers() {
        Customer cus = new Customer();
        Directory.add(cus);
        return cus;
    }

    public static ArrayList<Customer> getDirectory() {
        return Directory;
    }

    public static void setDirectory(ArrayList<Customer> Directory) {
        CustomerDirectory.Directory = Directory;
    }
}
