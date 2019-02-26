/**
 * TestTableau
 */
public class TestTableau {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int tailleTab = Integer.parseInt(args[1]);
        double tab[] = new double[tailleTab];
        Tableau.alea2thread(tab, n);
    }
}