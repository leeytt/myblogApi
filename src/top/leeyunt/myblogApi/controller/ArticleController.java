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
    * ArticleController
    * 由chenp 的CSMMAACToolv4.2生成
    *控制器Controller
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
@Controller
@RequestMapping("/Article")
public class ArticleController{
	@Resource
	private ArticleService articleService;  //根据id删除记录
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{aid}",method=RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation(value="删除记录",notes="根据id删除记录。")
	public ResultUtil loadByArticleId(@PathVariable("aid") int aid){
		ResultUtil result=articleService.deleteArticleById(aid);
		return result;
	}
  //根据id加载信息
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{aid}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取记录",notes="根据id得到数据。")
	public ResultUtil deleteById(@PathVariable("aid") int aid){
		ResultUtil result=articleService.getArticleById(aid);
		return result;
	}
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取所有记录",notes="得到全部数据。")
	public ResultUtil loadAll(){
		ResultUtil result=articleService.getAll();
		return result;
	}
    //添加数据信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/addArticle", method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="添加数据",notes="添加信息")
	public ResultUtil addArticle(
	@ApiParam(value = "文章id") @RequestParam("article_id") String article_id,
	@ApiParam(value = "文章标题") @RequestParam("title") String title,
	@ApiParam(value = "文章分类id",required=false) @RequestParam(required=false) String category_id,
	@ApiParam(value = "封面图url",required=false) @RequestParam(required=false) String cover,
	@ApiParam(value = "文章简介",required=false) @RequestParam(required=false) String sub_message,
	@ApiParam(value = "内容",required=false) @RequestParam(required=false) String content,
	@ApiParam(value = "生成的html",required=false) @RequestParam(required=false) String html_content,
	@ApiParam(value = "是否加密，1-是，0-否，默认0",required=false) @RequestParam(required=false) Boolean is_encrypt,
	@ApiParam(value = "状态，1-正常（发布），0-删除，2-草稿（待发布）",required=false) @RequestParam(required=false) Byte status,
	@ApiParam(value = "文章阅读数",required=false) @RequestParam(required=false) Integer pageview){
   ResultUtil result =new ResultUtil();
	if (null == article_id) {
		result.setMsg("文章idarticle_id字段不能为空");
		return result;
	}
	if (null == title) {
		result.setMsg("文章标题title字段不能为空");
		return result;
	}
 result=articleService.addArticle(
article_id,title,category_id,cover,sub_message,content,html_content,is_encrypt,status,pageview);
		return result;
	}
    //更新信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/updateArticle", method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="更新数据",notes="通过id更新数据")
	public ResultUtil updateArticleById(
	@ApiParam(value = "aid",required=false) @RequestParam(required=false) Object aid,
	@ApiParam(value = "文章id",required=false) @RequestParam(required=false) String article_id,
	@ApiParam(value = "文章标题",required=false) @RequestParam(required=false) String title,
	@ApiParam(value = "文章分类id",required=false) @RequestParam(required=false) String category_id,
	@ApiParam(value = "封面图url",required=false) @RequestParam(required=false) String cover,
	@ApiParam(value = "文章简介",required=false) @RequestParam(required=false) String sub_message,
	@ApiParam(value = "内容",required=false) @RequestParam(required=false) String content,
	@ApiParam(value = "生成的html",required=false) @RequestParam(required=false) String html_content,
	@ApiParam(value = "是否加密，1-是，0-否，默认0",required=false) @RequestParam(required=false) Boolean is_encrypt,
	@ApiParam(value = "状态，1-正常（发布），0-删除，2-草稿（待发布）",required=false) @RequestParam(required=false) Byte status,
	@ApiParam(value = "文章阅读数",required=false) @RequestParam(required=false) Integer pageview){
   ResultUtil result =new ResultUtil();
 if (null == aid) {
		result.setMsg("Article_Id字段不能为空");
		return result;
	} result=articleService.updateArticle(aid,article_id,title,category_id,cover,sub_message,content,html_content,is_encrypt,status,pageview);
		return result;
	}
// 动态查询
	// 由CSMMAACToolv4.2自动生成！
	@RequestMapping(value = "/selectArticle", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "查询数据", notes = "通过各项参数查询数据")
	public ResultUtil selectArticle(	@ApiParam(value = "aid",required=false) @RequestParam(required=false) Object aid,
	@ApiParam(value = "文章id",required=false) @RequestParam(required=false) String article_id,
	@ApiParam(value = "文章标题",required=false) @RequestParam(required=false) String title,
	@ApiParam(value = "文章分类id",required=false) @RequestParam(required=false) String category_id,
	@ApiParam(value = "封面图url",required=false) @RequestParam(required=false) String cover,
	@ApiParam(value = "文章简介",required=false) @RequestParam(required=false) String sub_message,
	@ApiParam(value = "内容",required=false) @RequestParam(required=false) String content,
	@ApiParam(value = "生成的html",required=false) @RequestParam(required=false) String html_content,
	@ApiParam(value = "是否加密，1-是，0-否，默认0",required=false) @RequestParam(required=false) Boolean is_encrypt,
	@ApiParam(value = "状态，1-正常（发布），0-删除，2-草稿（待发布）",required=false) @RequestParam(required=false) Byte status,
	@ApiParam(value = "文章阅读数",required=false) @RequestParam(required=false) Integer pageview,
	@ApiParam(value = "开始创建时间",required=false) @RequestParam(required=false) String startcreate_time,
	@ApiParam(value = "结束创建时间",required=false) @RequestParam(required=false) String endcreate_time,
	@ApiParam(value = "开始更新时间",required=false) @RequestParam(required=false) String startupdate_time,
	@ApiParam(value = "结束更新时间",required=false) @RequestParam(required=false) String endupdate_time,
	@ApiParam(value = "开始提交时间",required=false) @RequestParam(required=false) String startpublish_time,
	@ApiParam(value = "结束提交时间",required=false) @RequestParam(required=false) String endpublish_time,
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
     Article article = new Article();	       article.setAid(aid);
	       article.setArticle_id(article_id);
	       article.setTitle(title);
	       article.setCategory_id(category_id);
	       article.setCover(cover);
	       article.setSub_message(sub_message);
	       article.setContent(content);
	       article.setHtml_content(html_content);
	       article.setIs_encrypt(is_encrypt);
	       article.setStatus(status);
	       article.setPageview(pageview);
		ResultUtil apiresult = new ResultUtil();
		apiresult = articleService.selectArticle(article,pageNow, pageSize,orderByCase,startcreate_time,endcreate_time,startupdate_time,endupdate_time,startpublish_time,endpublish_time,startdelete_time,enddelete_time);
		return apiresult;
	}
 }
