package top.leeyunt.myblogApi.entity;

import java.util.HashMap;
import java.util.*;
import java.io.Serializable;
   /**
    * Pages
    * 由chenp 的CSMMAACToolv4.2生成
    *实体
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public class Pages implements Serializable {
	private static final long serialVersionUID = 1L;
	private Object id;//id
	private String paname;//页面名称
	private String md_content;//markdown内容
	private String html_content;//生成的html内容
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
	* 获取 页面名称
	* @return  paname 页面名称
	* 由CSMMAACToolv4.2生成
	*/
	public String getPaname(){
		return paname;
	}
	/**
	* 设置 页面名称
	* @param  paname 页面名称
	* 由CSMMAACToolv4.2生成
	*/
	public void setPaname(String paname){
	this.paname=paname;
	}
	/**
	* 获取 markdown内容
	* @return  md_content markdown内容
	* 由CSMMAACToolv4.2生成
	*/
	public String getMd_content(){
		return md_content;
	}
	/**
	* 设置 markdown内容
	* @param  md_content markdown内容
	* 由CSMMAACToolv4.2生成
	*/
	public void setMd_content(String md_content){
	this.md_content=md_content;
	}
	/**
	* 获取 生成的html内容
	* @return  html_content 生成的html内容
	* 由CSMMAACToolv4.2生成
	*/
	public String getHtml_content(){
		return html_content;
	}
	/**
	* 设置 生成的html内容
	* @param  html_content 生成的html内容
	* 由CSMMAACToolv4.2生成
	*/
	public void setHtml_content(String html_content){
	this.html_content=html_content;
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
		if (null != paname) {
			map.put("paname", paname);
		}
		if (null != md_content) {
			map.put("md_content", md_content);
		}
		if (null != html_content) {
			map.put("html_content", html_content);
		}
		return map;
		}
	@Override //By生成工具v4.2
	public String toString(){
	return "Pages [id=" +id+",paname=\"" +paname+"\",md_content=\"" +md_content+"\",html_content=\"" +html_content+"\""+"]"; 
	} 
}

