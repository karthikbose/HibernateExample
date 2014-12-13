package com.hibernate.chapter2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="Customer")
@SecondaryTable(name="CustomerDetail")
public class Customer {

	private int cusId;
	private String cusName;
	private String address;
	private String city;
	private String phoneNo;
	
	@Id
	@TableGenerator(name="PKTabls", table="TblOfPKs", pkColumnValue="Customer")
	@GeneratedValue(strategy=GenerationType.TABLE, generator="PKTabls")
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	
	@Column(table="CustomerDetail")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(table="CustomerDetail")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(table="CustomerDetail")
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
