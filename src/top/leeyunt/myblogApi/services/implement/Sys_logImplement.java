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
    * Sys_logImplement
    * 由chenp 的CSMMAACToolv4.2生成
    *Services 实现类。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 

@Service
public class Sys_logImplement implements Sys_logService {

	@Resource
	private Sys_logDao sys_logDao;

	//CSMMAACToolv4.2自动生成
	public ResultUtil addSys_log(String log_content,String login_ip) {
		ResultUtil apiresult = new ResultUtil();
     Sys_log sys_log = new Sys_log();	       sys_log.setLog_content(log_content);
	       sys_log.setLogin_ip(login_ip);
		  try {
        int res =sys_logDao.save(sys_log);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?sys_log:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("saveSys_log出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil updateSys_log(Object id,String log_content,String login_ip) {
		ResultUtil apiresult = new ResultUtil();
     Sys_log sys_log = new Sys_log();	       sys_log.setId(id);
	       sys_log.setLog_content(log_content);
	       sys_log.setLogin_ip(login_ip);
		  try {
        int res =sys_logDao.dynamicUpdate(sys_log);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?sys_log:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("dynamicUpdateSys_log出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil getSys_logById(Object id) {
		ResultUtil apiresult = new ResultUtil();
		Sys_log sys_log=sys_logDao.findById(id);
		apiresult.setData(sys_log);    
		apiresult.setStatus(sys_log!=null?1:0);
		apiresult.setMsg(sys_log!=null?"成功":"未能获取id为"+id+"的数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll() {
		ResultUtil apiresult = new ResultUtil();
		List<Sys_log> sys_log=sys_logDao.findAll();
		apiresult.setData(sys_log);    
		apiresult.setStatus(sys_log!=null?1:0);
		apiresult.setMsg(sys_log!=null?"成功":"未能获取数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteSys_logById(Object id) {
		ResultUtil apiresult = new ResultUtil();
  	 try {
		    apiresult.setStatus( sys_logDao.deleteById(id));
		    apiresult.setMsg( apiresult.getStatus()==1?"删除成功！":"删除失败！");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("删除Sys_log出错！");
		}		return apiresult;
	}
public ResultUtil selectSys_log(Sys_log sys_log,Integer pageNow, Integer pageSize,String orderByCase,String slog_time,String elog_time) {
		ResultUtil apiresult = new ResultUtil();
 Map<String,Object> map=sys_log.toMap();
	       if(null!=pageNow&&null!=pageSize){
	       map.put("startPos", (pageNow-1)*pageSize);
	       map.put("pageSize", pageSize);
	       }
           if(null!=orderByCase)
	       map.put("orderByCase", orderByCase);
	       map.put("slog_time",slog_time);
	       map.put("elog_time",elog_time);
try {
			List<Sys_log> list = sys_logDao.dynamicSelect(map);
			long count = sys_logDao.getSys_logCount(map);
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
			apiresult.setMsg("dynamic查询Sys_log出错！");
		}
		return apiresult;       }
}

