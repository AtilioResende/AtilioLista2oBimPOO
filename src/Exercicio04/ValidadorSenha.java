package Exercicio04;

public class ValidadorSenha {
    public static void main(String[] args) {
        String senhaCorreta = new String("1234");
        String tentativa = "1234";
        if (tentativa.equals(senhaCorreta)) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado"); // este roda!
        }
    }
}
/*
• Execute. O que aparece? Por que o acesso é negado mesmo com a senha
correta?
• Corrija substituindo == por .equals(). Execute novamente.
• Comente no código: qual o risco de usar == com Strings em sistemas reais?

 -Aparece "Acesso negado"
 -Ao substituir por .equals(), retorna "Acesso liberado"
 -Falsos Negativos: Duas strings com o mesmo conteúdo podem não ser o "mesmo objeto" na memória.

    String s1 = new String("teste");

    String s2 = new String("teste");
    s1 == s2 retornará false, pois new forçou a criação de novos objetos em locais diferentes.

Comportamento Inconsistente: Strings literais (ex: "oi" == "oi") podem funcionar com == devido
ao String Pool, mas strings geradas dinamicamente (de bancos de dados, arquivos ou APIs) falharão.

Bugs de Manutenção: Um código que funciona hoje usando == pode quebrar no futuro se a forma de
criação da String mudar (ex: mudar de um literal para uma leitura de arquivo)
 */