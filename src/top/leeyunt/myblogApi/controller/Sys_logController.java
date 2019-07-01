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
    * Sys_logController
    * 由chenp 的CSMMAACToolv4.2生成
    *控制器Controller
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
@Controller
@RequestMapping("/Sys_log")
public class Sys_logController{
	@Resource
	private Sys_logService sys_logService;  //根据id删除记录
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation(value="删除记录",notes="根据id删除记录。")
	public ResultUtil loadBySys_logId(@PathVariable("id") int id){
		ResultUtil result=sys_logService.deleteSys_logById(id);
		return result;
	}
  //根据id加载信息
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取记录",notes="根据id得到数据。")
	public ResultUtil deleteById(@PathVariable("id") int id){
		ResultUtil result=sys_logService.getSys_logById(id);
		return result;
	}
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取所有记录",notes="得到全部数据。")
	public ResultUtil loadAll(){
		ResultUtil result=sys_logService.getAll();
		return result;
	}
    //添加数据信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/addSys_log", method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="添加数据",notes="添加信息")
	public ResultUtil addSys_log(
	@ApiParam(value = "日志内容",required=false) @RequestParam(required=false) String log_content,
	@ApiParam(value = "客户端IP地址",required=false) @RequestParam(required=false) String login_ip){
   ResultUtil result =new ResultUtil();
 result=sys_logService.addSys_log(
log_content,login_ip);
		return result;
	}
    //更新信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/updateSys_log", method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="更新数据",notes="通过id更新数据")
	public ResultUtil updateSys_logById(
	@ApiParam(value = "id",required=false) @RequestParam(required=false) Object id,
	@ApiParam(value = "日志内容",required=false) @RequestParam(required=false) String log_content,
	@ApiParam(value = "客户端IP地址",required=false) @RequestParam(required=false) String login_ip){
   ResultUtil result =new ResultUtil();
 if (null == id) {
		result.setMsg("Sys_log_Id字段不能为空");
		return result;
	} result=sys_logService.updateSys_log(id,log_content,login_ip);
		return result;
	}
// 动态查询
	// 由CSMMAACToolv4.2自动生成！
	@RequestMapping(value = "/selectSys_log", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "查询数据", notes = "通过各项参数查询数据")
	public ResultUtil selectSys_log(	@ApiParam(value = "id",required=false) @RequestParam(required=false) Object id,
	@ApiParam(value = "日志内容",required=false) @RequestParam(required=false) String log_content,
	@ApiParam(value = "客户端IP地址",required=false) @RequestParam(required=false) String login_ip,
	@ApiParam(value = "开始时间",required=false) @RequestParam(required=false) String startlog_time,
	@ApiParam(value = "结束时间",required=false) @RequestParam(required=false) String endlog_time,
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
     Sys_log sys_log = new Sys_log();	       sys_log.setId(id);
	       sys_log.setLog_content(log_content);
	       sys_log.setLogin_ip(login_ip);
		ResultUtil apiresult = new ResultUtil();
		apiresult = sys_logService.selectSys_log(sys_log,pageNow, pageSize,orderByCase,startlog_time,endlog_time);
		return apiresult;
	}
 }
