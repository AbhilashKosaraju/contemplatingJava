/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;


public class MarketList {
    
    private ArrayList<Market> marketList;
    
    MarketList(){
        marketList = new ArrayList<Market>();
    }

    public ArrayList<Market> getMarketList() {
        return marketList;
    }

    public void setMarketList(ArrayList<Market> marketList) {
        this.marketList = marketList;
    }
    
    public Market addMarketList(){
        
        Market m = new Market();
        marketList.add(m);
        return m;
        
    }
    
    public void deleteMarket(Market m) {
     
       marketList.remove(m);
    }
    
}
