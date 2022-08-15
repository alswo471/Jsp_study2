package tool;

import java.io.IOException;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class LineTag extends SimpleTagSupport{
	private String color;
	private Integer size;
	
public void setColor(String color) {
		this.color = color;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
public void doTag() throws JspException, IOException {
	JspContext context = getJspContext();
	JspWriter out = context.getOut();
	out.print("<div style='color: " + color + "'>");
	
	for(int i = 0; i < size; i++) {
		out.print("-");
	}
	out.print("--------------");
	
	
	out.print("</div>");
}
}
