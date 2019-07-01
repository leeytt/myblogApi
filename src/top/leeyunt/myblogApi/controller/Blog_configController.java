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
    * Blog_configController
    * 由chenp 的CSMMAACToolv4.2生成
    *控制器Controller
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 
@Controller
@RequestMapping("/Blog_config")
public class Blog_configController{
	@Resource
	private Blog_configService blog_configService;  //根据id删除记录
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation(value="删除记录",notes="根据id删除记录。")
	public ResultUtil loadByBlog_configId(@PathVariable("id") int id){
		ResultUtil result=blog_configService.deleteBlog_configById(id);
		return result;
	}
  //根据id加载信息
  //由CSMMAACTool自动创建，请修改！
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取记录",notes="根据id得到数据。")
	public ResultUtil deleteById(@PathVariable("id") int id){
		ResultUtil result=blog_configService.getBlog_configById(id);
		return result;
	}
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取所有记录",notes="得到全部数据。")
	public ResultUtil loadAll(){
		ResultUtil result=blog_configService.getAll();
		return result;
	}
    //添加数据信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/addBlog_config", method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="添加数据",notes="添加信息")
	public ResultUtil addBlog_config(
	@ApiParam(value = "博客名称",required=false) @RequestParam(required=false) String blog_name,
	@ApiParam(value = "头像url",required=false) @RequestParam(required=false) String avatar,
	@ApiParam(value = "个性签名",required=false) @RequestParam(required=false) String sign,
	@ApiParam(value = "微信支付二维码url",required=false) @RequestParam(required=false) String wxpay_qrcode,
	@ApiParam(value = "支付宝支付二维码url",required=false) @RequestParam(required=false) String alipay_qrcode,
	@ApiParam(value = "github url",required=false) @RequestParam(required=false) String github,
	@ApiParam(value = "阅读加密密码",required=false) @RequestParam(required=false) String view_password,
	@ApiParam(value = "阅读加密秘钥",required=false) @RequestParam(required=false) String salt){
   ResultUtil result =new ResultUtil();
 result=blog_configService.addBlog_config(
blog_name,avatar,sign,wxpay_qrcode,alipay_qrcode,github,view_password,salt);
		return result;
	}
    //更新信息
    //由CSMMAACTool自动生成！
	@RequestMapping(value = "/updateBlog_config", method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="更新数据",notes="通过id更新数据")
	public ResultUtil updateBlog_configById(
	@ApiParam(value = "id",required=false) @RequestParam(required=false) Object id,
	@ApiParam(value = "博客名称",required=false) @RequestParam(required=false) String blog_name,
	@ApiParam(value = "头像url",required=false) @RequestParam(required=false) String avatar,
	@ApiParam(value = "个性签名",required=false) @RequestParam(required=false) String sign,
	@ApiParam(value = "微信支付二维码url",required=false) @RequestParam(required=false) String wxpay_qrcode,
	@ApiParam(value = "支付宝支付二维码url",required=false) @RequestParam(required=false) String alipay_qrcode,
	@ApiParam(value = "github url",required=false) @RequestParam(required=false) String github,
	@ApiParam(value = "阅读加密密码",required=false) @RequestParam(required=false) String view_password,
	@ApiParam(value = "阅读加密秘钥",required=false) @RequestParam(required=false) String salt){
   ResultUtil result =new ResultUtil();
 if (null == id) {
		result.setMsg("Blog_config_Id字段不能为空");
		return result;
	} result=blog_configService.updateBlog_config(id,blog_name,avatar,sign,wxpay_qrcode,alipay_qrcode,github,view_password,salt);
		return result;
	}
// 动态查询
	// 由CSMMAACToolv4.2自动生成！
	@RequestMapping(value = "/selectBlog_config", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "查询数据", notes = "通过各项参数查询数据")
	public ResultUtil selectBlog_config(	@ApiParam(value = "id",required=false) @RequestParam(required=false) Object id,
	@ApiParam(value = "博客名称",required=false) @RequestParam(required=false) String blog_name,
	@ApiParam(value = "头像url",required=false) @RequestParam(required=false) String avatar,
	@ApiParam(value = "个性签名",required=false) @RequestParam(required=false) String sign,
	@ApiParam(value = "微信支付二维码url",required=false) @RequestParam(required=false) String wxpay_qrcode,
	@ApiParam(value = "支付宝支付二维码url",required=false) @RequestParam(required=false) String alipay_qrcode,
	@ApiParam(value = "github url",required=false) @RequestParam(required=false) String github,
	@ApiParam(value = "阅读加密密码",required=false) @RequestParam(required=false) String view_password,
	@ApiParam(value = "阅读加密秘钥",required=false) @RequestParam(required=false) String salt,
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
     Blog_config blog_config = new Blog_config();	       blog_config.setId(id);
	       blog_config.setBlog_name(blog_name);
	       blog_config.setAvatar(avatar);
	       blog_config.setSign(sign);
	       blog_config.setWxpay_qrcode(wxpay_qrcode);
	       blog_config.setAlipay_qrcode(alipay_qrcode);
	       blog_config.setGithub(github);
	       blog_config.setView_password(view_password);
	       blog_config.setSalt(salt);
		ResultUtil apiresult = new ResultUtil();
		apiresult = blog_configService.selectBlog_config(blog_config,pageNow, pageSize,orderByCase);
		return apiresult;
	}
 }
