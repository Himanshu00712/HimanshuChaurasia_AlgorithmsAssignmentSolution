package com.greatlearning.stockers.service;

import java.util.Arrays;
import java.util.Comparator;

import com.greatlearning.stockers.model.Stock;

public class StockProcessorService {

	private static Stock[] stocks;
	private static AscComparator ascComparator;
	private static DscComparator dscComparator;

	public StockProcessorService(Stock[] stocks) {
		this.stocks = stocks;
		this.ascComparator = new AscComparator();
		this.dscComparator = new DscComparator();
	}

	static class AscComparator implements Comparator<Stock> {

		@Override
		public int compare(Stock o1, Stock o2) {
			return (int) (o1.getStockPrice() - o2.getStockPrice());
		}
	}

	static class DscComparator implements Comparator<Stock> {

		@Override
		public int compare(Stock o1, Stock o2) {
			return (int) (o2.getStockPrice() - o1.getStockPrice());
		}
	}

	public static Stock[] getStocksByAscendingOrder() {
		Stock[] ascStocks = stocks;
		Arrays.sort(ascStocks, ascComparator);

		return ascStocks;
	}

	public static Stock[] getStocksByDescendingOrder() {
		Stock[] dscStocks = stocks;
		Arrays.sort(dscStocks, dscComparator);

		return dscStocks;
	}

	public static int numberOfCompaniesStockRose() {
		int count = 0;
		for (Stock stock : stocks) {
			if (stock.isHasIncreased())
				count++;
		}
		return count;
	}

	public static int numOfCompaniesStockDecreased() {
		int count = 0;
		for (Stock stock : stocks) {
			if (!stock.isHasIncreased())
				count++;
		}
		return count;
	}

	public static boolean searchForAStock(double stockPrice) {
		int len = stocks.length;
		for(int i=0; i<len; i++)
		{
			if(stocks[i].getStockPrice() == stockPrice)
				return true;
		}
		return false;
	}

}
