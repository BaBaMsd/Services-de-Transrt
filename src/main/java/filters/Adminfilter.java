package filters;

//filter_pour_controler_laccéa_les_services_administratif
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;



public class Adminfilter extends HttpFilter implements Filter {
       
	 public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		 HttpServletRequest httpReq = (HttpServletRequest) request;

	        HttpSession session = httpReq.getSession();
	        if (session.getAttribute("adminSession")!=null)
	        {
	          
	            chain.doFilter(request, response);

	        }
	        else
	        {

	            PrintWriter out = response.getWriter();
	            out.print("vous n'etes pas admin ici");

	        }
	    }


	    public void init(FilterConfig fConfig) throws ServletException {
	    }
	    public void destroy() {
	        // TODO Auto-generated method stub
	    }
}
