package com.nt.manoj.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {
	@Id
	private int custId;
	private String custName;
	private String custAddr;
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	@Override
	public String toString() {
		return "Customers [custId=" + custId + ", custName=" + custName + ", custAddr=" + custAddr + "]";
	}
	
	
}
