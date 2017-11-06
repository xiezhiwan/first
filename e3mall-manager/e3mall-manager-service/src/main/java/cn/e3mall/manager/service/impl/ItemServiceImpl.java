package cn.e3mall.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.manager.pojo.TbItem;
import cn.e3mall.manager.service.ItemService;
import cn.e3mall.mapper.TbItemMapper;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	//注入dao
	private TbItemMapper itemMapper;
	public TbItem findItemById(Long itemId) {
		TbItem item = itemMapper.selectByPrimaryKey(itemId);
		return item;
	}

}
