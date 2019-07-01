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
    * TagImplement
    * 由chenp 的CSMMAACToolv4.2生成
    *Services 实现类。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 

@Service
public class TagImplement implements TagService {

	@Resource
	private TagDao tagDao;

	//CSMMAACToolv4.2自动生成
	public ResultUtil addTag(String tag_id,String name,Boolean status,Boolean can_del,Integer article_count) {
		ResultUtil apiresult = new ResultUtil();
     Tag tag = new Tag();	       tag.setTag_id(tag_id);
	       tag.setName(name);
	       tag.setStatus(status);
	       tag.setCan_del(can_del);
	       tag.setArticle_count(article_count);
		  try {
        int res =tagDao.save(tag);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?tag:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("saveTag出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil updateTag(Object aid,String tag_id,String name,Boolean status,Boolean can_del,Integer article_count) {
		ResultUtil apiresult = new ResultUtil();
     Tag tag = new Tag();	       tag.setAid(aid);
	       tag.setTag_id(tag_id);
	       tag.setName(name);
	       tag.setStatus(status);
	       tag.setCan_del(can_del);
	       tag.setArticle_count(article_count);
		  try {
        int res =tagDao.dynamicUpdate(tag);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?tag:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("dynamicUpdateTag出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil getTagById(Object aid) {
		ResultUtil apiresult = new ResultUtil();
		Tag tag=tagDao.findById(aid);
		apiresult.setData(tag);    
		apiresult.setStatus(tag!=null?1:0);
		apiresult.setMsg(tag!=null?"成功":"未能获取id为"+aid+"的数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll() {
		ResultUtil apiresult = new ResultUtil();
		List<Tag> tag=tagDao.findAll();
		apiresult.setData(tag);    
		apiresult.setStatus(tag!=null?1:0);
		apiresult.setMsg(tag!=null?"成功":"未能获取数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteTagById(Object aid) {
		ResultUtil apiresult = new ResultUtil();
  	 try {
		    apiresult.setStatus( tagDao.deleteById(aid));
		    apiresult.setMsg( apiresult.getStatus()==1?"删除成功！":"删除失败！");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("删除Tag出错！");
		}		return apiresult;
	}
public ResultUtil selectTag(Tag tag,Integer pageNow, Integer pageSize,String orderByCase,String screate_time,String ecreate_time,String supdate_time,String eupdate_time) {
		ResultUtil apiresult = new ResultUtil();
 Map<String,Object> map=tag.toMap();
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
			List<Tag> list = tagDao.dynamicSelect(map);
			long count = tagDao.getTagCount(map);
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
			apiresult.setMsg("dynamic查询Tag出错！");
		}
		return apiresult;       }
}

