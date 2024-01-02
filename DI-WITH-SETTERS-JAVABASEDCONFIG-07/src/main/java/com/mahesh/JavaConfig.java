package com.mahesh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig 
{
	@Bean("id1")
	public ProductBean getProductBean()
	{
		ProductBean p1=new ProductBean();
		p1.setpId(101);
		p1.setpName("Dell Laptop");
		p1.setPrice(45000.90);
		return p1;
	}

}
