package com.cwy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cwy.common.utils.PageUtils;
import com.cwy.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author yujin
 * @email sunlightcs@gmail.com
 * @date 2024-11-06 16:18:11
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

