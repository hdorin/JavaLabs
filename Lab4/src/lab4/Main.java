package lab4;



public class Main {

	public static void main(String[] args) {


        System.out.println("Hello world!");

        Catalog catalog = new Catalog();
        /*catalog.add(new Book("The Art of Computer Programming", "d:/books/programming/tacp.ps", 1967, "Donald E. Knuth"));
        catalog.add (new Article("Mastering the Game of Go without Human Knowledge", "d:/articles/AlphaGo.pdf", 2017, "David Silver", "Julian Schrittwieser", "Karen Simonyan"));
        catalog.add (new Manual("Cookbook", "d:/stuff/cookbook.doc"));
        catalog.save("d:/catalog.dat");*/
        //...
        //catalog.load("d:/catalog.dat");
        //catalog.list();
        catalog.add (new Article("Cel mai fain titlu", "d:/articles/AlphaGo.pdf", 2017,"ceva"));
        catalog.open(new Manual("Cookbook", "C:/Users/haloc/Desktop/1.jpg"));
	}

}
