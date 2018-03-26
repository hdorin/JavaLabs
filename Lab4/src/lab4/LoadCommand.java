package lab4;

final class LoadCommand implements KeyboardCommands {
	Catalog catalog;
	public LoadCommand(Catalog catalog) {
		this.catalog=catalog;
	}
	@Override
	public void use(String command) {
		// TODO Auto-generated method stub
		try {
			catalog.load(command);
		} catch (InvalidInputException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void open(Document doc) {

	}
}
