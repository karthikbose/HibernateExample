package com.hibernate.chapter4;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AccountsPK implements Serializable {

	private int userId;
	private int accId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	
	
}
