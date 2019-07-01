package top.leeyunt.myblogApi.util;
import java.io.InputStream;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
   /**
    * MybatisUtil
    * 由chenp 的CSMMAACToolv4.2生成
    *    
    * Chenp-Spring-MVC-Mysql-ApiAutoCreateTool。
    * Mon Jul 01 20:43:49 CST 2019 By chenp
    */ 
public class MybatisUtil {
	public static SqlSession getSqlSession(){
	SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
	ClassLoader loader=MybatisUtil.class.getClassLoader();
	InputStream instream = loader.getResourceAsStream("SqlMapConfig.xml");
	SqlSessionFactory factory =builder.build(instream);
	return factory.openSession();
	}
}

