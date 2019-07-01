package top.leeyunt.myblogApi.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

   /**
    * SwaggerConfig
    * 由chenp 的CSMMAACToolv4.2生成
    *ApiDoc工具
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:49 CST 2019 By chenp
    */ 
@Configuration
@EnableSwagger
public class SwaggerConfig{
	private SpringSwaggerConfig springSwaggerConfig;
	@Autowired
	public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig){
		this.springSwaggerConfig = springSwaggerConfig;
	}
	@Bean
	public SwaggerSpringMvcPlugin customImplementation(){
		return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
				.apiInfo(apiInfo())
				.includePatterns(".*?");
	}
	private ApiInfo apiInfo(){
		ApiInfo apiInfo = new ApiInfo(
				"个人博客系统",
				"blogsystem",
				"leeyunt",
				"924721970@qq.com",
				"APILicenceType",
				"#");
		return apiInfo;
	}

}

