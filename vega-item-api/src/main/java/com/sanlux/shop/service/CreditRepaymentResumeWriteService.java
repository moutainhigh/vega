package com.sanlux.shop.service;

import com.sanlux.shop.model.CreditRepaymentResume;
import io.terminus.common.model.Response;

/**
 * Code generated by terminus code gen
 * Desc: 还款履历表写服务
 * Date: 2016-08-29
 */
public interface CreditRepaymentResumeWriteService {

    /**
     * 创建CreditRepaymentResume
     * @param creditRepaymentResume 履历信息
     * @return 主键id
     */
    Response<Long> create(CreditRepaymentResume creditRepaymentResume);

    /**
     * 更新CreditRepaymentResume
     * @param creditRepaymentResume 履历信息
     * @return 是否成功
     */
    Response<Boolean> update(CreditRepaymentResume creditRepaymentResume);

    /**
     * 根据主键id删除CreditRepaymentResume
     * @param id 履历信息
     * @return 是否成功
     */
    Response<Boolean> deleteById(Long id);
}