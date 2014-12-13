package com.hibernate.chapter4;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accounts {

	private AccountsPK accountsPK;
	private int balance;
	
	@EmbeddedId
	public AccountsPK getAccountsPK() {
		return accountsPK;
	}
	public void setAccountsPK(AccountsPK accountsPK) {
		this.accountsPK = accountsPK;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
