package top.leeyunt.myblogApi.entity;

import java.util.HashMap;
import java.util.*;
import java.io.Serializable;
   /**
    * Blog_config
    * 由chenp 的CSMMAACToolv4.2生成
    *实体
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public class Blog_config implements Serializable {
	private static final long serialVersionUID = 1L;
	private Object id;//id
	private String blog_name;//博客名称
	private String avatar;//头像url
	private String sign;//个性签名
	private String wxpay_qrcode;//微信支付二维码url
	private String alipay_qrcode;//支付宝支付二维码url
	private String github;//github url
	private String view_password;//阅读加密密码
	private String salt;//阅读加密秘钥
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
	* 获取 博客名称
	* @return  blog_name 博客名称
	* 由CSMMAACToolv4.2生成
	*/
	public String getBlog_name(){
		return blog_name;
	}
	/**
	* 设置 博客名称
	* @param  blog_name 博客名称
	* 由CSMMAACToolv4.2生成
	*/
	public void setBlog_name(String blog_name){
	this.blog_name=blog_name;
	}
	/**
	* 获取 头像url
	* @return  avatar 头像url
	* 由CSMMAACToolv4.2生成
	*/
	public String getAvatar(){
		return avatar;
	}
	/**
	* 设置 头像url
	* @param  avatar 头像url
	* 由CSMMAACToolv4.2生成
	*/
	public void setAvatar(String avatar){
	this.avatar=avatar;
	}
	/**
	* 获取 个性签名
	* @return  sign 个性签名
	* 由CSMMAACToolv4.2生成
	*/
	public String getSign(){
		return sign;
	}
	/**
	* 设置 个性签名
	* @param  sign 个性签名
	* 由CSMMAACToolv4.2生成
	*/
	public void setSign(String sign){
	this.sign=sign;
	}
	/**
	* 获取 微信支付二维码url
	* @return  wxpay_qrcode 微信支付二维码url
	* 由CSMMAACToolv4.2生成
	*/
	public String getWxpay_qrcode(){
		return wxpay_qrcode;
	}
	/**
	* 设置 微信支付二维码url
	* @param  wxpay_qrcode 微信支付二维码url
	* 由CSMMAACToolv4.2生成
	*/
	public void setWxpay_qrcode(String wxpay_qrcode){
	this.wxpay_qrcode=wxpay_qrcode;
	}
	/**
	* 获取 支付宝支付二维码url
	* @return  alipay_qrcode 支付宝支付二维码url
	* 由CSMMAACToolv4.2生成
	*/
	public String getAlipay_qrcode(){
		return alipay_qrcode;
	}
	/**
	* 设置 支付宝支付二维码url
	* @param  alipay_qrcode 支付宝支付二维码url
	* 由CSMMAACToolv4.2生成
	*/
	public void setAlipay_qrcode(String alipay_qrcode){
	this.alipay_qrcode=alipay_qrcode;
	}
	/**
	* 获取 github url
	* @return  github github url
	* 由CSMMAACToolv4.2生成
	*/
	public String getGithub(){
		return github;
	}
	/**
	* 设置 github url
	* @param  github github url
	* 由CSMMAACToolv4.2生成
	*/
	public void setGithub(String github){
	this.github=github;
	}
	/**
	* 获取 阅读加密密码
	* @return  view_password 阅读加密密码
	* 由CSMMAACToolv4.2生成
	*/
	public String getView_password(){
		return view_password;
	}
	/**
	* 设置 阅读加密密码
	* @param  view_password 阅读加密密码
	* 由CSMMAACToolv4.2生成
	*/
	public void setView_password(String view_password){
	this.view_password=view_password;
	}
	/**
	* 获取 阅读加密秘钥
	* @return  salt 阅读加密秘钥
	* 由CSMMAACToolv4.2生成
	*/
	public String getSalt(){
		return salt;
	}
	/**
	* 设置 阅读加密秘钥
	* @param  salt 阅读加密秘钥
	* 由CSMMAACToolv4.2生成
	*/
	public void setSalt(String salt){
	this.salt=salt;
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
		if (null != blog_name) {
			map.put("blog_name", blog_name);
		}
		if (null != avatar) {
			map.put("avatar", avatar);
		}
		if (null != sign) {
			map.put("sign", sign);
		}
		if (null != wxpay_qrcode) {
			map.put("wxpay_qrcode", wxpay_qrcode);
		}
		if (null != alipay_qrcode) {
			map.put("alipay_qrcode", alipay_qrcode);
		}
		if (null != github) {
			map.put("github", github);
		}
		if (null != view_password) {
			map.put("view_password", view_password);
		}
		if (null != salt) {
			map.put("salt", salt);
		}
		return map;
		}
	@Override //By生成工具v4.2
	public String toString(){
	return "Blog_config [id=" +id+",blog_name=\"" +blog_name+"\",avatar=\"" +avatar+"\",sign=\"" +sign+"\",wxpay_qrcode=\"" +wxpay_qrcode+"\",alipay_qrcode=\"" +alipay_qrcode+"\",github=\"" +github+"\",view_password=\"" +view_password+"\",salt=\"" +salt+"\""+"]"; 
	} 
}

