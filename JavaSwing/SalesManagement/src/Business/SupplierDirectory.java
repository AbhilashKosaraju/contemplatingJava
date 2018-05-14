/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author sowjanya
 */
public class SupplierDirectory {
    
    public static ArrayList<Supplier>supplierDirectory;
    
    SupplierDirectory()
    {
        supplierDirectory = new ArrayList<Supplier>();
                
    }
    
    public Supplier addSupplier()
    {
        Supplier s = new Supplier();
        supplierDirectory.add(s);
        return s;
    }
    public void deleteSupplier(Supplier s )
    {
        supplierDirectory.remove(s);
    }
    
}
