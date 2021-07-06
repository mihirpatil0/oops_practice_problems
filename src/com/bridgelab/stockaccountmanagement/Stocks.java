package com.bridgelab.stockaccountmanagement;

/********************************************************************
 * @author mihir
 * 
 * @since 05-July-2021
 * 
 * This class defines stocks attributes
 * which are Stock-Name, Price and Quantity ( Total number of shares ) 
 ********************************************************************/

public class Stocks
{
	//Stocks Attributes.
	private String stockName;
	private double pricePerShare;
	private int totalNumberShares;
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName)
	{
		this.stockName = stockName;
	}
	public double getPricePerShare()
	{
		return pricePerShare;
	}
	public void setPricePerShare(double pricePerShare)
	{	
		if(pricePerShare <= 0)
		{
			System.err.println("Share Price can not be less than equal to zero. Enter again !");
		}
		else
		{
			this.pricePerShare = pricePerShare;
		}
	}
	public int getTotalNumberShares()
	{
		return totalNumberShares;
	}
	public void setTotalNumberShares(int totalNumberShares)
	{
		if(totalNumberShares <= 0)
		{
			System.err.println("Total Number Of Shares can not be less than equal to zero. Enter again !");
		}
		else
		{
			this.totalNumberShares = totalNumberShares;
		}
	}
	@Override
	public String toString() {
		return "Stocks [Name=" + stockName + ", PricePerShare=" + pricePerShare + ", TotalNumberShares="
				+ totalNumberShares + "]";
	}
}
