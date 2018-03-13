package lab4;

import java.io.Serializable;

final class Book extends Document implements Serializable {
	private String publisher;

	public Book(String title, String path, Integer year, String ... authors) {
		setTitle(title);
		setlocalPath(path);
		setYear(year);
		setAuthors(authors);
	}

//	public Book(String title, String path, int year, String author) {
//		setTitle(title);
//		setlocalPath(path);
//		setYear(year);
//		setAuthors(author);
//	}

	/**
	 * @return the publisher
	 */
	private String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher the publisher to set
	 */
	private void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public String toString() {
		return this.getTitle() + " " + this.getlocalPath() + " ";
	}
	
}
