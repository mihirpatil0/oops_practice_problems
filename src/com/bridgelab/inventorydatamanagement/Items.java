package com.bridgelab.inventorydatamanagement;

/*****************************************************
 * @author mihir
 * 
 * @sine 05-July-2021
 * 
 * This class holds information of inventory items.
 * example item name, total quantity, and price per kg.
 *****************************************************/

public class Items
{	
	//Inventory items information.
	private String itemName;
	private double totalWeight;
	private double pricePerKg;
	
	public String getItemName()
	{
		return itemName;
	}
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	public double getItemTotalWeight()
	{
		return totalWeight;
	}
	public void setItemTotalWeight(double totalWeight)
	{
		if(totalWeight <= 0)
		{
			System.err.println("Weight can not be less than equal to zero.");
		}
		else
		{
			this.totalWeight = totalWeight;
		}
	}
	public double getItemPricePerKg()
	{
		return pricePerKg;
	}
	public void setItemPricePerKg(double pricePerKg)
	{
		if(pricePerKg <= 0)
		{
			System.err.println("Price can not be less than equal to zero.");
		}
		else
		{
			this.pricePerKg = pricePerKg;
		}
	}
	@Override
	public String toString()
	{
		return "[Name=" + itemName + ", TotalWeight=" + totalWeight + ", PricePerKg="
				+ pricePerKg + "]";
	}
}
