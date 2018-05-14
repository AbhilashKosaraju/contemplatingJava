/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


public class ConfigureABusiness {
    
    public static Business Initialise(String s){
        Business b = new Business(s);
        
        ProductCatalog pc = b.getProductCatalog();
        Product p = pc.addProduct();
        p.setName("Laptops");
        
        MarketList ml = b.getMarketList();
        Market m = ml.addMarketList();
        m.setMarketName("NorthEastern Student Market");
        
        MarketOfferCatalog moc = b.getMarketOfferCatalog();
        MarketOffer mo = moc.addMarketOffer();
        mo.setMarketOffer("Fall Student Offer");
        
        
        SupplierDirectory spd = b.getSupplierDirectory();
        Supplier ss = spd.addSupplier();
        ss.setName("Walmart");
        
        
    return b;
    }
    
    
}
