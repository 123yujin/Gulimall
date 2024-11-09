package com.cwy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cwy.common.utils.PageUtils;
import com.cwy.gulimall.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author yujin
 * @email sunlightcs@gmail.com
 * @date 2024-11-06 16:22:04
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

