import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o texto: ");
        Scanner ler = new Scanner(System.in);
        String texto = ler.nextLine();
        String [] palavras = texto.split(" ");
        System.out.println("Numero de  palavras: "+ palavras.length);
        int pares =0, impares= 0;
        int quantidadeDeVogais = 0;
       for (String p: palavras){
           if (p.length() % 2 == 0) pares++;
            else impares++;
for (char c : p.toCharArray()) {
    if ("aeiou".indexOf(c) != -1) {
        quantidadeDeVogais++;
    }
}
       }
        System.out.println("Numero de vogais: "+ quantidadeDeVogais);
        System.out.println("Numero de palavras com a quantidade letras impares: "+ impares);
        System.out.println("Numero de palvras com a quantidade de letras pares: "+ pares);
     }
}
