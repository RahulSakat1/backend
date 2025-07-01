package com.example.demo.service;

public class WordInvoiceImpl extends AbstractImpl {

	@Override
	public void processdata() {
		
		System.out.println("Process Word data");
		
	}

	@Override
	public String printdata() {
		
		System.out.println(" Printing Word data ");
		
		return "Printing Word data";
	}

}
