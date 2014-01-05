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

import com.sudheer.model.Order;

@ManagedBean
@SessionScoped
public class UpdateDatatableController implements Serializable {

	private static final long serialVersionUID = 1L;

	int orderNo;
	String productName;
	int price;
	int qty;
	boolean editable;
	List<Order> orderlist;
	private DataSource ds;
	Connection con;

	public UpdateDatatableController() throws SQLException {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/sudheerdb");
			if (ds == null)
				throw new SQLException("Can't get data source");

			// get database connection
			con = ds.getConnection();

			if (con == null)
				throw new SQLException("Can't get database connection");
			orderlist=new ArrayList<Order>();
			orderlist=getOrderList();

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	// connect to DB and get order list
	public List<Order> getOrderList() throws SQLException {

		PreparedStatement ps = con
				.prepareStatement("select order_no, productname, price , qty,editable from sudheerdb.order");
		// get customer data from database
		ResultSet result = ps.executeQuery();

		List<Order> list = new ArrayList<Order>();

		while (result.next()) {
			Order order = new Order();

			order.setOrderNo(result.getInt("order_no"));
			order.setProductName(result.getString("productname"));
			order.setQty(result.getInt("qty"));
			order.setPrice(result.getInt("price"));
			order.setEditable(result.getBoolean("editable"));
			
			System.out.println("order.getEditable"+order.isEditable());
			
			// store all data into a List
			list.add(order);
		}

		return list;
	}

	public String saveAction() throws SQLException {

		// get all existing value but set "editable" to false
		for (Order order : orderlist) {
			PreparedStatement ps = con.prepareStatement("UPDATE sudheerdb.order SET productname='"+order.getProductName()+"',price="+order.getPrice()+",qty="+order.getQty()+",editable=false where order_no="+order.getOrderNo());
			//PreparedStatement ps = con.prepareStatement("UPDATE sudheerdb.order SET editable=false");
			ps.execute();
		//	order.setEditable(false);
		}
		
		orderlist=getOrderList();
		// return to current page
		return null;

	}

	public String editAction(Order order) throws SQLException {
		//order.setEditable(true);
		PreparedStatement ps = con.prepareStatement("UPDATE sudheerdb.order SET editable=true where order_no="+order.getOrderNo());
		ps.execute();
		orderlist=getOrderList();

		return null;
	}
	
	

	public List<Order> getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(List<Order> orderlistnew) throws SQLException {
		this.orderlist = orderlistnew;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
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
}