import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// dev branch for Y.Practicum
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("хуй на все на это и в небо по трубе");
        // ваш код начнется здесь
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
        System.out.println("введи > 1");
        Map<String,Integer> basket = new TreeMap<>();

        basket.put("SS", 2);
        basket.put("SA", 2);
        basket.put("Sd", 2);
        System.out.println(basket.toString());


        int numberOfPauer = scanner.nextInt();

        while (numberOfPauer <= 1) {
            if (numberOfPauer < 1) {
                System.out.println("не на кого делить");
            } else {
                System.out.println("сам плати");
            }
            numberOfPauer = scanner.nextInt();
        }
        System.out.println(numberOfPauer);


        System.out.println("че купил?");
        String key = scanner.next();
        int value = scanner.nextInt();
        basket.put(key,value);


        while (!key.equals("qwe")) {
            System.out.println("че купил?");
            key = scanner.next();
            value = scanner.nextInt();
            basket.put(key,value);
        }
        System.out.println("year boi");

        System.out.println(basket);

    }


}
