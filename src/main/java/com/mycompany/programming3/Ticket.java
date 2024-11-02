/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming3;

import java.io.*;
import java.util.ArrayList;

public class Ticket implements java.io.Serializable {

    private String hallName;
    private String movieName, movieDate;
    private int seatNumber = 0;

    public Ticket(String hallname, String movieName, String movieDate, int seatNumber) {
        this.hallName = hallname;
        this.movieName = movieName;
        this.movieDate = movieDate;
        this.seatNumber = seatNumber;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

}
