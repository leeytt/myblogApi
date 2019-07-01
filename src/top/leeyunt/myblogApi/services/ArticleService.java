package top.leeyunt.myblogApi.services;

import top.leeyunt.myblogApi.util.ResultUtil;
import top.leeyunt.myblogApi.entity.*;

   /**
    * ArticleService
    * 由chenp 的CSMMAACToolv4.2生成
    *服务接口。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
	//CSMMAACToolv4.2自动生成
public interface ArticleService {
	//CSMMAACToolv4.2自动生成
	public ResultUtil addArticle(String article_id,String title,String category_id,String cover,String sub_message,String content,String html_content,Boolean is_encrypt,Byte status,Integer pageview);
	//CSMMAACToolv4.2自动生成
	public ResultUtil updateArticle(Object aid,String article_id,String title,String category_id,String cover,String sub_message,String content,String html_content,Boolean is_encrypt,Byte status,Integer pageview);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getArticleById(Object aid);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll();

	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteArticleById(Object aid);
     /* 通过参数得到记录*
     * 
	//CSMMAACToolv4.2自动生成
     * @return 结果类
     */
	public ResultUtil selectArticle(Article article,Integer pageNow, Integer pageSize,String orderByCase,String screate_time,String ecreate_time,String supdate_time,String eupdate_time,String spublish_time,String epublish_time,String sdelete_time,String edelete_time);}

