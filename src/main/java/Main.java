import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int numberOfPayer;
    static Basket basket = new Basket();

    public static void main(String[] args) {
        System.out.println("на скольких делить?");

        numberOfPayer = calcPayer();

        System.out.println(numberOfPayer);

        requestItem();

        basket.printBasket();

        System.out.println("каждый заплатит " + check() + " " + padej());
    }

    public static int calcPayer() {
        int num;
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("введи число");
                scanner.next();
            } else {
                num = scanner.nextInt();
                if (num< 1){
                    System.out.println("не на кого делить");

                }else if (num == 1){
                    System.out.println("сам плати");
                }else
                break;
            }
        }
        return num;
    }

    public static void requestItem() {
        String key;
        float value;

        while (true) {
            System.out.println("если закончил с покупками то набери 'Завершить' иначе введи наименование товара и цену");
            key = scanner.next();

            if (key.equalsIgnoreCase("Завершить")) {
                break;
            }
            basket.addKey(key);

            while (true) {
                scanner.nextLine();
                if (!scanner.hasNextFloat()) {
                    System.out.println("введи значение в формате ХХ,ХХ");
                } else {
                    value = scanner.nextFloat();
                    if (value < 0) {
                        System.out.println("цена не может быть отрицательной");
                    }else break;
                }
            }
            basket.addValue(value);
            System.out.println("успешно добавленно в корзину");
            System.out.println("=============");
        }
    }

    public static float check() {
        return (float) Math.round((basket.sumBuy() / numberOfPayer) * 100) / 100;
    }

    public static String padej() {
        int floor = (int) check();

        if ((floor%100)>=10 && (floor%100)<20){
            return "рублей";
        } else if (floor % 10 > 1 && (floor % 10) < 5) {
            return "рубля";
        } else if (floor % 10 >= 5) {
            return "рублей";
        } else {
            return "рубль";
        }
    }


}
