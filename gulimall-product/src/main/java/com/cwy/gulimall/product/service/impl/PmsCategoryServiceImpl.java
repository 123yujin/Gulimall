package com.cwy.gulimall.product.service.impl;

import com.cwy.gulimall.product.entity.PmsCategoryBrandRelationEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cwy.common.utils.PageUtils;
import com.cwy.common.utils.Query;

import com.cwy.gulimall.product.dao.PmsCategoryDao;
import com.cwy.gulimall.product.entity.PmsCategoryEntity;
import com.cwy.gulimall.product.service.PmsCategoryService;


@Service("pmsCategoryService")
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryDao, PmsCategoryEntity> implements PmsCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCategoryEntity> page = this.page(
                new Query<PmsCategoryEntity>().getPage(params),
                new QueryWrapper<PmsCategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<PmsCategoryEntity> listWithTree() {
        //1，查出所有分类
        List<PmsCategoryEntity> categoryEntities = baseMapper.selectList(null);
        //2.组装成tree

        //2.1找到所有的一级分类
        categoryEntities.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == 0;
        }).map((menu)->{
            menu.setChildren(getChildrens(menu,categoryEntities));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0: menu1.getSort()) - (menu2.getSort()==null?0: menu2.getSort());
        }).collect(Collectors.toList());

        return categoryEntities;
    }

    @Override
    public void removeMenuByIds(List<Long> list) {
        //TODO

        //逻辑删除
        baseMapper.deleteBatchIds(list);
    }

    //递归查找所有菜单的子菜单
    public List<PmsCategoryEntity> getChildrens(PmsCategoryEntity root,List<PmsCategoryEntity> all) {

        List<PmsCategoryEntity> children = all.stream().filter(pmsCategoryEntity -> {
            return pmsCategoryEntity.getParentCid() == root.getCatId();
        }).map(pmsCategoryEntity -> {
            pmsCategoryEntity.setChildren(getChildrens(pmsCategoryEntity,all));
            return pmsCategoryEntity;
        }).sorted((menu1,menu2) ->{
            return (menu1.getSort()==null?0: menu1.getSort()) - (menu2.getSort()==null?0: menu2.getSort());
        }).collect(Collectors.toList());

        return children;
    }
}