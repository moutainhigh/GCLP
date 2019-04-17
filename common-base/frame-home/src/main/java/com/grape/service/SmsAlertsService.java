package com.grape.service;

import java.util.List;
import java.util.Map;

import com.grape.model.db.Person;
import com.grape.model.db.Smsparam;


public interface SmsAlertsService {
		/**
		 * 
		 * 查询还款短信所需信息
		 * @param map
		 * @return
		 */
		List<Map<String, Object>> findRepaymentList(String startdate,String enddate,String productno);
		/**
		 * 查询逾期短信（客户）所需信息
		 * @param map
		 * @return
		 */
		List<Map<String, Object>> findOverdueList(String productno);
		/**
		 * 查询渠道方逾期短信（内部）所需信息
		 * @param map
		 * @return
		 */
		List<Map<String, Object>> findOverdueListInChannel(String productno);
		/**
		 * 查询平台方逾期短信（内部）所需信息
		 * @param map
		 * @return
		 */
		List<Map<String, Object>> findOverdueListInTerrcae(String productno);
		/**
		 * 查询通道方逾期短信（内部）所需信息
		 * @param map
		 * @return
		 */
		List<Map<String, Object>> findOverdueListInAisle(String productno);
		/**
		 * 查询资金方逾期短信（内部）所需信息
		 * @param map
		 * @return
		 */
		List<Map<String, Object>> findOverdueListInFund(String productno);
		/**
		 * 查询渠道经理逾期短信（内部）所需信息
		 * @param map
		 * @return
		 */
		List<Map<String, Object>> findOverdueListInUserid(String productno);
		/**
		 * 查询还款短信参数模板
		 * @param map
		 * @return
		 */
		List<Smsparam> findSmsparamForRepayment();
		/**
		 * 查询逾期短信（客户）参数模板
		 * @param map
		 * @return
		 */
		List<Smsparam> findSmsparamForOverdue();
		/**
		 * 查询逾期短信（内部）参数模板
		 * @param map
		 * @return
		 */
		List<Smsparam> findSmsparamForOverdueForW();
		/**
		 * 查询验证码短信参数模板
		 * @param map
		 * @return
		 */
		Smsparam findSmsparamForCode();
		/**
		 * 查询贷后人员
		 * @param organizationid
		 * @param roleid
		 * @return
		 */
		List<Person> findPersonInDaihou(String organizationid,String roleid);
 		
}
