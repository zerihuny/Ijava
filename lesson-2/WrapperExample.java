import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(90);     // autoboxing: int → Integer
        scores.add(85);
        scores.add(78);

        System.out.println("Scores: " + scores);
    }
}
