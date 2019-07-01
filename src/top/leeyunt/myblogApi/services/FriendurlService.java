package top.leeyunt.myblogApi.services;

import top.leeyunt.myblogApi.util.ResultUtil;
import top.leeyunt.myblogApi.entity.*;

   /**
    * FriendurlService
    * 由chenp 的CSMMAACToolv4.2生成
    *服务接口。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
	//CSMMAACToolv4.2自动生成
public interface FriendurlService {
	//CSMMAACToolv4.2自动生成
	public ResultUtil addFriendurl(String friendurl_id,String name,String url,String type_id,Boolean status);
	//CSMMAACToolv4.2自动生成
	public ResultUtil updateFriendurl(Object aid,String friendurl_id,String name,String url,String type_id,Boolean status);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getFriendurlById(Object aid);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll();

	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteFriendurlById(Object aid);
     /* 通过参数得到记录*
     * 
	//CSMMAACToolv4.2自动生成
     * @return 结果类
     */
	public ResultUtil selectFriendurl(Friendurl friendurl,Integer pageNow, Integer pageSize,String orderByCase,String screate_time,String ecreate_time,String supdate_time,String eupdate_time,String sdelete_time,String edelete_time);}

