package Exercicio05;
import java.util.Objects;

public class Livro {

    String titulo;
    String isbn;
    public Livro (String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Livro)) return false;
        Livro outro = (Livro) obj;
        return Objects.equals(this.isbn, outro.isbn);
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(isbn);
    }*/

    @Override
    public String toString() {
        return "Livro[titulo=" + titulo + ", isbn=" + isbn + "]";
    }

    public static void main(String[] args) {
        Livro l1 = new Livro("Dirty Code", "978-0132350882");
        Livro l2 = new Livro("Clean Code", "978-0132350884");
        System.out.println(l1 == l2);
        System.out.println(l1.equals(l2));
        //Teste passando null e uma String para o equals(). Lança exceção?
        //RESPOSTA: Não.
        System.out.println(l1.equals(null));
        System.out.println(l1.equals("texto de teste"));

        System.out.println("l1.hashCode(): "+ l1.hashCode());
        System.out.println("l2.hashCode(): "+ l2.hashCode());

    }
}

/*• Anote e explique a saída. Por que .equals() também retorna false sem
override?

SAÍDA:
"C:\Program Files\openjdk-24_windows-x64_bin\jdk-24\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.3\lib\idea_rt.jar=50573" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\carlo\ProjetosJava\Lista2oBimPOO\out\production\Lista2oBimPOO Exercicio05.Livro
false
false

RESPOSTA:
.equals() também retorna false por que a classe Livro não sobrescreveu o
método equals() herdado da classe Object.
Por padrão, o equals() da classe Object compara se os dois objetos ocu-
pam o mesmo espaço na memória. Ou seja, nesse contexto, sem a sobrescri-
ção com @Override, por tratar-se de Strings, tanto "==" quanto '.equals()"
compararão o ENDEREÇO DE MEMÓRIA.

Adendo: O que significa sobrescrever?
Sobrescrever(ou override) significa criar, na classe filha ou na própria
classe, uma nova implementação de um método que já existe em uma classe
superior(neste caso, a Object).
No aspecto deste exercício, a classe Livro herda automaticamente métodos
da classe Object:

- método equals()
- método toString()
- método hashCode()

O método equals() já existe com suas proprieadades particulares na classe
Object. Entretanto, quis mudar seu comportamento para comparar os dados
do livro. Por isso, eu SOBRESCREVI o método.

EXERCÍCIO 6:

Teste com dois livros de mesmo ISBN mas títulos diferentes. São iguais?
RESPOSTA: Sim. Mesmo mudando o titulo de l1, o sistema diz que são iguais(true)

Teste passando null e uma String para o equals(). Lança exceção?
REPOSTA: Não.

Comente: por que comparamos pelo ISBN e não pelo título?
RESPOSTA: Por que pode haver livros com títulos homônimmos. Portanto, a fim
de evitar mal-entendidos, usa-se o identificador único: o isbn.

EXERCICIO 7:
Na Main, imprima o hashCode de dois livros com o mesmo ISBN. São iguais?
RESPOSTA: Sim, são iguais.

Imprima o hashCode de dois livros com ISBNs diferentes. São diferentes?
RESPOSTA: Sim. Os hashCodes de livros com ISBNs diferentes também são diferentes.

 */
