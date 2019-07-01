package top.leeyunt.myblogApi.dao;

import java.util.List;
import java.util.*;
import top.leeyunt.myblogApi.entity.Friendurl_type;
   /**
    * Friendurl_typeDao
    * 由chenp 的CSMMAACToolv4.2生成
    *DAO(数据访问对象)
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public interface Friendurl_typeDao{
	public int save(Friendurl_type friendurl_type);
	public Friendurl_type findById(Object aid);
	public List<Friendurl_type> findAll();
	public List<Friendurl_type> dynamicSelect(Map<String,Object> map);
	public int dynamicUpdate(Friendurl_type friendurl_type);
	public long getFriendurl_typeCount(Map<String,Object> map);
	public int deleteById(Object priId);
}

