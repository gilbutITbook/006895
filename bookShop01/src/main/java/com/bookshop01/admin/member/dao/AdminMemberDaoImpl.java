package com.bookshop01.admin.member.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookshop01.goods.vo.GoodsVO;
import com.bookshop01.goods.vo.ImageFileVO;
import com.bookshop01.member.vo.MemberVO;
import com.bookshop01.order.vo.OrderVO;

@Repository("adminMemberDao")
public class AdminMemberDaoImpl  implements AdminMemberDao{
	@Autowired
	private SqlSession sqlSession;
	
	
	public ArrayList<MemberVO> listMember(HashMap condMap) throws Exception{
		ArrayList<MemberVO>  memberList=(ArrayList)sqlSession.selectList("mapper.admin.member.listMember",condMap);
		return memberList;
	}
	
	public MemberVO memberDetail(String member_id) throws Exception{
		MemberVO memberBean=(MemberVO)sqlSession.selectOne("mapper.admin.member.memberDetail",member_id);
		return memberBean;
	}
	
	public void modifyMemberInfo(HashMap memberMap) throws Exception{
		sqlSession.update("mapper.admin.member.modifyMemberInfo",memberMap);
	}
	
	

}
