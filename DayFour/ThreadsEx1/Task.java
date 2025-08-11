package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task implements Runnable{
    private static int fileNum = 0;
    private final ArrayList<String> allNames;
    private final String path;

    public Task(ArrayList<String> allNames) {
        synchronized (this){
            this.allNames = allNames;
            fileNum++;
            path = String.format("/Users/seifehab/Desktop/txtFiles/txt%d.txt", fileNum);
        }

    }

    public void readFiles() {
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                synchronized (this) {
                    allNames.add(line);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void run() {
        readFiles();
    }
}
