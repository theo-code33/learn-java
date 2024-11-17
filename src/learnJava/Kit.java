package learnJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Kit {
    private List<Bloc> blocs;
    private Set<String> keywords;

    public Kit() throws IllegalBlocException {
        this.initialize();
    }

    private void initialize() throws IllegalBlocException {
        this.blocs = new ArrayList<Bloc>();
        this.blocs.add(new Mur(3, 2, 2, true));
        this.blocs.add(new Mur(3, 2, 2, true));
        this.blocs.add(new Mur(2, 1, 2, false));
        this.blocs.add(new Mur(2, 1, 2, false));
        this.blocs.add(new Porte(1, 2, 2, true));
        this.keywords = new HashSet<String>();
        this.keywords.add("Cabane");
        this.keywords.add("Muraille");
    }

    public void  printKit() {
        System.out.println("Nombre de bloc dans le kit : " + this.blocs.size());
        System.out.print("Liste des mots clés du kit : ");
        for (String keyword : this.keywords) {
            System.out.print(keyword + " ");
        }
    }
}
