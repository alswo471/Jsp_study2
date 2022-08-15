package filters;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class CommonRequestWrapper extends HttpServletRequestWrapper{

	private HttpServletRequest request;
	
	public CommonRequestWrapper(HttpServletRequest request) {
		super(request);
		
		request.setAttribute("commonValue", "공통값 abcdefg");
		
		this.request = request;
	}

	@Override
	public String getParameter(String name) {
		
		String value = super.getParameter(name);
		value = value.toUpperCase();
		
		return value;
	}
}
