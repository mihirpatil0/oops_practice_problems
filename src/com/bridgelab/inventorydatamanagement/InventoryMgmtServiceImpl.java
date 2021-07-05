package com.bridgelab.inventorydatamanagement;

import java.util.LinkedList;

/************************************************************
 * @author mihir
 * 
 * This class provides implementation to abstract methods.
 * Which are present in @InventoryManagementService interface.
 ************************************************************/

public class InventoryMgmtServiceImpl implements InventoryManagementService
{
	//Using linkedlist to store inventory details of each item.
	LinkedList<Items> inventoryList = new LinkedList<>();
	
	@Override
	public void addInventoryItems(Items items)
	{
		//checks if items is already present or not.
		if(inventoryList.contains(items))
		{
			System.err.println("Item already exist in inventory, Add new non existing item.");
		}
		else
		{
			inventoryList.add(items);
		}
	}
	
	//Display item names only before selection.
	@Override
	public void printItemNames()
	{	
		System.out.println("Following are the items present in inventory.");
		for(Items iterator : inventoryList)
		{
			System.out.print(iterator.getItemName() + " ");
		}
	}
	//display selected item details
	@Override
	public void printSelectedItemDetails(String userItemName)
	{
		for(Items iterator : inventoryList)
		{
			if(iterator.getItemName().equals(userItemName))
			{
				double itemValue = iterator.getItemTotalWeight()*iterator.getItemPricePerKg();
				System.out.println("Details of selected item : " + iterator.getItemName() + iterator + " and its total value is : " + itemValue + "\n");
			}
		}
	}
	
	//Calculating total value of all items present in inventory.
	@Override
	public void calculateValueOfInventory()
	{
		double inventoryValue = 0.0;
		for(Items iterator : inventoryList)
		{
			double itemValue = iterator.getItemTotalWeight()*iterator.getItemPricePerKg();
			inventoryValue += itemValue;
			System.out.println("Total value of item " + iterator.getItemName() + " is : " + itemValue);
		}
		System.out.println("Total value of inventory is : " + inventoryValue + "\n");
	}
	
	//Display all details of all items.
	@Override
	public void printAllItemsDetails()
	{
		System.out.println("\n" + "Following are the items present in inventory.");
		for(Items iterator : inventoryList)
		{
			System.out.println(iterator);
		}
		System.out.println(" ");
	}
}
