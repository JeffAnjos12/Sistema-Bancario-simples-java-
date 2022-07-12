
package bancodoscria;

public class BancodosCria {


    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(23);
        p1.setDono("Jeffinho");
        
        p1.abrirConta("CP");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2);
        p2.setDono("Ellon Musk");
        p2.abrirConta("CC");
        
        p1.depositar(100);
        p2.depositar(4000);
        
        p2.sacar(100);
        
        
        p1.StatusAtual();
        p2.StatusAtual();
    }
    
}
