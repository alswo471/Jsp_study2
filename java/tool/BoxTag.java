package tool;
import java.io.*;
import java.util.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class BoxTag extends SimpleTagSupport{
	private String oldWord;
	private String newWord;
	
	public void setOldWord(String oldWord) {
		this.oldWord = oldWord;
	}
	public void setNewWord(String newWord) {
		this.newWord = newWord;
	}
	
	@Override
	public void doTag() throws JspException, IOException {

		JspContext context = getJspContext();
		JspWriter out = context.getOut();
		JspFragment body = getJspBody();
		StringWriter writer = new StringWriter();
		out.print("<div style = 'border: 1px solid red; padding: 20px'>");
		body.invoke(writer);
		
		String text = writer.toString();
		text = text.replace(oldWord, newWord);
		
		out.print(text);
		out.print("</div>");
		
	}
}
