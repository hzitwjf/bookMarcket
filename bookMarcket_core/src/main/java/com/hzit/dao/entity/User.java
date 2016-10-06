package com.hzit.dao.entity;

/**
 * 
 * @author maxiang
 */
public class User {
	/**
	 *  用户id
	 */
	private Integer userId;
	/**
	 *  用户名
	 */
	private String userName;
	/**
	 *  用户密码
	 */
	private String userPwd;
	/**
	 *  用户邮箱
	 */
	private String userEmail;
	/**
	 * 用户id
	 * @param userId
	 */
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
    /**
     * 用户id
     * @return
     */	
    public Integer getUserId(){
    	return userId;
    }
	/**
	 * 用户名
	 * @param userName
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	
    /**
     * 用户名
     * @return
     */	
    public String getUserName(){
    	return userName;
    }
	/**
	 * 用户密码
	 * @param userPwd
	 */
	public void setUserPwd(String userPwd){
		this.userPwd = userPwd;
	}
	
    /**
     * 用户密码
     * @return
     */	
    public String getUserPwd(){
    	return userPwd;
    }
	/**
	 * 用户邮箱
	 * @param userEmail
	 */
	public void setUserEmail(String userEmail){
		this.userEmail = userEmail;
	}
	
    /**
     * 用户邮箱
     * @return
     */	
    public String getUserEmail(){
    	return userEmail;
    }
}