package com.taotao;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.taotao.pojo.TbUser;
import com.taotao.service.Userservice;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.Request;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

   /* @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${server.port}")
    private String ip;

    @GetMapping("/client")
    public String client() {
        String services = "Services: " + discoveryClient.getServices()+" ip :"+ip;

        System.out.println(services);
        return services;
    }*/
    @Autowired
    private   Userservice  userservice;

    @HystrixCommand(fallbackMethod = "fallbackmethod")   //熔断
    @RequestMapping(value ="/show",method = RequestMethod.GET)
    public String show(HttpServletRequest request) {
        System.out.println("yuntao");
        List<TbUser>list  = userservice.selecruser();
        request.setAttribute("list",list);
        return "index";
    }
    public   String   fallbackmethod(HttpServletRequest request){
        System.out.println("sss+++++++++++++++++++++++++++++++==");
        List<TbUser>list  =new ArrayList<>();
        TbUser  tb  = new TbUser();
        tb.setUsername("yyyy");
        list.add(tb);
        request.setAttribute("list",list);
       return "errors";
    }
}
