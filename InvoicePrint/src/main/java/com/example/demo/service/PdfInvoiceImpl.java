package com.example.demo.service;

public class PdfInvoiceImpl extends AbstractImpl {

	

	@Override
	public void processdata() {
		
		System.out.println("Process pdf data");
		
	}

	@Override
	public String printdata() {
	System.out.println("Printing Pdf data");
		
	 return "Printing Pdf Invoice data";
	}

}
