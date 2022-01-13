package com.greatlearning.stockers.model;

public class Stock {

	private double stockPrice;
	private boolean hasIncreased;

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public boolean isHasIncreased() {
		return hasIncreased;
	}

	public void setHasIncreased(boolean hasIncreased) {
		this.hasIncreased = hasIncreased;
	}

	public Stock(double stockPrice, boolean hasIncreased) {
		this.stockPrice = stockPrice;
		this.hasIncreased = hasIncreased;
	}

}
