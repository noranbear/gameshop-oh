package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.ProductVO;

/**
 * @author qwaszx357
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * product 데이터에 연결
 *
 * =========================================================
 * 	    DATE			   AUTHOR				NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357		   First creation
 *  2022. 6. 22.		 qwaszx357		   getaction add
 *  2022. 6. 24.		 qwaszx357		  	  RPG add
 *  
 * =========================================================
 */
@Repository
@Mapper
public interface ProductMapper {
	
	public void insert(ProductVO p) throws Exception;
	public void delete(int id) throws Exception;
	public void update(ProductVO p) throws Exception;
	
	public ProductVO select(int id) throws Exception;
	public List<ProductVO> selectall() throws Exception;
	
	// New
	public List<ProductVO> newgame() throws Exception;
	
	// Action
	public List<ProductVO> getaction() throws Exception;
	public List<ProductVO> getaction1() throws Exception;
	public List<ProductVO> getaction2() throws Exception;
	public List<ProductVO> getaction3() throws Exception;
	
	// RPG
	public List<ProductVO> getrpg() throws Exception;
	public List<ProductVO> getrpg1() throws Exception;
	public List<ProductVO> getrpg2() throws Exception;
	public List<ProductVO> getrpg3() throws Exception;

}
