package com.greatlearning.stockers.utility;

import java.util.Scanner;

import com.greatlearning.stockers.model.Stock;
import com.greatlearning.stockers.service.StockProcessorService;

public class HelperUtility {

	private final Scanner scanner = new Scanner(System.in);

	public void selectOptionUtil(StockProcessorService stockProcessorService, int option) {
		switch (option) {
		case 1:
			System.out.println("Stock prices in ascending order are :");
			displayStocks(StockProcessorService.getStocksByAscendingOrder());
			break;

		case 2: {
			System.out.println("Stock prices in descending order are :");
			displayStocks(StockProcessorService.getStocksByDescendingOrder());
			break;
		}

		case 3: {
			int count = StockProcessorService.numberOfCompaniesStockRose();
			System.out.println("Total no of companies whose stock price rose today : "+count);
			break;
		}

		case 4: {
			int count = StockProcessorService.numOfCompaniesStockDecreased();
			System.out.println("Total no of companies whose stock price declined today : "+String.valueOf(count));
			break;
		}
		case 5: {
			System.out.println("enter the key value");
			double stockPrice = scanner.nextDouble();
			boolean isPresent = StockProcessorService.searchForAStock(stockPrice);
			String message = "Stock of value " + stockPrice;
			if (isPresent) {
				message += " is present";
			} else {
				message += " is not present";
			}
			System.out.println(message);
			break;
		}
		default :{
			System.out.println("Please select the correct choice");
			break;
		}
		}

	}

	public void displayStocks(Stock[] stocks) {
		for (Stock stock : stocks)
			System.out.println(stock.getStockPrice());
	}

}
