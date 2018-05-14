/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AbhilashKosaraju
 */
public class MarketList {

    private List<Market> marketList;

    public MarketList() {
        marketList = new ArrayList<>();
    }

    public List<Market> getMarketList() {
        return marketList;
    }

    public void setMarketList(List<Market> marketList) {
        this.marketList = marketList;
    }

    public Market addMarket() {
        Market o = new Market();
        marketList.add(o);
        return o;
    }

    public void removeProduct(Market o) {
        marketList.remove(o);
    }
}
