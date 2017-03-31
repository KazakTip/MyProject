package com.services.jax_ws.bean;

public class ItemBean
{
   	private int itemId;
	
	private String itemName;

	private double itemWeightKg;

	private bool isStored;

	
	public int getItemId()
	{
		return itemId;
	}	

	public void setItemId(int ItemId)
	{
		this.itemId = ItemId;
	}
	
	public String getItemName()
	{
		return itemName;
	}	

	public void setItemName(String ItemName)
	{
		this.itemName = ItemName;
	}

	public double getItemWeightKg()
	{
		return itemWeightKg;
	}	

	public void setItemWeightKg(double ItemWeightKg)
	{
		this.itemWeightKg = ItemWeightKg;
	}

	public bool getIsStored()
	{
		return isStored;
	}	

	public void setIsStored(bool IsStored)
	{
		this.isStored = IsStored;
	}
}