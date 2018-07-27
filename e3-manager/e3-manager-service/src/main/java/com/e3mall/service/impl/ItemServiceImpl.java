package com.e3mall.service.impl;

import com.e3mall.mapper.TbItemMapper;
import com.e3mall.pojo.TbItem;
import com.e3mall.pojo.TbItemExample;
import com.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by YuKai Fan on 2018/7/26.
 */
@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(long id) {
        //根据主键查询
        //TbItem tbItem = itemMapper.selectByPrimaryKey(id);
        //设置查询条件
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<TbItem> tbItemsList = itemMapper.selectByExample(example);
        if (tbItemsList != null && tbItemsList.size() > 0) {
            return  tbItemsList.get(0);
        }
        return null;
    }
}
