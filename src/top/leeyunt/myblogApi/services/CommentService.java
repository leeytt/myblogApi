package top.leeyunt.myblogApi.services;

import top.leeyunt.myblogApi.util.ResultUtil;
import top.leeyunt.myblogApi.entity.*;

   /**
    * CommentService
    * 由chenp 的CSMMAACToolv4.2生成
    *服务接口。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
	//CSMMAACToolv4.2自动生成
public interface CommentService {
	//CSMMAACToolv4.2自动生成
	public ResultUtil addComment(String comment_id,String article_id,Integer parent_id,Integer reply_id,String coname,String email,String content,String source_content,Byte status,Boolean is_author);
	//CSMMAACToolv4.2自动生成
	public ResultUtil updateComment(Object aid,String comment_id,String article_id,Integer parent_id,Integer reply_id,String coname,String email,String content,String source_content,Byte status,Boolean is_author);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getCommentById(Object aid);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll();

	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteCommentById(Object aid);
     /* 通过参数得到记录*
     * 
	//CSMMAACToolv4.2自动生成
     * @return 结果类
     */
	public ResultUtil selectComment(Comment comment,Integer pageNow, Integer pageSize,String orderByCase,String screate_time,String ecreate_time,String sdelete_time,String edelete_time);}

