package com.bookshop01.admin.goods.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.bookshop01.goods.vo.GoodsVO;
import com.bookshop01.goods.vo.ImageFileVO;
import com.bookshop01.order.vo.OrderVO;

public interface AdminGoodsDAO {
	public int insertNewGoods(Map newGoodsMap) throws Exception;
	public List<GoodsVO>selectNewGoodsList(Map condMap) throws Exception;
	public GoodsVO selectGoodsDetail(int goods_id) throws Exception;
	public List selectGoodsImageFileList(int goods_id) throws Exception;
	public void insertGoodsImageFile(List fileList)  throws Exception;
	public void updateGoodsInfo(Map goodsMap) throws Exception;
	public void updateGoodsImage(List<ImageFileVO> imageFileList) throws Exception;
	public void deleteGoodsImage(int image_id) throws Exception;
	public void deleteGoodsImage(List fileList) throws Exception;
	public List<OrderVO> selectOrderGoodsList(Map condMap) throws Exception;
	public void updateOrderGoods(Map orderMap) throws Exception;
	
}
