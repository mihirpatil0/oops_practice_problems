package com.bridgelab.stockaccountmanagement;

import java.util.Scanner;

/*****************************************
 * @author mihir
 * 
 * This is the main class for this project.
 * From here we will call all the methods.
 *****************************************/

public class StockReportMain
{
	IStockAccountManagementService iStockAccMgmtServiceobject ;
	Scanner scannerObject;
	
	//Constructor.
	public StockReportMain()
	{
		iStockAccMgmtServiceobject = new CreateStocksReportImpl();
		scannerObject = new Scanner(System.in);
	}
	
	//method call as per user choice.
	private void userSelection()
	{
		boolean isExit = false;
		while(!isExit)
		{
			System.out.println("\n" + "Enter number as per choice :\n1 - Insert Stocks Details In PortFolio."
					+ "\n2 - Display Detailed Report of Specific Stock.\n3 - Display Total Value Of PortFolio.\n4 - Display Detailed PortFolio.\n5 - Exit.");
			int userChoice = scannerObject.nextInt();
			switch(userChoice)
			{
				case 1 :
						//Storing userInput stocks details inside ArrayList.(PortFolio).
						System.out.print("Enter how manys stocks records you want to store in port-folio : ");
						int userInput = scannerObject.nextInt();
						for(int iterator = 1; iterator <= userInput; iterator++)
						{
							Stocks stocksObject = new Stocks();
							System.out.print("Enter Stock Name : ");
							stocksObject.setStockName(scannerObject.next());
							System.out.print("Enter Total Number Of Shares : ");
							stocksObject.setTotalNumberShares(scannerObject.nextInt());
							System.out.print("Enter Price Per Share : ");
							stocksObject.setPricePerShare(scannerObject.nextDouble());
							iStockAccMgmtServiceobject.insertStocksDetails(stocksObject);
						}
						System.out.println("\n" + "All the Stocks inserted sucessfully !" + "\n");
						break;
				case 2 :
						//Printing Only stocks names for selection.
						iStockAccMgmtServiceobject.printStocksNames();
					
						System.out.print("\n" + "Enter any one of the above stock name to display its detailed report : ");
						String userStockName = scannerObject.next();
						iStockAccMgmtServiceobject.printSelectedStockReport(userStockName);
						break;
				case 3 :
						//Calculating total Value of port-folio.
						iStockAccMgmtServiceobject.calculateValueOfPoertFolio();
						break;
				case 4 :
						//Display Detailed PortFolio.
						iStockAccMgmtServiceobject.displayDetailPortFolio();
						break;
				case 5 :
						isExit = true;
						break;
			}
		}
		scannerObject.close();
	}

	public static void main(String[] args)
	{
		System.out.println("Welcome to Stock Account Management Services.");
		StockReportMain stockReportMainObject = new StockReportMain();
		stockReportMainObject.userSelection();
	}
}
