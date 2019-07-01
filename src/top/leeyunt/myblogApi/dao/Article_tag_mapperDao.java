package top.leeyunt.myblogApi.dao;

import java.util.List;
import java.util.*;
import top.leeyunt.myblogApi.entity.Article_tag_mapper;
   /**
    * Article_tag_mapperDao
    * 由chenp 的CSMMAACToolv4.2生成
    *DAO(数据访问对象)
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public interface Article_tag_mapperDao{
	public int save(Article_tag_mapper article_tag_mapper);
	public Article_tag_mapper findById(int id);
	public List<Article_tag_mapper> findAll();
	public List<Article_tag_mapper> dynamicSelect(Map<String,Object> map);
	public int dynamicUpdate(Article_tag_mapper article_tag_mapper);
	public long getArticle_tag_mapperCount(Map<String,Object> map);
	public int deleteById(int priId);
}

