package Exercicio03;

public class TesteStringPool {
    public static void main(String[] args) {
        String a ="Java";
        String b ="Java";
        String c= new String("Java");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));/*
• Por que a == b retorna true?
• Por que a == c retorna false?
• Explique o que é o String Pool em um comentário no código.

-Na primeira questão, o resultado é verdadeiro porque 'a' e 'b' apontam para o mesmo objeto, mesmo
endereço de memória, o qual encontra-se num canto especial da memória chamado de
StringPool.
-Já a próxima afirmativa é verdadeira porquanto 'c' aponta para um novo endereço de memória, expresso por 'new String'.
-O StringPool em java é um lugar dentro da heap que armazena endereços de memória.*/
        }
        }