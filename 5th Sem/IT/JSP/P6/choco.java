
package test;

import java.io.IOException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class choco extends SimpleTagSupport
{
    String texture;
    private ChocoBean chocoBean = new ChocoBean();
    
    public void setTexture(String texture)
    {
        this.texture= texture;
        chocoBean.setTexture(texture);
    }
    public void doTag() throws IOException
    {
        JspWriter out= getJspContext().getOut();
        out.println("<br>Texture : " + texture +"<br>");
	out.println("\tNames : " + chocoBean.getTexture());
    }
}
