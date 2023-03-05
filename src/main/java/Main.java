import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int numberOfPayer;
    static Basket basket = new Basket();

    public static void main(String[] args) {
        System.out.println("хуй на все на это и в небо по трубе");


        System.out.println("введи > 1");

        numberOfPayer = calcPayer();

        System.out.println(numberOfPayer);

        requestItem();

        basket.printBasket();

        System.out.println("каждый заплатит " + check() + " " + padej());

        System.out.println("yea boi");

        System.out.println(basket.toString());
        System.out.println(basket.sumBuy());


    }

    public static int calcPayer() {
        int num = 0;
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("введи число");
                scanner.next();
            } else {
                break;
            }
        }
        num = scanner.nextInt();
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
        String key;
        float value = 0.0f;
//        System.out.println("че купил?");

//        key = scanner.next();
//        if (key.equalsIgnoreCase("qwe")) {
//            System.out.println("ты нихера не купил? серьезно?");
//            return;
//        }

//        while (true) {
//            scanner.nextLine();
//
//            if (!scanner.hasNextFloat()) {
//                System.out.println("введи float");
//            } else {
//                value = scanner.nextFloat();
////                if (value < 0.0f) {
////                    System.out.println("<0");
////                    return;
////                }
//                break;
//            }
//        }

//        basket.addKey(key);
//        basket.addValue(value);
//        System.out.println("удачно");
//        System.out.println("=============");

        while (true) {
            System.out.println("че купил?");
            key = scanner.next();

            if (key.equalsIgnoreCase("qwe")) {
                break;
            }
            basket.addKey(key);

            while (true) {
                scanner.nextLine();
                if (!scanner.hasNextFloat()) {
                    System.out.println("введи float");
                } else {
                    value = scanner.nextFloat();
                    break;
                }
            }

//            if (value < 0.0f) {
//                System.out.println("<0");
//            } else {
                basket.addValue(value);
                System.out.println("удачно");
                System.out.println("=============");
//            }
//            } else break;


        }
    }

    public static float check() {
        return (float) Math.round((basket.sumBuy() / numberOfPayer) * 100) / 100;
    }

    public static String padej() {
        int floor = (int) check();

        if (floor % 10 > 1 && (floor % 10) < 5) {
            return "рубля";
        } else if (floor % 10 >= 5 && (floor % 10) < 10) {
            return "рублей";
        } else {
            return "рубль";
        }

    }


}
