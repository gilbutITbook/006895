package com.bookshop01.order.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookshop01.order.vo.OrderVO;

@Repository("orderDAO")
public class OrderDAOImpl implements OrderDAO {
	@Autowired
	private SqlSession sqlSession;
	
	public ArrayList<OrderVO> listMyOrderGoods(OrderVO orderVO) throws Exception{
		ArrayList<OrderVO> orderGoodsList=new ArrayList<OrderVO>();
		orderGoodsList=(ArrayList)sqlSession.selectList("mapper.order.selectMyOrderList",orderVO);
		return orderGoodsList;
	}
	
	public void insertNewOrder(List<OrderVO> myOrderList) throws Exception{
		int order_id=selectOrderID();
		for(int i=0; i<myOrderList.size();i++){
			OrderVO orderVO =(OrderVO)myOrderList.get(i);
			orderVO.setOrder_id(order_id);
			sqlSession.insert("mapper.order.insertNewOrder",orderVO);
		}
		
	}	
	
	public OrderVO findMyOrder(String order_id) throws Exception{
		OrderVO orderBean=(OrderVO)sqlSession.selectOne("mapper.order.selectMyOrder",order_id);		
		return orderBean;
	}
	
	public void removeGoodsFromCart(OrderVO orderVO)throws Exception{
		sqlSession.delete("mapper.order.deleteGoodsFromCart",orderVO);
	}
	
	public void removeGoodsFromCart(List<OrderVO> myOrderList)throws Exception{
		for(int i=0; i<myOrderList.size();i++){
			OrderVO orderVO =(OrderVO)myOrderList.get(i);
			sqlSession.delete("mapper.order.deleteGoodsFromCart",orderVO);		
		}
	}	
	private int selectOrderID() throws Exception{
		return sqlSession.selectOne("mapper.order.selectOrderID");
		
	}
}

