package top.leeyunt.myblogApi.dao;

import java.util.List;
import java.util.*;
import top.leeyunt.myblogApi.entity.Pages;
   /**
    * PagesDao
    * 由chenp 的CSMMAACToolv4.2生成
    *DAO(数据访问对象)
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public interface PagesDao{
	public int save(Pages pages);
	public Pages findById(Object id);
	public List<Pages> findAll();
	public List<Pages> dynamicSelect(Map<String,Object> map);
	public int dynamicUpdate(Pages pages);
	public long getPagesCount(Map<String,Object> map);
	public int deleteById(Object priId);
}

