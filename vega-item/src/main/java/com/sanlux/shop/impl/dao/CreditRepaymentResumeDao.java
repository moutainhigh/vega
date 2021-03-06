package com.sanlux.shop.impl.dao;

import com.sanlux.shop.model.CreditRepaymentResume;
import io.terminus.common.mysql.dao.MyBatisDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Code generated by terminus code gen
 * Desc: 还款履历表Dao类
 * Date: 2016-08-29
 */
@Repository
public class CreditRepaymentResumeDao extends MyBatisDao<CreditRepaymentResume> {

    public List<CreditRepaymentResume> findByAlterResumeId(Long alterResumeId) {
        return getSqlSession().selectList(sqlId("findByAlterResumeId"), alterResumeId);
    }

    public CreditRepaymentResume findLastRepaymentByAlterResumeId(Long alterResumeId) {
        return getSqlSession().selectOne(sqlId("findLastRepaymentByAlterResumeId"), alterResumeId);
    }
}
