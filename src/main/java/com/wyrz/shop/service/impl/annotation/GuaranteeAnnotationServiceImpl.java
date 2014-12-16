package com.wyrz.shop.service.impl.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wyrz.core.dao.BaseDao;
import com.wyrz.core.service.impl.BaseServiceImpl;
import com.wyrz.shop.dao.GuaranteeDao;
import com.wyrz.shop.domain.Guarantee;
import com.wyrz.shop.service.GuaranteeService;

/**
 * 
 * @author Ritchieyan
 * @date 2014年12月13日下午3:38:32
 */
@Service("guaranteeAnnotationService")
public class GuaranteeAnnotationServiceImpl extends BaseServiceImpl<Guarantee> implements GuaranteeService {

	@Resource(name = "guaranteeAnnotationDao")
	private GuaranteeDao guaranteeAnnotationDao;

	@Override
	protected BaseDao<Guarantee> getBaseDao() {
		return guaranteeAnnotationDao;
	}

}