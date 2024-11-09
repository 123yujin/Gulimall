package com.cwy.gulimall.member.dao;

import com.cwy.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yujin
 * @email sunlightcs@gmail.com
 * @date 2024-11-06 16:18:11
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
