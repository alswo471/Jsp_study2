package filters;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class CommonResponseWrapper extends HttpServletResponseWrapper{

	private HttpServletResponse response;
	
	public CommonResponseWrapper(HttpServletResponse response) {
		super(response);
		this.response = response;
	}

	@Override
	public void addCookie(Cookie cookie) {
		String value = cookie.getValue().toUpperCase();
		cookie.setValue(value);
		super.addCookie(cookie);
	}

	
}
