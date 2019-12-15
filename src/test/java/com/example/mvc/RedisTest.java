//package com.example.mvc;
//
//import com.example.mvc.util.RedisUtil;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * @version 1.0
// * @Description :
// * Copyright: Copyright (c)2019
// * Company: Tope
// * Created Date : 2019/12/15
// */
//@Slf4j
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = MvcApplication.class)
//public class RedisTest {
//
//    @Autowired
//    private RedisUtil redisUtil;
//
//    @Test
//    public void test(){
//        redisUtil.set("1","zhanghua1");
//        String str = (String) redisUtil.get("1");
//        log.info(str);
//        log.error("hello");
//    }
//
//    @Test
//    public void testList(){
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        redisUtil.lSet("list",list);
//        List<Object> list1 = redisUtil.lGet("list",0,-1);
//        log.info(list1.toString());
//
//    }
//
//    @Test
//    public void testMap(){
//      Map<String,Object> map = new HashMap<>();
//      map.put("1","1");
//      map.put("2","2");
//      redisUtil.hmset("map1",map);
//      Map<Object, Object> map1 = redisUtil.hmget("map1");
//      log.info(map1.toString());
//
//
//    }
//
//
//}
