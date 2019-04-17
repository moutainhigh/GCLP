package com.grape.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;


/** 
 * 对mapper进行了封装，也就是可以用mapper作为参数传入进去
 * @author lijl
 * @category dao包基类
 * @version 1.0 2015年4月13日
 */
public abstract class BaseMapper{
	@Autowired
	private SqlSession session;
public BaseMapper() {
	// TODO Auto-generated constructor stub
}	private String buildsql(Class<?> mapper,String sql){
		return mapper.getName() + "." + sql;
	}
	
	protected int delete(Class<?> mapper,String sql) {
		return session.delete(buildsql(mapper,sql));
	}

	protected int delete(Class<?> mapper,String sql, Object arg) {
		return session.delete(buildsql(mapper,sql), arg);
	}

	protected <T> T getMapper(Class<T> mapper) {
		return session.getMapper(mapper);
	}

	protected int insert(Class<?> mapper,String sql) {
		return session.insert(buildsql(mapper,sql));
	}

	protected int insert(Class<?> mapper,String sql, Object arg) {
		return session.insert(buildsql(mapper,sql),arg);
	}

	protected void select(Class<?> mapper,String sql, ResultHandler resulthandler) {
		 session.select(buildsql(mapper,sql), resulthandler);
	}

	protected void select(Class<?> mapper,String sql, Object arg, ResultHandler resulthandler) {
		 session.select(buildsql(mapper,sql),arg, resulthandler);
	}

	protected void select(Class<?> mapper,String sql, Object arg, RowBounds rowbound,ResultHandler resulthandler) {
		 session.select(buildsql(mapper,sql),arg,rowbound, resulthandler);
	}

	protected <E> List<E> selectList(Class<?> mapper,String sql) {
		return session.selectList(buildsql(mapper,sql));
	}

	protected <E> List<E> selectList(Class<?> mapper,String sql, Object arg) {
		return session.selectList(buildsql(mapper,sql),arg);
	}

	protected <E> List<E> selectList(Class<?> mapper,String sql, Object arg, RowBounds rowbound) {
		return session.selectList(buildsql(mapper,sql),arg,rowbound);
	}

	protected <K, V> Map<K, V> selectMap(Class<?> mapper,String sql, String arg) {
		return session.selectMap(buildsql(mapper,sql),arg);
	}

	protected <K, V> Map<K, V> selectMap(Class<?> mapper,String sql, Object arg1, String arg2) {
		return session.selectMap(buildsql(mapper,sql),arg1,arg2);
	}

	protected <K, V> Map<K, V> selectMap(Class<?> mapper,String sql,  Object arg1, String arg2,
			RowBounds rowbound) {
		return session.selectMap(buildsql(mapper,sql),arg1,arg2,rowbound);
	}

	protected <T> T selectOne(Class<?> mapper,String sql) {
		return (T) session.selectOne(buildsql(mapper,sql));
	}

	protected <T> T selectOne(Class<?> mapper,String sql ,Object arg) {
		return (T) session.selectOne(buildsql(mapper,sql),arg);
	}

	protected int update(Class<?> mapper,String sql) {
		return session.update(buildsql(mapper,sql));
	}

	protected int update(Class<?> mapper,String sql, Object arg) {
		return session.update(buildsql(mapper,sql),arg);
	}
	
	protected <E> List<E>  queryList(Class<?> mapper,String sql , Object paramObj , PageBean pageBean){
		return session.selectList(buildsql(mapper,sql), paramObj , new RowBounds(pageBean.getPageSize()*pageBean.getCurrentPage(),pageBean.getPageSize()));
	}
	
	protected <E> List<E>  selectByExample(Class<?> mapper,Object example){
		return queryList(mapper,"selectByExample", example);
	}
	
	protected <E> List<E>  queryList(Class<?> mapper,String sql , Object paramObj){
		return session.selectList(buildsql(mapper,sql), paramObj);
	}
	

	protected <E> List<E>  selectByExample(Class<?> mapper,Object example, PageBean pageBean){
		return queryList(mapper,"selectByExample", example, pageBean);
	}
	
	protected Integer countByExample(Class<?> mapper,Object example){
		return session.selectOne(buildsql(mapper,"countByExample"),example);
	}
}
