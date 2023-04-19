import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите пожалуйста блюдо, которое вы хотите приготовить: ");

        Scanner scanner = new Scanner(System.in);
        String meal = scanner.nextLine();

        switch (meal) {
            case "Паста":
                System.out.println("Для приготовления пасты возьмите: " +
                         "Спагетти, Помидоры, Лук, Грибы и Сливки.");
                break;
            case "Запечённый лосось":
                System.out.println("Для приготовления запечённого лосося возьмите: " +
                         "Рыба лосось, лимон, оливковое масло, орегано.");
                break;
            case "Пельмени":
                System.out.println("Для приготовления пельменей возьмите: " +
                         "Килограм пельменей, соль, кетчуп и вода.");
                break;
            case "Пирог":
                System.out.println("Для приготовления мясного пирога возьмите: " +
                        "Фарш, лук, картошка и заранее приготовленное тесто.");
                break;
            case "Плов":
                System.out.println("Для приготовления плова возьмите: " +
                         "Рис, много мяса, много моркови, лук и много масла подсолнечного.");
                break;
            case "Суп с фрикадельками":
                System.out.println("Для приготовления супа возьмите: " +
                         "Фрикадельки, лапша тонкая, морковки и картошки.");
                break;
            case "Борщ":
                System.out.println("Для приготовления борща возьмите: " +
                         "Свекла, капуста и мясо.");
                break;
            case "Оливье":
                System.out.println("Для притовления оливье просто возьмите всё что " +
                        "найдете в холодильнике.");
                break;
            default: {
                System.out.println("К сожалению, теперь твоя любимая еда, это вода.");
            }
        }

        System.out.println("BON APPETITEE!");
    }
}