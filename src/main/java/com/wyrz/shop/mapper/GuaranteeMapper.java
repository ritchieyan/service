package com.wyrz.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import com.wyrz.core.mapper.BaseMapper;
import com.wyrz.shop.domain.Guarantee;
import com.wyrz.shop.domain.vo.GuaranteeVo;
import com.wyrz.shop.mapper.provider.GuaranteeMapperProvider;

/**
 * 合作机构Mapper
 * @author Ritchieyan
 * @date 2014年12月13日下午1:40:51
 */
public interface GuaranteeMapper extends BaseMapper<Guarantee, GuaranteeVo> {
	// 测试成功
	@Override
	@SelectProvider(method = "select", type = GuaranteeMapperProvider.class)
	public List<GuaranteeVo> selectAll();

	// 测试成功
	@Override
	@SelectProvider(method = "select", type = GuaranteeMapperProvider.class)
	public List<GuaranteeVo> selectList(Map<String, Object> params);

	@Override
	@SelectProvider(method = "select", type = GuaranteeMapperProvider.class)
	public List<GuaranteeVo> selectListToPage(Map<String, Object> params);

	// 测试成功
	@Override
	@SelectProvider(method = "select", type = GuaranteeMapperProvider.class)
	public GuaranteeVo selectOne(Map<String, Object> params);

	// 测试成功
	@Override
	@SelectProvider(method = "selectById", type = GuaranteeMapperProvider.class)
	public GuaranteeVo selectById(Integer id);

	@Override
	@SelectProvider(method = "selectAllId", type = GuaranteeMapperProvider.class)
	public List<Integer> selectAllId();

	@Override
	@SelectProvider(method = "selectByIdList", type = GuaranteeMapperProvider.class)
	public List<GuaranteeVo> selectByIdList(@Param("idList") List<Integer> idList);

	@Override
	@SelectProvider(method = "selectCount", type = GuaranteeMapperProvider.class)
	public Long selectAllCount();

	@Override
	@SelectProvider(method = "selectCount", type = GuaranteeMapperProvider.class)
	public Long selectCount(Map<String, Object> params);

	@Override
	@SelectProvider(method = "selectIdList", type = GuaranteeMapperProvider.class)
	public List<Integer> selectIdList(Map<String, Object> params);

	@Override
	@UpdateProvider(method = "updateById", type = GuaranteeMapperProvider.class)
	public int updateById(Guarantee entity);

	@Override
	@UpdateProvider(method = "updateById", type = GuaranteeMapperProvider.class)
	public int updateByIdSelective(Guarantee entity);

	@Override
	@InsertProvider(method = "insert", type = GuaranteeMapperProvider.class)
	public void insert(Guarantee entity);

	@Override
	@DeleteProvider(method = "delete", type = GuaranteeMapperProvider.class)
	public int delete(Map<String, Object> params);

	@Override
	@DeleteProvider(method = "deleteById", type = GuaranteeMapperProvider.class)
	public int deleteById(@Param("guaranteeId") Integer id);

	@Override
	@DeleteProvider(method = "delete", type = GuaranteeMapperProvider.class)
	public int deleteAll();

}
