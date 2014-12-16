package com.wyrz.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.wyrz.core.mapper.BaseMapper;
import com.wyrz.shop.domain.Guarantee;
import com.wyrz.shop.mapper.provider.GuaranteeMapperProvider;

/**
 * 合作机构Mapper
 * @author Ritchieyan
 * @date 2014年12月13日下午1:40:51
 */
public interface GuaranteeMapper extends BaseMapper<Guarantee> {

	@Override
	@Select("SELECT GUARANTEE_ID as guaranteeId, GUARANTEE_NAME as guaranteeName, GUARANTEE_TEL as guaranteeTel FROM GUARANTEE")
	public List<Guarantee> selectAll();

	@Override
	@Select("SELECT GUARANTEE_ID as guaranteeId, GUARANTEE_NAME as guaranteeName, GUARANTEE_TEL as guaranteeTel FROM GUARANTEE WHERE GUARANTEE_ID=#{guaranteeId}")
	public <V extends Guarantee> V selectById(@Param("guaranteeId") Integer id);

	@Override
	@SelectProvider(method = "deleteAll", type = GuaranteeMapperProvider.class)
	public int deleteAll();

}
