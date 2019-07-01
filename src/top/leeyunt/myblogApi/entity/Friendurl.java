package top.leeyunt.myblogApi.entity;

import java.sql.*;
import top.leeyunt.myblogApi.util.StrUtil;
import java.util.HashMap;
import java.util.*;
import java.io.Serializable;
   /**
    * Friendurl
    * 由chenp 的CSMMAACToolv4.2生成
    *实体
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public class Friendurl implements Serializable {
	private static final long serialVersionUID = 1L;
	private Object aid;//aid
	private String friendurl_id;//友链id
	private String name;//友链名称
	private String url;//对应链接
	private String type_id;//所属类型id
	private Boolean status;//状态，1-可用，0-删除，默认1
	private Timestamp create_time;//创建时间
	private Timestamp update_time;//更新时间
	private Timestamp delete_time;//删除时间
	/**
	* 获取 aid
	* @return  aid aid
	* 由CSMMAACToolv4.2生成
	*/
	public Object getAid(){
		return aid;
	}
	/**
	* 设置 aid
	* @param  aid aid
	* 由CSMMAACToolv4.2生成
	*/
	public void setAid(Object aid){
	this.aid=aid;
	}
	/**
	* 获取 友链id
	* @return  friendurl_id 友链id
	* 由CSMMAACToolv4.2生成
	*/
	public String getFriendurl_id(){
		return friendurl_id;
	}
	/**
	* 设置 友链id
	* @param  friendurl_id 友链id
	* 由CSMMAACToolv4.2生成
	*/
	public void setFriendurl_id(String friendurl_id){
	this.friendurl_id=friendurl_id;
	}
	/**
	* 获取 友链名称
	* @return  name 友链名称
	* 由CSMMAACToolv4.2生成
	*/
	public String getName(){
		return name;
	}
	/**
	* 设置 友链名称
	* @param  name 友链名称
	* 由CSMMAACToolv4.2生成
	*/
	public void setName(String name){
	this.name=name;
	}
	/**
	* 获取 对应链接
	* @return  url 对应链接
	* 由CSMMAACToolv4.2生成
	*/
	public String getUrl(){
		return url;
	}
	/**
	* 设置 对应链接
	* @param  url 对应链接
	* 由CSMMAACToolv4.2生成
	*/
	public void setUrl(String url){
	this.url=url;
	}
	/**
	* 获取 所属类型id
	* @return  type_id 所属类型id
	* 由CSMMAACToolv4.2生成
	*/
	public String getType_id(){
		return type_id;
	}
	/**
	* 设置 所属类型id
	* @param  type_id 所属类型id
	* 由CSMMAACToolv4.2生成
	*/
	public void setType_id(String type_id){
	this.type_id=type_id;
	}
	/**
	* 获取 状态，1-可用，0-删除，默认1
	* @return  status 状态，1-可用，0-删除，默认1
	* 由CSMMAACToolv4.2生成
	*/
	public Boolean getStatus(){
		return status;
	}
	/**
	* 设置 状态，1-可用，0-删除，默认1
	* @param  status 状态，1-可用，0-删除，默认1
	* 由CSMMAACToolv4.2生成
	*/
	public void setStatus(Boolean status){
	this.status=status;
	}
	/**
	* 获取 创建时间
	* @return  create_time 创建时间
	* 由CSMMAACToolv4.2生成
	*/
	public Timestamp getCreate_time(){
		return create_time;
	}
	/**
	* 设置 创建时间
	* @param  create_time 创建时间
	* 由CSMMAACToolv4.2生成
	*/
	public void setCreate_time(Timestamp create_time){
	this.create_time=create_time;
	}
	/**
	* 获取字符格式创建时间
	* @return  create_time 创建时间
	* 由CSMMAACToolv4.2生成
	*/
	public String getCreate_timeString(){
		return  StrUtil.Timesamp2String(create_time);
	}
	/**
	* 获取 更新时间
	* @return  update_time 更新时间
	* 由CSMMAACToolv4.2生成
	*/
	public Timestamp getUpdate_time(){
		return update_time;
	}
	/**
	* 设置 更新时间
	* @param  update_time 更新时间
	* 由CSMMAACToolv4.2生成
	*/
	public void setUpdate_time(Timestamp update_time){
	this.update_time=update_time;
	}
	/**
	* 获取字符格式更新时间
	* @return  update_time 更新时间
	* 由CSMMAACToolv4.2生成
	*/
	public String getUpdate_timeString(){
		return  StrUtil.Timesamp2String(update_time);
	}
	/**
	* 获取 删除时间
	* @return  delete_time 删除时间
	* 由CSMMAACToolv4.2生成
	*/
	public Timestamp getDelete_time(){
		return delete_time;
	}
	/**
	* 设置 删除时间
	* @param  delete_time 删除时间
	* 由CSMMAACToolv4.2生成
	*/
	public void setDelete_time(Timestamp delete_time){
	this.delete_time=delete_time;
	}
	/**
	* 获取字符格式删除时间
	* @return  delete_time 删除时间
	* 由CSMMAACToolv4.2生成
	*/
	public String getDelete_timeString(){
		return  StrUtil.Timesamp2String(delete_time);
	}
/**
	 * 转换为hashmap
	 * 由CSMMAACToolv4.2 生成
	 * @return
	 */
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		if (null != aid) {
			map.put("aid", aid);
		}
		if (null != friendurl_id) {
			map.put("friendurl_id", friendurl_id);
		}
		if (null != name) {
			map.put("name", name);
		}
		if (null != url) {
			map.put("url", url);
		}
		if (null != type_id) {
			map.put("type_id", type_id);
		}
		if (null != status) {
			map.put("status", status);
		}
		if (null != create_time) {
			map.put("create_time", create_time);
		}
		if (null != update_time) {
			map.put("update_time", update_time);
		}
		if (null != delete_time) {
			map.put("delete_time", delete_time);
		}
		return map;
		}
	@Override //By生成工具v4.2
	public String toString(){
	return "Friendurl [aid=" +aid+",friendurl_id=\"" +friendurl_id+"\",name=\"" +name+"\",url=\"" +url+"\",type_id=\"" +type_id+"\",status=" +status+",create_time=\"" + StrUtil.Timesamp2String(create_time)+"\",update_time=\"" + StrUtil.Timesamp2String(update_time)+"\",delete_time=\"" + StrUtil.Timesamp2String(delete_time)+"\""+"]"; 
	} 
}

