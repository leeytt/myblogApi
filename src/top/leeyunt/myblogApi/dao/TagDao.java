package top.leeyunt.myblogApi.dao;

import java.util.List;
import java.util.*;
import top.leeyunt.myblogApi.entity.Tag;
   /**
    * TagDao
    * 由chenp 的CSMMAACToolv4.2生成
    *DAO(数据访问对象)
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public interface TagDao{
	public int save(Tag tag);
	public Tag findById(Object aid);
	public List<Tag> findAll();
	public List<Tag> dynamicSelect(Map<String,Object> map);
	public int dynamicUpdate(Tag tag);
	public long getTagCount(Map<String,Object> map);
	public int deleteById(Object priId);
}

