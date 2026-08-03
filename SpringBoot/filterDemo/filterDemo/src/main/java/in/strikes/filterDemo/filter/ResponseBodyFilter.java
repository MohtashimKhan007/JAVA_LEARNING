package in.strikes.filterDemo.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingResponseWrapper;

import java.io.IOException;


//@Component
public class ResponseBodyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {


        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        // ContentCachingResponseWrapper -> if we have to apply the wrapper on the http servlet response

        ContentCachingResponseWrapper wrappedResponse = new ContentCachingResponseWrapper(httpServletResponse);
         // Here in do filter we will give the wrapped response instead of the servlet response
        chain.doFilter(httpServletRequest,wrappedResponse);




        // do filter ke bad jo bhi apply hoga vo apply hogaa wrapper pe wapas aate hue request and vo vapas aate hue mileage in the form of stream
        byte[] originalBodyBytes = wrappedResponse.getContentAsByteArray();


        // but we want this in the form of json so firstly we have to convert it into string
        String originalBody = new String(originalBodyBytes);

        // this is called -> text block  -> the new way of declaring the string
        // here on the place of %s the value of the original body will come and the other will written will be concatenated with them
        String modifiedBody = """
                {
                     "originalResponse" %s" ,
                     "appName" : "Student Management System"
                }
                """.formatted(originalBody);

        wrappedResponse.resetBuffer();
       // now we have to write this modified body inside the wrapper
        wrappedResponse.getWriter().write(modifiedBody);
        // now we have to copy this wrapped response to the original response body
        wrappedResponse.copyBodyToResponse();
    }
}
