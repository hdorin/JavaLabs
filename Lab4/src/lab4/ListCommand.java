package lab4;

public final class ListCommand implements KeyboardCommands {
	Catalog catalog;
	public ListCommand(Catalog catalog) {
		this.catalog=catalog;
	}
	@Override
	public void use(String command) {
		// TODO Auto-generated method stub
		catalog.list();
	}

}
