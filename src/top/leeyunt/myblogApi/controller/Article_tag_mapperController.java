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
    * Article_tag_mapperController
    * 由chenp 的CSMMAACToolv4.2生成
    *控制器Controller
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
@Controller
@RequestMapping("/Article_tag_mapper")
public class Article_tag_mapperController{
	@Resource
	private Article_tag_mapperService article_tag_mapperService;  //根据id删除记录
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation(value="删除记录",notes="根据id删除记录。")
	public ResultUtil loadByArticle_tag_mapperId(@PathVariable("id") int id){
		ResultUtil result=article_tag_mapperService.deleteArticle_tag_mapperById(id);
		return result;
	}
  //根据id加载信息
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取记录",notes="根据id得到数据。")
	public ResultUtil deleteById(@PathVariable("id") int id){
		ResultUtil result=article_tag_mapperService.getArticle_tag_mapperById(id);
		return result;
	}
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取所有记录",notes="得到全部数据。")
	public ResultUtil loadAll(){
		ResultUtil result=article_tag_mapperService.getAll();
		return result;
	}
    //添加数据信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/addArticle_tag_mapper", method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="添加数据",notes="添加信息")
	public ResultUtil addArticle_tag_mapper(
	@ApiParam(value = "文章id") @RequestParam("article_id") String article_id,
	@ApiParam(value = "标签id") @RequestParam("tag_id") String tag_id){
   ResultUtil result =new ResultUtil();
	if (null == article_id) {
		result.setMsg("文章idarticle_id字段不能为空");
		return result;
	}
	if (null == tag_id) {
		result.setMsg("标签idtag_id字段不能为空");
		return result;
	}
 result=article_tag_mapperService.addArticle_tag_mapper(
article_id,tag_id);
		return result;
	}
    //更新信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/updateArticle_tag_mapper", method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="更新数据",notes="通过id更新数据")
	public ResultUtil updateArticle_tag_mapperById(
	@ApiParam(value = "id",required=false) @RequestParam(required=false) Integer id,
	@ApiParam(value = "文章id",required=false) @RequestParam(required=false) String article_id,
	@ApiParam(value = "标签id",required=false) @RequestParam(required=false) String tag_id){
   ResultUtil result =new ResultUtil();
 if (null == id) {
		result.setMsg("Article_tag_mapper_Id字段不能为空");
		return result;
	} result=article_tag_mapperService.updateArticle_tag_mapper(id,article_id,tag_id);
		return result;
	}
// 动态查询
	// 由CSMMAACToolv4.2自动生成！
	@RequestMapping(value = "/selectArticle_tag_mapper", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "查询数据", notes = "通过各项参数查询数据")
	public ResultUtil selectArticle_tag_mapper(	@ApiParam(value = "id",required=false) @RequestParam(required=false) Integer id,
	@ApiParam(value = "文章id",required=false) @RequestParam(required=false) String article_id,
	@ApiParam(value = "标签id",required=false) @RequestParam(required=false) String tag_id,
	@ApiParam(value = "开始创建时间",required=false) @RequestParam(required=false) String startcreate_time,
	@ApiParam(value = "结束创建时间",required=false) @RequestParam(required=false) String endcreate_time,
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
     Article_tag_mapper article_tag_mapper = new Article_tag_mapper();	       article_tag_mapper.setId(id);
	       article_tag_mapper.setArticle_id(article_id);
	       article_tag_mapper.setTag_id(tag_id);
		ResultUtil apiresult = new ResultUtil();
		apiresult = article_tag_mapperService.selectArticle_tag_mapper(article_tag_mapper,pageNow, pageSize,orderByCase,startcreate_time,endcreate_time);
		return apiresult;
	}
 }
