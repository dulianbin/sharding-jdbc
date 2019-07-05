package com.dulianbin.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dulianbin.springboot.entity.Order;
import com.dulianbin.springboot.mapper.OrderMapper;
import com.dulianbin.springboot.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * Created by wangxc on 2017/11/10 10:17.
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper,Order> implements OrderService{
}
