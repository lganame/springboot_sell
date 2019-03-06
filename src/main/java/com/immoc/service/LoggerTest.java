package com.immoc.service;

import javafx.application.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/*@RunWith(SpringRunner.class)
@SpringBootTest*/
@Slf4j
public class LoggerTest {
    /*填加类名参数以便打印时带上当前类名*/
    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1(){
        logger.debug("debug...");
        logger.info("info...");
        logger.error("error...");
    }
    @Test
    public void test2(){
        String name = "imooc";
        String password = "123456";
        log.debug("test2 debug...");
        log.info("test2 info...");
        log.error("test2 error...");

    }
}
