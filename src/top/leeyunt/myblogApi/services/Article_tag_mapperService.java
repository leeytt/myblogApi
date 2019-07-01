package top.leeyunt.myblogApi.services;

import top.leeyunt.myblogApi.util.ResultUtil;
import top.leeyunt.myblogApi.entity.*;

   /**
    * Article_tag_mapperService
    * 由chenp 的CSMMAACToolv4.2生成
    *服务接口。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
	//CSMMAACToolv4.2自动生成
public interface Article_tag_mapperService {
	//CSMMAACToolv4.2自动生成
	public ResultUtil addArticle_tag_mapper(String article_id,String tag_id);
	//CSMMAACToolv4.2自动生成
	public ResultUtil updateArticle_tag_mapper(Integer id,String article_id,String tag_id);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getArticle_tag_mapperById(int id);

	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll();

	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteArticle_tag_mapperById(int id);
     /* 通过参数得到记录*
     * 
	//CSMMAACToolv4.2自动生成
     * @return 结果类
     */
	public ResultUtil selectArticle_tag_mapper(Article_tag_mapper article_tag_mapper,Integer pageNow, Integer pageSize,String orderByCase,String screate_time,String ecreate_time);}

