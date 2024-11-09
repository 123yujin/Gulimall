package com.cwy.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cwy.common.utils.PageUtils;
import com.cwy.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author yujin
 * @email sunlightcs@gmail.com
 * @date 2024-11-06 16:25:35
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
