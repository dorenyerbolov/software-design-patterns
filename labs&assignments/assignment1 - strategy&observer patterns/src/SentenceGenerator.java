import java.util.ArrayList;

public interface SentenceGenerator {
    void update(String word);

    ArrayList<String> generateSentenceHelper();

    default String generateSentence() {
        return String.join(" ", generateSentenceHelper());
    }
}
