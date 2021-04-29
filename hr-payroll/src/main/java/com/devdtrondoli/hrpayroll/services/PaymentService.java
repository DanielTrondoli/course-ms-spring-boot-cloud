package com.devdtrondoli.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.devdtrondoli.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {		
		return new Payment("Daniel", 200.0, days);
	}

}
