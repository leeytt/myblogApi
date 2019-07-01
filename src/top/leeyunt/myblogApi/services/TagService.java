package top.leeyunt.myblogApi.services;

import top.leeyunt.myblogApi.util.ResultUtil;
import top.leeyunt.myblogApi.entity.*;

   /**
    * TagService
    * 由chenp 的CSMMAACToolv4.2生成
    *服务接口。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
	//CSMMAACToolv4.2自动生成
public interface TagService {
	//CSMMAACToolv4.2自动生成
	public ResultUtil addTag(String tag_id,String name,Boolean status,Boolean can_del,Integer article_count);
	//CSMMAACToolv4.2自动生成
	public ResultUtil updateTag(Object aid,String tag_id,String name,Boolean status,Boolean can_del,Integer article_count);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getTagById(Object aid);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll();

	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteTagById(Object aid);
     /* 通过参数得到记录*
     * 
	//CSMMAACToolv4.2自动生成
     * @return 结果类
     */
	public ResultUtil selectTag(Tag tag,Integer pageNow, Integer pageSize,String orderByCase,String screate_time,String ecreate_time,String supdate_time,String eupdate_time);}

