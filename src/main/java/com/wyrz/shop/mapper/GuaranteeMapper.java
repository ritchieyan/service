package com.wyrz.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.wyrz.core.mapper.BaseMapper;
import com.wyrz.shop.demain.Guarantee;
import com.wyrz.shop.mapper.provider.GuaranteeMapperProvider;

/**
 * 合作机构Mapper
 * @author Ritchieyan
 * @date 2014年12月13日下午1:40:51
 */
public interface GuaranteeMapper extends BaseMapper<Guarantee> {

	@Override
	@Select("SELECT * FROM GUARANTEE")
	public <V extends Guarantee> List<V> selectAll();

	@Override
	@SelectProvider(method = "deleteAll", type = GuaranteeMapperProvider.class)
	public int deleteAll();

}
