package Exercicio05;
import java.util.HashSet;

public class BibliotecaTeste {

    public static void main(String[] args) {
        HashSet biblioteca = new HashSet<>();
        Livro l1 = new Livro("Dirty Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");
        biblioteca.add(l1);
        biblioteca.add(l2);
        System.out.println(biblioteca.size()); // 1 ou 2?

        System.out.println("tamanho do set: " + biblioteca.size()); // Esperado: 1
        System.out.println("conteúdo do set: " + biblioteca);
    }
}
/*• Rodada A: execute com equals() e hashCode() implementados. Qual o
tamanho do Set?
RESPOSTA: O tamanho do set é 1.
• Rodada B: comente o hashCode() e execute novamente. O tamanho
mudou? Por quê?
RESPOSTA: Sim, o tamanho mudou. Mudou porque sem  a sobrescrição do
hashCode(), entra em ação a versão padrão de Object, que gera hashes
diferentes por instância. Uma vez qua a classe Livro não fornece
um hashCode() consistente com equals(), o HashSet pode colocar objetos
iguais, segundo o equals(), em gavetas diferentes, falhando em detectar
duplicatas só com o equals(). Como resultado, provavelmente size()
muda de 1 para 2 porque HashSet passa a não reconhecer l1 e l2
como iguais sem um hashCode consistente.
• Comente no código: o que o HashSet usa internamente para detectar
duplicatas?
RESPOSTA: Quando você adiciona um objeto a um HashSet, o conjunto chama
hashCode() para obter um inteiro e transforma esse inteiro num índice
de um array interno (um "balde"); se o balde estiver vazio o objeto é
guardado; se já houver elementos, o HashSet percorre-os e usa equals()
para comparar o novo objeto com cada um; se algum equals() retornar
true o objeto é considerado duplicata e não é adicionado, caso contrário
é inserido no balde; por isso equals() e hashCode() devem ser consistentes
(objetos iguais precisam ter o mesmo hashCode) para que duplicatas sejam
corretamente detectadas).
*/
