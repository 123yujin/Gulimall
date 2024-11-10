package com.cwy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cwy.common.utils.PageUtils;
import com.cwy.gulimall.product.entity.PmsCategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author yujin
 * @email sunlightcs@gmail.com
 * @date 2024-11-08 14:32:16
 */
public interface PmsCategoryService extends IService<PmsCategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<PmsCategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> list);
}

