package tool;
import java.io.*;
import java.util.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class NewLineTag extends SimpleTagSupport implements DynamicAttributes{
private Map<String, Object> attrs = new HashMap<>();
	@Override
	public void setDynamicAttribute(String uri, String localName, Object value) throws JspException {
		attrs.put(localName, value);
		
	}
	@Override
	public void doTag() throws JspException, IOException {
		JspContext context = getJspContext();
		JspWriter out = context.getOut();
		
		String color = (String)attrs.get("color");
		int size = Integer.parseInt((String)attrs.get("size"));
		
		out.print("<div style='color: " + color + "'>");
		for(int i=0; i < size; i++) {
			out.print("-");
		}
		out.print("</div>");
	}

}
