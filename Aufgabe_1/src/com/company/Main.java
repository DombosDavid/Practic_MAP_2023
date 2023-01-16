package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Service service = new Service();
        Repository repository = new Repository();

        try {
            List<Tier> listeTiere = repository.readFromFile("D:\\Praktische_Prufung\\Aufgabe_1\\src\\com\\company\\read.txt", "#");

            repository.writeToFile("D:\\Model Practic Iftinca\\Pregatire Practic\\Teil1\\src\\demo\\tiereResults.txt", listeTiere, "%");
            service.getMostFrequentPlace(listeTiere);
            System.out.println(service.getMostFrequentPlace(listeTiere));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
