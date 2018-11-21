package com.bookshop01.admin.order.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.bookshop01.goods.vo.GoodsVO;
import com.bookshop01.member.vo.MemberVO;
import com.bookshop01.order.vo.OrderVO;

public interface AdminOrderDAO {
	public ArrayList<OrderVO> selectNewOrderList(Map condMap) throws Exception;
	public void  updateDeliveryState(Map deliveryMap) throws Exception;
	public ArrayList<OrderVO> selectOrderDetail(int order_id) throws Exception;
	public MemberVO selectOrderer(String member_id) throws Exception;
}
