package in.strikes.filterDemo.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;

//@Component
public class RequestFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        // we can get http method, end point , header, request parameters , request body but we cannot set them
        // we can set them by the help of http servlet request Wrapper -> that is not a good practice
//       String token = httpServletRequest.getHeader("token");

        // if we want to log the input request that came from postman for that we have to do like this( we doest not have method like get body) -> get input stream method
        // by the help of .getInputStream() we get the stream data of our body


        // flow -> tomcat server interact with dispatcher servlet( this is the only servlet in spring framework)
//        client request -> tomcat Server -> dispatcher servlet  -> tomcat server -> response to client
        // tomcat work is to build the httpServletRequest and response and it save the body in the form of input stream
        // tomcat thinks every input body is the stream of bytes
//        in java if we have to read the bytes we have only two methods -> httpServletRequest.getInputStream() and httpServletRequest.getReader()
        // we can consume the input Stream only once (means we can read the value from it only once ) after that no other can read that value
        // for that other person the value become null
        // tomcat server convert the data into the input stream that is received by the jackson library in dispatcher servlet to convert the json into object
//        httpServletRequest.getInputStream();


        BufferedReader reader = httpServletRequest.getReader();

        StringBuilder body = new StringBuilder();
        String line = reader.readLine();
        while (line != null) {
            body.append(line);
            line = reader.readLine();

        }
        System.out.println(body);

        chain.doFilter(request, response);

    }

}