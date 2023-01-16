package com.company.model;

import java.util.List;

public class Speise
{
    int id;
    String name;
    List<Zutat> zutatList;

    public Speise(int id, String name, List<Zutat> zutatList)
    {
        this.id = id;
        this.name = name;
        this.zutatList = zutatList;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Zutat> getZutatList()
    {
        return zutatList;
    }

    public void setZutatList(List<Zutat> zutatList)
    {
        this.zutatList = zutatList;
    }
}
