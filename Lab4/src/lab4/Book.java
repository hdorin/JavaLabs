package lab4;

import java.io.Serializable;

final class Book extends Document implements Serializable {
	private static final long serialVersionUID = 1L;
	private String publisher;

	public Book(String title, String path, Integer year, String ... authors) throws InvalidInputException {
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
	 * @throws InvalidInputException 
	 */
	private void setPublisher(String publisher) throws InvalidInputException {
		if(publisher.length()==0) {
			throw new InvalidInputException("No publisher specified!");
		}
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return this.getTitle() + " " + this.getlocalPath() + " ";
	}
	
}
