package com.bookshop01.mypage.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bookshop01.member.vo.MemberVO;
import com.bookshop01.mypage.vo.MyPageVO;
import com.bookshop01.order.vo.OrderVO;

public interface MyPageDAO {
	public List<OrderVO> selectMyOrderGoodsList(String member_id) throws Exception;
	public List selectMyOrderInfo(String order_id) throws Exception;
	public List<OrderVO> selectMyOrderHistoryList(Map dateMap) throws Exception;
	public void updateMyInfo(Map memberMap) throws Exception;
	public MemberVO selectMyDetailInfo(String member_id) throws Exception;
	public void updateMyOrderCancel(String order_id) throws Exception;
}
