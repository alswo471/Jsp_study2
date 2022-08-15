package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterEx2 implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//서블릿, 다른 필터 실행 전
		System.out.println("FilterEx2 : 전처리");
		
		chain.doFilter(request, response);
		
		//서블릿 응답 이후
		System.out.println("FilterEx2 : 후처리");
	}
}
