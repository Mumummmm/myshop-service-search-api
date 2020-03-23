package com.spike.myshop.service.search.domain;

import lombok.Data;

@Data
public class TbItemResult {
    private long id;
    private long tbItemCid;
    private String tbItemCname;
    private String tbItemTitle;
    private String tbItemSellPoint;
    private String tbItemDesc;
}
