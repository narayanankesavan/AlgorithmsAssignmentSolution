package com.greatlearning.assignment2.stocks.model;

/**
 * @author narayanan.kesavan Stocks: Pojo class for Stock price
 */
public class Stocks {

	private Double stockPrice;
	private Boolean priceRose;

	public Double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(Double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public Boolean getPriceRose() {
		return priceRose;
	}

	public void setPriceRose(Boolean priceRose) {
		this.priceRose = priceRose;
	}
}
