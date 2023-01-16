package com.company.controller;

import com.company.model.Zutat;

import java.util.List;

public interface ZutatControllerInterface
{
    Zutat addZutat(String name,Integer preis,Integer menge);
    void deleteZutat(String name);
    void updateZutat(String name,Integer preis,Integer menge);
    List<Zutat> getAll();
}
