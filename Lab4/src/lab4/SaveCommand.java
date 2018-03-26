package lab4;

final class SaveCommand implements KeyboardCommands {
	Catalog catalog;
	public SaveCommand(Catalog catalog){
		this.catalog=catalog;
	}
	@Override
	public void use(String command) {
		// TODO Auto-generated method stub
		try {
			catalog.save(command);
		} catch (InvalidInputException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void open(Document doc) {

	}
}
