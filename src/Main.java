
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Main {

    static Scanner scanner = new Scanner(System.in);

    static List<Weapon> list = new ArrayList<>();


    public static void countingTop() {
        Weapon top1 = list.get(0);
        Weapon top2 = list.get(0);
        Weapon top3 = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (top1.getEstimation() < list.get(i).getEstimation()) {
                top3 = top2;
                top2 = top1;
                top1 = list.get(i);
            }
        }
        System.out.println("Топ1: " + top1.getName());
        System.out.println("Топ2: " + top2.getName());
        System.out.println("Топ3: " + top3.getName());
        }
    }

    public static void work(Weapon weapon) {
        // Тут второй принцып я не копировал код а создал вот такую систему
        System.out.println("Вот характеристика:");
        weapon.Characteristic();
        System.out.println("Что вы хотите сделать?");
        String s1 = scanner.nextLine();
        switch (s1) {
            case "Посмотреть отзывы":
                weapon.getFeedback();
                break;
            case "Добавить отзыв и Поставить оценку":
                System.out.println("Напишите ваш отзыв");
                String s2 = scanner.nextLine();
                weapon.addFeedback(s2);

                System.out.println("Добавьте оценку от 1 до 5");
                Scanner scannerInt = new Scanner(System.in);
                int i = scannerInt.nextInt(); /*Тут первый принцып ведь я мог просто закинуть в метод scannerInt.nextInt() и не создовать переменную*/
                weapon.addEstimation(i);
                break;
            default:
                System.out.println("У нас нет такой функции");
        }
    }

    // Тут третий принцып ведь метод должен только взаимодействовать с оружием а прочее сделает main все разделено
    public static void main(String[] args) {
        System.out.println("Добро пожаловать на рынок");
        list.add(new LasGun());
        list.add(new Bolter());
        list.add(new Flamethrower());

        while (true) {
            System.out.println("Вы хотите что-то посмотреть сами или нам показа топ три наших товаров?");
            String topOrNot = scanner.nextLine();
            if (topOrNot.equals("Покажите мне топ")) {
                countingTop();
            } else {
                String name = scanner.nextLine();
                if (name.equals("Лазган")) {
                    work(list.get(0));
                } else if (name.equals("Болтер")) {
                    work(list.get(1));
                } else if (name.equals("Огнемет")) {
                    work(list.get(2));
                } else {
                    System.out.println("У нас такого нет но вы можете посмотреть на Лазган");
                    work(list.get(0));
                }
            }
            System.out.println("Что-нибудь еще?");
            String s = scanner.nextLine();
            if (s.equals("Да")) {
                System.out.println("В таком случае");
            } else {
                System.out.println("Досвидания");
                break;
            }

        }
    }
}
