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
    * Blog_configImplement
    * 由chenp 的CSMMAACToolv4.2生成
    *Services 实现类。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 

@Service
public class Blog_configImplement implements Blog_configService {

	@Resource
	private Blog_configDao blog_configDao;

	//CSMMAACToolv4.2自动生成
	public ResultUtil addBlog_config(String blog_name,String avatar,String sign,String wxpay_qrcode,String alipay_qrcode,String github,String view_password,String salt) {
		ResultUtil apiresult = new ResultUtil();
     Blog_config blog_config = new Blog_config();	       blog_config.setBlog_name(blog_name);
	       blog_config.setAvatar(avatar);
	       blog_config.setSign(sign);
	       blog_config.setWxpay_qrcode(wxpay_qrcode);
	       blog_config.setAlipay_qrcode(alipay_qrcode);
	       blog_config.setGithub(github);
	       blog_config.setView_password(view_password);
	       blog_config.setSalt(salt);
		  try {
        int res =blog_configDao.save(blog_config);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?blog_config:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("saveBlog_config出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil updateBlog_config(Object id,String blog_name,String avatar,String sign,String wxpay_qrcode,String alipay_qrcode,String github,String view_password,String salt) {
		ResultUtil apiresult = new ResultUtil();
     Blog_config blog_config = new Blog_config();	       blog_config.setId(id);
	       blog_config.setBlog_name(blog_name);
	       blog_config.setAvatar(avatar);
	       blog_config.setSign(sign);
	       blog_config.setWxpay_qrcode(wxpay_qrcode);
	       blog_config.setAlipay_qrcode(alipay_qrcode);
	       blog_config.setGithub(github);
	       blog_config.setView_password(view_password);
	       blog_config.setSalt(salt);
		  try {
        int res =blog_configDao.dynamicUpdate(blog_config);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?blog_config:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("dynamicUpdateBlog_config出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil getBlog_configById(Object id) {
		ResultUtil apiresult = new ResultUtil();
		Blog_config blog_config=blog_configDao.findById(id);
		apiresult.setData(blog_config);    
		apiresult.setStatus(blog_config!=null?1:0);
		apiresult.setMsg(blog_config!=null?"成功":"未能获取id为"+id+"的数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll() {
		ResultUtil apiresult = new ResultUtil();
		List<Blog_config> blog_config=blog_configDao.findAll();
		apiresult.setData(blog_config);    
		apiresult.setStatus(blog_config!=null?1:0);
		apiresult.setMsg(blog_config!=null?"成功":"未能获取数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteBlog_configById(Object id) {
		ResultUtil apiresult = new ResultUtil();
  	 try {
		    apiresult.setStatus( blog_configDao.deleteById(id));
		    apiresult.setMsg( apiresult.getStatus()==1?"删除成功！":"删除失败！");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("删除Blog_config出错！");
		}		return apiresult;
	}
public ResultUtil selectBlog_config(Blog_config blog_config,Integer pageNow, Integer pageSize,String orderByCase) {
		ResultUtil apiresult = new ResultUtil();
 Map<String,Object> map=blog_config.toMap();
	       if(null!=pageNow&&null!=pageSize){
	       map.put("startPos", (pageNow-1)*pageSize);
	       map.put("pageSize", pageSize);
	       }
           if(null!=orderByCase)
	       map.put("orderByCase", orderByCase);
try {
			List<Blog_config> list = blog_configDao.dynamicSelect(map);
			long count = blog_configDao.getBlog_configCount(map);
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
			apiresult.setMsg("dynamic查询Blog_config出错！");
		}
		return apiresult;       }
}

