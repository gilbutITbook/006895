package com.spring.account;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;

public class AccountDAO {
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public void updateBalance1() throws DataAccessException {
		AccountVO accountVO = new AccountVO("70-490-930","È«±æµ¿",5000000);
		sqlSession.update("mapper.account.updateBalance1");
	}
	
	public void updateBalance2() throws DataAccessException {
		AccountVO accountVO = new AccountVO("70-490-911","±èÀ¯½Å",5000000);
		sqlSession.update("mapper.account.updateBalance2");
	}
	

}
