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
    * CategoryImplement
    * 由chenp 的CSMMAACToolv4.2生成
    *Services 实现类。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 

@Service
public class CategoryImplement implements CategoryService {

	@Resource
	private CategoryDao categoryDao;

	//CSMMAACToolv4.2自动生成
	public ResultUtil addCategory(String category_id,String name,Boolean status,Boolean can_del,Integer article_count) {
		ResultUtil apiresult = new ResultUtil();
     Category category = new Category();	       category.setCategory_id(category_id);
	       category.setName(name);
	       category.setStatus(status);
	       category.setCan_del(can_del);
	       category.setArticle_count(article_count);
		  try {
        int res =categoryDao.save(category);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?category:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("saveCategory出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil updateCategory(Object aid,String category_id,String name,Boolean status,Boolean can_del,Integer article_count) {
		ResultUtil apiresult = new ResultUtil();
     Category category = new Category();	       category.setAid(aid);
	       category.setCategory_id(category_id);
	       category.setName(name);
	       category.setStatus(status);
	       category.setCan_del(can_del);
	       category.setArticle_count(article_count);
		  try {
        int res =categoryDao.dynamicUpdate(category);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?category:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("dynamicUpdateCategory出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil getCategoryById(Object aid) {
		ResultUtil apiresult = new ResultUtil();
		Category category=categoryDao.findById(aid);
		apiresult.setData(category);    
		apiresult.setStatus(category!=null?1:0);
		apiresult.setMsg(category!=null?"成功":"未能获取id为"+aid+"的数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll() {
		ResultUtil apiresult = new ResultUtil();
		List<Category> category=categoryDao.findAll();
		apiresult.setData(category);    
		apiresult.setStatus(category!=null?1:0);
		apiresult.setMsg(category!=null?"成功":"未能获取数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteCategoryById(Object aid) {
		ResultUtil apiresult = new ResultUtil();
  	 try {
		    apiresult.setStatus( categoryDao.deleteById(aid));
		    apiresult.setMsg( apiresult.getStatus()==1?"删除成功！":"删除失败！");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("删除Category出错！");
		}		return apiresult;
	}
public ResultUtil selectCategory(Category category,Integer pageNow, Integer pageSize,String orderByCase,String screate_time,String ecreate_time,String supdate_time,String eupdate_time) {
		ResultUtil apiresult = new ResultUtil();
 Map<String,Object> map=category.toMap();
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
try {
			List<Category> list = categoryDao.dynamicSelect(map);
			long count = categoryDao.getCategoryCount(map);
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
			apiresult.setMsg("dynamic查询Category出错！");
		}
		return apiresult;       }
}

