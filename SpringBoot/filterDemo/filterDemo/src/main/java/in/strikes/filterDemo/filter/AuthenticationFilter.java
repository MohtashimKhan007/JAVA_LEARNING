package in.strikes.filterDemo.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
//@Component
@Order(1)
public class AuthenticationFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {


        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse =(HttpServletResponse) servletResponse;

        // me header me ek token name ki field send kre ge in postman
        String token = httpRequest.getHeader("token");
        String apiKey = httpRequest.getHeader("x-api-key");
        if(token==null || !token.equals("12345")){
         // means token nhi mil paya
            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            // adding a header in response
            httpResponse.setContentType("application/json");
            //we can also return a body along with the header
            httpResponse.getWriter().write(
                    "{\n" +
                            "    \"message\": \"Authentication is Required\"\n" +
                            "}"
            );
            return;
        }

        if(apiKey == null || !apiKey.equals("secret123")){
            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            httpResponse.setContentType("application/json");
            httpResponse.getWriter().write(
                    "{\n" +
                            "   \"message\" : \"Invalid or missing Api key\"\n" +
                            "}"

            );
            return;
        }
         filterChain.doFilter(servletRequest,servletResponse);

    }
}
