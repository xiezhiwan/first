package cn.e3mall.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.manager.pojo.TbItem;
import cn.e3mall.manager.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	// 根据id查询
	@RequestMapping("findItemByID/{itemId}")
	@ResponseBody
	public TbItem findItemById(@PathVariable Long itemId){
		TbItem item = itemService.findItemById(itemId);
		return item;
	}
}
