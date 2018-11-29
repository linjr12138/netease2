

package com.linjingrong.netease.service.impl;

import com.linjingrong.netease.mapper.PropertyMapper;
import com.linjingrong.netease.pojo.Category;
import com.linjingrong.netease.pojo.Product;
import com.linjingrong.netease.pojo.Property;
import com.linjingrong.netease.pojo.PropertyExample;
import com.linjingrong.netease.service.CategoryService;
import com.linjingrong.netease.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    PropertyMapper propertyMapper;

    @Override
    public void add(Property p) {
        propertyMapper.insert(p);
    }

    @Override
    public void delete(int id) {
        propertyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Property p) {
        propertyMapper.updateByPrimaryKeySelective(p);
    }

    @Override
    public Property get(int id) {
        return propertyMapper.selectByPrimaryKey(id);
    }

    @Override
    public List list(int cid) {
        PropertyExample example =new PropertyExample();
        example.createCriteria().andCidEqualTo(cid);
        example.setOrderByClause("id desc");
        return propertyMapper.selectByExample(example);
    }



}
