package com.wyrz.shop.dao.impl.xml;

import org.springframework.stereotype.Repository;

import com.wyrz.core.dao.impl.BaseXmlDaoImpl;
import com.wyrz.shop.dao.GuaranteeDao;
import com.wyrz.shop.demain.Guarantee;

/**
 * 合作机构Dao实现类--Xml方式
 * @author Ritchieyan
 * @date 2014年12月13日下午1:58:54
 */
@Repository("guaranteeXmlDao")
public class GuaranteeXmlDaoImpl extends BaseXmlDaoImpl<Guarantee> implements GuaranteeDao {

}
