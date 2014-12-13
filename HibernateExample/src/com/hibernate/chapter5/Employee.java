package com.hibernate.chapter5;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;

@Entity
/* strategy 1: *//*
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Emp")
*/
/* strategy 2: */
@Inheritance(strategy=InheritanceType.JOINED)
/* strategy 3: *//*
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
*/
public class Employee {

	private int empId;
	private String empName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="tbl")
	@TableGenerator(name="tbl", table="PKTable", pkColumnName="myKey", pkColumnValue="EmpID", valueColumnName="val", allocationSize=5, initialValue=10)
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}
