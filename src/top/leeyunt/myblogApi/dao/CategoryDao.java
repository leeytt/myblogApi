package top.leeyunt.myblogApi.dao;

import java.util.List;
import java.util.*;
import top.leeyunt.myblogApi.entity.Category;
   /**
    * CategoryDao
    * 由chenp 的CSMMAACToolv4.2生成
    *DAO(数据访问对象)
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public interface CategoryDao{
	public int save(Category category);
	public Category findById(Object aid);
	public List<Category> findAll();
	public List<Category> dynamicSelect(Map<String,Object> map);
	public int dynamicUpdate(Category category);
	public long getCategoryCount(Map<String,Object> map);
	public int deleteById(Object priId);
}

