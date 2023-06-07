import java.util.Random;
import java.util.Scanner;

public class Riddle1 {
    public static void main(String[] args){
        int[] x = {0,1,2,3,4,5,6,7,8,9,10};
        Random random = new Random();
        int sum = random.nextInt(x.length);

        System.out.println("Угадай число от 0 до 10");
        Scanner scanner = new Scanner(System.in);
        int guess;

        do{
            System.out.println("Выберите число");
            guess = scanner.nextInt();
            if (guess > sum){
                System.out.println("Выберите меньшее число");
            } else if (guess < sum) {
                System.out.println("Выберите большее число");
            } else{
                System.out.println(" Поздравляю, ваше число совпало с загаданным числом " + sum + "!");
            }
        } while (guess != sum);
        }
    }

