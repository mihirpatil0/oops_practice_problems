package com.bridgelab.inventorydatamanagement;

import java.util.Scanner;

/*******************************************************************************
 * @author mihir
 * 
 * Taking user input and calling methods which are required to perform operations
 * on inventory to store and manipulate data.
 *******************************************************************************/

public class InventoryManagerMain
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		InventoryManagementService inventoryMgmtInterfaceObj = new InventoryMgmtServiceImpl();
		
		System.out.println("Welcome to inventory data management system !");
		
		boolean isExit = false;
		while(!isExit)
		{	
			System.out.println("Enter number as per given choice :\n1 - Enter items in inventory."
					+ "\n2 - Print details of specific item.\n3 - Print total value of inventory.\n4 - Display all items.\n5 - Exit.");
			int userChoice = scannerObject.nextInt();
			switch(userChoice)
			{
				case 1 :
				{
					System.out.print("How many number of items you want to store in inventory : ");
					int numberOfItmes = scannerObject.nextInt();
					
					//User input for items which will be stored inside inventory.
					for(int itemCount = 1; itemCount <= numberOfItmes; itemCount++)
					{	
						Items itemsObject = new Items();
						System.out.print("Enter Item Name : ");
						itemsObject.setItemName(scannerObject.next());
						System.out.print("Enter Total Weight : ");
						itemsObject.setItemTotalWeight(scannerObject.nextDouble());
						System.out.print("Enter Price Per Kg : ");
						itemsObject.setItemPricePerKg(scannerObject.nextDouble());
						inventoryMgmtInterfaceObj.addInventoryItems(itemsObject);
					}
					System.out.println("\n" + "All the items inserted sucessfully !" + "\n");
					break;
				}
				case 2 :
				{
					//Printing Only items names for selection.
					inventoryMgmtInterfaceObj.printItemNames();
					
					System.out.print( "\n" + "Enter any one of the above item name to display its details : ");
					String userItemName = scannerObject.next();
					inventoryMgmtInterfaceObj.printSelectedItemDetails(userItemName);
					break;
				}
				case 3 :
				{
					//Calculating value of inventory.
					inventoryMgmtInterfaceObj.calculateValueOfInventory();
					break;
				}
				case 4 :
				{
					//Displaying all items present in inventory.
					inventoryMgmtInterfaceObj.printAllItemsDetails();
					break;
				}
				case 5 :
				{
					isExit = true;
				}
			}
		}
		scannerObject.close();
	}
}
