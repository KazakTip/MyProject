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

		// ��������� ���������...
		System.out.println("storageItem called for item"
				+ itemBean.getItemName());

		// ����������� ��������� ��������
		/*if (itemBean.getOrderItems() != null) {
			System.out.println("Number of items is "
					+ orderBean.getOrderItems().length);
		}*/

		//���������� �����.

		//���������� ������������� ������.
		itemBean.setIsStored(true);

		return itemBean;
	}	
}