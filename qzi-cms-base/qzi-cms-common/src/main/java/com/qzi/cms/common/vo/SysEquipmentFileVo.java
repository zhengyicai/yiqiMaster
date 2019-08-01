/* 
 * 文件名：BaseResourcePo.java  
 * 版权：Copyright 2016-2016 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友
 * 创建时间：2016年12月6日
 * 版本号：v1.0
*/
package com.qzi.cms.common.vo;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 设备文件管理
 * @author qsy
 * @version v1.0
 * @date 2016年12月6日
 */

public class SysEquipmentFileVo {

	/**
	 * 主键编号
	 * */
	@Id
	private String id;



	private String equipmentId;

	private String userId;

	/**
	 * 文件类型
	 * 10图片 20视频
	 */
	private String fileId;

	private String state;

	private Date createTime;

	private String type;
	private String fileUrl;
	private String standards;

	

	private String[] imageList;
	private String[] videoList;

	private String[] equipmentIds;

	private String align;
	private String titleDetail;

	public String getTitleDetail() {
		return titleDetail;
	}

	public void setTitleDetail(String titleDetail) {
		this.titleDetail = titleDetail;
	}

	public String[] getEquipmentIds() {
		return equipmentIds;
	}

	public void setEquipmentIds(String[] equipmentIds) {
		this.equipmentIds = equipmentIds;
	}

	public String getAlign() {
		return align;
	}

	public void setAlign(String align) {
		this.align = align;
	}

	public String getStandards() {
		return standards;
	}

	public void setStandards(String standards) {
		this.standards = standards;
	}

	public String[] getImageList() {
		return imageList;
	}

	public void setImageList(String[] imageList) {
		this.imageList = imageList;
	}

	public String[] getVideoList() {
		return videoList;
	}

	public void setVideoList(String[] videoList) {
		this.videoList = videoList;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
