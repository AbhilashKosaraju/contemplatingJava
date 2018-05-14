/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author AbhilashKosaraju
 */
public class MarketOffer {

    private Market targetMarket;
    private Product product;
    private double targetPriceMargin;
    private double maxPriceMargin;
    private int basePrice;

    public MarketOffer() {
        targetMarket = new Market();
        product = new Product();
    }

    public Market getTargetMarket() {
        return targetMarket;
    }

    public void setTargetMarket(Market targetMarket) {
        this.targetMarket = targetMarket;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getTargetPriceMargin() {
        return targetPriceMargin;
    }

    public void setTargetPriceMargin(double targetPriceMargin) {
        this.targetPriceMargin = targetPriceMargin;
    }

    public double getMaxPriceMargin() {
        return maxPriceMargin;
    }

    public void setMaxPriceMargin(double maxPriceMargin) {
        this.maxPriceMargin = maxPriceMargin;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public double getMaxPrice() {
        return maxPriceMargin * basePrice;
    }

    public double getTargetPrice() {
        return targetPriceMargin * basePrice;
    }

}
