package com.bookshop01.goods.dao;

import java.util.List;

import com.bookshop01.goods.vo.GoodsVO;

public interface GoodsDAO {
	public List selectGoodsList(String goodsStatus ) throws Exception;
	public List selectKeywordSearch(String keyword) throws Exception;
	public GoodsVO selectGoodsDetail(String goods_id) throws Exception;
	public List selectGoodsDetailImage(String goods_id) throws Exception;
	public List selectGoodsBySearchWord(String searchWord) throws Exception;
}
