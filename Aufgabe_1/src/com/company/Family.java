package com.company;

public class Family
{
    int id;
    String person;
    String aufgabe;
    Schwierigkeit schwierigkeit;
    int punktzahl;
    String result;

    public Family(int id, String person, String aufgabe, Schwierigkeit schwierigkeit, int punktzahl, String result)
    {
        this.id = id;
        this.person = person;
        this.aufgabe = aufgabe;
        this.schwierigkeit = schwierigkeit;
        this.punktzahl = punktzahl;
        this.result = result;
    }

    public Family(String person, int punktzahl)
    {
        this.person = person;
        this.punktzahl = punktzahl;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getPerson()
    {
        return person;
    }

    public void setPerson(String person)
    {
        this.person = person;
    }

    public String getAufgabe()
    {
        return aufgabe;
    }

    public void setAufgabe(String aufgabe)
    {
        this.aufgabe = aufgabe;
    }

    public Schwierigkeit getSchwierigkeit()
    {
        return schwierigkeit;
    }

    public void setSchwierigkeit(Schwierigkeit schwierigkeit)
    {
        this.schwierigkeit = schwierigkeit;
    }

    public int getPunktzahl()
    {
        return punktzahl;
    }

    public void setPunktzahl(int punktzahl)
    {
        this.punktzahl = punktzahl;
    }

    public String getResult()
    {
        return result;
    }

    public void setResult(String result)
    {
        this.result = result;
    }
}
