package top.leeyunt.myblogApi.entity;

import java.util.HashMap;
import java.util.*;
import java.io.Serializable;
   /**
    * Friendurl_type
    * 由chenp 的CSMMAACToolv4.2生成
    *实体
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public class Friendurl_type implements Serializable {
	private static final long serialVersionUID = 1L;
	private Object aid;//aid
	private String type_id;//类型id
	private String name;//友链的类型名称
	private Integer friend_count;//该类型的友链数量
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
	* 获取 类型id
	* @return  type_id 类型id
	* 由CSMMAACToolv4.2生成
	*/
	public String getType_id(){
		return type_id;
	}
	/**
	* 设置 类型id
	* @param  type_id 类型id
	* 由CSMMAACToolv4.2生成
	*/
	public void setType_id(String type_id){
	this.type_id=type_id;
	}
	/**
	* 获取 友链的类型名称
	* @return  name 友链的类型名称
	* 由CSMMAACToolv4.2生成
	*/
	public String getName(){
		return name;
	}
	/**
	* 设置 友链的类型名称
	* @param  name 友链的类型名称
	* 由CSMMAACToolv4.2生成
	*/
	public void setName(String name){
	this.name=name;
	}
	/**
	* 获取 该类型的友链数量
	* @return  friend_count 该类型的友链数量
	* 由CSMMAACToolv4.2生成
	*/
	public Integer getFriend_count(){
		return friend_count;
	}
	/**
	* 设置 该类型的友链数量
	* @param  friend_count 该类型的友链数量
	* 由CSMMAACToolv4.2生成
	*/
	public void setFriend_count(Integer friend_count){
	this.friend_count=friend_count;
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
		if (null != type_id) {
			map.put("type_id", type_id);
		}
		if (null != name) {
			map.put("name", name);
		}
		if (null != friend_count) {
			map.put("friend_count", friend_count);
		}
		return map;
		}
	@Override //By生成工具v4.2
	public String toString(){
	return "Friendurl_type [aid=" +aid+",type_id=\"" +type_id+"\",name=\"" +name+"\",friend_count=" +friend_count+""+"]"; 
	} 
}

