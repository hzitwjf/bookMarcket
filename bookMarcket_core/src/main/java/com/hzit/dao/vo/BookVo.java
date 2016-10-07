package com.hzit.dao.vo;

/**
 * 
 * @author maxiang
 */
public class BookVo {
	/**
	 *  图书id
	 */
	private Integer bookId;
	/**
	 *  图书作者
	 */
	private String bookAuthor;
	/**
	 *  图书库存
	 */
	private Integer bookStock;
	/**
	 *  图书的价格
	 */
	private Integer bookPrice;
	/**
	 *  图书的图片预览
	 */
	private String bookPicUrl;

	private Integer shopCount;

	public Integer getShopCount() {
		return shopCount;
	}

	public void setShopCount(Integer shopCount) {
		this.shopCount = shopCount;
	}

	/**
	 * 图书id
	 * @param bookId
	 */
	public void setBookId(Integer bookId){
		this.bookId = bookId;
	}


    /**
     * 图书id
     * @return Integer
     */	
    public Integer getBookId(){
    	return bookId;
    }
	/**
	 * 图书作者
	 * @param bookAuthor
	 */
	public void setBookAuthor(String bookAuthor){
		this.bookAuthor = bookAuthor;
	}
	
    /**
     * 图书作者
     * @return String
     */	
    public String getBookAuthor(){
    	return bookAuthor;
    }
	/**
	 * 图书库存
	 * @param bookStock
	 */
	public void setBookStock(Integer bookStock){
		this.bookStock = bookStock;
	}
	
    /**
     * 图书库存
     * @return Integer
     */	
    public Integer getBookStock(){
    	return bookStock;
    }
	/**
	 * 图书的价格
	 * @param bookPrice
	 */
	public void setBookPrice(Integer bookPrice){
		this.bookPrice = bookPrice;
	}
	
    /**
     * 图书的价格
     * @return Integer
     */	
    public Integer getBookPrice(){
    	return bookPrice;
    }
	/**
	 * 图书的图片预览
	 * @param bookPicUrl
	 */
	public void setBookPicUrl(String bookPicUrl){
		this.bookPicUrl = bookPicUrl;
	}
	
    /**
     * 图书的图片预览
     * @return String
     */	
    public String getBookPicUrl(){
    	return bookPicUrl;
    }
}