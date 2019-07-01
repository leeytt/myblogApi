package top.leeyunt.myblogApi.entity;

import java.sql.*;
import top.leeyunt.myblogApi.util.StrUtil;
import java.util.HashMap;
import java.util.*;
import java.io.Serializable;
   /**
    * Comment
    * 由chenp 的CSMMAACToolv4.2生成
    *实体
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public class Comment implements Serializable {
	private static final long serialVersionUID = 1L;
	private Object aid;//aid
	private String comment_id;//评论id
	private String article_id;//文章id
	private Integer parent_id;//父id, 默认0
	private Integer reply_id;//回复的评论id
	private String coname;//评论者名称
	private String email;//评论者邮箱
	private String content;//评论内容json
	private String source_content;//评论内容（原始内容）
	private Byte status;//状态，1-正常，0-删除，默认1
	private Timestamp create_time;//创建时间
	private Timestamp delete_time;//删除时间
	private Boolean is_author;//是否是作者，1-是，0-否，默认0
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
	* 获取 评论id
	* @return  comment_id 评论id
	* 由CSMMAACToolv4.2生成
	*/
	public String getComment_id(){
		return comment_id;
	}
	/**
	* 设置 评论id
	* @param  comment_id 评论id
	* 由CSMMAACToolv4.2生成
	*/
	public void setComment_id(String comment_id){
	this.comment_id=comment_id;
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
	* 获取 父id, 默认0
	* @return  parent_id 父id, 默认0
	* 由CSMMAACToolv4.2生成
	*/
	public Integer getParent_id(){
		return parent_id;
	}
	/**
	* 设置 父id, 默认0
	* @param  parent_id 父id, 默认0
	* 由CSMMAACToolv4.2生成
	*/
	public void setParent_id(Integer parent_id){
	this.parent_id=parent_id;
	}
	/**
	* 获取 回复的评论id
	* @return  reply_id 回复的评论id
	* 由CSMMAACToolv4.2生成
	*/
	public Integer getReply_id(){
		return reply_id;
	}
	/**
	* 设置 回复的评论id
	* @param  reply_id 回复的评论id
	* 由CSMMAACToolv4.2生成
	*/
	public void setReply_id(Integer reply_id){
	this.reply_id=reply_id;
	}
	/**
	* 获取 评论者名称
	* @return  coname 评论者名称
	* 由CSMMAACToolv4.2生成
	*/
	public String getConame(){
		return coname;
	}
	/**
	* 设置 评论者名称
	* @param  coname 评论者名称
	* 由CSMMAACToolv4.2生成
	*/
	public void setConame(String coname){
	this.coname=coname;
	}
	/**
	* 获取 评论者邮箱
	* @return  email 评论者邮箱
	* 由CSMMAACToolv4.2生成
	*/
	public String getEmail(){
		return email;
	}
	/**
	* 设置 评论者邮箱
	* @param  email 评论者邮箱
	* 由CSMMAACToolv4.2生成
	*/
	public void setEmail(String email){
	this.email=email;
	}
	/**
	* 获取 评论内容json
	* @return  content 评论内容json
	* 由CSMMAACToolv4.2生成
	*/
	public String getContent(){
		return content;
	}
	/**
	* 设置 评论内容json
	* @param  content 评论内容json
	* 由CSMMAACToolv4.2生成
	*/
	public void setContent(String content){
	this.content=content;
	}
	/**
	* 获取 评论内容（原始内容）
	* @return  source_content 评论内容（原始内容）
	* 由CSMMAACToolv4.2生成
	*/
	public String getSource_content(){
		return source_content;
	}
	/**
	* 设置 评论内容（原始内容）
	* @param  source_content 评论内容（原始内容）
	* 由CSMMAACToolv4.2生成
	*/
	public void setSource_content(String source_content){
	this.source_content=source_content;
	}
	/**
	* 获取 状态，1-正常，0-删除，默认1
	* @return  status 状态，1-正常，0-删除，默认1
	* 由CSMMAACToolv4.2生成
	*/
	public Byte getStatus(){
		return status;
	}
	/**
	* 设置 状态，1-正常，0-删除，默认1
	* @param  status 状态，1-正常，0-删除，默认1
	* 由CSMMAACToolv4.2生成
	*/
	public void setStatus(Byte status){
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
	* 获取 是否是作者，1-是，0-否，默认0
	* @return  is_author 是否是作者，1-是，0-否，默认0
	* 由CSMMAACToolv4.2生成
	*/
	public Boolean getIs_author(){
		return is_author;
	}
	/**
	* 设置 是否是作者，1-是，0-否，默认0
	* @param  is_author 是否是作者，1-是，0-否，默认0
	* 由CSMMAACToolv4.2生成
	*/
	public void setIs_author(Boolean is_author){
	this.is_author=is_author;
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
		if (null != comment_id) {
			map.put("comment_id", comment_id);
		}
		if (null != article_id) {
			map.put("article_id", article_id);
		}
		if (null != parent_id) {
			map.put("parent_id", parent_id);
		}
		if (null != reply_id) {
			map.put("reply_id", reply_id);
		}
		if (null != coname) {
			map.put("coname", coname);
		}
		if (null != email) {
			map.put("email", email);
		}
		if (null != content) {
			map.put("content", content);
		}
		if (null != source_content) {
			map.put("source_content", source_content);
		}
		if (null != status) {
			map.put("status", status);
		}
		if (null != create_time) {
			map.put("create_time", create_time);
		}
		if (null != delete_time) {
			map.put("delete_time", delete_time);
		}
		if (null != is_author) {
			map.put("is_author", is_author);
		}
		return map;
		}
	@Override //By生成工具v4.2
	public String toString(){
	return "Comment [aid=" +aid+",comment_id=\"" +comment_id+"\",article_id=\"" +article_id+"\",parent_id=" +parent_id+",reply_id=" +reply_id+",coname=\"" +coname+"\",email=\"" +email+"\",content=\"" +content+"\",source_content=\"" +source_content+"\",status=" +status+",create_time=\"" + StrUtil.Timesamp2String(create_time)+"\",delete_time=\"" + StrUtil.Timesamp2String(delete_time)+"\",is_author=" +is_author+""+"]"; 
	} 
}

