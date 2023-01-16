package com.company.controller;

import com.company.model.Speise;
import com.company.model.Zutat;

import java.util.List;

public interface SpeiseControllerInterface
{
    Speise addSpeise(int id, String name, List<Zutat> zutatList);
    void deleteSpeise(int id);
    void updateSpeise(int id, String name, List<Zutat> zutatList);
    List<Speise> getAll();
}
