package com.linjingrong.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.linjingrong.netease.pojo.Product;
import com.linjingrong.netease.service.CategoryService;
import com.linjingrong.netease.service.ProductService;




public class ProductServiceTest extends SpringTestCase{
	
	@Autowired
	ProductService productService;
	@Autowired
	CategoryService categoryService;
	Logger logger = Logger.getLogger(ProductService.class);
	@Test
	public void getidtest(){
		Product p = productService.get(87);
		logger.debug("查询结果："+p);
	}
	@Test
	public void getproductlist(){
		List list = productService.list(81);
		logger.debug("查询结果："+list);
	}
	@Test
	public void categoryServicetest(){
		List list = categoryService.list();
		
		logger.debug("查询结果："+list);
	}

}
