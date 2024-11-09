package com.cwy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cwy.common.utils.PageUtils;
import com.cwy.gulimall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author yujin
 * @email sunlightcs@gmail.com
 * @date 2024-11-08 14:32:15
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

