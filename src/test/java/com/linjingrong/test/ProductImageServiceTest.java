package com.linjingrong.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.linjingrong.netease.pojo.ProductImage;
import com.linjingrong.netease.service.ProductImageService;
import com.linjingrong.netease.service.ProductService;




public class ProductImageServiceTest extends SpringTestCase{
	
	@Autowired
	ProductImageService productImageService;
	Logger logger = Logger.getLogger(ProductService.class);
	@Test
	public void getproductTest(){
		ProductImage productImage = productImageService.get(10170);
		logger.debug("查询结果："+ productImage);
	}

}
