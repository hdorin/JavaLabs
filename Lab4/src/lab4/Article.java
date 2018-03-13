package lab4;

import java.io.Serializable;

final class Article extends Document implements Serializable {
	private String journal;

	public Article(String title, String path, int year, String ... authors) {
		super();
		setTitle(title);
		setlocalPath(path);
		setYear(year);
        setAuthors(authors);
	}

	/**
	 * @return the journal
	 */
	private String getJournal() {
		return journal;
	}

	/**
	 * @param journal the journal to set
	 */
	private void setJournal(String journal) {
		this.journal = journal;
	}


	public String toString() {
		return this.getTitle() + " " + this.getlocalPath() + " ";
	}
}
