import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char operador;
        double resultado = 0;
        boolean OperadorValido = true;

        System.out.print("Coloque o primeiro número:");
        num1 = sc.nextDouble();

        System.out.println("Coloque o OPERADOR (+ , - , * , / , ^).");
        operador = sc.next().charAt(0);

        System.out.print("Coloque o segundo número:");
        num2 = sc.nextDouble();

        switch (operador) {
            case '+' -> resultado = num1 + num2;
            case '-' -> resultado = num1 - num2;
            case '*' -> resultado = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Não pode se dividir por zero.");
                    OperadorValido = false;
                } else {
                    resultado = num1 / num2;
                }
                }
                case '^' -> resultado = Math.pow(num1, num2);

            default ->  {
                System.out.println("Não é um operador valido!");
                OperadorValido = false;
            }
            }
            if(OperadorValido){
                System.out.printf("O Resultado é igual a %.2f", resultado);
            }

            sc.close();
        }
    }
