package com.bookshop01.goods.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.bookshop01.goods.vo.GoodsVO;

public interface GoodsDAO {
	public List selectGoodsList(String goodsStatus ) throws DataAccessException;
	public List selectKeywordSearch(String keyword) throws DataAccessException;
	public GoodsVO selectGoodsDetail(String goods_id) throws DataAccessException;
	public List selectGoodsDetailImage(String goods_id) throws DataAccessException;
	public List selectGoodsBySearchWord(String searchWord) throws DataAccessException;
}
