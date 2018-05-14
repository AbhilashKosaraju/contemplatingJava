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
public class MarketOfferCatalog {
    
    private ArrayList<MarketOffer> marketOfferCatalog;
    
    public MarketOfferCatalog()
    {
        marketOfferCatalog = new ArrayList<MarketOffer>();
        
    }
    
    public MarketOffer addMarketOffer()
    {
        MarketOffer mo = new MarketOffer();
        marketOfferCatalog.add(mo);
        return mo;
    }
    
    public void deleteMarketOffer(MarketOffer mo)
    {
        marketOfferCatalog.remove(mo);
    }
    
}
