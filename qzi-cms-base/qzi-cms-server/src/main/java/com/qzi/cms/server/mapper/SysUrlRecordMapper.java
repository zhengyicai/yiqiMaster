/* 
 * 文件名：BaseUrlRecordMapper.java  
 * 版权：Copyright 2016-2016 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2016年11月29日
 * 版本号：v1.0
*/
package com.qzi.cms.server.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import com.qzi.cms.common.po.SysUrlRecordPo;
import com.qzi.cms.server.base.BaseMapper;

/**
 * URL不拦截记录数据操作类
 * @author qsy
 * @version v1.0
 * @date 2016年11月29日
 */
public interface SysUrlRecordMapper extends BaseMapper<SysUrlRecordPo>{
	
	@Select("select url from sys_url_record where state='10'")
	public List<String> findUrl();
	
	/**
	 * 分页查询URl记录信息
	 * @param rowBounds
	 * @return
	 */
	public List<SysUrlRecordPo> loadRecords(RowBounds rowBounds);
	
	/**
	 * 查询URl记录信息列表总记录数
	 * @return 总记录数
	 */
	public int findAllCount();
	
	/**
	 * 修改URL记录
	 * @param recordPo
	 */
	@Select("update sys_url_record set url=#{po.url},state=#{po.state} where id=#{po.id}")
	public void updateRecord(@Param("po") SysUrlRecordPo recordPo);
	
	/**
	 * 删除单条URL记录
	 * @param recordPo
	 */
	@Select("delete from sys_url_record where id=#{po.id}")
	public void deleteRecord(@Param("po") SysUrlRecordPo recordPo);
	
	/**
	 * 删除多条URl记录
	 * @param delIds
	 * @return
	 */
	public int deleteRecords(List<String> delIds);

}
