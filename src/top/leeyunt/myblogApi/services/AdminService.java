package top.leeyunt.myblogApi.services;

import top.leeyunt.myblogApi.util.ResultUtil;
import top.leeyunt.myblogApi.entity.*;

   /**
    * AdminService
    * 由chenp 的CSMMAACToolv4.2生成
    *服务接口。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
	//CSMMAACToolv4.2自动生成
public interface AdminService {
	//CSMMAACToolv4.2自动生成
	public ResultUtil addAdmin(String user_id,String username,String password,String salt,String access_token,Integer token_expires_in,Boolean status);
	//CSMMAACToolv4.2自动生成
	public ResultUtil updateAdmin(Object aid,String user_id,String username,String password,String salt,String access_token,Integer token_expires_in,Boolean status);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getAdminById(Object aid);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll();

	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteAdminById(Object aid);
     /* 通过参数得到记录*
     * 
	//CSMMAACToolv4.2自动生成
     * @return 结果类
     */
	public ResultUtil selectAdmin(Admin admin,Integer pageNow, Integer pageSize,String orderByCase,String screate_time,String ecreate_time,String slast_login_time,String elast_login_time);}

