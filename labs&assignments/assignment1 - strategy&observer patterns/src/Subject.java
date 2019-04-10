public interface Subject {
    void addGenerator(SentenceGenerator sg);

    void removeGenerator(SentenceGenerator sg);

    void notifyGenerators();
}