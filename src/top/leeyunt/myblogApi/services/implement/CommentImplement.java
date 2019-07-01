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
    * CommentImplement
    * 由chenp 的CSMMAACToolv4.2生成
    *Services 实现类。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 

@Service
public class CommentImplement implements CommentService {

	@Resource
	private CommentDao commentDao;

	//CSMMAACToolv4.2自动生成
	public ResultUtil addComment(String comment_id,String article_id,Integer parent_id,Integer reply_id,String coname,String email,String content,String source_content,Byte status,Boolean is_author) {
		ResultUtil apiresult = new ResultUtil();
     Comment comment = new Comment();	       comment.setComment_id(comment_id);
	       comment.setArticle_id(article_id);
	       comment.setParent_id(parent_id);
	       comment.setReply_id(reply_id);
	       comment.setConame(coname);
	       comment.setEmail(email);
	       comment.setContent(content);
	       comment.setSource_content(source_content);
	       comment.setStatus(status);
	       comment.setIs_author(is_author);
		  try {
        int res =commentDao.save(comment);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?comment:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("saveComment出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil updateComment(Object aid,String comment_id,String article_id,Integer parent_id,Integer reply_id,String coname,String email,String content,String source_content,Byte status,Boolean is_author) {
		ResultUtil apiresult = new ResultUtil();
     Comment comment = new Comment();	       comment.setAid(aid);
	       comment.setComment_id(comment_id);
	       comment.setArticle_id(article_id);
	       comment.setParent_id(parent_id);
	       comment.setReply_id(reply_id);
	       comment.setConame(coname);
	       comment.setEmail(email);
	       comment.setContent(content);
	       comment.setSource_content(source_content);
	       comment.setStatus(status);
	       comment.setIs_author(is_author);
		  try {
        int res =commentDao.dynamicUpdate(comment);
		   apiresult.setStatus(res);
        apiresult.setMsg(res==1?"成功":"失败");
         apiresult.setData(res==1?comment:"");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("dynamicUpdateComment出错！");
		}  		return apiresult;
	}

	//CSMMAACToolv4.2自动生成
	public ResultUtil getCommentById(Object aid) {
		ResultUtil apiresult = new ResultUtil();
		Comment comment=commentDao.findById(aid);
		apiresult.setData(comment);    
		apiresult.setStatus(comment!=null?1:0);
		apiresult.setMsg(comment!=null?"成功":"未能获取id为"+aid+"的数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil getAll() {
		ResultUtil apiresult = new ResultUtil();
		List<Comment> comment=commentDao.findAll();
		apiresult.setData(comment);    
		apiresult.setStatus(comment!=null?1:0);
		apiresult.setMsg(comment!=null?"成功":"未能获取数据。");
		return apiresult;
	}
	//CSMMAACToolv4.2自动生成
	public ResultUtil deleteCommentById(Object aid) {
		ResultUtil apiresult = new ResultUtil();
  	 try {
		    apiresult.setStatus( commentDao.deleteById(aid));
		    apiresult.setMsg( apiresult.getStatus()==1?"删除成功！":"删除失败！");
		  }catch (Exception e) {
       e.printStackTrace();
			apiresult.setMsg("删除Comment出错！");
		}		return apiresult;
	}
public ResultUtil selectComment(Comment comment,Integer pageNow, Integer pageSize,String orderByCase,String screate_time,String ecreate_time,String sdelete_time,String edelete_time) {
		ResultUtil apiresult = new ResultUtil();
 Map<String,Object> map=comment.toMap();
	       if(null!=pageNow&&null!=pageSize){
	       map.put("startPos", (pageNow-1)*pageSize);
	       map.put("pageSize", pageSize);
	       }
           if(null!=orderByCase)
	       map.put("orderByCase", orderByCase);
	       map.put("screate_time",screate_time);
	       map.put("ecreate_time",ecreate_time);
	       map.put("sdelete_time",sdelete_time);
	       map.put("edelete_time",edelete_time);
try {
			List<Comment> list = commentDao.dynamicSelect(map);
			long count = commentDao.getCommentCount(map);
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
			apiresult.setMsg("dynamic查询Comment出错！");
		}
		return apiresult;       }
}

