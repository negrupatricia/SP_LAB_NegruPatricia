class Main{
public static void main(String[] args) throws Exception {
	Section cap1 = new Section("Capitolul 1");
	Paragraph p1 = new Paragraph("Paragraful 1");
	cap1.add(p1);
	Paragraph p2 = new Paragraph("Paragraful 2");
	cap1.add(p2);
	Paragraph p3 = new Paragraph("Paragraful 3");
	cap1.add(p3);
	Paragraph p4 = new Paragraph("Paragraful 4");
	cap1.add(p4);
	
	System.out.println();
	System.out.println("Printing without Alignment");
	System.out.println();
	cap1.print();
	
	p1.setAlignStrategy(new AlignCenter());
	p2.setAlignStrategy(new AlignRight());
	p3.setAlignStrategy(new AlignLeft());
	
	System.out.println();
	System.out.println("Printing with Alignment");
	System.out.println();
	cap1.print();
}
}