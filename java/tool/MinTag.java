package tool;

import java.io.*;
import java.util.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class MinTag extends SimpleTagSupport {
	private String var;
	private Integer num1;
	private Integer num2;

	@Override
	public void doTag() throws JspException, IOException {
		int result = Math.min(num1, num2);
		JspContext context = getJspContext();
		context.setAttribute(var, result);
	}

	public void setVar(String var) {
		this.var = var;
	}

	public void setNum1(Integer num1) {
		this.num1 = num1;
	}

	public void setNum2(Integer num2) {
		this.num2 = num2;
	}
}
