package com.company.view;


import com.company.controller.SpeiseControllerInterface;
import com.company.controller.ZutatControllerInterface;
import com.company.model.Zutat;

import java.util.ArrayList;
import java.util.List;

public class view
{
    private SpeiseControllerInterface speiseControllerInterface;
    private ZutatControllerInterface zutatControllerInterface;


    public void View(SpeiseControllerInterface speiseControllerInterface, ZutatControllerInterface zutatControllerInterface) {
        this.speiseControllerInterface = speiseControllerInterface;
        this.zutatControllerInterface = zutatControllerInterface;

        zutatControllerInterface.addZutat("lasagna",30, 2);
        zutatControllerInterface.addZutat("ciorba",20,1);


        speiseControllerInterface.addSpeise(1,"special",new ArrayList<>());
        speiseControllerInterface.addSpeise(2,"meniu_complet",zutatControllerInterface.getAll());

    }
    public void run(){
        zutatControllerInterface.addZutat("lasagna",30, 2);
        zutatControllerInterface.addZutat("ciorba",20,1);

        speiseControllerInterface.addSpeise(1,"special",new ArrayList<>());
        speiseControllerInterface.addSpeise(2,"meniu_complet",zutatControllerInterface.getAll());
    }
}

