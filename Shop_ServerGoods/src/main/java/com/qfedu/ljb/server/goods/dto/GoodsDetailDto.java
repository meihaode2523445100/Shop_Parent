package com.qfedu.ljb.server.goods.dto;

import lombok.Data;

import java.util.List;
@Data
public class GoodsDetailDto extends GoodsListDto {
    private List<GoodsSkuDto> skuDtoList;
}
