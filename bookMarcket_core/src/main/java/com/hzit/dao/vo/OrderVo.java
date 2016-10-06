package com.hzit.dao.vo;

/**
 * 
 * @author maxiang
 */
public class OrderVo {
	/**
	 *  订单id
	 */
	private Integer orderId;
	/**
	 *  收货人id(用户id)
	 */
	private Integer userId;
	/**
	 *  下单日期
	 */
	private String orderCreateTime;
	/**
	 *  总价
	 */
	private Integer orderPrice;
	/**
	 *  订单状态
	 */
	private String orderStatus;
	/**
	 * 订单id
	 * @param orderId
	 */
	public void setOrderId(Integer orderId){
		this.orderId = orderId;
	}
	
    /**
     * 订单id
     * @return Integer
     */	
    public Integer getOrderId(){
    	return orderId;
    }
	/**
	 * 收货人id(用户id)
	 * @param userId
	 */
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
    /**
     * 收货人id(用户id)
     * @return Integer
     */	
    public Integer getUserId(){
    	return userId;
    }
	/**
	 * 下单日期
	 * @param orderCreateTime
	 */
	public void setOrderCreateTime(String orderCreateTime){
		this.orderCreateTime = orderCreateTime;
	}
	
    /**
     * 下单日期
     * @return String
     */	
    public String getOrderCreateTime(){
    	return orderCreateTime;
    }
	/**
	 * 总价
	 * @param orderPrice
	 */
	public void setOrderPrice(Integer orderPrice){
		this.orderPrice = orderPrice;
	}
	
    /**
     * 总价
     * @return Integer
     */	
    public Integer getOrderPrice(){
    	return orderPrice;
    }
	/**
	 * 订单状态
	 * @param orderStatus
	 */
	public void setOrderStatus(String orderStatus){
		this.orderStatus = orderStatus;
	}
	
    /**
     * 订单状态
     * @return String
     */	
    public String getOrderStatus(){
    	return orderStatus;
    }
}