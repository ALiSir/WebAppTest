package com.alisir.pw.login;

import java.io.PrintWriter;
import java.io.Reader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginServer implements Controller  {
	private SqlSession session;
	private LoginDB db;

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		setSession();
		PrintWriter out = arg1.getWriter();
		
		try{
			db = session.getMapper(LoginDB.class);
			db.findUser();
			out.print("Connect DB Succeed!");
		}catch(Exception e){
			e.printStackTrace();
			out.print("Connect DB faild!");
		}
		
		out.print("  I'am WebAppTest!");
		return null;
	}
	
	//设置session
	public void setSession(){
		try{
			String resource = "mybatis.xml";  
	        Reader reader = Resources.getResourceAsReader(resource);  
	        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);  
	        session = ssf.openSession();  
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
}
