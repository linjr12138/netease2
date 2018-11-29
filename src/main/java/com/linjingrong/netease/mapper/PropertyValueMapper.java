
package com.linjingrong.netease.mapper;


import java.util.List;

import com.linjingrong.netease.pojo.PropertyValue;
import com.linjingrong.netease.pojo.PropertyValueExample;

public interface PropertyValueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PropertyValue record);

    int insertSelective(PropertyValue record);

    List<PropertyValue> selectByExample(PropertyValueExample example);

    PropertyValue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PropertyValue record);

    int updateByPrimaryKey(PropertyValue record);
}

