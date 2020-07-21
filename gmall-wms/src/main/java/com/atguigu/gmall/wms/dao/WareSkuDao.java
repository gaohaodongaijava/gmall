package com.atguigu.gmall.wms.dao;

import com.atguigu.gmall.wms.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author gaohaodong
 * @email nuc_gaohaodong@163.com
 * @date 2020-07-21 15:01:40
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
