package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            File file = new File("newFile.txt");

            if (!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println("Everthing is working");
            pw.println("Hello World");
            pw.println("Hello World 3");
            pw.println("683");
            pw.close();


            br = new BufferedReader( new FileReader("newFile.txt"));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.print("Error: " + e);
        } finally {
            br.close();
        }
    }
}
