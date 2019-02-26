import java.util.concurrent.ThreadLocalRandom;
public class CalculAlea extends Thread {
    // tableau à traiter
    private double[] t;
    // attribut qui indique sur quelle partie du tableau on travaille
    private int debut, fin;

    // constructeur
    public CalculAlea(double[] t, int debut, int fin) {
        this.t = t;
        this.debut = debut;
        this.fin = fin;
    }

    // méthode run
    public void run() {
        ThreadLocalRandom lr = ThreadLocalRandom.current();
        for (int i = debut; i < fin; i++) {
            t[i] = Math.sqrt(Math.pow(lr.nextDouble(), 2.0) + Math.pow(lr.nextDouble(), 1.0));
        }
    }
}