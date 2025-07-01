package com.example.demo.service;

public class ExcelInvoiceImpl extends AbstractImpl{

	@Override
	public void processdata() {
		
		System.out.println("process excel data");
		
	}

	@Override
	public String printdata() {
		
		System.out.println("Printing excel data");
		
		return "Printing Excel data";
	}

}
