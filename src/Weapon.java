import java.util.ArrayList;
import java.util.List;

class Weapon {

    protected List<String> feedback = new ArrayList<>();
    protected/* тут шестой я создал List хоят пользуюсь ArrayList и теперь логика более независимая */ List<Integer> estimation = new ArrayList<>();

    // тут пятый принцып все наследники Weapon подходят к нему
    public void addFeedback(String s) {
        feedback.add(s);
        System.out.println("Спасибо за отзыв");
    }

    public void getFeedback() {
        System.out.println("Отзывы: " + feedback);
    }


    public void Characteristic() {
        System.out.println("Тут нужна характеристика товара");
    }

    public void addEstimation(Integer integer) {
        if (integer >= 1 || integer <= 5) {
            estimation.add(integer);
            System.out.println("Спасибо за оценку");
        } else {
            System.out.println("Так нельзя!!!");
        }
    }

    public String getName() {
        return "Оружие";
    }

    public int getEstimation() {
        int sum = 0;
        for (int i = 0; i < estimation.size(); i++) {
            sum += estimation.get(i);
            sum = sum / estimation.size();
        }
        return sum;
    }
}
