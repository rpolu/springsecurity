package com.spring.security.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.AccountModel;
import com.spring.model.BankModel;

@RestController
public class BankContoller {
	@GetMapping("/bankdetails")
	public ResponseEntity<BankModel> getBankDetails() {
		BankModel bankModel = new BankModel();
		bankModel.setName("Hdfc Marathalli");
		bankModel.setAddress("Bangalore");
		bankModel.setIfcCode("HDFC1234");
		ResponseEntity<BankModel> responseEnt = new ResponseEntity<BankModel>(bankModel, HttpStatus.OK);
		return responseEnt;
	}

	@GetMapping("/user")
	public ResponseEntity<AccountModel> getAccountDetails() {
		AccountModel accountModel = new AccountModel(1, "mohan", 8999.90f);
		ResponseEntity<AccountModel> responseEnt = new ResponseEntity<AccountModel>(accountModel, HttpStatus.OK);
		return responseEnt;
	}

	@GetMapping("/all")
	public ResponseEntity<List<AccountModel>> getAccounts() {
		List<AccountModel> listAccounts = new ArrayList<AccountModel>();
		AccountModel accountModel1 = new AccountModel(1, "mohan", 8999.90f);
		AccountModel accountModel2 = new AccountModel(2, "mohan", 7888.90f);
		listAccounts.add(accountModel1);
		listAccounts.add(accountModel2);
		ResponseEntity<List<AccountModel>> responseEnt = new ResponseEntity<List<AccountModel>>(listAccounts,
				HttpStatus.OK);
		return responseEnt;
	}

}
