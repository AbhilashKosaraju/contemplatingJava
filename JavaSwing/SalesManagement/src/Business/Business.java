/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.ProductCatalog;
import Business.SupplierDirectory;
import Business.MarketOfferCatalog;
import Business.MarketList;

public class Business {
    
    private String name; 
    private ProductCatalog productCatalog;
    private SupplierDirectory supplierDirectory;
    private MarketOfferCatalog marketOfferCatalog;
    private MarketList marketList;
    
    public Business(String s)
    {
        this.name = name;
        productCatalog = new ProductCatalog();
        supplierDirectory = new SupplierDirectory();
        marketOfferCatalog = new MarketOfferCatalog();
        marketList = new MarketList();
              
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public MarketOfferCatalog getMarketOfferCatalog() {
        return marketOfferCatalog;
    }

    public void setMarketOfferCatalog(MarketOfferCatalog marketOfferCatalog) {
        this.marketOfferCatalog = marketOfferCatalog;
    }

    public MarketList getMarketList() {
        return marketList;
    }

    public void setMarketList(MarketList marketList) {
        this.marketList = marketList;
    }
}
