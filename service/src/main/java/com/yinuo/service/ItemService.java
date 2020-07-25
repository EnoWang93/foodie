package com.yinuo.service;

import com.yinuo.pojo.*;

import java.util.List;

public interface ItemService {
    public Item queryItemById(String itemId);

    public List<ItemImg> queryItemImgList(String itemId);

    public List<ItemSpec> queryItemSpecList(String itemId);

    public ItemParam queryItemParam(String itemId);

}
