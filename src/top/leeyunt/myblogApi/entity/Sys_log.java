package top.leeyunt.myblogApi.entity;

import java.sql.*;
import top.leeyunt.myblogApi.util.StrUtil;
import java.util.HashMap;
import java.util.*;
import java.io.Serializable;
   /**
    * Sys_log
    * 由chenp 的CSMMAACToolv4.2生成
    *实体
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public class Sys_log implements Serializable {
	private static final long serialVersionUID = 1L;
	private Object id;//id
	private Timestamp log_time;//时间
	private String log_content;//日志内容
	private String login_ip;//客户端IP地址
	/**
	* 获取 id
	* @return  id id
	* 由CSMMAACToolv4.2生成
	*/
	public Object getId(){
		return id;
	}
	/**
	* 设置 id
	* @param  id id
	* 由CSMMAACToolv4.2生成
	*/
	public void setId(Object id){
	this.id=id;
	}
	/**
	* 获取 时间
	* @return  log_time 时间
	* 由CSMMAACToolv4.2生成
	*/
	public Timestamp getLog_time(){
		return log_time;
	}
	/**
	* 设置 时间
	* @param  log_time 时间
	* 由CSMMAACToolv4.2生成
	*/
	public void setLog_time(Timestamp log_time){
	this.log_time=log_time;
	}
	/**
	* 获取字符格式时间
	* @return  log_time 时间
	* 由CSMMAACToolv4.2生成
	*/
	public String getLog_timeString(){
		return  StrUtil.Timesamp2String(log_time);
	}
	/**
	* 获取 日志内容
	* @return  log_content 日志内容
	* 由CSMMAACToolv4.2生成
	*/
	public String getLog_content(){
		return log_content;
	}
	/**
	* 设置 日志内容
	* @param  log_content 日志内容
	* 由CSMMAACToolv4.2生成
	*/
	public void setLog_content(String log_content){
	this.log_content=log_content;
	}
	/**
	* 获取 客户端IP地址
	* @return  login_ip 客户端IP地址
	* 由CSMMAACToolv4.2生成
	*/
	public String getLogin_ip(){
		return login_ip;
	}
	/**
	* 设置 客户端IP地址
	* @param  login_ip 客户端IP地址
	* 由CSMMAACToolv4.2生成
	*/
	public void setLogin_ip(String login_ip){
	this.login_ip=login_ip;
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
		if (null != log_time) {
			map.put("log_time", log_time);
		}
		if (null != log_content) {
			map.put("log_content", log_content);
		}
		if (null != login_ip) {
			map.put("login_ip", login_ip);
		}
		return map;
		}
	@Override //By生成工具v4.2
	public String toString(){
	return "Sys_log [id=" +id+",log_time=\"" + StrUtil.Timesamp2String(log_time)+"\",log_content=\"" +log_content+"\",login_ip=\"" +login_ip+"\""+"]"; 
	} 
}

