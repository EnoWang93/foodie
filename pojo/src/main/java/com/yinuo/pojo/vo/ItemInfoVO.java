package com.yinuo.pojo.vo;

import com.yinuo.pojo.Item;
import com.yinuo.pojo.ItemImg;
import com.yinuo.pojo.ItemParam;
import com.yinuo.pojo.ItemSpec;

import java.util.List;


public class ItemInfoVO {

    private Item item;
    private List<ItemImg> itemImgList;
    private List<ItemSpec> itemSpecList;
    private ItemParam itemParams;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<ItemImg> getItemImgList() {
        return itemImgList;
    }

    public void setItemImgList(List<ItemImg> itemImgList) {
        this.itemImgList = itemImgList;
    }

    public List<ItemSpec> getItemSpecList() {
        return itemSpecList;
    }

    public void setItemSpecList(List<ItemSpec> itemSpecList) {
        this.itemSpecList = itemSpecList;
    }

    public ItemParam getItemParams() {
        return itemParams;
    }

    public void setItemParams(ItemParam itemParams) {
        this.itemParams = itemParams;
    }
}
