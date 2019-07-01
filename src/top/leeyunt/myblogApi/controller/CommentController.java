package top.leeyunt.myblogApi.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestParam;
import com.wordnik.swagger.annotations.ApiParam;
import top.leeyunt.myblogApi.services.*;
import top.leeyunt.myblogApi.util.*;
import top.leeyunt.myblogApi.entity.*;
   /**
    * CommentController
    * 由chenp 的CSMMAACToolv4.2生成
    *控制器Controller
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
@Controller
@RequestMapping("/Comment")
public class CommentController{
	@Resource
	private CommentService commentService;  //根据id删除记录
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{aid}",method=RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation(value="删除记录",notes="根据id删除记录。")
	public ResultUtil loadByCommentId(@PathVariable("aid") int aid){
		ResultUtil result=commentService.deleteCommentById(aid);
		return result;
	}
  //根据id加载信息
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{aid}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取记录",notes="根据id得到数据。")
	public ResultUtil deleteById(@PathVariable("aid") int aid){
		ResultUtil result=commentService.getCommentById(aid);
		return result;
	}
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取所有记录",notes="得到全部数据。")
	public ResultUtil loadAll(){
		ResultUtil result=commentService.getAll();
		return result;
	}
    //添加数据信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/addComment", method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="添加数据",notes="添加信息")
	public ResultUtil addComment(
	@ApiParam(value = "评论id") @RequestParam("comment_id") String comment_id,
	@ApiParam(value = "文章id") @RequestParam("article_id") String article_id,
	@ApiParam(value = "父id, 默认0") @RequestParam("parent_id") Integer parent_id,
	@ApiParam(value = "回复的评论id",required=false) @RequestParam(required=false) Integer reply_id,
	@ApiParam(value = "评论者名称") @RequestParam("coname") String coname,
	@ApiParam(value = "评论者邮箱",required=false) @RequestParam(required=false) String email,
	@ApiParam(value = "评论内容json") @RequestParam("content") String content,
	@ApiParam(value = "评论内容（原始内容）",required=false) @RequestParam(required=false) String source_content,
	@ApiParam(value = "状态，1-正常，0-删除，默认1",required=false) @RequestParam(required=false) Byte status,
	@ApiParam(value = "是否是作者，1-是，0-否，默认0",required=false) @RequestParam(required=false) Boolean is_author){
   ResultUtil result =new ResultUtil();
	if (null == comment_id) {
		result.setMsg("评论idcomment_id字段不能为空");
		return result;
	}
	if (null == article_id) {
		result.setMsg("文章idarticle_id字段不能为空");
		return result;
	}
	if (null == coname) {
		result.setMsg("评论者名称coname字段不能为空");
		return result;
	}
	if (null == content) {
		result.setMsg("评论内容jsoncontent字段不能为空");
		return result;
	}
 result=commentService.addComment(
comment_id,article_id,parent_id,reply_id,coname,email,content,source_content,status,is_author);
		return result;
	}
    //更新信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/updateComment", method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="更新数据",notes="通过id更新数据")
	public ResultUtil updateCommentById(
	@ApiParam(value = "aid",required=false) @RequestParam(required=false) Object aid,
	@ApiParam(value = "评论id",required=false) @RequestParam(required=false) String comment_id,
	@ApiParam(value = "文章id",required=false) @RequestParam(required=false) String article_id,
	@ApiParam(value = "父id, 默认0",required=false) @RequestParam(required=false) Integer parent_id,
	@ApiParam(value = "回复的评论id",required=false) @RequestParam(required=false) Integer reply_id,
	@ApiParam(value = "评论者名称",required=false) @RequestParam(required=false) String coname,
	@ApiParam(value = "评论者邮箱",required=false) @RequestParam(required=false) String email,
	@ApiParam(value = "评论内容json",required=false) @RequestParam(required=false) String content,
	@ApiParam(value = "评论内容（原始内容）",required=false) @RequestParam(required=false) String source_content,
	@ApiParam(value = "状态，1-正常，0-删除，默认1",required=false) @RequestParam(required=false) Byte status,
	@ApiParam(value = "是否是作者，1-是，0-否，默认0",required=false) @RequestParam(required=false) Boolean is_author){
   ResultUtil result =new ResultUtil();
 if (null == aid) {
		result.setMsg("Comment_Id字段不能为空");
		return result;
	} result=commentService.updateComment(aid,comment_id,article_id,parent_id,reply_id,coname,email,content,source_content,status,is_author);
		return result;
	}
// 动态查询
	// 由CSMMAACToolv4.2自动生成！
	@RequestMapping(value = "/selectComment", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "查询数据", notes = "通过各项参数查询数据")
	public ResultUtil selectComment(	@ApiParam(value = "aid",required=false) @RequestParam(required=false) Object aid,
	@ApiParam(value = "评论id",required=false) @RequestParam(required=false) String comment_id,
	@ApiParam(value = "文章id",required=false) @RequestParam(required=false) String article_id,
	@ApiParam(value = "父id, 默认0",required=false) @RequestParam(required=false) Integer parent_id,
	@ApiParam(value = "回复的评论id",required=false) @RequestParam(required=false) Integer reply_id,
	@ApiParam(value = "评论者名称",required=false) @RequestParam(required=false) String coname,
	@ApiParam(value = "评论者邮箱",required=false) @RequestParam(required=false) String email,
	@ApiParam(value = "评论内容json",required=false) @RequestParam(required=false) String content,
	@ApiParam(value = "评论内容（原始内容）",required=false) @RequestParam(required=false) String source_content,
	@ApiParam(value = "状态，1-正常，0-删除，默认1",required=false) @RequestParam(required=false) Byte status,
	@ApiParam(value = "是否是作者，1-是，0-否，默认0",required=false) @RequestParam(required=false) Boolean is_author,
	@ApiParam(value = "开始创建时间",required=false) @RequestParam(required=false) String startcreate_time,
	@ApiParam(value = "结束创建时间",required=false) @RequestParam(required=false) String endcreate_time,
	@ApiParam(value = "开始删除时间",required=false) @RequestParam(required=false) String startdelete_time,
	@ApiParam(value = "结束删除时间",required=false) @RequestParam(required=false) String enddelete_time,
	@ApiParam(value = "排序") @RequestParam(required=false) String orderByCase,
	@ApiParam(value = "排序方式") @RequestParam(required=false) Boolean desc,
	@ApiParam(value = "页码") @RequestParam(required=false) Integer pageNow,
	@ApiParam(value = "分页大小") @RequestParam(required=false) Integer pageSize
   ){
		if (null != orderByCase) {
         if(desc==null){
           desc=false;    
          }
  			orderByCase += desc ? " desc" : " asc";
		}
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
		ResultUtil apiresult = new ResultUtil();
		apiresult = commentService.selectComment(comment,pageNow, pageSize,orderByCase,startcreate_time,endcreate_time,startdelete_time,enddelete_time);
		return apiresult;
	}
 }
