package top.leeyunt.myblogApi.services;

import top.leeyunt.myblogApi.util.ResultUtil;
import top.leeyunt.myblogApi.entity.*;

   /**
    * Friendurl_typeService
    * 由chenp 的CSMMAACToolv4.2生成
    *服务接口。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
	//CSMMAACToolv4.2自动生成
public interface Friendurl_typeService {
	//CSMMAACToolv4.2自动生成
	public ResultUtil addFriendurl_type(String type_id,String name,Integer friend_count);
	//CSMMAACToolv4.2自动生成
	public ResultUtil updateFriendurl_type(Object aid,String type_id,String name,Integer friend_count);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getFriendurl_typeById(Object aid);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll();

	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteFriendurl_typeById(Object aid);
     /* 通过参数得到记录*
     * 
	//CSMMAACToolv4.2自动生成
     * @return 结果类
     */
	public ResultUtil selectFriendurl_type(Friendurl_type friendurl_type,Integer pageNow, Integer pageSize,String orderByCase);}

