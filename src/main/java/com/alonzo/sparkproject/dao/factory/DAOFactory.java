package com.alonzo.sparkproject.dao.factory;

import com.alonzo.sparkproject.dao.IAreaTop3ProductDAO;
import com.alonzo.sparkproject.dao.IPageSplitConvertRateDAO;
import com.alonzo.sparkproject.dao.ISessionAggrStatDAO;
import com.alonzo.sparkproject.dao.ISessionDetailDAO;
import com.alonzo.sparkproject.dao.ISessionRandomExtractDAO;
import com.alonzo.sparkproject.dao.ITaskDAO;
import com.alonzo.sparkproject.dao.ITop10CategoryDAO;
import com.alonzo.sparkproject.dao.ITop10SessionDAO;
import com.alonzo.sparkproject.dao.impl.AreaTop3ProductDAOImpl;
import com.alonzo.sparkproject.dao.impl.PageSplitConvertRateDAOImpl;
import com.alonzo.sparkproject.dao.impl.SessionAggrStatDAOImpl;
import com.alonzo.sparkproject.dao.impl.SessionDetailDAOImpl;
import com.alonzo.sparkproject.dao.impl.SessionRandomExtractDAOImpl;
import com.alonzo.sparkproject.dao.impl.TaskDAOImpl;
import com.alonzo.sparkproject.dao.impl.Top10CategoryDAOImpl;
import com.alonzo.sparkproject.dao.impl.Top10SessionDAOImpl;

/**
 * DAO工厂类
 * @author Administrator
 *
 */
public class DAOFactory {

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
	
	public static ITop10CategoryDAO getTop10CategoryDAO() {
		return new Top10CategoryDAOImpl();
	}
	
	public static ITop10SessionDAO getTop10SessionDAO() {
		return new Top10SessionDAOImpl();
	}
	
	public static IPageSplitConvertRateDAO getPageSplitConvertRateDAO() {
		return new PageSplitConvertRateDAOImpl();
	}
	
	public static IAreaTop3ProductDAO getAreaTop3ProductDAO() {
		return new AreaTop3ProductDAOImpl();
	}
}
