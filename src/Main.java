import Exercicio01.Produto;
public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("mesa", 50);
        System.out.println(p1.nome + ", " + p1.preco);
        /*Anote a saída no código como comentário. O que aparece? É legível?
        Aparece "mesa, 50.0". É legível.
         */
    }
}