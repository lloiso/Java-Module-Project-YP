import java.util.ArrayList;
import java.util.LinkedList;

public class Basket {
    ArrayList<String> key = new ArrayList<>();
    ArrayList<Float> value = new ArrayList<>();

    public void addKey(String str) {
        key.add(str);
    }

    public void addValue(float i) {
        value.add(i);
    }

    @Override
    public String toString() {
        return key.toString() + "-" + value.toString();
    }

    public float sumBue() {
        float sum = 0.0f;
        for (int i = 0; i < value.size(); i++) {
            sum += value.get(i);
        }
        return (float) Math.round(sum * 100) / 100;
    }
}
