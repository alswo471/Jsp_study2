package tool;
import java.io.*;
import java.util.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class ItemTag extends SimpleTagSupport {

	
	@Override
	public void doTag() throws JspException, IOException {
		JspTag parent = getParent();
		if (parent == null || !(parent instanceof ListTag)) {
			throw new JspException("List 태그 안에 사용하세요.");
		}
		
		ListTag parentTag = (ListTag)parent;
		String bullet = parentTag.getBullet();
		
		JspContext context = getJspContext();
		JspWriter out = context.getOut();
		JspFragment body = getJspBody();
		
		out.print("<div>");
		out.print(bullet);
		body.invoke(null);
		out.print("</div>");
	}

}
