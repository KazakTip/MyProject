package com.services.jax_ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import com.services.jax_ws.bean;

@WebService(serviceName = "StorageItem",
			portName = "StorageItemPort",	
			targetNamespace = "http://jawxs.ibm.tutorial/jaxws/storageitem")

public class StorageItemService
{
	@WebMethod
	public ItemBean storageItem(ItemBean itemBean) 
	{

		// Выполнить обработку...
		System.out.println("storageItem called for item"
				+ itemBean.getItemName());

		// Заказанными позициями являются
		/*if (itemBean.getOrderItems() != null) {
			System.out.println("Number of items is "
					+ orderBean.getOrderItems().length);
		}*/

		//Обработать заказ.

		//Установить идентификатор заказа.
		itemBean.setIsStored(true);

		return itemBean;
	}	
}