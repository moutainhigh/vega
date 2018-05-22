package com.sanlux.trade.settle.service;

import com.sanlux.trade.settle.model.AllinpayTrans;
import io.terminus.common.model.Response;

/**
 * Code generated by terminus code gen
 * Desc: 写服务
 * Date: 2016-10-20
 */

public interface AllinpayTransWriteService {

    /**
     * 创建AllinpayTrans(已去重)
     * @param allinpayTrans 账务
     * @return 主键id
     */
    Response<Long> create(AllinpayTrans allinpayTrans);

    /**
     * 更新AllinpayTrans
     * @param allinpayTrans
     * @return 是否成功
     */
    Response<Boolean> update(AllinpayTrans allinpayTrans);

    /**
     * 根据主键id删除AllinpayTrans
     * @param allinpayTransId
     * @return 是否成功
     */
    Response<Boolean> deleteById(Long allinpayTransId);
}