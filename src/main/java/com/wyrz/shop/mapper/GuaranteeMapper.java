package com.wyrz.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.data.domain.Pageable;

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
	public Long selectCount(Guarantee query);

	@Override
	@SelectProvider(method = "selectIdList", type = GuaranteeMapperProvider.class)
	public List<String> selectIdList(Guarantee query);

	@Override
	public <V extends Guarantee> List<V> selectList(Guarantee query);

	@Override
	public <V extends Guarantee> List<V> selectList(Guarantee query, Pageable pageable);

	@Override
	public <K, V extends Guarantee> Map<K, V> selectMap(Guarantee query, String mapKey);

	@Override
	public <K, V extends Guarantee> Map<K, V> selectMap(Guarantee query, String mapKey, Pageable pageable);

	@Override
	public <V extends Guarantee> V selectOne(Guarantee query);

	@Override
	public int updateById(Guarantee entity);

	@Override
	public int updateByIdSelective(Guarantee entity);

	@Override
	public void insert(Guarantee entity);

	@Override
	public int delete(Guarantee query);

	@Override
	public int deleteById(Integer id);

	@Override
	public void deleteByIdInBatch(List<Integer> idList);

	@Override
	@Select("DELETE FROM GUARANTEE")
	public int deleteAll();

}
