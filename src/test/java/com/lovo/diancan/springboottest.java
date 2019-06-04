package com.lovo.diancan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lovo.diancan.service.CategoryService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=T.class)
public class springboottest {
	@Autowired
	CategoryService cs;
	@Test
	public void addcate() {
		System.out.println(16);
	}

}
