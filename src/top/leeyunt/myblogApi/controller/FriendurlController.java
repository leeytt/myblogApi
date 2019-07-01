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
    * FriendurlController
    * 由chenp 的CSMMAACToolv4.2生成
    *控制器Controller
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
@Controller
@RequestMapping("/Friendurl")
public class FriendurlController{
	@Resource
	private FriendurlService friendurlService;  //根据id删除记录
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{aid}",method=RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation(value="删除记录",notes="根据id删除记录。")
	public ResultUtil loadByFriendurlId(@PathVariable("aid") int aid){
		ResultUtil result=friendurlService.deleteFriendurlById(aid);
		return result;
	}
  //根据id加载信息
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{aid}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取记录",notes="根据id得到数据。")
	public ResultUtil deleteById(@PathVariable("aid") int aid){
		ResultUtil result=friendurlService.getFriendurlById(aid);
		return result;
	}
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取所有记录",notes="得到全部数据。")
	public ResultUtil loadAll(){
		ResultUtil result=friendurlService.getAll();
		return result;
	}
    //添加数据信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/addFriendurl", method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="添加数据",notes="添加信息")
	public ResultUtil addFriendurl(
	@ApiParam(value = "友链id") @RequestParam("friendurl_id") String friendurl_id,
	@ApiParam(value = "友链名称") @RequestParam("name") String name,
	@ApiParam(value = "对应链接") @RequestParam("url") String url,
	@ApiParam(value = "所属类型id",required=false) @RequestParam(required=false) String type_id,
	@ApiParam(value = "状态，1-可用，0-删除，默认1") @RequestParam("status") Boolean status){
   ResultUtil result =new ResultUtil();
	if (null == friendurl_id) {
		result.setMsg("友链idfriendurl_id字段不能为空");
		return result;
	}
	if (null == name) {
		result.setMsg("友链名称name字段不能为空");
		return result;
	}
	if (null == url) {
		result.setMsg("对应链接url字段不能为空");
		return result;
	}
 result=friendurlService.addFriendurl(
friendurl_id,name,url,type_id,status);
		return result;
	}
    //更新信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/updateFriendurl", method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="更新数据",notes="通过id更新数据")
	public ResultUtil updateFriendurlById(
	@ApiParam(value = "aid",required=false) @RequestParam(required=false) Object aid,
	@ApiParam(value = "友链id",required=false) @RequestParam(required=false) String friendurl_id,
	@ApiParam(value = "友链名称",required=false) @RequestParam(required=false) String name,
	@ApiParam(value = "对应链接",required=false) @RequestParam(required=false) String url,
	@ApiParam(value = "所属类型id",required=false) @RequestParam(required=false) String type_id,
	@ApiParam(value = "状态，1-可用，0-删除，默认1",required=false) @RequestParam(required=false) Boolean status){
   ResultUtil result =new ResultUtil();
 if (null == aid) {
		result.setMsg("Friendurl_Id字段不能为空");
		return result;
	} result=friendurlService.updateFriendurl(aid,friendurl_id,name,url,type_id,status);
		return result;
	}
// 动态查询
	// 由CSMMAACToolv4.2自动生成！
	@RequestMapping(value = "/selectFriendurl", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "查询数据", notes = "通过各项参数查询数据")
	public ResultUtil selectFriendurl(	@ApiParam(value = "aid",required=false) @RequestParam(required=false) Object aid,
	@ApiParam(value = "友链id",required=false) @RequestParam(required=false) String friendurl_id,
	@ApiParam(value = "友链名称",required=false) @RequestParam(required=false) String name,
	@ApiParam(value = "对应链接",required=false) @RequestParam(required=false) String url,
	@ApiParam(value = "所属类型id",required=false) @RequestParam(required=false) String type_id,
	@ApiParam(value = "状态，1-可用，0-删除，默认1",required=false) @RequestParam(required=false) Boolean status,
	@ApiParam(value = "开始创建时间",required=false) @RequestParam(required=false) String startcreate_time,
	@ApiParam(value = "结束创建时间",required=false) @RequestParam(required=false) String endcreate_time,
	@ApiParam(value = "开始更新时间",required=false) @RequestParam(required=false) String startupdate_time,
	@ApiParam(value = "结束更新时间",required=false) @RequestParam(required=false) String endupdate_time,
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
     Friendurl friendurl = new Friendurl();	       friendurl.setAid(aid);
	       friendurl.setFriendurl_id(friendurl_id);
	       friendurl.setName(name);
	       friendurl.setUrl(url);
	       friendurl.setType_id(type_id);
	       friendurl.setStatus(status);
		ResultUtil apiresult = new ResultUtil();
		apiresult = friendurlService.selectFriendurl(friendurl,pageNow, pageSize,orderByCase,startcreate_time,endcreate_time,startupdate_time,endupdate_time,startdelete_time,enddelete_time);
		return apiresult;
	}
 }
