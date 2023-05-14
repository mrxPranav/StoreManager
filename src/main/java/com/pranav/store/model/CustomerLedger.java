package com.pranav.store.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerLedger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int custId;
	private String custledName;
	private String custLedAddress;
	private String date;
	private double debit;
	private double credit;
	private double balance;
	private String payment;
	private String cheq;
	private String remark;
	private boolean enable;
	
	public CustomerLedger() {
		super();
	}
	public CustomerLedger(int id, int custId, String custledName, String custLedAddress, String date, double debit,
			double credit, double balance, String payment, String cheq, String remark, boolean enable) {
		super();
		this.id = id;
		this.custId = custId;
		this.custledName = custledName;
		this.custLedAddress = custLedAddress;
		this.date = date;
		this.debit = debit;
		this.credit = credit;
		this.balance = balance;
		this.payment = payment;
		this.cheq = cheq;
		this.remark = remark;
		this.enable = enable;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custledName;
	}
	public void setCustName(String custName) {
		this.custledName = custName;
	}
	public String getCustAddress() {
		return custLedAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custLedAddress = custAddress;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getDebit() {
		return debit;
	}
	public void setDebit(double debit) {
		this.debit = debit;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getCheq() {
		return cheq;
	}
	public void setCheq(String cheq) {
		this.cheq = cheq;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
}
