package com.alonzo.sparkproject.dao.impl;

import com.alonzo.sparkproject.dao.ISessionAggrStatDAO;
import com.alonzo.sparkproject.dao.ISessionDetailDAO;
import com.alonzo.sparkproject.dao.ISessionRandomExtractDAO;
import com.alonzo.sparkproject.dao.ITaskDAO;

/**
 * DAO工厂类
 * @author Administrator
 *
 */
public class DAOFactory {

	/**
	 * 获取任务管理DAO
	 * @return DAO
	 */
	public static ITaskDAO getTaskDAO() {
		return new TaskDAOImpl();
	}
	
	public static ISessionAggrStatDAO getSessionAggrStatDAO() {
		return new SessionAggrStatDAOImpl();
	}
	
	public static ISessionRandomExtractDAO getSessionRandomExtractDAO() {
		return new SessionRandomExtractDAOImpl();
	}
	
	public static ISessionDetailDAO getSessionDetailDAO() {
		return new SessionDetailDAOImpl();
	}
}
