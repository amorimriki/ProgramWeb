package Book_Essay3;

public class BookAuthors {
	private String name;
	private Author[]  authors;
	private double price;
	private int qty;
	
	public BookAuthors (String name, Author[]  authors, double price, int qty) {
		this.name=name;
		this.authors = authors;
		this.price =price;
		this.qty = qty;
	}
	public String getName() {return name;}
	public double getPrice() {return price;}
	public void setPrice (double price) {this.price = price;}
	public int getQty() {return qty;}
	public void setQty(int qty) {this.qty = qty;}
	
	public Author[] getAuthor() {return authors;}
	public String toSring() {
		int i;
		String out ="";
		for (i=0; i < authors.length ;i++) {
			out.concat(authors[i].getName());
			out.concat(" | ");
		}
		return "'" +name+ "'by " + out;}
}



