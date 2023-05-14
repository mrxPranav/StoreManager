package com.pranav.store.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SupplierLedger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int supId;
	private String supLedName;
	private String supLedAddress;
	private String date;
	private String debit;
	private String credit;
	private String balance;
	private String payment;
	private String cheq;
	private String remark;
	private boolean enable;
	
	public SupplierLedger(int id, int supId, String supLedName, String supLedAddress, String date, String debit,
			String credit, String balance, String payment, String cheq, String remark, boolean enable) {
		super();
		this.id = id;
		this.supId = supId;
		this.supLedName = supLedName;
		this.supLedAddress = supLedAddress;
		this.date = date;
		this.debit = debit;
		this.credit = credit;
		this.balance = balance;
		this.payment = payment;
		this.cheq = cheq;
		this.remark = remark;
		this.enable = enable;
	}
	
	public SupplierLedger() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSupId() {
		return supId;
	}
	public void setSupId(int supId) {
		this.supId = supId;
	}
	public String getSupName() {
		return supLedName;
	}
	public void setSupName(String supName) {
		this.supLedName = supName;
	}
	public String getSupAddress() {
		return supLedAddress;
	}
	public void setSupAddress(String supAddress) {
		this.supLedAddress = supAddress;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDebit() {
		return debit;
	}
	public void setDebit(String debit) {
		this.debit = debit;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
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
