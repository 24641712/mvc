package com.example.mvc.hellocontroller;

import com.example.mvc.entity.Student;
import com.example.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Description :
 * Copyright: Copyright (c)2019
 * Company: Tope
 * Created Date : 2019/9/8
 * @version 1.0
 */
@Controller
public class HelloController {

     @RequestMapping(value = "index",method = RequestMethod.GET)
     public String index(){
          return "index";
     }

     @RequestMapping(value = "/hello1")
     @ResponseBody
     public String hello1(@ModelAttribute User user){
          System.out.println(user.toString());
       return "亲爱的你好，你的年级虽然只有岁，你的罩杯却是";
     }

     @RequestMapping(value = "/hello")
     @ResponseBody
     public String hello(@RequestBody Student student){
          System.out.println(student.toString());
          return "亲爱的你好，你的年级虽然只有岁，你的罩杯却是";
     }

     @RequestMapping(value = "/hello3")
     @ResponseBody
     public String hello3(int ID){
          System.out.println("亲爱的你好，"+ID);
          return "亲爱的你好，你的年级虽然只有18岁，你的罩杯却是D";
     }



}
