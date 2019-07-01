package top.leeyunt.myblogApi.dao;

import java.util.List;
import java.util.*;
import top.leeyunt.myblogApi.entity.Admin;
   /**
    * AdminDao
    * 由chenp 的CSMMAACToolv4.2生成
    *DAO(数据访问对象)
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public interface AdminDao{
	public int save(Admin admin);
	public Admin findById(Object aid);
	public List<Admin> findAll();
	public List<Admin> dynamicSelect(Map<String,Object> map);
	public int dynamicUpdate(Admin admin);
	public long getAdminCount(Map<String,Object> map);
	public int deleteById(Object priId);
}

