/**
 * Tableau
 */
public class Tableau {

    public static void alea2thread(double tab[],int n){
        long t = System.nanoTime();
        CalculAlea[] cTab = new CalculAlea[n];
        for (int i = 0; i < n; i++) {
            cTab[i] = new CalculAlea(tab, i * tab.length / n, (i + 1) * tab.length / n);
            cTab[i].start();
        }

        for (int j = 0; j < cTab.length; j++) {
            try {
                cTab[j].join();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        long t1 = System.nanoTime();
        System.out.println((t1-t)/10e5 + " Temps Pris pour remplir");
    }

    public static  void afficheTableau(double tab[]){
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i] + " | ième élément : " + i );       
        }
    }
}