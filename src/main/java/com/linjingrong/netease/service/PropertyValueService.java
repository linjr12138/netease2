

package com.linjingrong.netease.service;



import java.util.List;

import com.linjingrong.netease.pojo.Product;
import com.linjingrong.netease.pojo.PropertyValue;

public interface PropertyValueService {
    void init(Product p);
    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);
    List<PropertyValue> list(int pid);
}

	
