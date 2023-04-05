import java.util.ArrayList;
import java.util.List;

public class Flamethrower extends Weapon {
    protected List<String> feedback = new ArrayList<>();
    protected List<Integer> estimation = new ArrayList<>();

    public void addFeedback(String s) {
        super.addFeedback(s);
    }

    public void getFeedback() {
        super.getFeedback();
    }

    public void Characteristic() {
        System.out.println("Им прекрасно выжигать дома и узкие коридоры, в иных ситуациях он бесполезен");
    }

    public void addEstimation(Integer integer) {
        super.addEstimation(integer);
    }

    public int getEstimation() {
        return super.getEstimation();

    }

    public String getName() {
        return "Огнемет";
    }

}
