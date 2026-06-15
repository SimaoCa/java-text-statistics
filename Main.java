public class Main {
    public static void main(String[] args) {
        String texto = String.join(" ", args); // junta todos os argumentos em um texto
        String[] palavras = args;

        int pares = 0, impares = 0, vogais = 0;

        for (String p : palavras) {
            if (p.length() % 2 == 0) pares++;
            else impares++;

            for (char c : p.toCharArray()) {
                if ("aeiouAEIOU".indexOf(c) != -1) vogais++;
            }
        }

        System.out.println("Numero de palavras: " + palavras.length);
        System.out.println("Numero de vogais: " + vogais);
        System.out.println("Palavras com letras impares: " + impares);
        System.out.println("Palavras com letras pares: " + pares);
    }
}
