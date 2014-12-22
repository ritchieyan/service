package com.wyrz.shop.domain;

import com.wyrz.core.dao.demain.Identifiable;

/**
 * 合作机构域对象
 * @author Ritchieyan
 * @date 2014年12月13日下午1:26:50
 */
public class Guarantee implements Identifiable {

	/**
	 * @fields serialVersionUID 
	 */
	private static final long serialVersionUID = 2018201382865632915L;
	private Integer guaranteeId;// 合作机构编号
	private String guaranteeName;// 合作机构名称
	private String guaranteeTel;// 合作机构电话

	public Integer getGuaranteeId() {
		return guaranteeId;
	}

	public void setGuaranteeId(Integer guaranteeId) {
		this.guaranteeId = guaranteeId;
	}

	public String getGuaranteeName() {
		return guaranteeName;
	}

	public void setGuaranteeName(String guaranteeName) {
		this.guaranteeName = guaranteeName;
	}

	public String getGuaranteeTel() {
		return guaranteeTel;
	}

	public void setGuaranteeTel(String guaranteeTel) {
		this.guaranteeTel = guaranteeTel;
	}

	@Override
	public Integer getId() {
		return this.getGuaranteeId();
	}

	@Override
	public void setId(Integer id) {
		this.setGuaranteeId(id);
	}

	@Override
	public String toString() {
		return "Guarantee [guaranteeId=" + guaranteeId + ", guaranteeName=" + guaranteeName + ", guaranteeTel="
				+ guaranteeTel + "]";
	}

}
