package com.bookshop01.cart.dao;

import java.util.ArrayList;
import java.util.List;

import com.bookshop01.cart.vo.CartVO;
import com.bookshop01.goods.vo.GoodsVO;

public interface CartDAO {
	public List<CartVO> selectCartList(CartVO cartVO) throws Exception;
	public List<GoodsVO> selectGoodsList(List<CartVO> cartList) throws Exception;
	public boolean selectCountInCart(CartVO cartVO) throws Exception;
	public void insertGoodsInCart(CartVO cartVO) throws Exception;
	public void updateCartGoodsQty(CartVO cartVO) throws Exception;
	public void deleteCartGoods(int cart_id) throws Exception;
	
	

}
