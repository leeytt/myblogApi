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
    * ArticleImplement
    * 由chenp 的CSMMAACToolv4.2生成
    *Services 实现类。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 

@Service
public class ArticleImplement implements ArticleService {

	@Resource
	private ArticleDao articleDao;

	//CSMMAACToolv4.2自动生成
	public ResultUtil addArticle(String article_id,String title,String category_id,String cover,String sub_message,String content,String html_content,Boolean is_encrypt,Byte status,Integer pageview) {
		ResultUtil apiresult = new ResultUtil();
     Article article = new Article();	       article.setArticle_id(article_id);
	       article.setTitle(title);
	       article.setCategory_id(category_id);
	       article.setCover(cover);
	       article.setSub_message(sub_message);
	       article.setContent(content);
	       article.setHtml_content(html_content);
	       article.setIs_encrypt(is_encrypt);
	       article.setStatus(status);
	       article.setPageview(pageview);
		  try {
        int res =articleDao.save(article);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?article:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("saveArticle出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil updateArticle(Object aid,String article_id,String title,String category_id,String cover,String sub_message,String content,String html_content,Boolean is_encrypt,Byte status,Integer pageview) {
		ResultUtil apiresult = new ResultUtil();
     Article article = new Article();	       article.setAid(aid);
	       article.setArticle_id(article_id);
	       article.setTitle(title);
	       article.setCategory_id(category_id);
	       article.setCover(cover);
	       article.setSub_message(sub_message);
	       article.setContent(content);
	       article.setHtml_content(html_content);
	       article.setIs_encrypt(is_encrypt);
	       article.setStatus(status);
	       article.setPageview(pageview);
		  try {
        int res =articleDao.dynamicUpdate(article);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?article:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("dynamicUpdateArticle出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil getArticleById(Object aid) {
		ResultUtil apiresult = new ResultUtil();
		Article article=articleDao.findById(aid);
		apiresult.setData(article);    
		apiresult.setStatus(article!=null?1:0);
		apiresult.setMsg(article!=null?"成功":"未能获取id为"+aid+"的数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll() {
		ResultUtil apiresult = new ResultUtil();
		List<Article> article=articleDao.findAll();
		apiresult.setData(article);    
		apiresult.setStatus(article!=null?1:0);
		apiresult.setMsg(article!=null?"成功":"未能获取数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteArticleById(Object aid) {
		ResultUtil apiresult = new ResultUtil();
  	 try {
		    apiresult.setStatus( articleDao.deleteById(aid));
		    apiresult.setMsg( apiresult.getStatus()==1?"删除成功！":"删除失败！");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("删除Article出错！");
		}		return apiresult;
	}
public ResultUtil selectArticle(Article article,Integer pageNow, Integer pageSize,String orderByCase,String screate_time,String ecreate_time,String supdate_time,String eupdate_time,String spublish_time,String epublish_time,String sdelete_time,String edelete_time) {
		ResultUtil apiresult = new ResultUtil();
 Map<String,Object> map=article.toMap();
	       if(null!=pageNow&&null!=pageSize){
	       map.put("startPos", (pageNow-1)*pageSize);
	       map.put("pageSize", pageSize);
	       }
           if(null!=orderByCase)
	       map.put("orderByCase", orderByCase);
	       map.put("screate_time",screate_time);
	       map.put("ecreate_time",ecreate_time);
	       map.put("supdate_time",supdate_time);
	       map.put("eupdate_time",eupdate_time);
	       map.put("spublish_time",spublish_time);
	       map.put("epublish_time",epublish_time);
	       map.put("sdelete_time",sdelete_time);
	       map.put("edelete_time",edelete_time);
try {
			List<Article> list = articleDao.dynamicSelect(map);
			long count = articleDao.getArticleCount(map);
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
			apiresult.setMsg("dynamic查询Article出错！");
		}
		return apiresult;       }
}

