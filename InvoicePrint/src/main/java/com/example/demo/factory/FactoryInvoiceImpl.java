package com.example.demo.factory;

import com.example.demo.service.ExcelInvoiceImpl;
import com.example.demo.service.InterInvoiceImpl;
import com.example.demo.service.PdfInvoiceImpl;

public class FactoryInvoiceImpl {

	
	public static InterInvoiceImpl InvoicePrinting(String type) {
		
		if(type.equals("PdfImpl"))
			return new PdfInvoiceImpl();
		
		if(type.equals("ExcelImpl"))
				return new ExcelInvoiceImpl();
		
		return null;
		
		
	}
	
	
}
