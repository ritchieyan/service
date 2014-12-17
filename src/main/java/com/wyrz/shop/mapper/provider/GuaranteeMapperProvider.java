package com.wyrz.shop.mapper.provider;

import java.util.List;

import org.springframework.util.StringUtils;

import com.wyrz.shop.domain.Guarantee;

/**
 * 合作机构Sql支持器
 * @author Ritchieyan
 * @date 2014年12月13日下午1:44:51
 */
public class GuaranteeMapperProvider {

	public String selectByIdList(List<Integer> idList) {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT GUARANTEE_ID as guaranteeId, GUARANTEE_NAME as guaranteeName, GUARANTEE_TEL as guaranteeTel ");
		sb.append("WHERE GUARANTEE_ID IN (");
		for (Integer id : idList) {
			sb.append(id);
			if (idList.indexOf(id) > (idList.size() - 1)) {
				sb.append(",");
			}
		}
		sb.append(");");
		return sb.toString();
	}

	public String selectCount(Guarantee query) {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT COUNT(*) FROM GUARNATEE ");
		sb.append("WHERE 1=1 ");
		if (StringUtils.isEmpty(query.getGuaranteeId())) {
			sb.append("AND GUARANTEE_ID=#{guaranteeId} ");
		}
		if (StringUtils.isEmpty(query.getGuaranteeName())) {
			sb.append("AND GUARANTEE_NAME=#{guaranteeName} ");
		}
		if (StringUtils.isEmpty(query.getGuaranteeTel())) {
			sb.append("AND GUARANTEE_TEL=#{guaranteeTel} ");
		}
		return sb.toString();
	}

	public String selectIdList(Guarantee query) {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT GUARANTEE_ID ");
		sb.append("WHERE 1=1 ");
		if (StringUtils.isEmpty(query.getGuaranteeId())) {
			sb.append("AND GUARANTEE_ID=#{guaranteeId} ");
		}
		if (StringUtils.isEmpty(query.getGuaranteeName())) {
			sb.append("AND GUARANTEE_NAME=#{guaranteeName} ");
		}
		if (StringUtils.isEmpty(query.getGuaranteeTel())) {
			sb.append("AND GUARANTEE_TEL=#{guaranteeTel} ");
		}
		return sb.toString();
	}

}
