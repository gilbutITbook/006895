package com.bookshop01.order.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bookshop01.order.vo.OrderVO;

public interface OrderDAO {
	public ArrayList<OrderVO> listMyOrderGoods(OrderVO orderBean) throws Exception;
	public void insertNewOrder(List<OrderVO> myOrderList) throws Exception;
	public OrderVO findMyOrder(String order_id) throws Exception;
	public void removeGoodsFromCart(List<OrderVO> myOrderList)throws Exception;
}
