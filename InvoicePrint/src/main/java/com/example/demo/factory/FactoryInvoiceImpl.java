package com.example.demo.factory;

import com.example.demo.service.ExcelInvoiceImpl;
import com.example.demo.service.InterInvoiceImpl;
import com.example.demo.service.PdfInvoiceImpl;
import com.example.demo.service.WordInvoiceImpl;

public class FactoryInvoiceImpl {

	
	public static InterInvoiceImpl InvoicePrinting(String type) {
		
		if(type.equals("PdfImpl"))
			return new PdfInvoiceImpl();
		
		if(type.equals("ExcelImpl"))
				return new ExcelInvoiceImpl();
		
		if(type.equals("WordImpl"))
		return new WordInvoiceImpl();
			
		
		return null;
		
		
	}
	
	
}
