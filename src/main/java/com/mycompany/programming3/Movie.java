/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming3;

import java.util.ArrayList;




public class Movie implements java.io.Serializable{
    
    private String name="",type="",date="";
    private  int availableSeats=100;
    private final double priceOfTicket=20000;
    private String hallName="";
    private int idMovie=0;
    ArrayList<Integer> seats=new ArrayList<>();
    
    
    public Movie(String hallName,String movieName ,String movieType ,String movieDate)
    {
        this.hallName=hallName;
        this.name=movieName;
        this.type=movieType;
        this.date=movieDate;
        this.idMovie=this.idMovie(hallName);
        this.seats=this.setSeatsNumber();
    }
    
    
    
    public Movie(String hallName , String movieName , String movieDate)
    {
        this.hallName=hallName;
        this.name=movieName;
        this.date=movieDate;
        this.idMovie=this.getIdMovieNumber(hallName, movieName, movieDate);
    }
    
    
    
    public int idMovie( String hallName )
    {
        ArrayList<Integer> moviesID=new ArrayList<>();
        moviesID=Cinema.getMoviesID();
        int hallNumber=Character.getNumericValue(hallName.charAt(4));
        int id=moviesID.get(hallNumber-1);
        id++;
        moviesID.set(hallNumber-1, (id));
        Cinema.setMoviesID(moviesID);
        
        return id;
    }
    
    
    
    
    
    public int getIdMovieNumber(String hallName,String movieName,String movieDate) {
        int id=0;
        String idPath;
        idPath=Cinema.hallsPath.concat(hallName.concat(Cinema.moviesFilePath));
        ArrayList<Movie> tempMovies=new ArrayList<>();
        tempMovies=Cinema.readMoviesHallFile(hallName);
        for(Movie temp:tempMovies)
        {
            if(movieName.equals(temp.getName()) && movieDate.equals(temp.getDate()))
            {
                id=temp.getID();
                return id;
            }
        }
        
        return id;
        
    }
    
    
    
    public ArrayList<Integer> setSeatsNumber()
    {
        ArrayList<Integer> seatsNumber=new ArrayList<>();
         for(int i=1;i<101;i++)
        {
            seatsNumber.add(i);
        }
         
        return seatsNumber; 
    }
    
    
    
    

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public String getHallName() {
        return hallName;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
    
    public int getID()
    {
        return idMovie;
    }

    public ArrayList<Integer> getSeats() {
        return seats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void setSeats(ArrayList<Integer> seats) {
        this.seats = seats;
    }
    
    
  
    
}
