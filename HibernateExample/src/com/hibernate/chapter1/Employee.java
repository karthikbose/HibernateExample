package com.hibernate.chapter1;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

@Entity
@Table(name = "HBPUsers")
public class Employee {

	private int empId;
	private String empName;
	private int age;

	@Id
	@Column(name = "UserId")
	@TableGenerator(name="PKTable", table="TblOfPKs", allocationSize=5000, initialValue=800, pkColumnName="MyKey", pkColumnValue="HBPUser", valueColumnName="MyValue")
	@GeneratedValue(strategy=GenerationType.TABLE, generator="PKTable")
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Basic
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Transient
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
