package com.test;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class test extends BaseTest {
    @Test
    public void test() throws InterruptedException {
    	//´ò¿ªµÇÂ¼
    	webtest.open("http://www.roqisoft.com/zhsx/");
    	webtest.click("link=µÇÂ¼");
		webtest.type("name=user", "liguanda111");
		webtest.type("name=pw", "123456789");
		webtest.click("class=button");
        webtest.click("class=sub");
        Thread.sleep(3000);
        
        webtest.open("http://www.roqisoft.com/zhsx/blog/admin/mytravel.php?rnd=911683412");
		webtest.click("xpath=//div[@class='padcontent']/section/h4/font/a");
		webtest.type("id=title", "Hello World");
		webtest.type("class=ke-edit-iframe", "Hello World");
		webtest.click("class=button");
		Thread.sleep(3000);

		webtest.open("http://www.roqisoft.com/zhsx/blog/admin/mypic.php?rnd=1019704091");
		webtest.click("xpath=//div[@id='post_bar']/div/span/strong");
		webtest.click("name=html-upload");
		Thread.sleep(3000);

		webtest.open("http://www.roqisoft.com/zhsx/blog/");
		Thread.sleep(3000);
		webtest.click("link=asdkfalsdjfh;lksjad");
		webtest.type("name=comment", "Hello World");
		webtest.click("xpath=//input[@class='submit blue button']");
		Thread.sleep(3000);

    }

}