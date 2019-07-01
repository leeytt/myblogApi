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
    * AdminController
    * 由chenp 的CSMMAACToolv4.2生成
    *控制器Controller
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
@Controller
@RequestMapping("/Admin")
public class AdminController{
	@Resource
	private AdminService adminService;  //根据id删除记录
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{aid}",method=RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation(value="删除记录",notes="根据id删除记录。")
	public ResultUtil loadByAdminId(@PathVariable("aid") int aid){
		ResultUtil result=adminService.deleteAdminById(aid);
		return result;
	}
  //根据id加载信息
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{aid}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取记录",notes="根据id得到数据。")
	public ResultUtil deleteById(@PathVariable("aid") int aid){
		ResultUtil result=adminService.getAdminById(aid);
		return result;
	}
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取所有记录",notes="得到全部数据。")
	public ResultUtil loadAll(){
		ResultUtil result=adminService.getAll();
		return result;
	}
    //添加数据信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/addAdmin", method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="添加数据",notes="添加信息")
	public ResultUtil addAdmin(
	@ApiParam(value = "用户id") @RequestParam("user_id") String user_id,
	@ApiParam(value = "账号") @RequestParam("username") String username,
	@ApiParam(value = "密码") @RequestParam("password") String password,
	@ApiParam(value = "秘钥",required=false) @RequestParam(required=false) String salt,
	@ApiParam(value = "access_token",required=false) @RequestParam(required=false) String access_token,
	@ApiParam(value = "token有效期至",required=false) @RequestParam(required=false) Integer token_expires_in,
	@ApiParam(value = "状态，1为正常，默认1") @RequestParam("status") Boolean status){
   ResultUtil result =new ResultUtil();
	if (null == user_id) {
		result.setMsg("用户iduser_id字段不能为空");
		return result;
	}
	if (null == username) {
		result.setMsg("账号username字段不能为空");
		return result;
	}
	if (null == password) {
		result.setMsg("密码password字段不能为空");
		return result;
	}
 result=adminService.addAdmin(
user_id,username,password,salt,access_token,token_expires_in,status);
		return result;
	}
    //更新信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/updateAdmin", method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="更新数据",notes="通过id更新数据")
	public ResultUtil updateAdminById(
	@ApiParam(value = "aid",required=false) @RequestParam(required=false) Object aid,
	@ApiParam(value = "用户id",required=false) @RequestParam(required=false) String user_id,
	@ApiParam(value = "账号",required=false) @RequestParam(required=false) String username,
	@ApiParam(value = "密码",required=false) @RequestParam(required=false) String password,
	@ApiParam(value = "秘钥",required=false) @RequestParam(required=false) String salt,
	@ApiParam(value = "access_token",required=false) @RequestParam(required=false) String access_token,
	@ApiParam(value = "token有效期至",required=false) @RequestParam(required=false) Integer token_expires_in,
	@ApiParam(value = "状态，1为正常，默认1",required=false) @RequestParam(required=false) Boolean status){
   ResultUtil result =new ResultUtil();
 if (null == aid) {
		result.setMsg("Admin_Id字段不能为空");
		return result;
	} result=adminService.updateAdmin(aid,user_id,username,password,salt,access_token,token_expires_in,status);
		return result;
	}
// 动态查询
	// 由CSMMAACToolv4.2自动生成！
	@RequestMapping(value = "/selectAdmin", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "查询数据", notes = "通过各项参数查询数据")
	public ResultUtil selectAdmin(	@ApiParam(value = "aid",required=false) @RequestParam(required=false) Object aid,
	@ApiParam(value = "用户id",required=false) @RequestParam(required=false) String user_id,
	@ApiParam(value = "账号",required=false) @RequestParam(required=false) String username,
	@ApiParam(value = "密码",required=false) @RequestParam(required=false) String password,
	@ApiParam(value = "秘钥",required=false) @RequestParam(required=false) String salt,
	@ApiParam(value = "access_token",required=false) @RequestParam(required=false) String access_token,
	@ApiParam(value = "token有效期至",required=false) @RequestParam(required=false) Integer token_expires_in,
	@ApiParam(value = "状态，1为正常，默认1",required=false) @RequestParam(required=false) Boolean status,
	@ApiParam(value = "开始创建时间",required=false) @RequestParam(required=false) String startcreate_time,
	@ApiParam(value = "结束创建时间",required=false) @RequestParam(required=false) String endcreate_time,
	@ApiParam(value = "开始最后登录时间",required=false) @RequestParam(required=false) String startlast_login_time,
	@ApiParam(value = "结束最后登录时间",required=false) @RequestParam(required=false) String endlast_login_time,
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
     Admin admin = new Admin();	       admin.setAid(aid);
	       admin.setUser_id(user_id);
	       admin.setUsername(username);
	       admin.setPassword(password);
	       admin.setSalt(salt);
	       admin.setAccess_token(access_token);
	       admin.setToken_expires_in(token_expires_in);
	       admin.setStatus(status);
		ResultUtil apiresult = new ResultUtil();
		apiresult = adminService.selectAdmin(admin,pageNow, pageSize,orderByCase,startcreate_time,endcreate_time,startlast_login_time,endlast_login_time);
		return apiresult;
	}
 }
