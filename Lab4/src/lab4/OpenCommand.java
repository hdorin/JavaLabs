package lab4;

final class OpenCommand implements KeyboardCommands {
	Catalog catalog;
	public OpenCommand(Catalog catalog) {
		this.catalog=catalog;
	}
	@Override
	public void open (Document doc) {
		// TODO Auto-generated method stub
		try {
			this.catalog.open(doc);
		} catch (InvalidInputException e) {
			e.printStackTrace();
		}
	}

    @Override
    public void use(String command) {

    }
}
