package com.greatlearning.stockers.service;

import java.util.Scanner;

import com.greatlearning.stockers.model.Stock;

public class StockBuildService {

	private final Scanner scanner = new Scanner(System.in);

	public Stock[] buildStockInfo() {

		System.out.println("Enter the number of companies:- ");
		int numberOfCompanies = scanner.nextInt();

		Stock[] stockArray = new Stock[numberOfCompanies];
		for (int num = 0; num < numberOfCompanies; num++) {

			System.out.println("Enter current stock price of the company " + (num + 1));
			double price = scanner.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			boolean hasRaised = scanner.nextBoolean();

			stockArray[num] = new Stock(price, hasRaised);
		}

		return stockArray;
	}

}
