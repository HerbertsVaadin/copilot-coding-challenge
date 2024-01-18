package org.vaadin.challenges.algorithms;

import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class SortFile {
    public static void sort(String fileLocation) {
        Path path = Paths.get(fileLocation);
        try {
            List<String> lines = Files.readAllLines(path);
            Collections.sort(lines);
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}