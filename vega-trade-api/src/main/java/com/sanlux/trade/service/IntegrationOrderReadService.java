package com.sanlux.trade.service;

import com.sanlux.trade.dto.IntegrationOrderCriteria;
import com.sanlux.trade.model.IntegrationOrder;
import io.terminus.common.model.Paging;
import io.terminus.common.model.Response;

import java.util.List;

/**
 * Code generated by terminus code gen
 * Desc: 积分商品订单读服务
 * Date: 2016-11-07
 */

public interface IntegrationOrderReadService {

    /**
     * 根据id查询积分商品订单
     * @param id 主键id
     * @return 积分商品订单
     */
    Response<IntegrationOrder> findById(Long id);

    /**
     *  积分订单分页
     * @param criteria 查询条件
     * @return Paging
     */
    Response<Paging<IntegrationOrder>> paging (IntegrationOrderCriteria criteria);
}
