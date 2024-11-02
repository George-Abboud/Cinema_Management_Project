/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming3;

import java.util.ArrayList;


public class Book_Ticket_Hall_Thread extends Thread implements java.io.Serializable{
    
    private String hallName;
    private ArrayList<Movie> movies=new ArrayList<>();

    public Book_Ticket_Hall_Thread(String hallName , ArrayList<Movie> tempMovies)
    {
        this.hallName = hallName;
        this.movies=tempMovies;
    }
    
    
    @Override
    public void run()
    {
        Cinema.bookTicketHall=Cinema.writeMoviesHallFileForThread(hallName, movies);
    }
    
    
    
    
}
