package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DaoPracownicy {

    @Insert
    public void dodajPracownika(Pracownik pracownik);

    @Insert
    public void dodajWieluPracownikow(Pracownik ... pracownicy);

    @Delete
    public void usunPracownika(Pracownik pracownik);

    @Update
    public void zakutalizujDanePracownika(Pracownik pracownik);

    @Query("Select * from pracownicy where jezykOjczysty = 'polski'")
    public List<Pracownik> wypiszPracownikowPolskoJezycznych();

    @Query("Select *from pracownicy")
    public List<Pracownik> wyswietlwszystkichPracownikow();

    @Query("Select * from pracownicy where jezykObcy = :jezyk")
    public List<Pracownik> wypiszPracownikowmowiacychjezykiem(String jezyk);

}
