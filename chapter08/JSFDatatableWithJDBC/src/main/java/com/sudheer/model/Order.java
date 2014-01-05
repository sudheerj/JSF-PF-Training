package com.sudheer.model;

import java.math.BigDecimal;

public  class Order{
 
		int orderNo;
		String productName;
		int price;
		int qty;
		boolean editable;
 
		public Order(int orderNo, String productName, 
				int price, int qty,boolean editable) {
			this.orderNo = orderNo;
			this.productName = productName;
			this.price = price;
			this.qty = qty;
			this.editable=editable;
		}
		

		public Order() {
			super();
			// TODO Auto-generated constructor stub
		}


		public int getOrderNo() {
			return orderNo;
		}


		public void setOrderNo(int orderNo) {
			this.orderNo = orderNo;
		}


		public String getProductName() {
			return productName;
		}


		public void setProductName(String productName) {
			this.productName = productName;
		}


		public int getPrice() {
			return price;
		}


		public void setPrice(int price) {
			this.price = price;
		}


		public int getQty() {
			return qty;
		}


		public void setQty(int qty) {
			this.qty = qty;
		}


		public boolean isEditable() {
			return editable;
		}


		public void setEditable(boolean editable) {
			this.editable = editable;
		}


		
	}