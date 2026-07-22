package in.strikes.filterDemo.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.UUID;

@Component
@Order(2)
public class LoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
          Long startTime = System.currentTimeMillis();
//        System.out.println("System entered in the logging filter");
//        filterChain.doFilter(servletRequest,servletResponse);
        // when the req coming back after going from all filters then dispatcher servlet then student controller then student service then come back
//        System.out.println("Request exiting in logging filter");
        // to use the httpServletRequest we have to typecase the servletRequest to httpServletRequest
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse =(HttpServletResponse) servletResponse;
       // UUID to generate the key
        String requestId = UUID.randomUUID().toString();
        httpResponse.setHeader("X-Req_Id",requestId);

        //Request Log
        System.out.println("Incoming Request: " + httpRequest.getMethod()
                                                +" " +
                                           httpRequest.getRequestURI());

        try {
            filterChain.doFilter(servletRequest, servletResponse);
        }
        // finally hame sha implement ho ta hai
        finally {
            Long duration = System.currentTimeMillis() - startTime;

            // Response Status Log
            System.out.println("Response Status "+ httpResponse.getStatus());

            System.out.println("Api Response Time " + duration);
        }
        }

}
