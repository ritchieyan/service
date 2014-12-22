错误总结：

1.当Mapper中的参数被注解@Param声明时，那么Provider中对应的方法中的参数必须以Map方式作为参数

Eg:
GuaranteeMapper:
	@Override
	@SelectProvider(method = "selectById", type = GuaranteeMapperProvider.class)
	public <V extends Guarantee> V selectById(@Param("guaranteeId") Integer id);

GuaranteeMapperProvider:
	public String selectById(Map<String, Object> params) { ----参数不能是 Integer id
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT ");
		sb.append(this.getColumnList());
		sb.append("FROM GUARANTEE WHERE GUARANTEE_ID = #{guaranteeId} ");
		return sb.toString();
	}
	
	