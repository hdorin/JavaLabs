package lab4;

final class AddCommand implements KeyboardCommands {
	Catalog catalog;
	public AddCommand(Catalog catalog) {
		//catalog.add();
		this.catalog=catalog;
	}
	@Override
	public void use(String command) {
		// TODO Auto-generated method stub
		
	}

}
