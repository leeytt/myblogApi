package top.leeyunt.myblogApi.entity;

import java.sql.*;
import top.leeyunt.myblogApi.util.StrUtil;
import java.util.HashMap;
import java.util.*;
import java.io.Serializable;
   /**
    * Admin
    * 由chenp 的CSMMAACToolv4.2生成
    *实体
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;
	private Object aid;//aid
	private String user_id;//用户id
	private String username;//账号
	private String password;//密码
	private String salt;//秘钥
	private String access_token;//access_token
	private Integer token_expires_in;//token有效期至
	private Timestamp create_time;//创建时间
	private Boolean status;//状态，1为正常，默认1
	private Timestamp last_login_time;//最后登录时间
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
	* 获取 用户id
	* @return  user_id 用户id
	* 由CSMMAACToolv4.2生成
	*/
	public String getUser_id(){
		return user_id;
	}
	/**
	* 设置 用户id
	* @param  user_id 用户id
	* 由CSMMAACToolv4.2生成
	*/
	public void setUser_id(String user_id){
	this.user_id=user_id;
	}
	/**
	* 获取 账号
	* @return  username 账号
	* 由CSMMAACToolv4.2生成
	*/
	public String getUsername(){
		return username;
	}
	/**
	* 设置 账号
	* @param  username 账号
	* 由CSMMAACToolv4.2生成
	*/
	public void setUsername(String username){
	this.username=username;
	}
	/**
	* 获取 密码
	* @return  password 密码
	* 由CSMMAACToolv4.2生成
	*/
	public String getPassword(){
		return password;
	}
	/**
	* 设置 密码
	* @param  password 密码
	* 由CSMMAACToolv4.2生成
	*/
	public void setPassword(String password){
	this.password=password;
	}
	/**
	* 获取 秘钥
	* @return  salt 秘钥
	* 由CSMMAACToolv4.2生成
	*/
	public String getSalt(){
		return salt;
	}
	/**
	* 设置 秘钥
	* @param  salt 秘钥
	* 由CSMMAACToolv4.2生成
	*/
	public void setSalt(String salt){
	this.salt=salt;
	}
	/**
	* 获取 access_token
	* @return  access_token access_token
	* 由CSMMAACToolv4.2生成
	*/
	public String getAccess_token(){
		return access_token;
	}
	/**
	* 设置 access_token
	* @param  access_token access_token
	* 由CSMMAACToolv4.2生成
	*/
	public void setAccess_token(String access_token){
	this.access_token=access_token;
	}
	/**
	* 获取 token有效期至
	* @return  token_expires_in token有效期至
	* 由CSMMAACToolv4.2生成
	*/
	public Integer getToken_expires_in(){
		return token_expires_in;
	}
	/**
	* 设置 token有效期至
	* @param  token_expires_in token有效期至
	* 由CSMMAACToolv4.2生成
	*/
	public void setToken_expires_in(Integer token_expires_in){
	this.token_expires_in=token_expires_in;
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
	* 获取 状态，1为正常，默认1
	* @return  status 状态，1为正常，默认1
	* 由CSMMAACToolv4.2生成
	*/
	public Boolean getStatus(){
		return status;
	}
	/**
	* 设置 状态，1为正常，默认1
	* @param  status 状态，1为正常，默认1
	* 由CSMMAACToolv4.2生成
	*/
	public void setStatus(Boolean status){
	this.status=status;
	}
	/**
	* 获取 最后登录时间
	* @return  last_login_time 最后登录时间
	* 由CSMMAACToolv4.2生成
	*/
	public Timestamp getLast_login_time(){
		return last_login_time;
	}
	/**
	* 设置 最后登录时间
	* @param  last_login_time 最后登录时间
	* 由CSMMAACToolv4.2生成
	*/
	public void setLast_login_time(Timestamp last_login_time){
	this.last_login_time=last_login_time;
	}
	/**
	* 获取字符格式最后登录时间
	* @return  last_login_time 最后登录时间
	* 由CSMMAACToolv4.2生成
	*/
	public String getLast_login_timeString(){
		return  StrUtil.Timesamp2String(last_login_time);
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
		if (null != user_id) {
			map.put("user_id", user_id);
		}
		if (null != username) {
			map.put("username", username);
		}
		if (null != password) {
			map.put("password", password);
		}
		if (null != salt) {
			map.put("salt", salt);
		}
		if (null != access_token) {
			map.put("access_token", access_token);
		}
		if (null != token_expires_in) {
			map.put("token_expires_in", token_expires_in);
		}
		if (null != create_time) {
			map.put("create_time", create_time);
		}
		if (null != status) {
			map.put("status", status);
		}
		if (null != last_login_time) {
			map.put("last_login_time", last_login_time);
		}
		return map;
		}
	@Override //By生成工具v4.2
	public String toString(){
	return "Admin [aid=" +aid+",user_id=\"" +user_id+"\",username=\"" +username+"\",password=\"" +password+"\",salt=\"" +salt+"\",access_token=\"" +access_token+"\",token_expires_in=" +token_expires_in+",create_time=\"" + StrUtil.Timesamp2String(create_time)+"\",status=" +status+",last_login_time=\"" + StrUtil.Timesamp2String(last_login_time)+"\""+"]"; 
	} 
}

