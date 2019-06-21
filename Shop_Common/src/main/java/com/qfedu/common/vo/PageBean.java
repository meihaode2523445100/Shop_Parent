package com.qfedu.common.vo;

import lombok.Data;

import java.util.List;

@Data
public class PageBean<T> {
    private int currPage;//当前页
    private int totalCount;//总条数
    private int count;//每页显示多少条
    private int totalPage;//总页数
    private List<T> data;//数据
}
