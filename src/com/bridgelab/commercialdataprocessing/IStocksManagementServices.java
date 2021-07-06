package com.bridgelab.commercialdataprocessing;

/************************************************************
 * @author mihir
 * 
 * This interface will have abstract methods.
 * Methods which will be use to do the following operations.
 * Like Buy new stocks, Sell existing stocks and Print report.
 ************************************************************/

public interface IStocksManagementServices
{
	//Abstract methods.
	public void displayPresentCompanySharesDetails();
	public void buyStocks(CompanyShares companySharesDetails);
	public void sellStocks(String companySymbol);
	public void displayDetailPortFolio();
}
