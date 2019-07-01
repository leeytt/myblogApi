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
    * PagesImplement
    * 由chenp 的CSMMAACToolv4.2生成
    *Services 实现类。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 

@Service
public class PagesImplement implements PagesService {

	@Resource
	private PagesDao pagesDao;

	//CSMMAACToolv4.2自动生成
	public ResultUtil addPages(String paname,String md_content,String html_content) {
		ResultUtil apiresult = new ResultUtil();
     Pages pages = new Pages();	       pages.setPaname(paname);
	       pages.setMd_content(md_content);
	       pages.setHtml_content(html_content);
		  try {
        int res =pagesDao.save(pages);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?pages:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("savePages出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil updatePages(Object id,String paname,String md_content,String html_content) {
		ResultUtil apiresult = new ResultUtil();
     Pages pages = new Pages();	       pages.setId(id);
	       pages.setPaname(paname);
	       pages.setMd_content(md_content);
	       pages.setHtml_content(html_content);
		  try {
        int res =pagesDao.dynamicUpdate(pages);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?pages:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("dynamicUpdatePages出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil getPagesById(Object id) {
		ResultUtil apiresult = new ResultUtil();
		Pages pages=pagesDao.findById(id);
		apiresult.setData(pages);    
		apiresult.setStatus(pages!=null?1:0);
		apiresult.setMsg(pages!=null?"成功":"未能获取id为"+id+"的数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll() {
		ResultUtil apiresult = new ResultUtil();
		List<Pages> pages=pagesDao.findAll();
		apiresult.setData(pages);    
		apiresult.setStatus(pages!=null?1:0);
		apiresult.setMsg(pages!=null?"成功":"未能获取数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil deletePagesById(Object id) {
		ResultUtil apiresult = new ResultUtil();
  	 try {
		    apiresult.setStatus( pagesDao.deleteById(id));
		    apiresult.setMsg( apiresult.getStatus()==1?"删除成功！":"删除失败！");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("删除Pages出错！");
		}		return apiresult;
	}
public ResultUtil selectPages(Pages pages,Integer pageNow, Integer pageSize,String orderByCase) {
		ResultUtil apiresult = new ResultUtil();
 Map<String,Object> map=pages.toMap();
	       if(null!=pageNow&&null!=pageSize){
	       map.put("startPos", (pageNow-1)*pageSize);
	       map.put("pageSize", pageSize);
	       }
           if(null!=orderByCase)
	       map.put("orderByCase", orderByCase);
try {
			List<Pages> list = pagesDao.dynamicSelect(map);
			long count = pagesDao.getPagesCount(map);
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
			apiresult.setMsg("dynamic查询Pages出错！");
		}
		return apiresult;       }
}

