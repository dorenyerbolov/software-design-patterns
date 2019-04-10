import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Vocabulary implements Subject {
    private String word;
    private ArrayList<SentenceGenerator> generators;

    {
        generators = new ArrayList<>();
    }

    @Override
    public void addGenerator(SentenceGenerator generator) {
        generators.add(generator);
    }

    @Override
    public void removeGenerator(SentenceGenerator generator) {
        int index = generators.indexOf(generator);
        if (index >= 0) {
            generators.remove(index);
        }
    }

    @Override
    public void notifyGenerators() {
        for (SentenceGenerator tmpGenerator : generators) {
            tmpGenerator.update(word);
        }
    }

    public void measurementsChanged() {
        notifyGenerators();
    }

    public void setMeasurements(String word) {
        this.word = word;
        measurementsChanged();
    }

    public void start() {
        try {
            String choice, newWord;
            Vocabulary vocab = new Vocabulary();
            SentenceGenerator RSG = new RandomSG(vocab);
            SentenceGenerator SSG = new SortedSG(vocab);
            SentenceGenerator OSG = new OrderedSG(vocab);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            menu:
            while (true) {
                System.out.println("Please, select desired option: ");
                System.out.println("[1] - Add a new word to the vocabulary");
                System.out.println("[2] - Add words from a text file");
                System.out.println("[3] - Choose sentence generator");
                System.out.println("[4] - Quit");

                choice = reader.readLine();

                switch (choice) {
                    case "1":
                        System.out.println("Enter one word:");

                        newWord = reader.readLine();
                        vocab.setMeasurements(newWord);
                        break;
                    case "2":
                        BufferedReader br = new BufferedReader(new FileReader("words.txt"));
                        newWord = br.readLine();

                        while (newWord != null) {
                            vocab.setMeasurements(newWord);
                            newWord = br.readLine();
                        }

                        br.close();
                        break;
                    case "3":
                        while (true) {
                            System.out.println("Please, select desired sentence generator: ");
                            System.out.println("[1] - Random Sentence Generator (RSG)");
                            System.out.println("[2] - Sorted Sentence Generator (SSG)");
                            System.out.println("[3] - Ordered Sentence Generator (OSG)");
                            System.out.println("[4] - Back");

                            choice = reader.readLine();

                            switch (choice) {
                                case "1":
                                    System.out.println(RSG.generateSentence());
                                    break;
                                case "2":
                                    System.out.println(SSG.generateSentence());
                                    break;
                                case "3":
                                    System.out.println(OSG.generateSentence());
                                    break;
                                case "4":
                                    continue menu;
                                default:
                                    System.out.println("Wrong input! Try again.");
                            }
                        }
                    case "4":
                        System.exit(666);
                    default:
                        System.out.println("Wrong input! Try again.");
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
