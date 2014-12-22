package com.wyrz.shop.mapper.provider;

import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.wyrz.core.mapper.provider.BaseMapperProvider;
import com.wyrz.shop.domain.Guarantee;

/**
 * 合作机构Sql支持器
 * @author Ritchieyan
 * @date 2014年12月13日下午1:44:51
 */
public class GuaranteeMapperProvider implements BaseMapperProvider {

	@Override
	public String getColumnList() {
		StringBuffer sb = new StringBuffer();
		sb.append("GUARANTEE_ID as guaranteeId, GUARANTEE_NAME as guaranteeName, GUARANTEE_TEL as guaranteeTel ");
		return sb.toString();
	}

	@Override
	public String getWhereClause(Map<String, Object> params) {
		if (params == null) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		sb.append("WHERE 1=1 ");
		if (!StringUtils.isEmpty(params.get("guaranteeId"))) {
			sb.append("AND GUARANTEE_ID=#{guaranteeId} ");
		}
		if (!StringUtils.isEmpty(params.get("guaranteeName"))) {
			sb.append("AND GUARANTEE_NAME=#{guaranteeName} ");
		}
		if (!StringUtils.isEmpty(params.get("guaranteeTel"))) {
			sb.append("AND GUARANTEE_TEL=#{guaranteeTel} ");
		}
		return sb.toString();
	}

	@Override
	public String getGroupByClause(Map<String, Object> params) {
		if (params == null) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		if (!StringUtils.isEmpty(params.get("grouping"))) {
			sb.append("GROUP BY ${grouping}");
		}
		return sb.toString();
	}

	@Override
	public String getOrderByClause(Map<String, Object> params) {
		if (params == null) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		if (!StringUtils.isEmpty(params.get("sorting"))) {
			sb.append("ORDER BY ${sorting} ");
		}
		return sb.toString();
	}

	@Override
	public String getLimitClause(Map<String, Object> params) {
		if (params == null) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		if (!StringUtils.isEmpty(params.get("offset")) && !StringUtils.isEmpty(params.get("limit"))) {
			sb.append("LIMIT #{offset}, #{limit} ");
		}
		return sb.toString();
	}

	public String selectCount() {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT COUNT(*) FROM GUARANTEE ");
		return sb.toString();
	}

	public String selectCount(Map<String, Object> params) {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT COUNT(*) FROM GUARANTEE ");
		sb.append(this.getWhereClause(params));
		return sb.toString();
	}

	public String select(Map<String, Object> params) {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT ");
		sb.append(this.getColumnList());
		sb.append("FROM GUARANTEE ");
		sb.append(this.getWhereClause(params));
		sb.append(this.getOrderByClause(params));
		sb.append(this.getLimitClause(params));
		return sb.toString();
	}

	public String selectById() {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT ");
		sb.append(this.getColumnList());
		sb.append("FROM GUARANTEE WHERE GUARANTEE_ID = #{guaranteeId} ");
		return sb.toString();
	}

	@SuppressWarnings("unchecked")
	public String selectByIdList(Map<String, Object> params) {
		List<Integer> idList = (List<Integer>) params.get("idList");
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT ");
		sb.append(this.getColumnList());
		sb.append("FROM GUARANTEE WHERE GUARANTEE_ID IN (");
		for (int i = 0; i < idList.size(); i++) {
			sb.append(idList.get(i));
			if (i < (idList.size() - 1)) {
				sb.append(",");
			}
		}
		sb.append(")");
		return sb.toString();
	}

	public String selectAllId() {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT GUARANTEE_ID FROM GUARANTEE ORDER BY GUARANTEE_ID");
		return sb.toString();
	}

	public String selectIdList(Map<String, Object> params) {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT GUARANTEE_ID FROM GUARANTEE ");
		sb.append(this.getWhereClause(params));
		sb.append("ORDER BY GUARANTEE_ID");
		return sb.toString();
	}

	public String insert() {
		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO GUARANTEE (GUARANTEE_ID, GUARANTEE_NAME, GUARANTEE_TEL)VALUES(#{guaranteeId}, #{guaranteeName},#{guaranteeTel})");
		return sb.toString();
	}

	public String updateById(Guarantee guarantee) {
		StringBuffer sb = new StringBuffer();
		sb.append("UPDATE GUARANTEE SET ");
		sb.append("GUARANTEE_ID = #{guaranteeId}, GUARANTEE_NAME = #{guaranteeName}, GUARANTEE_TEL = #{guaranteeTel} WHERE GUARANTEE_ID = #{guaranteeId}");
		return sb.toString();
	}

	public String delete(Map<String, Object> params) {
		StringBuffer sb = new StringBuffer();
		sb.append("DELETE FROM GUARANTEE ");
		sb.append(this.getWhereClause(params));
		return sb.toString();

	}

	public String deleteById() {
		StringBuffer sb = new StringBuffer();
		sb.append("DELETE FROM GUARANTEE WHERE GUARANTEE_ID = #{guaranteeId}");
		return sb.toString();
	}

}
