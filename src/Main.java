import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice, count = 0, powFour = 1, powFive = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        choice = input.nextInt();

        while (powFive < choice) {
            powFour *= 4;
            powFive *= 5;
            if (powFour > choice){
                continue;
            } else System.out.print(powFour + " ");
            if (powFive > choice){
                break;
            } else {
                System.out.print(powFive + " ");
            }
        }
    }
}