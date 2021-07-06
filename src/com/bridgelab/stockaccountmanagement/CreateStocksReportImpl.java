package com.bridgelab.stockaccountmanagement;

import java.util.LinkedList;

/*****************************************************************************************
 * @author mihir
 * 
 * This class will implement all the abstract methods from @IStockAccountManagementService
 * To perform all required operations. 
 *****************************************************************************************/

public class CreateStocksReportImpl implements IStockAccountManagementService
{
	LinkedList<Stocks> portFolioList = new LinkedList<Stocks>();
	
	//Insertion of stocks in PortFolio.
	@Override
	public void insertStocksDetails(Stocks stocks)
	{
		if(portFolioList.contains(stocks))
		{
			System.err.println("Stock already exist in PortFolio, Add new non existing stock.");
		}
		else
		{
			portFolioList.add(stocks);
		}
	}
	
	//Printing only stocks names for selection.
	@Override
	public void printStocksNames()
	{
		System.out.println("Following are the stocks present in port-folio.");
		for(Stocks iterator : portFolioList)
		{
			System.out.print(iterator.getStockName() + " ");
		}
	}
	
	//prints user selected stocks detailed report.
	@Override
	public void printSelectedStockReport(String userStockName)
	{
		for(Stocks iterator : portFolioList)
		{
			if(iterator.getStockName().equals(userStockName))
			{
				double itemValue = iterator.getPricePerShare()*iterator.getTotalNumberShares();
				System.out.println("Detailed Report of selected Stock " + iterator.getStockName() + " is : " + iterator + " and its total value is : " + itemValue + " RS" + "\n");
			}
		}
	}
	
	//Calculating total value of port-folio.
	@Override
	public void calculateValueOfPoertFolio()
	{
		double portFolioValue = 0.0;
		for(Stocks iterator : portFolioList)
		{
			double stocksValue = iterator.getPricePerShare()*iterator.getTotalNumberShares();
			portFolioValue += stocksValue;
			System.out.println("Total value of " + iterator.getStockName() + " is : " + stocksValue);
		}
		System.out.println("Total value of Port-Folio is : " + portFolioValue + " Rs." + "\n");
	}
	
	//Display Details of PortFolio.
	@Override
	public void displayDetailPortFolio()
	{
		System.out.println("\n" + "Following are the detail stocks holdings from your portfolio.");
		for(Stocks iterator : portFolioList)
		{
			System.out.println(iterator);
		}
	}
}
