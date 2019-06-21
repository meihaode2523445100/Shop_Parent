package com.qfedu.ljb.server.goods.service;

import com.qfedu.common.vo.R;

import java.util.Map;

public interface GoodsService {
    R queryIndexNew();
    R queryPage(Map<String,String> map);
    R queryDetail(int id);

}
