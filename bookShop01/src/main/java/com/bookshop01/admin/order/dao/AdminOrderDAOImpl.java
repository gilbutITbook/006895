package com.bookshop01.admin.order.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookshop01.goods.vo.GoodsVO;
import com.bookshop01.goods.vo.ImageFileVO;
import com.bookshop01.member.vo.MemberVO;
import com.bookshop01.order.vo.OrderVO;

@Repository("adminOrderDAO")
public class AdminOrderDAOImpl  implements AdminOrderDAO{
	@Autowired
	private SqlSession sqlSession;
	
	public ArrayList<OrderVO>selectNewOrderList(Map condMap) throws Exception{
		ArrayList<OrderVO>  orderList=(ArrayList)sqlSession.selectList("mapper.admin.order.selectNewOrderList",condMap);
		return orderList;
	}
	public void  updateDeliveryState(Map deliveryMap) throws Exception{
		sqlSession.update("mapper.admin.order.updateDeliveryState",deliveryMap);
	}
	
	public ArrayList<OrderVO> selectOrderDetail(int order_id) throws Exception{
		ArrayList<OrderVO> orderList=(ArrayList)sqlSession.selectList("mapper.admin.order.selectOrderDetail",order_id);
		return orderList;
	}


	public MemberVO selectOrderer(String member_id) throws Exception{
		MemberVO orderer=(MemberVO)sqlSession.selectOne("mapper.admin.order.selectOrderer",member_id);
		return orderer;
		
	}

}
