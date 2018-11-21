package com.bookshop01.order.vo;

import org.springframework.stereotype.Component;

@Component("orderVO")
public class OrderVO {
	private int order_seq_num;
	private String member_id;
	private int order_id;
	private int goods_id;
	private String goods_title;
	private int goods_sales_price;
	private int total_goods_price;
	private int cart_goods_qty; //장바구니에 담긴 제품 수
	private int order_goods_qty; //최종 주문  제품 수
	private String orderer_name;
	private String receiver_name;
	private String receiver_hp1;
	private String receiver_hp2;
	private String receiver_hp3;
	private String receiver_tel1;
	private String receiver_tel2;
	private String receiver_tel3;
	
	private String delivery_address;
	private String delivery_message;
	private String delivery_method;
	private String gift_wrapping;
	private String pay_method;
	private String card_com_name;
	private String card_pay_month;
	private String pay_orderer_hp_num; //휴대폰 결제 전화번호
	private String pay_order_time;
	private String delivery_state;  //현재 주문 상품 배송 상태
	
	private String final_total_price;
	private int goods_qty;
	private String goods_fileName;
	private String orderer_hp;
	
	
	
	
	
	public int getOrder_seq_num() {
		return order_seq_num;
	}
	public void setOrder_seq_num(int order_seq_num) {
		this.order_seq_num = order_seq_num;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getGoods_title() {
		return goods_title;
	}
	public void setGoods_title(String goods_title) {
		this.goods_title = goods_title;
	}
	
	
	
	
	public int getGoods_sales_price() {
		return goods_sales_price;
	}
	public void setGoods_sales_price(int goods_sales_price) {
		this.goods_sales_price = goods_sales_price;
	}
	public String getGoods_fileName() {
		return goods_fileName;
	}
	public void setGoods_fileName(String goods_fileName) {
		this.goods_fileName = goods_fileName;
	}
	public String getFinal_total_price() {
		return final_total_price;
	}
	public void setFinal_total_price(String final_total_price) {
		this.final_total_price = final_total_price;
	}
	public int getGoods_qty() {
		return goods_qty;
	}
	public void setGoods_qty(int goods_qty) {
		this.goods_qty = goods_qty;
	}
	
	
	public int getTotal_goods_price() {
		return total_goods_price;
	}
	public void setTotal_goods_price(int total_goods_price) {
		this.total_goods_price = total_goods_price;
	}
	public int getCart_goods_qty() {
		return cart_goods_qty;
	}
	public void setCart_goods_qty(int cart_goods_qty) {
		this.cart_goods_qty = cart_goods_qty;
	}
	
	
	public int getOrder_goods_qty() {
		return order_goods_qty;
	}
	public void setOrder_goods_qty(int order_goods_qty) {
		this.order_goods_qty = order_goods_qty;
	}
	public String getOrderer_name() {
		return orderer_name;
	}
	public void setOrderer_name(String orderer_name) {
		this.orderer_name = orderer_name;
	}
	public String getReceiver_name() {
		return receiver_name;
	}
	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}
	
	
	
	public String getReceiver_hp1() {
		return receiver_hp1;
	}
	public void setReceiver_hp1(String receiver_hp1) {
		this.receiver_hp1 = receiver_hp1;
	}
	public String getReceiver_hp2() {
		return receiver_hp2;
	}
	public void setReceiver_hp2(String receiver_hp2) {
		this.receiver_hp2 = receiver_hp2;
	}
	public String getReceiver_hp3() {
		return receiver_hp3;
	}
	
	
	public String getReceiver_tel1() {
		return receiver_tel1;
	}
	public void setReceiver_tel1(String receiver_tel1) {
		this.receiver_tel1 = receiver_tel1;
	}
	public String getReceiver_tel2() {
		return receiver_tel2;
	}
	public void setReceiver_tel2(String receiver_tel2) {
		this.receiver_tel2 = receiver_tel2;
	}
	public String getReceiver_tel3() {
		return receiver_tel3;
	}
	public void setReceiver_tel3(String receiver_tel3) {
		this.receiver_tel3 = receiver_tel3;
	}
	public void setReceiver_hp3(String receiver_hp3) {
		this.receiver_hp3 = receiver_hp3;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	public String getDelivery_message() {
		return delivery_message;
	}
	public void setDelivery_message(String delivery_message) {
		this.delivery_message = delivery_message;
	}
	public String getDelivery_method() {
		return delivery_method;
	}
	public void setDelivery_method(String delivery_method) {
		this.delivery_method = delivery_method;
	}
	public String getGift_wrapping() {
		return gift_wrapping;
	}
	public void setGift_wrapping(String gift_wrapping) {
		this.gift_wrapping = gift_wrapping;
	}
	public String getPay_method() {
		return pay_method;
	}
	public void setPay_method(String pay_method) {
		this.pay_method = pay_method;
	}
	public String getCard_com_name() {
		return card_com_name;
	}
	public void setCard_com_name(String card_com_name) {
		this.card_com_name = card_com_name;
	}
	public String getCard_pay_month() {
		return card_pay_month;
	}
	public void setCard_pay_month(String card_pay_month) {
		this.card_pay_month = card_pay_month;
	}
	
	
	public String getPay_order_time() {
		return pay_order_time;
	}
	public void setPay_order_time(String pay_order_time) {
		this.pay_order_time = pay_order_time;
	}
	public String getPay_orderer_hp_num() {
		return pay_orderer_hp_num;
	}
	public void setPay_orderer_hp_num(String pay_orderer_hp_num) {
		this.pay_orderer_hp_num = pay_orderer_hp_num;
	}
	public String getDelivery_state() {
		return delivery_state;
	}
	public void setDelivery_state(String delivery_state) {
		this.delivery_state = delivery_state;
	}
	public String getOrderer_hp() {
		return orderer_hp;
	}
	public void setOrderer_hp(String orderer_hp) {
		this.orderer_hp = orderer_hp;
	}
	
	

}
