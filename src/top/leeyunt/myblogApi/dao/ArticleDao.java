package top.leeyunt.myblogApi.dao;

import java.util.List;
import java.util.*;
import top.leeyunt.myblogApi.entity.Article;
   /**
    * ArticleDao
    * 由chenp 的CSMMAACToolv4.2生成
    *DAO(数据访问对象)
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public interface ArticleDao{
	public int save(Article article);
	public Article findById(Object aid);
	public List<Article> findAll();
	public List<Article> dynamicSelect(Map<String,Object> map);
	public int dynamicUpdate(Article article);
	public long getArticleCount(Map<String,Object> map);
	public int deleteById(Object priId);
}

