package com.sudheer.controller;
 
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.sudheer.model.Customer;
import com.sudheer.model.Order;
 
@ManagedBean
@SessionScoped
public class AddDatatableController implements Serializable{
 
	private static final long serialVersionUID = 1L;
 
	int orderNo;
	String productName;
	int price;
	int qty;
	private DataSource ds;
	Connection con; 
	
	public AddDatatableController() throws SQLException{
	try {
		Context ctx = new InitialContext();
		ds = (DataSource)ctx.lookup("java:comp/env/jdbc/sudheerdb");
		if(ds==null)
			throw new SQLException("Can't get data source");
 
		//get database connection
		 con = ds.getConnection();
 
		if(con==null)
			throw new SQLException("Can't get database connection");
 
		 
	} catch (NamingException e) {
		e.printStackTrace();
	}
	}
	
	//connect to DB and get order list
		public List<Order> getOrderList() throws SQLException{
	 
			
			PreparedStatement ps = con.prepareStatement(
					   "select order_no, productname, price , qty from sudheerdb.order"); 
			//get customer data from database
			ResultSet result =  ps.executeQuery();
	 
			List<Order> list = new ArrayList<Order>();
	 
			while(result.next()){
				Order order = new Order();
	 
				order.setOrderNo(result.getInt("order_no"));
				order.setProductName(result.getString("productname"));
				order.setQty(result.getInt("qty"));
				order.setPrice(result.getInt("price"));
	 
				//store all data into a List
				list.add(order);
			}
	 
			return list;
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

	public String addAction() throws SQLException {
 
		/*Order order = new Order(this.orderNo, this.productName, 
			this.price, this.qty);*/
		
		PreparedStatement ps = con.prepareStatement(
				   "insert into sudheerdb.order(order_no,productname,price,qty) values("+this.orderNo+",'"+this.productName+"',"+price+","+qty+")"); 
		//get customer data from database
		ps.execute();
		return null;
 	}
 
	public void deleteAction(Order order) {
           
	}
 
	
}