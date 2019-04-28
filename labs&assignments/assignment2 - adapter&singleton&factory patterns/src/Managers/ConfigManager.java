package Managers;

import java.io.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ConfigManager {
    private ArrayList<String> nodes;
    private String configPath;
    private int cursor = 0;

    public ConfigManager(String path) throws FileNotFoundException, IOException {
        nodes = new ArrayList<>();
        configPath = path;
    }

    public void loadConfig() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(configPath)));

        String line = br.readLine();
        while (line != null) {
            nodes.add(line);
            line = br.readLine();
        }

        br.close();
    }

    public boolean hasNext() {
        return cursor < nodes.size();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return nodes.get(cursor++);
    }
}
