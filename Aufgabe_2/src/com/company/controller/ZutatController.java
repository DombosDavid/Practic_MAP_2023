package com.company.controller;

import com.company.model.Zutat;

import java.util.List;
import java.util.Objects;

public class ZutatController implements ZutatControllerInterface
{
    private final List<Zutat> zutatList;

    public ZutatController(List<Zutat> zutatList)
    {
        this.zutatList = zutatList;
    }

    @Override
    public Zutat addZutat(String name, Integer preis, Integer menge)
    {
        Zutat zutat = new Zutat(name,preis,menge);
        zutatList.add(zutat);
        return zutat;
    }

    @Override
    public void deleteZutat(String name)
    {
        zutatList.removeIf(zutat -> Objects.equals(zutat.getName(), name));
    }

    @Override
    public void updateZutat(String name, Integer preis, Integer menge)
    {
        for (Zutat zutat:
                zutatList) {
            if(Objects.equals(zutat.getName(), name)){
                zutat.setPreis(preis);
                zutat.setMenge(menge);
            }
        }
    }

    @Override
    public List<Zutat> getAll()
    {
        return null;
    }

}
