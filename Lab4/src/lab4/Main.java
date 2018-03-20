package lab4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws InvalidInputException {
		Scanner keyboard = new Scanner(System.in);
		String command;
		Catalog catalog = new Catalog();
		AddCommand addC = new AddCommand(catalog);
		ListCommand listC = new ListCommand(catalog);
		SaveCommand saveC = new SaveCommand(catalog);
		LoadCommand loadC = new LoadCommand(catalog);
		OpenCommand openC = new OpenCommand(catalog);
		
		while(true) {
			System.out.println("Command:");
			command=keyboard.nextLine();
			if(Pattern.matches("add .*", command)==true) {
				addC.use(command);
			}
			if(Pattern.matches("list", command)==true) {
				listC.use(command);
			}
			if(Pattern.matches("save*", command)==true) {
				saveC.use(command);
			}
			if(Pattern.matches("load*", command)==true) {
				loadC.use(command);
			}
			if(Pattern.matches("open*", command)==true) {
				openC.use(command);
			}
		}
        //System.out.println("Hello world!");

        
        //catalog.add(new Book("The Art of Computer Programming", "d:/books/programming/tacp.ps", 1967, "Donald E. Knuth"));
        //catalog.add (new Article("Mastering the Game of Go without Human Knowledge", "d:/articles/AlphaGo.pdf", 2017, "David Silver", "Julian Schrittwieser", "Karen Simonyan"));
        //catalog.add (new Manual("Cookbook", "d:/stuff/cookbook.doc"));
        //catalog.save("d:/catalog.dat");
        //...
        //catalog.load("d:/catalog.dat");
        //catalog.list();
        //catalog.add (new Article("Cel mai fain titlu", "d:/articles/AlphaGo.pdf", 2017,"ceva"));
        //catalog.open(new Manual("Cookbook", "C:/Users/haloc/Desktop/1.jpg"));
	}

}
