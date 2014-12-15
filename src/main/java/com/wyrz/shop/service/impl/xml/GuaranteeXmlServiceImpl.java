package com.wyrz.shop.service.impl.xml;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wyrz.core.dao.BaseDao;
import com.wyrz.core.service.impl.BaseServiceImpl;
import com.wyrz.shop.dao.GuaranteeDao;
import com.wyrz.shop.demain.Guarantee;
import com.wyrz.shop.service.GuaranteeService;

/**
 * 
 * @author Ritchieyan
 * @date 2014年12月13日下午4:10:00
 */
@Service("guaranteeXmlService")
public class GuaranteeXmlServiceImpl extends BaseServiceImpl<Guarantee> implements GuaranteeService {

	@Resource(name = "guaranteeXmlDao")
	private GuaranteeDao guaranteeXmlDao;

	@Override
	protected BaseDao<Guarantee> getBaseDao() {
		return guaranteeXmlDao;
	}

}
