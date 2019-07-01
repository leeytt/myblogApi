package top.leeyunt.myblogApi.dao;

import java.util.List;
import java.util.*;
import top.leeyunt.myblogApi.entity.Friendurl;
   /**
    * FriendurlDao
    * 由chenp 的CSMMAACToolv4.2生成
    *DAO(数据访问对象)
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public interface FriendurlDao{
	public int save(Friendurl friendurl);
	public Friendurl findById(Object aid);
	public List<Friendurl> findAll();
	public List<Friendurl> dynamicSelect(Map<String,Object> map);
	public int dynamicUpdate(Friendurl friendurl);
	public long getFriendurlCount(Map<String,Object> map);
	public int deleteById(Object priId);
}

