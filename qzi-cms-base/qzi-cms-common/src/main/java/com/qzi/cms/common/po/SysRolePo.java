/* 
 * 文件名：SysRolePo.java  
 * 版权：Copyright 2016-2017 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2017年6月20日
 * 版本号：v1.0
*/
package com.qzi.cms.common.po;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 角色Po类
 * 
 * @author qsy
 * @version v1.0
 * @date 2017年6月20日
 */
@Table(name="sys_role")
public class SysRolePo {
	/**
	 * 主键编号
	 */
	@Id
	private String id;
	/**
	 * 角色名
	 */
	private String roleName;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName
	 *            the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
