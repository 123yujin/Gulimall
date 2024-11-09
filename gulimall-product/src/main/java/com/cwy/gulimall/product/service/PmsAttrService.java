package com.cwy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cwy.common.utils.PageUtils;
import com.cwy.gulimall.product.entity.PmsAttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author yujin
 * @email sunlightcs@gmail.com
 * @date 2024-11-08 14:32:16
 */
public interface PmsAttrService extends IService<PmsAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
