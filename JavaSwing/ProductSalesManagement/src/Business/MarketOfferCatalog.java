/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author AbhilashKosaraju
 */
public class MarketOfferCatalog {

    private ArrayList<MarketOffer> marketOfferCatalog;

    public MarketOfferCatalog() {
        marketOfferCatalog = new ArrayList<>();
    }

    public ArrayList<MarketOffer> getMarketOfferCatalog() {
        return marketOfferCatalog;
    }

    public void setMarketOfferCatalog(ArrayList<MarketOffer> marketOfferCatalog) {
        this.marketOfferCatalog = marketOfferCatalog;
    }

    public MarketOffer addMarketOffer() {
        MarketOffer o = new MarketOffer();
        marketOfferCatalog.add(o);
        return o;
    }

    public void removeProduct(MarketOffer o) {
        marketOfferCatalog.remove(o);
    }
}
