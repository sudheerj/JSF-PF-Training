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
public class DeleteDatatableController implements Serializable{
 
	private static final long serialVersionUID = 1L;
 
	private DataSource ds;
	Connection con; 
	List<Order> orderlist;
	
	public DeleteDatatableController() throws SQLException{
	try {
		Context ctx = new InitialContext();
		ds = (DataSource)ctx.lookup("java:comp/env/jdbc/sudheerdb");
		if(ds==null)
			throw new SQLException("Can't get data source");
 
		//get database connection
		 con = ds.getConnection();
 
		if(con==null)
			throw new SQLException("Can't get database connection");
		orderlist=new ArrayList<Order>();
		orderlist=getOrderList();
		 
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
	
 
	public String deleteAction(Order order) throws SQLException {
 
			PreparedStatement ps = con.prepareStatement("DELETE FROM sudheerdb.order where order_no="+order.getOrderNo());
			 ps.execute();
		
		orderlist=getOrderList();
		return null;
	}

	public List<Order> getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(List<Order> orderlist) {
		this.orderlist = orderlist;
	}
	
	
}