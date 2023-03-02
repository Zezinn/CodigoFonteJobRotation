import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = "Paralelepipedo";
        System.out.println("A string original é: " + str);

        System.out.print("Informe uma string para ser invertida: ");
        str = input.nextLine();

        StringBuilder strInvertida = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            strInvertida.append(str.charAt(i));
        }

        System.out.println("A string invertida é: " + strInvertida);
    }
}
