package org.example;

import java.io.*;


public class Ej10Fillo {
    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        System.out.println(CountVocal(file, args[1].charAt(0)));
    }

    public static long CountVocal(File file, char vocal) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line;
        long count = 0;
        while ((line = reader.readLine()) != null) {
            char[] textoChar = line.toLowerCase().toCharArray();
            int next = 0;

            while(next < textoChar.length){
                if (textoChar[next] == Character.toLowerCase(vocal)) count++;
                next++;
            }
        }
        return count;
    }

}