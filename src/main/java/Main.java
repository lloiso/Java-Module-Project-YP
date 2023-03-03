import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int numberOfPayer;
    static Basket basket = new Basket();

    public static void main(String[] args) {
        System.out.println("хуй на все на это и в небо по трубе");


        System.out.println("введи > 1");

        numberOfPayer = calcPayer(scanner.nextInt());

//        System.out.println(numberOfPayer);

        requestItem();

        System.out.println("year boi");

        System.out.println(basket.toString());
        System.out.println(basket.sumBue());


    }

    public static int calcPayer(int num) {
        while (num <= 1) {
            if (num < 1) {
                System.out.println("не на кого делить");
            } else {
                System.out.println("сам плати");
            }
            num = scanner.nextInt();
        }
        return num;
    }

    public static void requestItem() {
        System.out.println("че купил?");
        String key = scanner.next();
        if (key.equals("qwe")) {
            System.out.println("ты нихера не купил? серьезно?");
            return;
        }

        float value = scanner.nextFloat();
        basket.addKey(key);
        basket.addValue(value);
        System.out.println("удачно");
        System.out.println("=============");

        while (true) {
            System.out.println("че купил?");
            key = scanner.next();
            if (!key.equals("qwe")) {
                basket.addKey(key);
                value = scanner.nextFloat();
                basket.addValue(value);
                System.out.println("удачно");
                System.out.println("=============");
            } else break;
        }
    }


}
