/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;






public class User implements java.io.Serializable{
    
    
    private  String userName="";
    private  String password="";
    HashMap<Movie,ArrayList<Ticket>> hm = new HashMap<>();
    
    
    
    
    
    
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        
    }
    
    
    

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
    

    public HashMap<Movie, ArrayList<Ticket>> getHm() {
        return hm;
    }

    public void setHm(HashMap<Movie, ArrayList<Ticket>> hm) {
        this.hm = hm;
    }
    
    
    
    
    
    
     public  static void bookMovie(String hallName,String movieName,String movieDate,String password,ArrayList<Ticket> tickets)
    {   
       String usersPath="C:\\Users\\omarm\\Desktop\\Programming3\\Cinema\\Users\\Users.txt" ;
       ArrayList<User> tempUsers=new ArrayList<>(); 
       File f=new File(usersPath);
       try{
       FileInputStream fis=new FileInputStream(f);
       ObjectInputStream ois=new ObjectInputStream(fis);
       tempUsers.add((User)ois.readObject());
       int j=0;
       while(tempUsers.get(j)!=null)
       {
            tempUsers.add((User)ois.readObject());
            j++;
       }    
       }
       catch(EOFException e)
       {}
       catch(IOException | ClassNotFoundException e  )
       {
           System.out.println(e);
       }
       
       finally{
           for(User tempUser:tempUsers)
           {
               if(password.equals(tempUser.getPassword()))
               {
                boolean b = false;
                if(tempUser.getHm()!=null){
            for(Map.Entry<Movie,ArrayList<Ticket>> entry:tempUser.hm.entrySet())
              {
                  
                if(entry.getKey().getName().equals(movieName) &&entry.getKey().getHallName().equals(hallName) && entry.getKey().getDate().equals(movieDate) )
              {
              
               ArrayList<Ticket>tempTickets=new ArrayList<>();
               
               for(Ticket temp:entry.getValue()){
                   tempTickets.add(temp);
                   
               }
               
               for(Ticket temp: tickets)
               {
                   tempTickets.add(temp);
               }
               
               entry.setValue(tempTickets);
               
               b=true;
               break;
               
              }
             
           }
                
                
        }
            
            
     if(!b)
     {
        
        ArrayList<Ticket>tempTickets=new ArrayList<>();
         for(Ticket temp:tickets)
         {
             tempTickets.add(temp);
         }
         
         
         
              
        Movie m1=new Movie(hallName,movieName,movieDate);
        tempUser.hm.put(m1, tempTickets);
     }
      
     
    
 break;
 
 
 
    }
           }
           try{
           FileOutputStream fos=new FileOutputStream(f);
           ObjectOutputStream oos=new ObjectOutputStream(fos);
           for(User t:tempUsers)
           {
               oos.writeObject(t);
           }
           
           oos.flush();
           oos.close();
           fos.close();
           }
           catch(IOException e)
           {
               System.out.println(e);
           }
       }
    }
    
    
    
    
    
    
    
    
    
}
