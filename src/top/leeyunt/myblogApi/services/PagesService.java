package top.leeyunt.myblogApi.services;

import top.leeyunt.myblogApi.util.ResultUtil;
import top.leeyunt.myblogApi.entity.*;

   /**
    * PagesService
    * 由chenp 的CSMMAACToolv4.2生成
    *服务接口。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
	//CSMMAACToolv4.2自动生成
public interface PagesService {
	//CSMMAACToolv4.2自动生成
	public ResultUtil addPages(String paname,String md_content,String html_content);
	//CSMMAACToolv4.2自动生成
	public ResultUtil updatePages(Object id,String paname,String md_content,String html_content);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getPagesById(Object id);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll();

	//CSMMAACToolv4.2自动生成
	public ResultUtil deletePagesById(Object id);
     /* 通过参数得到记录*
     * 
	//CSMMAACToolv4.2自动生成
     * @return 结果类
     */
	public ResultUtil selectPages(Pages pages,Integer pageNow, Integer pageSize,String orderByCase);}

