package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

/**
 * @author qwaszx357
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * Product Insert Test
 *
 * =========================================================
 * 	    DATE			   AUTHOR				NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357		  First creation
 *  
 * =========================================================
 */
@SpringBootTest
class ProductInsertTests {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		ProductVO p = new ProductVO(0,"product1",10000,"1GB","dev1","2022-06-20",11);
		
		try {
			biz.register(p);
			System.out.println("Inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
