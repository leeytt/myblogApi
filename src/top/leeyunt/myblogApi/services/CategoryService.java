package top.leeyunt.myblogApi.services;

import top.leeyunt.myblogApi.util.ResultUtil;
import top.leeyunt.myblogApi.entity.*;

   /**
    * CategoryService
    * 由chenp 的CSMMAACToolv4.2生成
    *服务接口。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
	//CSMMAACToolv4.2自动生成
public interface CategoryService {
	//CSMMAACToolv4.2自动生成
	public ResultUtil addCategory(String category_id,String name,Boolean status,Boolean can_del,Integer article_count);
	//CSMMAACToolv4.2自动生成
	public ResultUtil updateCategory(Object aid,String category_id,String name,Boolean status,Boolean can_del,Integer article_count);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getCategoryById(Object aid);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll();

	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteCategoryById(Object aid);
     /* 通过参数得到记录*
     * 
	//CSMMAACToolv4.2自动生成
     * @return 结果类
     */
	public ResultUtil selectCategory(Category category,Integer pageNow, Integer pageSize,String orderByCase,String screate_time,String ecreate_time,String supdate_time,String eupdate_time);}

