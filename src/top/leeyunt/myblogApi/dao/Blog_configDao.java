package top.leeyunt.myblogApi.dao;

import java.util.List;
import java.util.*;
import top.leeyunt.myblogApi.entity.Blog_config;
   /**
    * Blog_configDao
    * 由chenp 的CSMMAACToolv4.2生成
    *DAO(数据访问对象)
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public interface Blog_configDao{
	public int save(Blog_config blog_config);
	public Blog_config findById(Object id);
	public List<Blog_config> findAll();
	public List<Blog_config> dynamicSelect(Map<String,Object> map);
	public int dynamicUpdate(Blog_config blog_config);
	public long getBlog_configCount(Map<String,Object> map);
	public int deleteById(Object priId);
}

