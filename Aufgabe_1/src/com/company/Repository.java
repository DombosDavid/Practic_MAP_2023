package com.company;

import java.io.*;
import java.util.ArrayList;

public class Repository
{
    public List<Tier> readFromFile(String fileName, String character) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        String[] attributes;
        Tier tier;
        List<Tier> listeTiere = new ArrayList<>();
        while (line != null) {
            attributes = line.split(character);
            tier = new Tier(attributes[0], attributes[1], Diaet.valueOf(attributes[2]), attributes[3]);
            listeTiere.add(tier);

            line = bufferedReader.readLine();
        }
        return listeTiere;
    }
    public void writeToFile(String fileName, List<Tier> liste, String character) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Tier tier : liste) {
            String line = tier.getName() + character + tier.getWissenschaftlicherName() + character +
                    tier.getDiaet() + character + tier.getOrt();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

}
