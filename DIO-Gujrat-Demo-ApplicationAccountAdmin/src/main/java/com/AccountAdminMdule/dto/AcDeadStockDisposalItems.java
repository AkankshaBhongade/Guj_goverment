package com.AccountAdminMdule.dto;

public class AcDeadStockDisposalItems {
	private String Disposal_Type;
	private String Order_Number_or_voucher_Number;
	private String Order_Date;
	private String Final_Dispose_Qty;
	private String Reciever_Name;
	private String Reciever_Amount;
	private String Reciever_Amount_Date;
	private String Amount_Deposit_To_Gov_Account;
	private String Deposit_Amount_Date;
	private String Remaining_Qty_Equipment;
	private String Amount_Of_Remaining_Equipment;
	public AcDeadStockDisposalItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AcDeadStockDisposalItems(String disposal_Type, String order_Number_or_voucher_Number, String order_Date,
			String final_Dispose_Qty, String reciever_Name, String reciever_Amount, String reciever_Amount_Date,
			String amount_Deposit_To_Gov_Account, String deposit_Amount_Date, String remaining_Qty_Equipment,
			String amount_Of_Remaining_Equipment) {
		super();
		Disposal_Type = disposal_Type;
		Order_Number_or_voucher_Number = order_Number_or_voucher_Number;
		Order_Date = order_Date;
		Final_Dispose_Qty = final_Dispose_Qty;
		Reciever_Name = reciever_Name;
		Reciever_Amount = reciever_Amount;
		Reciever_Amount_Date = reciever_Amount_Date;
		Amount_Deposit_To_Gov_Account = amount_Deposit_To_Gov_Account;
		Deposit_Amount_Date = deposit_Amount_Date;
		Remaining_Qty_Equipment = remaining_Qty_Equipment;
		Amount_Of_Remaining_Equipment = amount_Of_Remaining_Equipment;
	}
	@Override
	public String toString() {
		return "AcDeadStockDisposalItems [Disposal_Type=" + Disposal_Type + ", Order_Number_or_voucher_Number="
				+ Order_Number_or_voucher_Number + ", Order_Date=" + Order_Date + ", Final_Dispose_Qty="
				+ Final_Dispose_Qty + ", Reciever_Name=" + Reciever_Name + ", Reciever_Amount=" + Reciever_Amount
				+ ", Reciever_Amount_Date=" + Reciever_Amount_Date + ", Amount_Deposit_To_Gov_Account="
				+ Amount_Deposit_To_Gov_Account + ", Deposit_Amount_Date=" + Deposit_Amount_Date
				+ ", Remaining_Qty_Equipment=" + Remaining_Qty_Equipment + ", Amount_Of_Remaining_Equipment="
				+ Amount_Of_Remaining_Equipment + "]";
	}
	public String getDisposal_Type() {
		return Disposal_Type;
	}
	public void setDisposal_Type(String disposal_Type) {
		Disposal_Type = disposal_Type;
	}
	public String getOrder_Number_or_voucher_Number() {
		return Order_Number_or_voucher_Number;
	}
	public void setOrder_Number_or_voucher_Number(String order_Number_or_voucher_Number) {
		Order_Number_or_voucher_Number = order_Number_or_voucher_Number;
	}
	public String getOrder_Date() {
		return Order_Date;
	}
	public void setOrder_Date(String order_Date) {
		Order_Date = order_Date;
	}
	public String getFinal_Dispose_Qty() {
		return Final_Dispose_Qty;
	}
	public void setFinal_Dispose_Qty(String final_Dispose_Qty) {
		Final_Dispose_Qty = final_Dispose_Qty;
	}
	public String getReciever_Name() {
		return Reciever_Name;
	}
	public void setReciever_Name(String reciever_Name) {
		Reciever_Name = reciever_Name;
	}
	public String getReciever_Amount() {
		return Reciever_Amount;
	}
	public void setReciever_Amount(String reciever_Amount) {
		Reciever_Amount = reciever_Amount;
	}
	public String getReciever_Amount_Date() {
		return Reciever_Amount_Date;
	}
	public void setReciever_Amount_Date(String reciever_Amount_Date) {
		Reciever_Amount_Date = reciever_Amount_Date;
	}
	public String getAmount_Deposit_To_Gov_Account() {
		return Amount_Deposit_To_Gov_Account;
	}
	public void setAmount_Deposit_To_Gov_Account(String amount_Deposit_To_Gov_Account) {
		Amount_Deposit_To_Gov_Account = amount_Deposit_To_Gov_Account;
	}
	public String getDeposit_Amount_Date() {
		return Deposit_Amount_Date;
	}
	public void setDeposit_Amount_Date(String deposit_Amount_Date) {
		Deposit_Amount_Date = deposit_Amount_Date;
	}
	public String getRemaining_Qty_Equipment() {
		return Remaining_Qty_Equipment;
	}
	public void setRemaining_Qty_Equipment(String remaining_Qty_Equipment) {
		Remaining_Qty_Equipment = remaining_Qty_Equipment;
	}
	public String getAmount_Of_Remaining_Equipment() {
		return Amount_Of_Remaining_Equipment;
	}
	public void setAmount_Of_Remaining_Equipment(String amount_Of_Remaining_Equipment) {
		Amount_Of_Remaining_Equipment = amount_Of_Remaining_Equipment;
	}
	
}
