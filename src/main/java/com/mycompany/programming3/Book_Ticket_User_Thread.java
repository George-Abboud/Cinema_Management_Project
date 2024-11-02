/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming3;
import java.util.ArrayList;





public class Book_Ticket_User_Thread extends Thread implements java.io.Serializable
{
   private String hallName;
   private String movieName;
   private String movieDate;
   private String password;
   private ArrayList<Ticket> tickets=new ArrayList<>();

    public Book_Ticket_User_Thread(String hallName, String movieName, String movieDate, String password, ArrayList<Ticket> tickets) 
    {
        this.hallName = hallName;
        this.movieName = movieName;
        this.movieDate = movieDate;
        this.password = password;
        this.tickets = tickets;
    }
    
    
    
    @Override
    public void run()
    {
        Cinema.bookTicketUser=Cinema.bookMovieUser(hallName, movieName, movieDate, password, tickets);
       
    }
   
   
   
   
}
