package Adapter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class TextParser implements ConfigManager {
    private static final String CONFIG_PATH = "config.txt";
    private ArrayList<String> elements;
    private int cursor;

    public TextParser() {
        elements = new ArrayList<>();
        cursor = 0;
    }

    @Override
    public void loadConfig() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(CONFIG_PATH)));

            String line = br.readLine();
            while (line != null) {
                elements.add(line);
                line = br.readLine();
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean hasNext() {
        return cursor < elements.size();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return elements.get(cursor++);
    }
}
