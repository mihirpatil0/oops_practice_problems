package com.bridgelab.stockaccountmanagement;

/***********************************************
 * @author mihir
 * 
 * This interface will have all abstract methods.
 * Which are required to make Stock Report. 
 ***********************************************/

public interface IStockAccountManagementService
{
	public void insertStocksDetails(Stocks stocks);
	public void printStocksNames();
	public void printSelectedStockReport(String userStockName);
	public void calculateValueOfPoertFolio();
	public void displayDetailPortFolio();
}
