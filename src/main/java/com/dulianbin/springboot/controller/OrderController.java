package com.dulianbin.springboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dulianbin.springboot.entity.Order;
import com.dulianbin.springboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangxc on 2017/11/10 10:19.
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("queryOrderByUserId")
    public List<Order> queryOrderByUserId(Long userId){
        List<Order> orders = orderService.list(new QueryWrapper<Order>().eq("user_id",userId));
        return orders;
    }

    @RequestMapping("queryOrderList")
    public List<Order> queryOrderList(){
        List<Order> orders = orderService.list();
        return orders;
    }

    @GetMapping("save")
    public Object save(){
        for(int i=1000;i<1200;i++){
            Order order=new Order();
            order.setOrderId(Long.parseLong(i+""));
            order.setUserId(i);
            order.setStatus("mysql分片存储");
            orderService.save(order);
        }
        return "success";
    }
}
