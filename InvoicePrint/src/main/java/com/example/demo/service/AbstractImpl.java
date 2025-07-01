package com.example.demo.service;

public abstract  class AbstractImpl implements InterInvoiceImpl  {

	@Override
	public void readdata() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public String Print() {
		readdata();
		processdata();
	return	printdata();
		
	}

	
	


		
	
	
	
	

}
