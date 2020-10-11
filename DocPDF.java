package ex3;

public class DocPDF implements Document {

	composantPDF c = new composantPDF();
@Override
public void afficheDoc() {
	System.out.println("Ici c'est le doc pdf");
	c.afficheNom();
	c.afficheVersion();
	
}
}
