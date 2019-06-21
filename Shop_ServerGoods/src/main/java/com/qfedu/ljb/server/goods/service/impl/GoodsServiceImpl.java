package com.qfedu.ljb.server.goods.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.common.vo.PageBean;
import com.qfedu.common.vo.R;
import com.qfedu.ljb.server.goods.dao.GoodsMapper;
import com.qfedu.ljb.server.goods.dto.GoodsListDto;
import com.qfedu.ljb.server.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public R queryIndexNew() {
        return R.setOK("OK",goodsMapper.selectAll(null));
    }

    @Override
    public R queryPage(Map<String, String> map) {
        int page=Integer.parseInt(map.get("page"));
        int count=Integer.parseInt(map.get("count"));
        Page<GoodsListDto> pageObj=PageHelper.startPage(page,count);
        PageBean<GoodsListDto> pageBean=new PageBean();
        pageBean.setCount(count);
        pageBean.setCurrPage(page);
        pageBean.setTotalCount((int)pageObj.getTotal());
        pageBean.setTotalPage(pageObj.getPages());
        pageBean.setData(pageObj.getResult());
        return R.setOK("OK",pageBean);
    }

    @Override
    public R queryDetail(int id) {
        return R.setOK("OK",goodsMapper.selectDetail(id));
    }
}
