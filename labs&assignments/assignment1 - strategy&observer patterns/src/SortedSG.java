import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortedSG implements SentenceGenerator {
    private ArrayList<String> internalVocabulary;
    private Vocabulary subjectVocabulary;

    public SortedSG(Vocabulary subjectVocabulary) {
        this.subjectVocabulary = subjectVocabulary;
        subjectVocabulary.addGenerator(this);

        internalVocabulary = new ArrayList<>();
    }

    @Override
    public void update(String word) {
        internalVocabulary.add(word.toUpperCase());
    }

    @Override
    public ArrayList<String> generateSentenceHelper() {
        ArrayList<String> sentence = new ArrayList<>();
        Random random = new Random();

        if (internalVocabulary.size() > 0) {
            int amountOfWords;

            do {
                amountOfWords = random.nextInt(internalVocabulary.size());
            } while (amountOfWords < 2 || amountOfWords > 15);

            for (int i = 0; i < amountOfWords; i++) {
                sentence.add(internalVocabulary.get(random.nextInt(internalVocabulary.size())));
            }
            Collections.sort(sentence);
        }

        return sentence;
    }
}
