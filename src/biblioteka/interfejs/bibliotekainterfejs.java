package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface bibliotekainterfejs {
	public void dodajKnjigu(Knjiga knjiga);
	public void obrisiKnjiigu();
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, long ISBN, String izdavac,Autor autor);
	
	
}


