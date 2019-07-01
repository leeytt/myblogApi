package top.leeyunt.myblogApi.dao;

import java.util.List;
import java.util.*;
import top.leeyunt.myblogApi.entity.Sys_log;
   /**
    * Sys_logDao
    * 由chenp 的CSMMAACToolv4.2生成
    *DAO(数据访问对象)
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public interface Sys_logDao{
	public int save(Sys_log sys_log);
	public Sys_log findById(Object id);
	public List<Sys_log> findAll();
	public List<Sys_log> dynamicSelect(Map<String,Object> map);
	public int dynamicUpdate(Sys_log sys_log);
	public long getSys_logCount(Map<String,Object> map);
	public int deleteById(Object priId);
}

