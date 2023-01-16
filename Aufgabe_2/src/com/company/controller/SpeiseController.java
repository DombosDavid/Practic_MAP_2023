package com.company.controller;

import com.company.model.Speise;
import com.company.model.Zutat;

import java.util.List;
import java.util.Objects;

public class SpeiseController implements SpeiseControllerInterface
{
    private final List<Speise> speises;

    public SpeiseController(List<Speise> speises)
    {
        this.speises = speises;
    }

    @Override
    public Speise addSpeise(int id, String name, List<Zutat> zutatList)
    {
        Speise speise = new Speise(id,name,zutatList);
        speises.add(speise);
        return speise;
    }

    @Override
    public void deleteSpeise(int id)
    {
        speises.removeIf(speise -> Objects.equals(speise.getId(), id));

    }

    @Override
    public void updateSpeise(int id, String name, List<Zutat> zutatList)
    {
        for (Speise speise:
                speises) {
            if(Objects.equals(speise.getId(), id)){
                speise.setName(name);
                speise.setZutatList(zutatList);
            }
        }
    }

    @Override
    public List<Speise> getAll()
    {
        return null;
    }
}
