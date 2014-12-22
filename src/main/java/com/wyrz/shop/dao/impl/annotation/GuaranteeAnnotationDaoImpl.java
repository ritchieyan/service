package com.wyrz.shop.dao.impl.annotation;

import org.springframework.stereotype.Repository;

import com.wyrz.core.dao.impl.BaseAnnotationDaoImpl;
import com.wyrz.core.mapper.BaseMapper;
import com.wyrz.shop.dao.GuaranteeDao;
import com.wyrz.shop.domain.Guarantee;
import com.wyrz.shop.mapper.GuaranteeMapper;

/**
 * 合作机构Dao实现类--Annotation方式
 * @author Ritchieyan
 * @date 2014年12月13日下午1:35:20
 */
@Repository("guaranteeAnnotationDao")
public class GuaranteeAnnotationDaoImpl extends BaseAnnotationDaoImpl<Guarantee> implements GuaranteeDao {

	@SuppressWarnings("unchecked")
	@Override
	protected <I extends BaseMapper<Guarantee, ? extends Guarantee>> I getWritableMapper() {
		return (I) writableSQLSession.getMapper(GuaranteeMapper.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected <I extends BaseMapper<Guarantee, ? extends Guarantee>> I getReadonlyMapper() {
		return (I) readonlySQLSession.getMapper(GuaranteeMapper.class);
	}

	// @SuppressWarnings("unchecked")
	// @Override
	// protected GuaranteeMapper getWritableMapper() {
	// return writableSQLSession.getMapper(GuaranteeMapper.class);
	// }
	//
	// @SuppressWarnings("unchecked")
	// @Override
	// protected GuaranteeMapper getReadonlyMapper() {
	// return readonlySQLSession.getMapper(GuaranteeMapper.class);
	// }

}
