package Book_Essay3;

public class appAuthor {
	public static void main (String[] args) {
		Author a1 = new Author ("Antonio Manuel","manuel11@gmail.com",'M');
		Author a2 = new Author ("José Tó","zecaas@gmail.com",'M');
		Author a3 = new Author ("Maria Coelho","coelhomar@gmail.com",'F');
		
		System.out.println(a1);
		a1.setEmail("mauel22@gmail.com");
		System.out.println(a1);
		System.out.println(a1);
		System.out.println(a1.getName());
		System.out.println(a1.getGender());
		System.out.println(a1.getEmail());
		System.out.println(a1.toString());
		
		Book b1 = new Book ("As Descobertas VC", a1,12.2, 3);
		b1.setPrice(18.30);
		b1.setQty(900);
		System.out.println(b1.toSring());
		
		
		Author[] aa3 = new Author[3];
		aa3[0] = a1;
		aa3[1] = a2;
		aa3[2] = a3;
		
		BookAuthors b3 = new BookAuthors ("java MATS", aa3, 66.50, 200);
		b3.setPrice(18.30);
		b3.setQty(900);
		System.out.println(b3.getName());
		System.out.println(b3.getPrice());
		System.out.println(b3.getQty());
		System.out.println(b3.getAuthor());
		System.out.println(b3.toSring());
		
	}
}
