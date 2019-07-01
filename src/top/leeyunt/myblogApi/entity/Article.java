package top.leeyunt.myblogApi.entity;

import java.sql.*;
import top.leeyunt.myblogApi.util.StrUtil;
import java.util.HashMap;
import java.util.*;
import java.io.Serializable;
   /**
    * Article
    * 由chenp 的CSMMAACToolv4.2生成
    *实体
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public class Article implements Serializable {
	private static final long serialVersionUID = 1L;
	private Object aid;//aid
	private String article_id;//文章id
	private String title;//文章标题
	private String category_id;//文章分类id
	private String cover;//封面图url
	private String sub_message;//文章简介
	private String content;//内容
	private String html_content;//生成的html
	private Boolean is_encrypt;//是否加密，1-是，0-否，默认0
	private Timestamp create_time;//创建时间
	private Timestamp update_time;//更新时间
	private Timestamp publish_time;//提交时间
	private Timestamp delete_time;//删除时间
	private Byte status;//状态，1-正常（发布），0-删除，2-草稿（待发布）
	private Integer pageview;//文章阅读数
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
	* 获取 文章标题
	* @return  title 文章标题
	* 由CSMMAACToolv4.2生成
	*/
	public String getTitle(){
		return title;
	}
	/**
	* 设置 文章标题
	* @param  title 文章标题
	* 由CSMMAACToolv4.2生成
	*/
	public void setTitle(String title){
	this.title=title;
	}
	/**
	* 获取 文章分类id
	* @return  category_id 文章分类id
	* 由CSMMAACToolv4.2生成
	*/
	public String getCategory_id(){
		return category_id;
	}
	/**
	* 设置 文章分类id
	* @param  category_id 文章分类id
	* 由CSMMAACToolv4.2生成
	*/
	public void setCategory_id(String category_id){
	this.category_id=category_id;
	}
	/**
	* 获取 封面图url
	* @return  cover 封面图url
	* 由CSMMAACToolv4.2生成
	*/
	public String getCover(){
		return cover;
	}
	/**
	* 设置 封面图url
	* @param  cover 封面图url
	* 由CSMMAACToolv4.2生成
	*/
	public void setCover(String cover){
	this.cover=cover;
	}
	/**
	* 获取 文章简介
	* @return  sub_message 文章简介
	* 由CSMMAACToolv4.2生成
	*/
	public String getSub_message(){
		return sub_message;
	}
	/**
	* 设置 文章简介
	* @param  sub_message 文章简介
	* 由CSMMAACToolv4.2生成
	*/
	public void setSub_message(String sub_message){
	this.sub_message=sub_message;
	}
	/**
	* 获取 内容
	* @return  content 内容
	* 由CSMMAACToolv4.2生成
	*/
	public String getContent(){
		return content;
	}
	/**
	* 设置 内容
	* @param  content 内容
	* 由CSMMAACToolv4.2生成
	*/
	public void setContent(String content){
	this.content=content;
	}
	/**
	* 获取 生成的html
	* @return  html_content 生成的html
	* 由CSMMAACToolv4.2生成
	*/
	public String getHtml_content(){
		return html_content;
	}
	/**
	* 设置 生成的html
	* @param  html_content 生成的html
	* 由CSMMAACToolv4.2生成
	*/
	public void setHtml_content(String html_content){
	this.html_content=html_content;
	}
	/**
	* 获取 是否加密，1-是，0-否，默认0
	* @return  is_encrypt 是否加密，1-是，0-否，默认0
	* 由CSMMAACToolv4.2生成
	*/
	public Boolean getIs_encrypt(){
		return is_encrypt;
	}
	/**
	* 设置 是否加密，1-是，0-否，默认0
	* @param  is_encrypt 是否加密，1-是，0-否，默认0
	* 由CSMMAACToolv4.2生成
	*/
	public void setIs_encrypt(Boolean is_encrypt){
	this.is_encrypt=is_encrypt;
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
	* 获取 提交时间
	* @return  publish_time 提交时间
	* 由CSMMAACToolv4.2生成
	*/
	public Timestamp getPublish_time(){
		return publish_time;
	}
	/**
	* 设置 提交时间
	* @param  publish_time 提交时间
	* 由CSMMAACToolv4.2生成
	*/
	public void setPublish_time(Timestamp publish_time){
	this.publish_time=publish_time;
	}
	/**
	* 获取字符格式提交时间
	* @return  publish_time 提交时间
	* 由CSMMAACToolv4.2生成
	*/
	public String getPublish_timeString(){
		return  StrUtil.Timesamp2String(publish_time);
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
	* 获取 状态，1-正常（发布），0-删除，2-草稿（待发布）
	* @return  status 状态，1-正常（发布），0-删除，2-草稿（待发布）
	* 由CSMMAACToolv4.2生成
	*/
	public Byte getStatus(){
		return status;
	}
	/**
	* 设置 状态，1-正常（发布），0-删除，2-草稿（待发布）
	* @param  status 状态，1-正常（发布），0-删除，2-草稿（待发布）
	* 由CSMMAACToolv4.2生成
	*/
	public void setStatus(Byte status){
	this.status=status;
	}
	/**
	* 获取 文章阅读数
	* @return  pageview 文章阅读数
	* 由CSMMAACToolv4.2生成
	*/
	public Integer getPageview(){
		return pageview;
	}
	/**
	* 设置 文章阅读数
	* @param  pageview 文章阅读数
	* 由CSMMAACToolv4.2生成
	*/
	public void setPageview(Integer pageview){
	this.pageview=pageview;
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
		if (null != article_id) {
			map.put("article_id", article_id);
		}
		if (null != title) {
			map.put("title", title);
		}
		if (null != category_id) {
			map.put("category_id", category_id);
		}
		if (null != cover) {
			map.put("cover", cover);
		}
		if (null != sub_message) {
			map.put("sub_message", sub_message);
		}
		if (null != content) {
			map.put("content", content);
		}
		if (null != html_content) {
			map.put("html_content", html_content);
		}
		if (null != is_encrypt) {
			map.put("is_encrypt", is_encrypt);
		}
		if (null != create_time) {
			map.put("create_time", create_time);
		}
		if (null != update_time) {
			map.put("update_time", update_time);
		}
		if (null != publish_time) {
			map.put("publish_time", publish_time);
		}
		if (null != delete_time) {
			map.put("delete_time", delete_time);
		}
		if (null != status) {
			map.put("status", status);
		}
		if (null != pageview) {
			map.put("pageview", pageview);
		}
		return map;
		}
	@Override //By生成工具v4.2
	public String toString(){
	return "Article [aid=" +aid+",article_id=\"" +article_id+"\",title=\"" +title+"\",category_id=\"" +category_id+"\",cover=\"" +cover+"\",sub_message=\"" +sub_message+"\",content=\"" +content+"\",html_content=\"" +html_content+"\",is_encrypt=" +is_encrypt+",create_time=\"" + StrUtil.Timesamp2String(create_time)+"\",update_time=\"" + StrUtil.Timesamp2String(update_time)+"\",publish_time=\"" + StrUtil.Timesamp2String(publish_time)+"\",delete_time=\"" + StrUtil.Timesamp2String(delete_time)+"\",status=" +status+",pageview=" +pageview+""+"]"; 
	} 
}

