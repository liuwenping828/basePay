package com.wenping.basepay.component.model;

/**
 * 订单信息
 */
public class OrderInfo {

	private String orderInfo;

	public OrderInfo(String content) {
		orderInfo=content;
	}
	
	public String GetContent(){
		return orderInfo;
	}
}
