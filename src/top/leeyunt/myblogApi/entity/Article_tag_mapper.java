package top.leeyunt.myblogApi.entity;

import java.sql.*;
import top.leeyunt.myblogApi.util.StrUtil;
import java.util.HashMap;
import java.util.*;
import java.io.Serializable;
   /**
    * Article_tag_mapper
    * 由chenp 的CSMMAACToolv4.2生成
    *实体
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public class Article_tag_mapper implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;//id
	private String article_id;//文章id
	private String tag_id;//标签id
	private Timestamp create_time;//创建时间
	/**
	* 获取 id
	* @return  id id
	* 由CSMMAACToolv4.2生成
	*/
	public Integer getId(){
		return id;
	}
	/**
	* 设置 id
	* @param  id id
	* 由CSMMAACToolv4.2生成
	*/
	public void setId(Integer id){
	this.id=id;
	}
	/**
	* 获取 文章id
	* @return  article_id 文章id
	* 由CSMMAACToolv4.2生成
	*/
	public String getArticle_id(){
		return article_id;
	}
	/**
	* 设置 文章id
	* @param  article_id 文章id
	* 由CSMMAACToolv4.2生成
	*/
	public void setArticle_id(String article_id){
	this.article_id=article_id;
	}
	/**
	* 获取 标签id
	* @return  tag_id 标签id
	* 由CSMMAACToolv4.2生成
	*/
	public String getTag_id(){
		return tag_id;
	}
	/**
	* 设置 标签id
	* @param  tag_id 标签id
	* 由CSMMAACToolv4.2生成
	*/
	public void setTag_id(String tag_id){
	this.tag_id=tag_id;
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
	 * 转换为hashmap
	 * 由CSMMAACToolv4.2 生成
	 * @return
	 */
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		if (null != id) {
			map.put("id", id);
		}
		if (null != article_id) {
			map.put("article_id", article_id);
		}
		if (null != tag_id) {
			map.put("tag_id", tag_id);
		}
		if (null != create_time) {
			map.put("create_time", create_time);
		}
		return map;
		}
	@Override //By生成工具v4.2
	public String toString(){
	return "Article_tag_mapper [id=" +id+",article_id=\"" +article_id+"\",tag_id=\"" +tag_id+"\",create_time=\"" + StrUtil.Timesamp2String(create_time)+"\""+"]"; 
	} 
}

