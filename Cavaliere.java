public class Cavaliere {
    private String nome;

    public Cavaliere(String nome){
        this.nome=nome;
    }
    public void lanciaDardi(Thread d){
        for(int i = 0; i<=20;i++){
            try{
                Thread.sleep(5);
                d.interrupt();
                System.out.println(nome + "sta cercando d colpire il drago ");
        } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
