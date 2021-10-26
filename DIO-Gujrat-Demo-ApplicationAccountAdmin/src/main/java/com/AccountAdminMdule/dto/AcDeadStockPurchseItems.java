package com.AccountAdminMdule.dto;

import java.util.List;

//import antlr.collections.List;

public class AcDeadStockPurchseItems {
	private String Equipment_Name;
	private String Purchase_Order_Number;
	private String Purchase_Order_Date;
	private String Quantity;
	private String Amount;
	private String Receiver_Name;
	private String Serial_Number;
	private String Remarks;
	
	private List<AcDeadStockDisposalItems> disposalitem ;
	
	
	public List<AcDeadStockDisposalItems> getDisposalitem() {
		return disposalitem;
	}
	public void setDisposalitem(List<AcDeadStockDisposalItems> disposalitem) {
		this.disposalitem = disposalitem;
	}
	
	
	public AcDeadStockPurchseItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AcDeadStockPurchseItems(String equipment_Name, String purchase_Order_Number, String purchase_Order_Date,
			String quantity, String amount, String receiver_Name, String serial_Number, String remarks) {
		super();
		Equipment_Name = equipment_Name;
		Purchase_Order_Number = purchase_Order_Number;
		Purchase_Order_Date = purchase_Order_Date;
		Quantity = quantity;
		Amount = amount;
		Receiver_Name = receiver_Name;
		Serial_Number = serial_Number;
		Remarks = remarks;
	}
	@Override
	public String toString() {
		return "AcDeadStockPurchseItems [Equipment_Name=" + Equipment_Name + ", Purchase_Order_Number="
				+ Purchase_Order_Number + ", Purchase_Order_Date=" + Purchase_Order_Date + ", Quantity=" + Quantity
				+ ", Amount=" + Amount + ", Receiver_Name=" + Receiver_Name + ", Serial_Number=" + Serial_Number
				+ ", Remarks=" + Remarks + "]";
	}
	public String getEquipment_Name() {
		return Equipment_Name;
	}
	public void setEquipment_Name(String equipment_Name) {
		Equipment_Name = equipment_Name;
	}
	public String getPurchase_Order_Number() {
		return Purchase_Order_Number;
	}
	public void setPurchase_Order_Number(String purchase_Order_Number) {
		Purchase_Order_Number = purchase_Order_Number;
	}
	public String getPurchase_Order_Date() {
		return Purchase_Order_Date;
	}
	public void setPurchase_Order_Date(String purchase_Order_Date) {
		Purchase_Order_Date = purchase_Order_Date;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getReceiver_Name() {
		return Receiver_Name;
	}
	public void setReceiver_Name(String receiver_Name) {
		Receiver_Name = receiver_Name;
	}
	public String getSerial_Number() {
		return Serial_Number;
	}
	public void setSerial_Number(String serial_Number) {
		Serial_Number = serial_Number;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	
}
