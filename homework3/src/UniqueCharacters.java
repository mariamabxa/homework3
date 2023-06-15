import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "Hello, World!";
        Set<Character> uniqueChars = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueChars.add(Character.toLowerCase(c));
            }
        }

        StringBuilder sb = new StringBuilder("Unique characters: ");
        for (char c : uniqueChars) {
            sb.append(c).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
