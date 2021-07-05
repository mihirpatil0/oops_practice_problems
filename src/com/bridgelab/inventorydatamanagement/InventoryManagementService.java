package com.bridgelab.inventorydatamanagement;

/*****************************************************************
 * @author mihir
 * 
 * This interface will have abstract methods which we will be using
 * for inventory data manipulation.
 *****************************************************************/

public interface InventoryManagementService
{
	public void addInventoryItems(Items items);
	public void calculateValueOfInventory();
	public void printItemNames();
	public void printSelectedItemDetails(String userItemName);
	public void printAllItemsDetails();
}
