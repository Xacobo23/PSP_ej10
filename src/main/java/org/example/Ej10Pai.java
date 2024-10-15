package org.example;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;


public class Ej10Pai {

    public static void main(String[] args) throws IOException {
        long time = System.currentTimeMillis();
        int total = 0;
        String[] vocales = {"a","e","i","o","u"};
        ProcessBuilder processBuilder = new ProcessBuilder();

        for (String vocal : vocales){
            processBuilder.command("java", "-cp", "./target/classes", "org.example/Ej10Fillo", "./fileData.txt", vocal);

            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Number of "+vocal.toUpperCase()+": "+line);
                total = Integer.parseInt(line) + total;
            }



        }
        System.out.println("Total number of vowels: "+total);
        System.out.println(System.currentTimeMillis()-time);

    }
}
