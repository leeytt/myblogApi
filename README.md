# myblogApi
💯这是我的个人博客系统的后端接口代码🐔

### 我的个人博客api源码

#### 后台管理-接口
|接口名称|接口地址|请求方式|
| :- | -: | -: |
| 登录 | a/login | post |
| 获取七牛图片token | a/qiniu/token | get |
| 获取博客配置 | a/webConfig | get |
| 修改博客配置 | a/webConfig/modify | post |
| 获取 关于我 页面 | a/webConfig/getAbout | get |
| 修改 关于我 页面 | a/webConfig/modifyAbout | post |
| 获取友链类型列表 | a/friends/typeList | get |
| 获取友链列表 | a/friends/list | get |
| 添加友链 | a/friends/add | post |
| 编辑友链 | a/friends/modify | post |
| 删除友链 | a/friends/delete | post |
| 添加分类 | a/category/add | post |
| 添加标签 | a/tag/add | post |
| 修改分类 | a/category/modify | post |
| 修改标签 | a/tag/modify | post |
| 删除分类 | a/category/delete | post |
| 删除标签 | a/tag/delete | post |
| 获取分类列表 | a/category/list | get |
| 获取标签列表 | a/tag/list | get |
| 获取分类 | a/category | get |
| 获取标签 | a/tag | get |
| 保存文章 | a/article/save | post |
| 发布文章 | a/article/publish | post |
| 编辑文章 | a/article/modify | post |
| 删除文章 | a/article/delete | post |
| 获取文章信息 | a/article/info | get |
| 获取文章列表 | a/article/list | get |
| 获取系统日志 | a/sys/log | get |
| 获取首页面板显示的统计信息 | a/statistics/home | get |
| 获取文章评论列表 | a/comments/list | get |
| 添加评论 | a/comments/add | post |
| 删除评论 | a/comments/delete | post |
| 获取所有评论 | a/comments/alllist | get |
| 获取 我的简历 页面 | a/webConfig/getResume | get |
| 修改 我的简历 页面 | a/webConfig/modifyResume | post |
#### 博客-接口
|接口名称|接口地址|请求方式|
| :- | -: | -: |
| 获取 关于我 页面 | w/getAbout | get |
| 获取文章归档列表 | w/article/archives | get |
| 获取文章信息 | w/article | get |
| 获取文章列表 | w/article/list | get |
| 获取分类列表 | w/category/list | get |
| 获取标签列表 | w/tag/list | get |
| 获取博客信息 | w/blogInfo | get |
| 获取友链列表 | w/friends/list | get |
| 获取文章评论列表 | w/comments/list | get |
| 添加评论 | w/comments/add | post |
| 获取 我的简历 页面 | w/getResume | get |
| 按文章标题和简介搜索 | w/article/search | get |

##### sql文件：该项目sql目录下
* my_blog.sql : 表
##### 数据库配置
> 配置文件
##### 七牛上传图片配置
> 工具文件
