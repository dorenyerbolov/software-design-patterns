import java.util.ArrayList;
import java.util.Random;

public class OrderedSG implements SentenceGenerator {
    private ArrayList<String> internalVocabulary;
    private Vocabulary subjectVocabulary;

    public OrderedSG(Vocabulary subjectVocabulary) {
        this.subjectVocabulary = subjectVocabulary;
        subjectVocabulary.addGenerator(this);

        internalVocabulary = new ArrayList<>();
    }

    @Override
    public void update(String word) {
        internalVocabulary.add(new StringBuilder(word.toUpperCase()).reverse().toString());
    }

    @Override
    public ArrayList<String> generateSentenceHelper() {
        ArrayList<String> tmp_sentence = new ArrayList<>();
        ArrayList<String> sentence = new ArrayList<>();
        Random random = new Random();

        if (internalVocabulary.size() > 0) {
            int amountOfWords;

            do {
                amountOfWords = random.nextInt(internalVocabulary.size());
            } while (amountOfWords < 2 || amountOfWords > 15);

            for (int i = 0; i < amountOfWords; i++) {
                tmp_sentence.add(internalVocabulary.get(random.nextInt(internalVocabulary.size())));
            }

            for (String word : internalVocabulary) {
                if (tmp_sentence.contains(word)) {
                    sentence.add(word);
                }
            }
        }

        return sentence;
    }
}
