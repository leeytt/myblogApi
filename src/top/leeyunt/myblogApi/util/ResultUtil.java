package top.leeyunt.myblogApi.util;

import java.io.Serializable;
   /**
    * ResultUtil
    * 由chenp 的CSMMAACToolv4.2生成
    *返回结果公共类。
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:50 CST 2019 By chenp
    */ 

public class ResultUtil implements Serializable {
   private static final long serialVersionUID = 1L;
	private int status;//状态,成功：1，失败：0
	private String msg;//消息
	private Object data;//数据
	public int getStatus() {
		return status;
	}
 private Page page;
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	//toString方法
	public String toString() {
		return "Result [status=" + status + ", msg=" + msg + ", data=" + data + "]";
	}
}

