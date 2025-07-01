package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.factory.FactoryInvoiceImpl;
import com.example.demo.service.InterInvoiceImpl;

@RestController
public class InvoiceController {
	
	@GetMapping("Invoice/{type}")
	public String Invoice(@PathVariable String type) {
		
		
	InterInvoiceImpl in = FactoryInvoiceImpl.InvoicePrinting(type);
	
	return in.Print();		
		
		
	}

}
