public class Drago implements Runnable {
    private String nome;
    int numBattiti;


    public Drago(String nome, int numBattiti) {
        this.numBattiti = numBattiti;
        this.nome = nome;
    }


    @Override
    public void run() {
        for (int i = 0; (i < numBattiti) && !Thread.interrupted(); i++) {
            System.out.println(nome + "si libera nell'aria! Gioia immensa, battito: " + (i + 1));
        }
    }
}



