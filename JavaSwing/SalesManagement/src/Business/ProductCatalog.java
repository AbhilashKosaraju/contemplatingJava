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
public class ProductCatalog {

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ArrayList<Product> productCatalog) {
        this.productCatalog = productCatalog;
    }
    
    private ArrayList<Product> productCatalog;
    
    ProductCatalog()
    {
        productCatalog = new ArrayList<Product>();
    }
    
    public Product addProduct()
    {
        Product p = new Product();
        productCatalog.add(p);
        return p;
    }
    public void deleteProduct(Product p)
    {
        productCatalog.remove(p);
    }
}
