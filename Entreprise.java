package ex3;

public class Entreprise {

	
	public void afficheDoc(Document doc)
	{
		doc.afficheDoc();
		
	}
	
	public static void main(String[] args) {
		
		Entreprise e = new Entreprise();
		DocPDF pdf = new DocPDF();
		DocText text = new DocText();
		DocHTML html = new DocHTML();
		
		e.afficheDoc(pdf);
		e.afficheDoc(text);
		e.afficheDoc(html);
	}
}
