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
    * AdminImplement
    * 由chenp 的CSMMAACToolv4.2生成
    *Services 实现类。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 

@Service
public class AdminImplement implements AdminService {

	@Resource
	private AdminDao adminDao;

	//CSMMAACToolv4.2自动生成
	public ResultUtil addAdmin(String user_id,String username,String password,String salt,String access_token,Integer token_expires_in,Boolean status) {
		ResultUtil apiresult = new ResultUtil();
     Admin admin = new Admin();	       admin.setUser_id(user_id);
	       admin.setUsername(username);
	       admin.setPassword(password);
	       admin.setSalt(salt);
	       admin.setAccess_token(access_token);
	       admin.setToken_expires_in(token_expires_in);
	       admin.setStatus(status);
		  try {
        int res =adminDao.save(admin);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?admin:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("saveAdmin出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil updateAdmin(Object aid,String user_id,String username,String password,String salt,String access_token,Integer token_expires_in,Boolean status) {
		ResultUtil apiresult = new ResultUtil();
     Admin admin = new Admin();	       admin.setAid(aid);
	       admin.setUser_id(user_id);
	       admin.setUsername(username);
	       admin.setPassword(password);
	       admin.setSalt(salt);
	       admin.setAccess_token(access_token);
	       admin.setToken_expires_in(token_expires_in);
	       admin.setStatus(status);
		  try {
        int res =adminDao.dynamicUpdate(admin);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?admin:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("dynamicUpdateAdmin出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil getAdminById(Object aid) {
		ResultUtil apiresult = new ResultUtil();
		Admin admin=adminDao.findById(aid);
		apiresult.setData(admin);    
		apiresult.setStatus(admin!=null?1:0);
		apiresult.setMsg(admin!=null?"成功":"未能获取id为"+aid+"的数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll() {
		ResultUtil apiresult = new ResultUtil();
		List<Admin> admin=adminDao.findAll();
		apiresult.setData(admin);    
		apiresult.setStatus(admin!=null?1:0);
		apiresult.setMsg(admin!=null?"成功":"未能获取数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteAdminById(Object aid) {
		ResultUtil apiresult = new ResultUtil();
  	 try {
		    apiresult.setStatus( adminDao.deleteById(aid));
		    apiresult.setMsg( apiresult.getStatus()==1?"删除成功！":"删除失败！");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("删除Admin出错！");
		}		return apiresult;
	}
public ResultUtil selectAdmin(Admin admin,Integer pageNow, Integer pageSize,String orderByCase,String screate_time,String ecreate_time,String slast_login_time,String elast_login_time) {
		ResultUtil apiresult = new ResultUtil();
 Map<String,Object> map=admin.toMap();
	       if(null!=pageNow&&null!=pageSize){
	       map.put("startPos", (pageNow-1)*pageSize);
	       map.put("pageSize", pageSize);
	       }
           if(null!=orderByCase)
	       map.put("orderByCase", orderByCase);
	       map.put("screate_time",screate_time);
	       map.put("ecreate_time",ecreate_time);
	       map.put("slast_login_time",slast_login_time);
	       map.put("elast_login_time",elast_login_time);
try {
			List<Admin> list = adminDao.dynamicSelect(map);
			long count = adminDao.getAdminCount(map);
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
			apiresult.setMsg("dynamic查询Admin出错！");
		}
		return apiresult;       }
}

