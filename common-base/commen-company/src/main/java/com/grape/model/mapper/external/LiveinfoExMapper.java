package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Liveinfo;
@Mapper
public interface LiveinfoExMapper {
		
		/**
		 * 按结束时间降序查询
		 * @param map 流水号
		 * @return
		 */
		List<Liveinfo> findLiveinfoListOrderByEndtimeDesc(Map<String, String> map);
		
		/**
		 * 按开始时间升序查询
		 * @param map 流水号
		 * @return
		 */
		List<Liveinfo> findLiveinfoListOrderByStarttimeAsc(Map<String, String> map);
		
		/**
		 * 查询直播类型
		 * @param workid
		 * @return
		 */
		List<String> findByWorkid(Map<String, String> map);
		
}
