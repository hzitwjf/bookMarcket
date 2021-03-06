package com.hzit.dao.entity;

/**
 * 
 * @author maxiang
 */
public class Orderdetail {
	/**
	 *  订单详情id
	 */
	private Integer orderdetailId;
	/**
	 *  订单id
	 */
	private String orderId;
	/**
	 *  图书的id
	 */
	private Integer bookId;
	/**
	 *  购买数量
	 */
	private Integer orderdetailNum;
	/**
	 *  交易价格
	 */
	private Integer orderdetailPrice;
	/**
	 * 订单详情id
	 * @param orderdetailId
	 */
	public void setOrderdetailId(Integer orderdetailId){
		this.orderdetailId = orderdetailId;
	}
	
    /**
     * 订单详情id
     * @return
     */	
    public Integer getOrderdetailId(){
    	return orderdetailId;
    }
	/**
	 * 订单id
	 * @param orderId
	 */
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}
	
    /**
     * 订单id
     * @return
     */	
    public String getOrderId(){
    	return orderId;
    }
	/**
	 * 图书的id
	 * @param bookId
	 */
	public void setBookId(Integer bookId){
		this.bookId = bookId;
	}
	
    /**
     * 图书的id
     * @return
     */	
    public Integer getBookId(){
    	return bookId;
    }
	/**
	 * 购买数量
	 * @param orderdetailNum
	 */
	public void setOrderdetailNum(Integer orderdetailNum){
		this.orderdetailNum = orderdetailNum;
	}
	
    /**
     * 购买数量
     * @return
     */	
    public Integer getOrderdetailNum(){
    	return orderdetailNum;
    }
	/**
	 * 交易价格
	 * @param orderdetailPrice
	 */
	public void setOrderdetailPrice(Integer orderdetailPrice){
		this.orderdetailPrice = orderdetailPrice;
	}
	
    /**
     * 交易价格
     * @return
     */	
    public Integer getOrderdetailPrice(){
    	return orderdetailPrice;
    }
}