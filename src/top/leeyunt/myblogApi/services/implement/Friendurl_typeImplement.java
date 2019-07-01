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
    * Friendurl_typeImplement
    * 由chenp 的CSMMAACToolv4.2生成
    *Services 实现类。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 

@Service
public class Friendurl_typeImplement implements Friendurl_typeService {

	@Resource
	private Friendurl_typeDao friendurl_typeDao;

	//CSMMAACToolv4.2自动生成
	public ResultUtil addFriendurl_type(String type_id,String name,Integer friend_count) {
		ResultUtil apiresult = new ResultUtil();
     Friendurl_type friendurl_type = new Friendurl_type();	       friendurl_type.setType_id(type_id);
	       friendurl_type.setName(name);
	       friendurl_type.setFriend_count(friend_count);
		  try {
        int res =friendurl_typeDao.save(friendurl_type);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?friendurl_type:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("saveFriendurl_type出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil updateFriendurl_type(Object aid,String type_id,String name,Integer friend_count) {
		ResultUtil apiresult = new ResultUtil();
     Friendurl_type friendurl_type = new Friendurl_type();	       friendurl_type.setAid(aid);
	       friendurl_type.setType_id(type_id);
	       friendurl_type.setName(name);
	       friendurl_type.setFriend_count(friend_count);
		  try {
        int res =friendurl_typeDao.dynamicUpdate(friendurl_type);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?friendurl_type:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("dynamicUpdateFriendurl_type出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil getFriendurl_typeById(Object aid) {
		ResultUtil apiresult = new ResultUtil();
		Friendurl_type friendurl_type=friendurl_typeDao.findById(aid);
		apiresult.setData(friendurl_type);    
		apiresult.setStatus(friendurl_type!=null?1:0);
		apiresult.setMsg(friendurl_type!=null?"成功":"未能获取id为"+aid+"的数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll() {
		ResultUtil apiresult = new ResultUtil();
		List<Friendurl_type> friendurl_type=friendurl_typeDao.findAll();
		apiresult.setData(friendurl_type);    
		apiresult.setStatus(friendurl_type!=null?1:0);
		apiresult.setMsg(friendurl_type!=null?"成功":"未能获取数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteFriendurl_typeById(Object aid) {
		ResultUtil apiresult = new ResultUtil();
  	 try {
		    apiresult.setStatus( friendurl_typeDao.deleteById(aid));
		    apiresult.setMsg( apiresult.getStatus()==1?"删除成功！":"删除失败！");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("删除Friendurl_type出错！");
		}		return apiresult;
	}
public ResultUtil selectFriendurl_type(Friendurl_type friendurl_type,Integer pageNow, Integer pageSize,String orderByCase) {
		ResultUtil apiresult = new ResultUtil();
 Map<String,Object> map=friendurl_type.toMap();
	       if(null!=pageNow&&null!=pageSize){
	       map.put("startPos", (pageNow-1)*pageSize);
	       map.put("pageSize", pageSize);
	       }
           if(null!=orderByCase)
	       map.put("orderByCase", orderByCase);
try {
			List<Friendurl_type> list = friendurl_typeDao.dynamicSelect(map);
			long count = friendurl_typeDao.getFriendurl_typeCount(map);
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
			apiresult.setMsg("dynamic查询Friendurl_type出错！");
		}
		return apiresult;       }
}

