package com.linjingrong.netease.mapper;


import java.util.List;

import com.linjingrong.netease.pojo.Order;
import com.linjingrong.netease.pojo.OrderExample;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}

