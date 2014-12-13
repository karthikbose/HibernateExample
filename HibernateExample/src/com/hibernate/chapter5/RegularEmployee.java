package com.hibernate.chapter5;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
/* strategy 1: *//*
@DiscriminatorValue("Reg")
*/
/* strategy 2: */
@PrimaryKeyJoinColumn(name="E_ID")
/*strategy 3
@AttributeOverride(name="empId", column=@Column(name="employeeId"))
*/
public class RegularEmployee extends Employee {

	private long salary;
	private long pfAccNo;
	
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getPfAccNo() {
		return pfAccNo;
	}
	public void setPfAccNo(long pfAccNo) {
		this.pfAccNo = pfAccNo;
	}
	
	
}
