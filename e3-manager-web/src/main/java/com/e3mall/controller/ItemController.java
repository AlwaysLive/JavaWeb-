package com.e3mall.controller;

import com.e3mall.pojo.TbItem;
import com.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by YuKai Fan on 2018/7/26.
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        TbItem tbItem = itemService.getItemById(itemId);
        System.out.println("提交成功怎么说");
        return tbItem;
    }
}
