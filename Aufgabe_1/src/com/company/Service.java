package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Service
{
//    public List<Tier> sortListeTiereByName(List<Tier> liste) {
//        return liste.stream()
//                .sorted((tier, otherTier) -> tier.getName().compareTo(otherTier.getName()))
//                .collect(Collectors.toList());
//    }
    public List<Family> einfacheAufgaben(List<Family> list){
        return list.stream()
                .sorted((otherfamily,family)->family.getAufgabe().compareTo(otherfamily.getAufgabe())).collect(Collectors.toList());
    }
//    public List<Family> punkte(List<Family> families){
//        return families.stream().sorted((o1, o2)->o1.getPunktzahl().
//                        compareTo(o2.getPunktzahl())).
//                collect(Collectors.toList());
//    }
//    public int getScore(String name){
//
//    }

}
