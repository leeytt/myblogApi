package top.leeyunt.myblogApi.dao;

import java.util.List;
import java.util.*;
import top.leeyunt.myblogApi.entity.Comment;
   /**
    * CommentDao
    * 由chenp 的CSMMAACToolv4.2生成
    *DAO(数据访问对象)
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 


public interface CommentDao{
	public int save(Comment comment);
	public Comment findById(Object aid);
	public List<Comment> findAll();
	public List<Comment> dynamicSelect(Map<String,Object> map);
	public int dynamicUpdate(Comment comment);
	public long getCommentCount(Map<String,Object> map);
	public int deleteById(Object priId);
}

