package InterceptorDemo.demo.config;

import InterceptorDemo.demo.interceptor.AuthenticationInterceptor;
import InterceptorDemo.demo.interceptor.AuthorizationInterceptor;
import InterceptorDemo.demo.interceptor.LoggingInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    public LoggingInterceptor loggingInterceptor;
    public AuthenticationInterceptor authenticationInterceptor;
    public AuthorizationInterceptor authorizationInterceptor;

    public WebConfig(LoggingInterceptor loggingInterceptor,
                     AuthenticationInterceptor authenticationInterceptor,
                     AuthorizationInterceptor authorizationInterceptor){
        this.loggingInterceptor = loggingInterceptor;
        this.authenticationInterceptor = authenticationInterceptor;
        this.authorizationInterceptor = authorizationInterceptor;
    }

    @Override
    public void  addInterceptors(InterceptorRegistry registry){
    registry.addInterceptor(authenticationInterceptor)
            .addPathPatterns("/api/**")
            .excludePathPatterns("/api/auth/login","api/public/**")
                    .order(1);
//         ** means / ke bad kitne bhi aajaye kuch bhi aajaye single star means only one value after /
        registry.addInterceptor(loggingInterceptor)
                .order(3);
        registry.addInterceptor(authorizationInterceptor)
                .order(2);
    }

}
