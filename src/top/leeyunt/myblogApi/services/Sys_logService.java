package top.leeyunt.myblogApi.services;

import top.leeyunt.myblogApi.util.ResultUtil;
import top.leeyunt.myblogApi.entity.*;

   /**
    * Sys_logService
    * 由chenp 的CSMMAACToolv4.2生成
    *服务接口。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
	//CSMMAACToolv4.2自动生成
public interface Sys_logService {
	//CSMMAACToolv4.2自动生成
	public ResultUtil addSys_log(String log_content,String login_ip);
	//CSMMAACToolv4.2自动生成
	public ResultUtil updateSys_log(Object id,String log_content,String login_ip);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getSys_logById(Object id);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll();

	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteSys_logById(Object id);
     /* 通过参数得到记录*
     * 
	//CSMMAACToolv4.2自动生成
     * @return 结果类
     */
	public ResultUtil selectSys_log(Sys_log sys_log,Integer pageNow, Integer pageSize,String orderByCase,String slog_time,String elog_time);}

