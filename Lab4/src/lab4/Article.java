package lab4;

final class Article extends Document{
	private String journal=new String();

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
}
