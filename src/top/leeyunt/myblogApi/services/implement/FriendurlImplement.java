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
    * FriendurlImplement
    * 由chenp 的CSMMAACToolv4.2生成
    *Services 实现类。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 

@Service
public class FriendurlImplement implements FriendurlService {

	@Resource
	private FriendurlDao friendurlDao;

	//CSMMAACToolv4.2自动生成
	public ResultUtil addFriendurl(String friendurl_id,String name,String url,String type_id,Boolean status) {
		ResultUtil apiresult = new ResultUtil();
     Friendurl friendurl = new Friendurl();	       friendurl.setFriendurl_id(friendurl_id);
	       friendurl.setName(name);
	       friendurl.setUrl(url);
	       friendurl.setType_id(type_id);
	       friendurl.setStatus(status);
		  try {
        int res =friendurlDao.save(friendurl);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?friendurl:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("saveFriendurl出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil updateFriendurl(Object aid,String friendurl_id,String name,String url,String type_id,Boolean status) {
		ResultUtil apiresult = new ResultUtil();
     Friendurl friendurl = new Friendurl();	       friendurl.setAid(aid);
	       friendurl.setFriendurl_id(friendurl_id);
	       friendurl.setName(name);
	       friendurl.setUrl(url);
	       friendurl.setType_id(type_id);
	       friendurl.setStatus(status);
		  try {
        int res =friendurlDao.dynamicUpdate(friendurl);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?friendurl:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("dynamicUpdateFriendurl出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil getFriendurlById(Object aid) {
		ResultUtil apiresult = new ResultUtil();
		Friendurl friendurl=friendurlDao.findById(aid);
		apiresult.setData(friendurl);    
		apiresult.setStatus(friendurl!=null?1:0);
		apiresult.setMsg(friendurl!=null?"成功":"未能获取id为"+aid+"的数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll() {
		ResultUtil apiresult = new ResultUtil();
		List<Friendurl> friendurl=friendurlDao.findAll();
		apiresult.setData(friendurl);    
		apiresult.setStatus(friendurl!=null?1:0);
		apiresult.setMsg(friendurl!=null?"成功":"未能获取数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteFriendurlById(Object aid) {
		ResultUtil apiresult = new ResultUtil();
  	 try {
		    apiresult.setStatus( friendurlDao.deleteById(aid));
		    apiresult.setMsg( apiresult.getStatus()==1?"删除成功！":"删除失败！");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("删除Friendurl出错！");
		}		return apiresult;
	}
public ResultUtil selectFriendurl(Friendurl friendurl,Integer pageNow, Integer pageSize,String orderByCase,String screate_time,String ecreate_time,String supdate_time,String eupdate_time,String sdelete_time,String edelete_time) {
		ResultUtil apiresult = new ResultUtil();
 Map<String,Object> map=friendurl.toMap();
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
	       map.put("sdelete_time",sdelete_time);
	       map.put("edelete_time",edelete_time);
try {
			List<Friendurl> list = friendurlDao.dynamicSelect(map);
			long count = friendurlDao.getFriendurlCount(map);
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
			apiresult.setMsg("dynamic查询Friendurl出错！");
		}
		return apiresult;       }
}

