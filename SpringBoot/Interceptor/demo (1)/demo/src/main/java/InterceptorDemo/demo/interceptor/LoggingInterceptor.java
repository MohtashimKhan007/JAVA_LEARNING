package InterceptorDemo.demo.interceptor;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class LoggingInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler){
//    if(handler instanceof HandlerMethod handlerMethod) {
//        HandlerMethod method = (HandlerMethod) handler;
//        String controllerName = method.getBeanType().getName();
//        String methodName = method.getMethod().getName();
//        System.out.println("PreHandle called");
//        System.out.println("Controller name " + controllerName);
//        System.out.println("Method name " + methodName);
//    }
//        return true;


        //logging the incoming request
        System.out.println("Incoming request");
        System.out.println("Http Method ...." + request.getMethod());
        System.out.println("Request URI: " + request.getRequestURI());
        System.out.println("Request Parameters "+ request.getQueryString());
        System.out.println("Client IP " + request.getRemoteAddr());
        System.out.println("Token Header " + request.getHeader("token"));

        if(handler instanceof HandlerMethod handlerMethod){
            System.out.println("Controller: " + handlerMethod.getBeanType().getName());
            System.out.println("Controller Method: " + handlerMethod.getMethod().getName());
        }
        return true;
    }

//    @Override
//    public void postHandle(HttpServletRequest request,
//                           HttpServletResponse response,
//                           Object handler,
//                            ModelAndView modelAndView){
//        System.out.println("Post Handle Called");
//    }

    @Override
   public  void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler,
                          Exception ex) throws Exception {
        System.out.println("Response Status " + response.getStatus());
    }

}
