package com.taotao.service;

import  com.taotao.pojo.TbUser;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * service  接口定义   为了使用消费者所以要这样写
 *@FeignClient(name= "spring-eurake-client1")
 */
@FeignClient(name= "spring-eurake-client1")
public interface Userservice {
        /**
         * 查询全部的用户
         * @return
         */
        @RequestMapping(value = "/show",method = RequestMethod.GET)
        List<TbUser> selecruser();
       /* *//**
         *
         * 根据用户名称查寻用户在
         *//*
        @RequestMapping(value = "selectByUnameAndPassword",method = RequestMethod.POST)
        TbUser  selectByUnameAndPassword(TbUser tbUser);*/
}
