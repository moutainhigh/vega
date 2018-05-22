package com.sanlux.category.impl.dao;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.sanlux.category.model.CategoryAuthe;
import io.terminus.common.mysql.dao.MyBatisDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Code generated by terminus code gen
 * Desc: 经销商授权类目Dao类
 * Date: 2016-08-04
 */
@Repository
public class CategoryAutheDao extends MyBatisDao<CategoryAuthe> {

    /**
     * 根据店铺ID获取授权类目表
     * @param shopId 店铺ID
     * @return 授权类目表
     */
    public Optional<CategoryAuthe> findByShopId(Long shopId) {
        return Optional.fromNullable(
                getSqlSession().<CategoryAuthe>selectOne(sqlId("findByShopId"), shopId));
    }

    public List<CategoryAuthe> findByShopIds(List<Long> shopIds) {
        return getSqlSession().selectList(sqlId("findByShopIds"), shopIds);
    }

    public Boolean updateDiscountLowerLimitByShopId(Long shopId, Integer discountLowerLimit) {
        return getSqlSession().update("updateDiscountLowerLimitByShopId",
                ImmutableMap.of("shopId", shopId, "discountLowerLimit", discountLowerLimit)) > 0;
    }
}