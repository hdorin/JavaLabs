package lab4;

import java.io.Serializable;

public class Manual extends Document implements Serializable {
	private static final long serialVersionUID = 1L;
	public Manual(String title, String path) {
        this.title = title;
        this.localPath = path;
        this.authors = null;
        this.year = 0;
    }
	
	@Override
    public String toString() {
        return this.getTitle() + " " + this.getlocalPath() + " ";
    }

}
