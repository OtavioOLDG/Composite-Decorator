package folders;

import java.util.Arrays;

import folders.model.composite.ComposedIssueComposite;
import folders.model.composite.SimpleIssueComposite;
import folders.model.decorator.Musica;
import folders.model.decorator.MusicaAgudo;
import folders.model.decorator.MusicaGrave;
import folders.model.decorator.MusicaMedio;
import folders.model.decorator.MusicaSimples;

public class Main {
	
	public static void main(String[] args) {
		
		SimpleIssueComposite si1 = new SimpleIssueComposite("Homework", "Math Exercise", "01/05/2024");
		SimpleIssueComposite si2 = new SimpleIssueComposite("Homework", "Portuguese Exercise", "02/05/2024");
		ComposedIssueComposite ci1 = new ComposedIssueComposite("Homeowork", Arrays.asList(si1,si2));
		SimpleIssueComposite si3 = new SimpleIssueComposite("Test", "Math", "05/05/2024");
		SimpleIssueComposite si4 = new SimpleIssueComposite("Test", "Portuguese", "04/05/2024");
		ComposedIssueComposite ci2 = new ComposedIssueComposite("Tests", Arrays.asList(si3,si4));
		ComposedIssueComposite ci3 = new ComposedIssueComposite("Week", Arrays.asList(ci1,ci2));
		ci3.print();
		
		
		Musica m = new MusicaSimples();
		playMusic(m);
		
		m = new MusicaGrave(m, 5);
		m = new MusicaAgudo(m, 2);
		m = new MusicaMedio(m, 3);
		playMusic(m);
	}
	
	private static void playMusic(Musica m) {
		System.out.printf("Tocando musica:\nGrave %d;\nMédio: %d;\nAgudo: %d;\n", m.low(), m.mid(), m.high());
	}
}
