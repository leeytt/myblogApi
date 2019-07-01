package top.leeyunt.myblogApi.services.implement;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import top.leeyunt.myblogApi.dao.*;
import top.leeyunt.myblogApi.entity.*;
import java.util.*;
import top.leeyunt.myblogApi.util.Page;
import top.leeyunt.myblogApi.services.*;
import java.util.List;
import top.leeyunt.myblogApi.util.ResultUtil;
   /**
    * Article_tag_mapperImplement
    * 由chenp 的CSMMAACToolv4.2生成
    *Services 实现类。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 

@Service
public class Article_tag_mapperImplement implements Article_tag_mapperService {

	@Resource
	private Article_tag_mapperDao article_tag_mapperDao;

	//CSMMAACToolv4.2自动生成
	public ResultUtil addArticle_tag_mapper(String article_id,String tag_id) {
		ResultUtil apiresult = new ResultUtil();
     Article_tag_mapper article_tag_mapper = new Article_tag_mapper();	       article_tag_mapper.setArticle_id(article_id);
	       article_tag_mapper.setTag_id(tag_id);
		  try {
        int res =article_tag_mapperDao.save(article_tag_mapper);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?article_tag_mapper:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("saveArticle_tag_mapper出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil updateArticle_tag_mapper(Integer id,String article_id,String tag_id) {
		ResultUtil apiresult = new ResultUtil();
     Article_tag_mapper article_tag_mapper = new Article_tag_mapper();	       article_tag_mapper.setId(id);
	       article_tag_mapper.setArticle_id(article_id);
	       article_tag_mapper.setTag_id(tag_id);
		  try {
        int res =article_tag_mapperDao.dynamicUpdate(article_tag_mapper);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?article_tag_mapper:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("dynamicUpdateArticle_tag_mapper出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil getArticle_tag_mapperById(int id) {
		ResultUtil apiresult = new ResultUtil();
		Article_tag_mapper article_tag_mapper=article_tag_mapperDao.findById(id);
		apiresult.setData(article_tag_mapper);    
		apiresult.setStatus(article_tag_mapper!=null?1:0);
		apiresult.setMsg(article_tag_mapper!=null?"成功":"未能获取id为"+id+"的数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll() {
		ResultUtil apiresult = new ResultUtil();
		List<Article_tag_mapper> article_tag_mapper=article_tag_mapperDao.findAll();
		apiresult.setData(article_tag_mapper);    
		apiresult.setStatus(article_tag_mapper!=null?1:0);
		apiresult.setMsg(article_tag_mapper!=null?"成功":"未能获取数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteArticle_tag_mapperById(int id) {
		ResultUtil apiresult = new ResultUtil();
  	 try {
		    apiresult.setStatus( article_tag_mapperDao.deleteById(id));
		    apiresult.setMsg( apiresult.getStatus()==1?"删除成功！":"删除失败！");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("删除Article_tag_mapper出错！");
		}		return apiresult;
	}
public ResultUtil selectArticle_tag_mapper(Article_tag_mapper article_tag_mapper,Integer pageNow, Integer pageSize,String orderByCase,String screate_time,String ecreate_time) {
		ResultUtil apiresult = new ResultUtil();
 Map<String,Object> map=article_tag_mapper.toMap();
	       if(null!=pageNow&&null!=pageSize){
	       map.put("startPos", (pageNow-1)*pageSize);
	       map.put("pageSize", pageSize);
	       }
           if(null!=orderByCase)
	       map.put("orderByCase", orderByCase);
	       map.put("screate_time",screate_time);
	       map.put("ecreate_time",ecreate_time);
try {
			List<Article_tag_mapper> list = article_tag_mapperDao.dynamicSelect(map);
			long count = article_tag_mapperDao.getArticle_tag_mapperCount(map);
			pageSize=null!=pageSize?pageSize:(int)(count&0xffffffff);
			pageNow=null!=pageNow?pageNow:1;
			Page page=new Page(count, pageNow);
			     page.setPageSize(pageSize);
			apiresult.setPage(page);
			apiresult.setStatus(list.size()&1);
			apiresult.setMsg(list.size() > 0 ? "成功" : "失败");
			apiresult.setData(list.size() > 0 ? list : "");
		} catch (Exception e) {
			e.printStackTrace();
			apiresult.setMsg("dynamic查询Article_tag_mapper出错！");
		}
		return apiresult;       }
}

