package com.company.model;

public class Zutat
{
    String name;
    int preis;
    int menge;

    public Zutat(String name, int preis, int menge)
    {
        this.name = name;
        this.preis = preis;
        this.menge = menge;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPreis()
    {
        return preis;
    }

    public void setPreis(int preis)
    {
        this.preis = preis;
    }

    public int getMenge()
    {
        return menge;
    }

    public void setMenge(int menge)
    {
        this.menge = menge;
    }
}
