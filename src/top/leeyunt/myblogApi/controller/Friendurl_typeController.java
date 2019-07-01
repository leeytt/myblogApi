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
    * Friendurl_typeController
    * 由chenp 的CSMMAACToolv4.2生成
    *控制器Controller
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
@Controller
@RequestMapping("/Friendurl_type")
public class Friendurl_typeController{
	@Resource
	private Friendurl_typeService friendurl_typeService;  //根据id删除记录
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{aid}",method=RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation(value="删除记录",notes="根据id删除记录。")
	public ResultUtil loadByFriendurl_typeId(@PathVariable("aid") int aid){
		ResultUtil result=friendurl_typeService.deleteFriendurl_typeById(aid);
		return result;
	}
  //根据id加载信息
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{aid}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取记录",notes="根据id得到数据。")
	public ResultUtil deleteById(@PathVariable("aid") int aid){
		ResultUtil result=friendurl_typeService.getFriendurl_typeById(aid);
		return result;
	}
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取所有记录",notes="得到全部数据。")
	public ResultUtil loadAll(){
		ResultUtil result=friendurl_typeService.getAll();
		return result;
	}
    //添加数据信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/addFriendurl_type", method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="添加数据",notes="添加信息")
	public ResultUtil addFriendurl_type(
	@ApiParam(value = "类型id") @RequestParam("type_id") String type_id,
	@ApiParam(value = "友链的类型名称") @RequestParam("name") String name,
	@ApiParam(value = "该类型的友链数量",required=false) @RequestParam(required=false) Integer friend_count){
   ResultUtil result =new ResultUtil();
	if (null == type_id) {
		result.setMsg("类型idtype_id字段不能为空");
		return result;
	}
	if (null == name) {
		result.setMsg("友链的类型名称name字段不能为空");
		return result;
	}
 result=friendurl_typeService.addFriendurl_type(
type_id,name,friend_count);
		return result;
	}
    //更新信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/updateFriendurl_type", method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="更新数据",notes="通过id更新数据")
	public ResultUtil updateFriendurl_typeById(
	@ApiParam(value = "aid",required=false) @RequestParam(required=false) Object aid,
	@ApiParam(value = "类型id",required=false) @RequestParam(required=false) String type_id,
	@ApiParam(value = "友链的类型名称",required=false) @RequestParam(required=false) String name,
	@ApiParam(value = "该类型的友链数量",required=false) @RequestParam(required=false) Integer friend_count){
   ResultUtil result =new ResultUtil();
 if (null == aid) {
		result.setMsg("Friendurl_type_Id字段不能为空");
		return result;
	} result=friendurl_typeService.updateFriendurl_type(aid,type_id,name,friend_count);
		return result;
	}
// 动态查询
	// 由CSMMAACToolv4.2自动生成！
	@RequestMapping(value = "/selectFriendurl_type", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "查询数据", notes = "通过各项参数查询数据")
	public ResultUtil selectFriendurl_type(	@ApiParam(value = "aid",required=false) @RequestParam(required=false) Object aid,
	@ApiParam(value = "类型id",required=false) @RequestParam(required=false) String type_id,
	@ApiParam(value = "友链的类型名称",required=false) @RequestParam(required=false) String name,
	@ApiParam(value = "该类型的友链数量",required=false) @RequestParam(required=false) Integer friend_count,
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
     Friendurl_type friendurl_type = new Friendurl_type();	       friendurl_type.setAid(aid);
	       friendurl_type.setType_id(type_id);
	       friendurl_type.setName(name);
	       friendurl_type.setFriend_count(friend_count);
		ResultUtil apiresult = new ResultUtil();
		apiresult = friendurl_typeService.selectFriendurl_type(friendurl_type,pageNow, pageSize,orderByCase);
		return apiresult;
	}
 }
