package tool;
import java.io.*;
import java.util.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class ListTag extends SimpleTagSupport {
private String bullet;
	
	public String getBullet() {
	return bullet;
}

public void setBullet(String bullet) {
	this.bullet = bullet;
}

	@Override
	public void doTag() throws JspException, IOException {
		JspFragment body = getJspBody();
		body.invoke(null);
	}

}
