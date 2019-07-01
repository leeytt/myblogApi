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
    * CategoryController
    * 由chenp 的CSMMAACToolv4.2生成
    *控制器Controller
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
@Controller
@RequestMapping("/Category")
public class CategoryController{
	@Resource
	private CategoryService categoryService;  //根据id删除记录
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{aid}",method=RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation(value="删除记录",notes="根据id删除记录。")
	public ResultUtil loadByCategoryId(@PathVariable("aid") int aid){
		ResultUtil result=categoryService.deleteCategoryById(aid);
		return result;
	}
  //根据id加载信息
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{aid}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取记录",notes="根据id得到数据。")
	public ResultUtil deleteById(@PathVariable("aid") int aid){
		ResultUtil result=categoryService.getCategoryById(aid);
		return result;
	}
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取所有记录",notes="得到全部数据。")
	public ResultUtil loadAll(){
		ResultUtil result=categoryService.getAll();
		return result;
	}
    //添加数据信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/addCategory", method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="添加数据",notes="添加信息")
	public ResultUtil addCategory(
	@ApiParam(value = "分类id") @RequestParam("category_id") String category_id,
	@ApiParam(value = "分类名称") @RequestParam("name") String name,
	@ApiParam(value = "状态，1-正常，0-删除，默认1",required=false) @RequestParam(required=false) Boolean status,
	@ApiParam(value = "能否删除，1-可删除，0-不可删除，默认1") @RequestParam("can_del") Boolean can_del,
	@ApiParam(value = "该分类的文章数量",required=false) @RequestParam(required=false) Integer article_count){
   ResultUtil result =new ResultUtil();
	if (null == category_id) {
		result.setMsg("分类idcategory_id字段不能为空");
		return result;
	}
	if (null == name) {
		result.setMsg("分类名称name字段不能为空");
		return result;
	}
 result=categoryService.addCategory(
category_id,name,status,can_del,article_count);
		return result;
	}
    //更新信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/updateCategory", method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="更新数据",notes="通过id更新数据")
	public ResultUtil updateCategoryById(
	@ApiParam(value = "aid",required=false) @RequestParam(required=false) Object aid,
	@ApiParam(value = "分类id",required=false) @RequestParam(required=false) String category_id,
	@ApiParam(value = "分类名称",required=false) @RequestParam(required=false) String name,
	@ApiParam(value = "状态，1-正常，0-删除，默认1",required=false) @RequestParam(required=false) Boolean status,
	@ApiParam(value = "能否删除，1-可删除，0-不可删除，默认1",required=false) @RequestParam(required=false) Boolean can_del,
	@ApiParam(value = "该分类的文章数量",required=false) @RequestParam(required=false) Integer article_count){
   ResultUtil result =new ResultUtil();
 if (null == aid) {
		result.setMsg("Category_Id字段不能为空");
		return result;
	} result=categoryService.updateCategory(aid,category_id,name,status,can_del,article_count);
		return result;
	}
// 动态查询
	// 由CSMMAACToolv4.2自动生成！
	@RequestMapping(value = "/selectCategory", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "查询数据", notes = "通过各项参数查询数据")
	public ResultUtil selectCategory(	@ApiParam(value = "aid",required=false) @RequestParam(required=false) Object aid,
	@ApiParam(value = "分类id",required=false) @RequestParam(required=false) String category_id,
	@ApiParam(value = "分类名称",required=false) @RequestParam(required=false) String name,
	@ApiParam(value = "状态，1-正常，0-删除，默认1",required=false) @RequestParam(required=false) Boolean status,
	@ApiParam(value = "能否删除，1-可删除，0-不可删除，默认1",required=false) @RequestParam(required=false) Boolean can_del,
	@ApiParam(value = "该分类的文章数量",required=false) @RequestParam(required=false) Integer article_count,
	@ApiParam(value = "开始创建时间",required=false) @RequestParam(required=false) String startcreate_time,
	@ApiParam(value = "结束创建时间",required=false) @RequestParam(required=false) String endcreate_time,
	@ApiParam(value = "开始更新时间",required=false) @RequestParam(required=false) String startupdate_time,
	@ApiParam(value = "结束更新时间",required=false) @RequestParam(required=false) String endupdate_time,
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
     Category category = new Category();	       category.setAid(aid);
	       category.setCategory_id(category_id);
	       category.setName(name);
	       category.setStatus(status);
	       category.setCan_del(can_del);
	       category.setArticle_count(article_count);
		ResultUtil apiresult = new ResultUtil();
		apiresult = categoryService.selectCategory(category,pageNow, pageSize,orderByCase,startcreate_time,endcreate_time,startupdate_time,endupdate_time);
		return apiresult;
	}
 }
