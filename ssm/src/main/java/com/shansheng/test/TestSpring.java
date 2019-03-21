package com.shansheng.test;

import com.shansheng.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 帅气胡
 * @date 2019/3/15 14:54
 */
public class TestSpring {

    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService as = (AccountService) ac.getBean("accountService");
        //调用方法
        as.findAll();
    }

}
