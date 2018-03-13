package lab4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Serializable;

abstract class Document implements Serializable {
	protected String title;
	protected String[] authors;
	protected int year;
	protected String localPath;

	/**
	 * @return the title
	 */
	protected String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	protected void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 * @throws NotSetException 
	 */
	protected String[] getAuthors() {
		return authors;
	}
	/**
	 * @param author the author to set
	 */
	protected void setAuthors(String[] authors) {
		this.authors = authors;
	}
	/**
	 * @return the year
	 */
	protected int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	protected void setYear(int year){
		if(year<0) {
			throw new InvalidInputException("Invalid year value!");
		}
		this.year=year;
	}
	/**
	 * @return the localPath
	 */
	protected String getlocalPath() {
		return localPath;
	}
	/**
	 * @param localPath the localPath to set
	 */
	protected void setlocalPath(String localPath) {
			try{
				FileReader f = new FileReader("fisier.txt");
				f.close();
			} catch (FileNotFoundException e) {
				//throw new InvalidInputException("Invalid path!");
			} catch (Exception e) {
				//throw new InvalidInputException("Unexpected error!");
			}		
		this.localPath = localPath;
	}
}
