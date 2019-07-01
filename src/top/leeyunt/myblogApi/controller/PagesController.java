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
    * PagesController
    * 由chenp 的CSMMAACToolv4.2生成
    *控制器Controller
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
@Controller
@RequestMapping("/Pages")
public class PagesController{
	@Resource
	private PagesService pagesService;  //根据id删除记录
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation(value="删除记录",notes="根据id删除记录。")
	public ResultUtil loadByPagesId(@PathVariable("id") int id){
		ResultUtil result=pagesService.deletePagesById(id);
		return result;
	}
  //根据id加载信息
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取记录",notes="根据id得到数据。")
	public ResultUtil deleteById(@PathVariable("id") int id){
		ResultUtil result=pagesService.getPagesById(id);
		return result;
	}
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取所有记录",notes="得到全部数据。")
	public ResultUtil loadAll(){
		ResultUtil result=pagesService.getAll();
		return result;
	}
    //添加数据信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/addPages", method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="添加数据",notes="添加信息")
	public ResultUtil addPages(
	@ApiParam(value = "页面名称") @RequestParam("paname") String paname,
	@ApiParam(value = "markdown内容",required=false) @RequestParam(required=false) String md_content,
	@ApiParam(value = "生成的html内容",required=false) @RequestParam(required=false) String html_content){
   ResultUtil result =new ResultUtil();
	if (null == paname) {
		result.setMsg("页面名称paname字段不能为空");
		return result;
	}
 result=pagesService.addPages(
paname,md_content,html_content);
		return result;
	}
    //更新信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/updatePages", method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="更新数据",notes="通过id更新数据")
	public ResultUtil updatePagesById(
	@ApiParam(value = "id",required=false) @RequestParam(required=false) Object id,
	@ApiParam(value = "页面名称",required=false) @RequestParam(required=false) String paname,
	@ApiParam(value = "markdown内容",required=false) @RequestParam(required=false) String md_content,
	@ApiParam(value = "生成的html内容",required=false) @RequestParam(required=false) String html_content){
   ResultUtil result =new ResultUtil();
 if (null == id) {
		result.setMsg("Pages_Id字段不能为空");
		return result;
	} result=pagesService.updatePages(id,paname,md_content,html_content);
		return result;
	}
// 动态查询
	// 由CSMMAACToolv4.2自动生成！
	@RequestMapping(value = "/selectPages", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "查询数据", notes = "通过各项参数查询数据")
	public ResultUtil selectPages(	@ApiParam(value = "id",required=false) @RequestParam(required=false) Object id,
	@ApiParam(value = "页面名称",required=false) @RequestParam(required=false) String paname,
	@ApiParam(value = "markdown内容",required=false) @RequestParam(required=false) String md_content,
	@ApiParam(value = "生成的html内容",required=false) @RequestParam(required=false) String html_content,
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
     Pages pages = new Pages();	       pages.setId(id);
	       pages.setPaname(paname);
	       pages.setMd_content(md_content);
	       pages.setHtml_content(html_content);
		ResultUtil apiresult = new ResultUtil();
		apiresult = pagesService.selectPages(pages,pageNow, pageSize,orderByCase);
		return apiresult;
	}
 }
