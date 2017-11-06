package cn.e3mall.manager.service;

import cn.e3mall.manager.pojo.TbItem;

public interface ItemService {

	//根据id查询商品
	public TbItem findItemById(Long itemId);
}
