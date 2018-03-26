package lab4;

import java.util.regex.Pattern;

final class AddCommand implements KeyboardCommands {
	Catalog catalog;
	public AddCommand(Catalog catalog) {
		//catalog.add();
		this.catalog=catalog;
	}

	@Override
	public void open(Document doc) {

	}

	@Override
	public void use(String command) {
		// TODO Auto-generated method stub
		if(Pattern.matches("add book .*", command)) {
			 String[] arr = command.split("\"");
			 String[] aut = new String[50];
			 int i;
			 try {
				/*for(i=0;i<arr.length;i++) {
					System.out.println(i+"."+arr[i]);
				}*/
				for(i=5;i<arr.length;i++) {
					aut[i-5]=arr[i];
				}
				 arr[4]=arr[4].replaceAll("\\s+","");
				catalog.add(new Book(arr[1],arr[3],Integer.parseInt(arr[4]),aut));
			} catch (NumberFormatException | InvalidInputException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("You added a book!");
		} else
		if(Pattern.matches("add article .*", command)) {
			 String[] arr = command.split("\"");
			 String[] aut = new String[50];
			 int i;
			 try {
				/*for(i=0;i<arr.length;i++) {
					System.out.println(i+"."+arr[i]);
				}*/
				for(i=5;i<arr.length;i++) {
					aut[i-5]=arr[i];
				}
				 arr[4]=arr[4].replaceAll("\\s+","");
				catalog.add(new Article(arr[1],arr[3],Integer.parseInt(arr[4]),aut));
			} catch (NumberFormatException | InvalidInputException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("You added an article!");
		} else
		if(Pattern.matches("add manual .*", command)) {
			 String[] arr = command.split("\"");
			 String[] aut = new String[50];
			 int i;
			 try {
				/*for(i=0;i<arr.length;i++) {
					System.out.println(i+"."+arr[i]);
				}*/
				for(i=5;i<arr.length;i++) {
					aut[i-5]=arr[i];
				}
				 arr[4]=arr[4].replaceAll("\\s+","");
				catalog.add(new Article(arr[1],arr[3],Integer.parseInt(arr[4]),aut));
			} catch (NumberFormatException | InvalidInputException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("You added a manual!");
		}
	}

}
