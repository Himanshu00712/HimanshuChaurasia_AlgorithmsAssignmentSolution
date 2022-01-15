package com.greatlearning.stockers.driver;

import java.util.Scanner;

import com.greatlearning.stockers.model.Stock;
import com.greatlearning.stockers.service.StockProcessorService;
import com.greatlearning.stockers.service.StockBuildService;
import com.greatlearning.stockers.utility.HelperUtility;

public class Main {

	private final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		StockBuildService stockService = new StockBuildService();
		Stock[] stocksInfo = stockService.buildStockInfo();

		StockProcessorService stockProcessorService = new StockProcessorService(stocksInfo);
		HelperUtility helperUtility = new HelperUtility();

		int Option = 0;
		do {
			displayOptions();
			Option = scanner.nextInt();
			helperUtility.selectOptionUtil(stockProcessorService, Option);
		} while (Option != 0);
	}

	private static void displayOptions() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Enter the operation that you want to perform : ");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("0. Press 0 to exit");
		System.out.println("---------------------------------------------------------------------------------");
	}
}
