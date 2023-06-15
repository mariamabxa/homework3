import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Character frequency:");
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
