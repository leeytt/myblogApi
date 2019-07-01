package top.leeyunt.myblogApi.services;

import top.leeyunt.myblogApi.util.ResultUtil;
import top.leeyunt.myblogApi.entity.*;

   /**
    * Blog_configService
    * 由chenp 的CSMMAACToolv4.2生成
    *服务接口。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
	//CSMMAACToolv4.2自动生成
public interface Blog_configService {
	//CSMMAACToolv4.2自动生成
	public ResultUtil addBlog_config(String blog_name,String avatar,String sign,String wxpay_qrcode,String alipay_qrcode,String github,String view_password,String salt);
	//CSMMAACToolv4.2自动生成
	public ResultUtil updateBlog_config(Object id,String blog_name,String avatar,String sign,String wxpay_qrcode,String alipay_qrcode,String github,String view_password,String salt);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getBlog_configById(Object id);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll();

	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteBlog_configById(Object id);
     /* 通过参数得到记录*
     * 
	//CSMMAACToolv4.2自动生成
     * @return 结果类
     */
	public ResultUtil selectBlog_config(Blog_config blog_config,Integer pageNow, Integer pageSize,String orderByCase);}

