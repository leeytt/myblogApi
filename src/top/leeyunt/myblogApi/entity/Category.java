package top.leeyunt.myblogApi.entity;

import java.sql.*;
import top.leeyunt.myblogApi.util.StrUtil;
import java.util.HashMap;
import java.util.*;
import java.io.Serializable;
   /**
    * Category
    * 由chenp 的CSMMAACToolv4.2生成
    *实体
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	private Object aid;//aid
	private String category_id;//分类id
	private String name;//分类名称
	private Boolean status;//状态，1-正常，0-删除，默认1
	private Timestamp create_time;//创建时间
	private Timestamp update_time;//更新时间
	private Boolean can_del;//能否删除，1-可删除，0-不可删除，默认1
	private Integer article_count;//该分类的文章数量
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
	* 获取 分类id
	* @return  category_id 分类id
	* 由CSMMAACToolv4.2生成
	*/
	public String getCategory_id(){
		return category_id;
	}
	/**
	* 设置 分类id
	* @param  category_id 分类id
	* 由CSMMAACToolv4.2生成
	*/
	public void setCategory_id(String category_id){
	this.category_id=category_id;
	}
	/**
	* 获取 分类名称
	* @return  name 分类名称
	* 由CSMMAACToolv4.2生成
	*/
	public String getName(){
		return name;
	}
	/**
	* 设置 分类名称
	* @param  name 分类名称
	* 由CSMMAACToolv4.2生成
	*/
	public void setName(String name){
	this.name=name;
	}
	/**
	* 获取 状态，1-正常，0-删除，默认1
	* @return  status 状态，1-正常，0-删除，默认1
	* 由CSMMAACToolv4.2生成
	*/
	public Boolean getStatus(){
		return status;
	}
	/**
	* 设置 状态，1-正常，0-删除，默认1
	* @param  status 状态，1-正常，0-删除，默认1
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
	* 获取 能否删除，1-可删除，0-不可删除，默认1
	* @return  can_del 能否删除，1-可删除，0-不可删除，默认1
	* 由CSMMAACToolv4.2生成
	*/
	public Boolean getCan_del(){
		return can_del;
	}
	/**
	* 设置 能否删除，1-可删除，0-不可删除，默认1
	* @param  can_del 能否删除，1-可删除，0-不可删除，默认1
	* 由CSMMAACToolv4.2生成
	*/
	public void setCan_del(Boolean can_del){
	this.can_del=can_del;
	}
	/**
	* 获取 该分类的文章数量
	* @return  article_count 该分类的文章数量
	* 由CSMMAACToolv4.2生成
	*/
	public Integer getArticle_count(){
		return article_count;
	}
	/**
	* 设置 该分类的文章数量
	* @param  article_count 该分类的文章数量
	* 由CSMMAACToolv4.2生成
	*/
	public void setArticle_count(Integer article_count){
	this.article_count=article_count;
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
		if (null != category_id) {
			map.put("category_id", category_id);
		}
		if (null != name) {
			map.put("name", name);
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
		if (null != can_del) {
			map.put("can_del", can_del);
		}
		if (null != article_count) {
			map.put("article_count", article_count);
		}
		return map;
		}
	@Override //By生成工具v4.2
	public String toString(){
	return "Category [aid=" +aid+",category_id=\"" +category_id+"\",name=\"" +name+"\",status=" +status+",create_time=\"" + StrUtil.Timesamp2String(create_time)+"\",update_time=\"" + StrUtil.Timesamp2String(update_time)+"\",can_del=" +can_del+",article_count=" +article_count+""+"]"; 
	} 
}

