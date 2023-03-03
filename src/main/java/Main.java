import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ваш код начнется здесь
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
        System.out.println("vvedi > 1");

        int a = scanner.nextInt();

        while (a<=1){
            if (a<1){
                System.out.println("ne na kogo delit");
            } else {
                System.out.println("sam plati");
            }
            a = scanner.nextInt();
        }
        System.out.println(a);


        System.out.println("tovar?");
        String s = scanner.next();
        while (!s.equals("йцу")){
            System.out.println("tovar?");
            s = scanner.next();
        }
        System.out.println("year boi");



    }


}
