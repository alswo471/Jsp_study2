package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommonFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		CommonResponseWrapper commonResponse = new CommonResponseWrapper((HttpServletResponse)response);
		CommonRequestWrapper commonRequest = new CommonRequestWrapper((HttpServletRequest)request);
		
		
		chain.doFilter(commonRequest, commonResponse);
		System.out.println("공통 필터 후처리");
		
		
	}

}
