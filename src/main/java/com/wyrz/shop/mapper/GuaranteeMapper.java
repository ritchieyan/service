package com.wyrz.shop.mapper;

import java.util.List;
import java.util.Map;

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
	@Select("SELECT GUARANTEE_ID as guaranteeId FROM GUARANTEE")
	public List<String> selectAllId();

	@Override
	@SelectProvider(method = "selectByIdList", type = GuaranteeMapperProvider.class)
	public <V extends Guarantee> List<V> selectByIdList(List<Integer> idList);

	@Override
	@Select("SELECT COUNT(*) FROM GUARANTEE")
	public Long selectCount();

	@Override
	@SelectProvider(method = "selectCount", type = GuaranteeMapperProvider.class)
	public Long selectCount(Map<String, Object> params);

	@Override
	@SelectProvider(method = "selectIdList", type = GuaranteeMapperProvider.class)
	public List<String> selectIdList(Map<String, Object> params);

	@Override
	@SelectProvider(method = "selectList", type = GuaranteeMapperProvider.class)
	public <V extends Guarantee> List<V> selectList(Map<String, Object> params);

	@Override
	@SelectProvider(method = "selectListToPage", type = GuaranteeMapperProvider.class)
	public <V extends Guarantee> List<V> selectListToPage(Map<String, Object> params);

	@Override
	public <K, V extends Guarantee> Map<K, V> selectMap(Map<String, Object> params);

	@Override
	public <K, V extends Guarantee> Map<K, V> selectMapToPage(Map<String, Object> params);

	@Override
	public <V extends Guarantee> V selectOne(Map<String, Object> params);

	@Override
	public int updateById(Guarantee entity);

	@Override
	public int updateByIdSelective(Guarantee entity);

	@Override
	public void insert(Guarantee entity);

	@Override
	public int delete(Map<String, Object> params);

	@Override
	public int deleteById(Integer id);

	@Override
	@Select("DELETE FROM GUARANTEE")
	public int deleteAll();

}
