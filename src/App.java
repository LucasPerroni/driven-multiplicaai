public class App {
    public static void main(String[] args) throws Exception {
        int numero = 7;

        System.out.println("Tabela de multiplicação de %s:".formatted(numero));
        for (int i = 1; i <= 10; i++) {
            System.out.println("%s x %s = %s".formatted(numero, i, numero * i));
        }
    }
}
