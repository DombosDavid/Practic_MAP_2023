package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Service service = new Service();
        Repository repository = new Repository();

        try {
            List<Family> families = repository.readFromFile("D:\\Praktische_Prufung\\Aufgabe_1\\src\\com\\company\\championship.txt", "#");
//            System.out.println(families.get(0).id);
//            System.out.println(families.get(5).aufgabe);
            List<Family> sorted = service.einfacheAufgaben(families);
            System.out.println("Easy aufgaben:");
            for(Family family:sorted){
                if(family.getSchwierigkeit() == Schwierigkeit.easy){
                    System.out.println(family.getAufgabe());
                }
            }
            System.out.println("================================");
            System.out.println("Hard aufgaben:");
            for(Family family:sorted){
                if(family.getSchwierigkeit() == Schwierigkeit.hard && Objects.equals(family.getResult(), "win") && Objects.equals(family.getPerson(), "Morty Smith")){
                    System.out.println(family.getAufgabe());
                }
            }
            int Mortyscore=0;
            int rickscore=0;
            int summer=0;
            int beth=0;
            int jerry=0;
            for(Family family:sorted){
                if(Objects.equals(family.getPerson(), "Rick Sanchez")){
                    if(Objects.equals(family.getResult(), "win")){
                        rickscore = rickscore + family.getPunktzahl();
                    }
                    else {
                        rickscore = rickscore - 2*family.getPunktzahl();
                    }
                }
                if(Objects.equals(family.getPerson(), "Morty Smith")){
                    if(Objects.equals(family.getResult(), "win")){
                        Mortyscore = Mortyscore + family.getPunktzahl();
                    }
                    else {
                        Mortyscore = Mortyscore - 2*family.getPunktzahl();
                    }
                }
                if(Objects.equals(family.getPerson(), "Summer Smith")){
                    if(Objects.equals(family.getResult(), "win")){
                        summer = summer + family.getPunktzahl();
                    }
                    else {
                        summer = summer - 2*family.getPunktzahl();
                    }
                }
                if(Objects.equals(family.getPerson(), "Beth Smith")){
                    if(Objects.equals(family.getResult(), "win")){
                        beth = beth + family.getPunktzahl();
                    }
                    else {
                        beth = beth - 2*family.getPunktzahl();
                    }
                }
                if(Objects.equals(family.getPerson(), "Jerry Smith")){
                    if(Objects.equals(family.getResult(), "win")){
                        jerry = jerry + family.getPunktzahl();
                    }
                    else {
                        jerry = jerry - 2*family.getPunktzahl();
                    }
                }

            }
            List<Family> scoreList = new ArrayList<>();
//            scoreList.add(new Family("Rick Sanchez",rickscore),new Family("Morty Smith",Mortyscore),new Family("Beth Smith",beth),new Family("Summer Smith",summer),new Family("Jerry Smith",jerry));
            Family rick = new Family("Rick Sanchez",rickscore);
            Family morty = new Family("Morty Smith", Mortyscore);
            Family beth_smith = new Family("Beth Smith",beth);
            Family summer_smith = new Family("Summer Smith",summer);
            Family jerry_smith = new Family("Jerry Smith",jerry);
            scoreList.add(rick);
            scoreList.add(morty);
            scoreList.add(beth_smith);
            scoreList.add(summer_smith);
            scoreList.add(jerry_smith);

//            repository.writeToFile("D:\\Praktische_Prufung\\Aufgabe_1\\src\\com\\company\\write.txt", scoreList.stream().sorted((family,otherfamily)->family.getPunktzahl().compareTo(otherfamily.getPunktzahl())).collect(Collectors.toList()), "%");

            repository.writeToFile("D:\\Praktische_Prufung\\Aufgabe_1\\src\\com\\company\\write.txt", scoreList, "%");
//            service.getMostFrequentPlace(listeTiere);
//            System.out.println(service.getMostFrequentPlace(listeTiere));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
