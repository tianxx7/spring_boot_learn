package txx.cross.echo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 跨域请求
 * 有这个就可以跨域了
 * @author seth
 * @version 1.0
 * Created by seth on 2020/8/8
 */
// @Configuration
public class MvcConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                //设置允许跨域请求的域名
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("*")
                //跨域允许时间
                .maxAge(3600);
    }

}
