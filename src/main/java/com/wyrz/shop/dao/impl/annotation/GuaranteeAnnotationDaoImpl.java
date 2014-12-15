package com.wyrz.shop.dao.impl.annotation;

import org.springframework.stereotype.Repository;

import com.wyrz.core.dao.impl.BaseAnnotationDaoImpl;
import com.wyrz.core.mapper.BaseMapper;
import com.wyrz.shop.dao.GuaranteeDao;
import com.wyrz.shop.demain.Guarantee;
import com.wyrz.shop.mapper.GuaranteeMapper;

/**
 * 合作机构Dao实现类--Annotation方式
 * @author Ritchieyan
 * @date 2014年12月13日下午1:35:20
 */
@Repository("guaranteeAnnotationDao")
public class GuaranteeAnnotationDaoImpl extends BaseAnnotationDaoImpl<Guarantee> implements GuaranteeDao {

	private GuaranteeMapper guaranteeMapper;

	@Override
	protected BaseMapper<Guarantee> getMapper() {
		return this.guaranteeMapper;
	}

}
