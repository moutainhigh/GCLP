package com.grape.repository.dao;

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.grape.repository.entity.Goods;

	
public interface GoodsDao extends JpaRepository<Goods, Integer>, JpaSpecificationExecutor<Goods>  {

    Page<Goods> findByName(String name,Pageable pageable);

    
    @Query (value = "select * from goods where name=?1 ORDER BY ?#{#pageable}",
		     countQuery = "select count(1) from goods where name=?1",
		     nativeQuery = true)
    Page<Goods> findByName2(String name,Pageable pageable);
    
    @Query (value = "select new map(id,name) from Goods where name=?1 ORDER BY ?#{#pageable}",
		     countQuery = "select count(1) from Goods where name=?1")
   Page<Map<String,Object>> findByName3(String name,Pageable pageable);
}
