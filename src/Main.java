import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>(Arrays.asList("Bianco", "Nero"));

        String grigio = "Grigio";
        colors.add(grigio);

        Iterator<String> iterator = colors.iterator();

        while (iterator.hasNext()) {
            String color = iterator.next();

            if (color.equals(grigio)) {
                iterator.remove();
            }
        }

        colors.clear();

        for(String color : colors) {
            System.out.println(color);
        }
    }
}
