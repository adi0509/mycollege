
package test;

import java.io.Serializable;

public class ChocoBean implements Serializable
{
        private String texture;
	public ChocoBean()
        {
		this.texture = null;
	}
        
	public void setTexture(String texture)
        {
		this.texture = texture;
	}
        
	public String getTexture()
        {
		if(this.texture.equals("chewy"))
			return "FiveStar, BarOne";
                else
			return "Munch, Kitkat";
	}
}
