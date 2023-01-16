package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Repository
{
    public List<Family> readFromFile(String fileName, String character) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        String[] attributes;
        Family family;
        List<Family> listeFamily = new ArrayList<>();
        while (line != null) {
            attributes = line.split(character);
            family = new Family(Integer.parseInt(attributes[0]), attributes[1],attributes[2], Schwierigkeit.valueOf(attributes[3]),Integer.parseInt(attributes[4]),attributes[5]);
            listeFamily.add(family);

            line = bufferedReader.readLine();
        }
        return listeFamily;
    }
    public void writeToFile(String fileName, List<Family> families, String character) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Family family : families) {
            String line = family.getPerson()+character+family.getPunktzahl();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

}
