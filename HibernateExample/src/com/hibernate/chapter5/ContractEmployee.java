package com.hibernate.chapter5;

import javax.persistence.Entity;

@Entity
public class ContractEmployee extends Employee {

	private int costPerHour;
	private int contactPeriod;
	
	public int getCostPerHour() {
		return costPerHour;
	}
	public void setCostPerHour(int costPerHour) {
		this.costPerHour = costPerHour;
	}
	public int getContactPeriod() {
		return contactPeriod;
	}
	public void setContactPeriod(int contactPeriod) {
		this.contactPeriod = contactPeriod;
	}
	
}
