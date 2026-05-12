package Exercicio05;

public class Livro {

    String titulo;
    String isbn;
    public Livro (String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public static void main(String[] args) {
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");
        System.out.println(l1 == l2); // ?
        System.out.println(l1.equals(l2)); // ?
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


 */
