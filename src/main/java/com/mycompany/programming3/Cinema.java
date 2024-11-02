/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming3;

// ITv Project Programming 3
// This is a Cinema Administration Program!
// #7



import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;





public class Cinema implements java.io.Serializable{
    
    
    
    
    
    public static boolean cancelTicketUser=false;                               // We need this static boolean variable for Threads!
    public static boolean cancelTicketHall=false;                               // We need this static boolean variable for Threads!
    public static boolean bookTicketUser=false;                                 // We need this static boolean variable for Threads!
    public static boolean bookTicketHall=false;                                 // We need this static boolean variable for Threads!
    
    
    public static String usernameKey="";                                        // We need this static String variable for Login!
    public static String passwordKey="";                                        // We need this static String variable for Login!
    public static String hallName = "";
    public static String movieName = "";
    public static String showTime = "";
    public static int noOfTickets = 0;
    public static int noOfVIPSeat = 0;
    
    public static String hallsPath="C:\\Users\\omarm\\Desktop\\Programming3\\Cinema\\Halls\\";              // These are The Files Path!
    public static String moviesFilePath="\\Movies.txt";                         // These are The Files Path!
    public static String usersFilePath="C:\\Users\\omarm\\Desktop\\Programming3\\Cinema\\Users\\Users.txt"; // These are The Files Path!
    public static String moviesIDPath="C:\\Users\\omarm\\Desktop\\Programming3\\Cinema\\Halls\\MoviesID.txt";  // These ara The Files Path!
    
    
    
    
    
    public Cinema()
    {}
    
    
    
    
    public static void writeUsersFile(ArrayList<User> tempUsers)
    {
        File f=new File(Cinema.usersFilePath);
            try
            {
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos =new ObjectOutputStream(fos);
                
                
                for(User temp:tempUsers)
                {
                    oos.writeObject(temp);
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
    
    
    
    
    
    
    
    public static ArrayList<User> readUsersFile()
    {
        ArrayList<User> tempUsers=new ArrayList<>();
        File f=new File(Cinema.usersFilePath);
        
        try
        {
            FileInputStream fis=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
            
            
            int index=0;
            tempUsers.add((User)ois.readObject());
            while(tempUsers.get(index)!=null)
            {
                tempUsers.add((User)ois.readObject());
                index++;
            }
            
            
            ois.close();
            fis.close();
        }
        
        catch(EOFException e)
        {}
        
        catch(IOException | ClassNotFoundException e)
        {
            System.out.println(e);
        }
        
        
        return tempUsers;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void writeMoviesHallFile(String hallName,ArrayList<Movie> tempMovies)
    {
        
        String moviesHallPath=Cinema.hallsPath.concat(hallName.concat(Cinema.moviesFilePath));
        File f=new File(moviesHallPath);
            try
            {
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos =new ObjectOutputStream(fos);
                
                
                for(Movie temp:tempMovies)
                {
                    oos.writeObject(temp);
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
    
    
    
    
    
    public static ArrayList<Movie> readMoviesHallFile(String hallName)
    {
        String moviesHallPath=Cinema.hallsPath.concat(hallName.concat(Cinema.moviesFilePath));
        ArrayList<Movie> tempMovies=new ArrayList<>();
        File f=new File(moviesHallPath);
        
        try
        {
            FileInputStream fis=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
            
            
            int index=0;
            tempMovies.add((Movie)ois.readObject());
            while(tempMovies.get(index)!=null)
            {
                tempMovies.add((Movie)ois.readObject());
                index++;
            }
            
            
            ois.close();
            fis.close();
        }
        
        catch(EOFException e)
        {}
        
        catch(IOException | ClassNotFoundException e)
        {
            System.out.println(e);
        }
        
        
        return tempMovies;
        
    }
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      public boolean addMovie(String hallName,String movieName,String movieType,String date)
    {
        boolean b=true;
        ArrayList<Movie> tempMovies=new ArrayList<>();
        String moviesHallPath=Cinema.hallsPath.concat(hallName.concat(Cinema.moviesFilePath));
        File f=new File(moviesHallPath);
           
        if(f.length()>0)
        {
            tempMovies=Cinema.readMoviesHallFile(hallName);
            for(Movie temp:tempMovies)
            {
                if(date.equals(temp.getDate()))
                {
                    b=false;
                    return b;
                }
            }
                
        }
        
        if(b)
        {
            tempMovies.add(new Movie(hallName,movieName,movieType,date));
            Cinema.writeMoviesHallFile(hallName, tempMovies);
        }
        
        return b;
          
            
    }
      
      
      
      
        public static ArrayList<Integer> getMoviesID()
    {
      
        ArrayList<Integer> tempID=new ArrayList<>();
        File f=new File(Cinema.moviesIDPath);
        try{
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        tempID=(ArrayList<Integer>)ois.readObject();
        ois.close();
        fis.close();
    }
        catch(IOException | ClassNotFoundException e)
        {
            System.out.println(e);
        }
        return tempID;
    }
        
        
     public static void setMoviesID(ArrayList<Integer> moviesID)
    {
        File f=new File(Cinema.moviesIDPath);
        try
        {
            FileOutputStream fos=new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(moviesID);
            oos.flush();
            oos.close();
            fos.close();
        }
        
        catch(IOException e)
        {
            System.out.println(e);
        }
        
        
    }
  
      
      
      
      
   
    
    
    public boolean createAccount(String username,String password)
    {
        boolean b=true;
       
        
        ArrayList<User>tempUsers=new ArrayList<>();
        
        File f=new File(Cinema.usersFilePath);
        if(f.length()>0)
        {
        
            tempUsers=Cinema.readUsersFile();
            for(User temp:tempUsers)
            {
                if(temp.getPassword().equals(password)){
                b=false;
                return b;
                }
               
            }
            if(b) {
                tempUsers.add(new User(username, password));
                Cinema.writeUsersFile(tempUsers);
                return b;
            }
            
        }
        
        
        
        if(b)
        {
            tempUsers.add(new User(username,password));
            Cinema.writeUsersFile(tempUsers);
            b = true;
        }
        
        
        return b;
    }
    
    
    
    
    
     public String[] login(String username,String password)
   {
        String [] s=new String[2];
        boolean b=false;
        ArrayList<User>tempUsers=new ArrayList<>();
        
        File f=new File(Cinema.usersFilePath);
        if(f.length()>0)
        {
            tempUsers=Cinema.readUsersFile();
            
            for(User temp:tempUsers)
            {
                if(username.equals(temp.getUserName()) && password.equals(temp.getPassword()))
                {
                    s[0]=username;
                    s[1]=password;
                    b=true;
                    break;
                }
            }
        }
        
        
        if(!b)
        
        {
        s[0]=null;
        s[1]=null;
        }
        return s;
   }
     
     
     
      public void printUserDetails(String username, String password)
    {
        
        ArrayList<User>tempUsers=new ArrayList<>();
        tempUsers=Cinema.readUsersFile();
        
        for(User temp: tempUsers)
        {
            if(username.equals(temp.getUserName()) && password.equals(temp.getPassword()))
            {
                if(temp.hm==null)
                {
                    System.out.println("No Reservations!");
                    return;
                }
                else
                {
                    for(Map.Entry<Movie,ArrayList<Ticket>> entry:temp.hm.entrySet())
                    {
                        System.out.println("{ Movie ID:" +entry.getKey().getID() + " , Movie Name:"+ entry.getKey().getName() + " , HallName:" + entry.getKey().getHallName() +  " , Movie Date:" + entry.getKey().getDate() + " , Your number of Tickets is:" + entry.getValue().size() + " }" );
                        System.out.println("Your Seats Number is: ");
                        System.out.print("[ ");
                        for(Ticket ticket:entry.getValue())
                            {
                            System.out.print(  ticket.getSeatNumber() + " ");
                            }
                            System.out.println("]");
                            System.out.println("The price of any Ticket is: 20000 S.P");
                        System.out.println();
                        System.out.println();
                    }
                    break;
                }
            }
        }
    }
    
    
    
    
    public void changeUsername(String oldUsername,String newUsername)
    {
        ArrayList<User>tempUsers=new ArrayList<>();
        tempUsers=Cinema.readUsersFile();
        int index=0;
        for(User temp:tempUsers)
        {
            if(oldUsername.equals(temp.getUserName()))
            {
                temp.setUserName(newUsername);
                tempUsers.set(index, temp);
                Cinema.writeUsersFile(tempUsers);
                return;
            }
            index++;
        }
        
    }
    
    
    
    public void changePassword(String oldPassword , String newPassword)
    {
        ArrayList<User>tempUsers=new ArrayList<>();
        tempUsers=Cinema.readUsersFile();
        int index=0;
        for(User temp:tempUsers)
        {
            if(oldPassword.equals(temp.getPassword()))
            {
                temp.setPassword(newPassword);
                tempUsers.set(index, temp);
                Cinema.writeUsersFile(tempUsers);
                return;
            }
            index++;
        }
        
    }
     
     
     
     
    
     
        
        
        
        
        
        
        
        
      
    
    public void printMovies(String hallName)
    {   
        boolean b=false;
        String moviesHallFilePath=Cinema.hallsPath.concat(hallName.concat(Cinema.moviesFilePath));
        File f=new File(moviesHallFilePath);
        if(f.length()>0)
        {
            b=true;
            
        }
        
        if(b)
        {
            ArrayList<Movie> tempMovies=new ArrayList<>();
            tempMovies=Cinema.readMoviesHallFile(hallName);
            for(Movie temp: tempMovies)
            {
                System.out.println("{ " + temp.getName() + " , " + temp.getType() + " , " + temp.getDate() + " , " + temp.getAvailableSeats() + " }");
                System.out.println();
            }
        }
        
        else
        {
            System.out.println("No Movies!");
            System.out.println();
        }
        
    }
    
    
    
    
    
    public void printMoviesByType(String movieType)
    {   
        boolean b=false;
        System.out.println("Search Result:" + movieType);
        System.out.println();
        System.out.println();
        System.out.println("Movies:");
        for(int i=1;i<=6;i++)
        {
            String hallName="Hall" + i;
            ArrayList<Movie> tempMovies=new ArrayList<>();
            tempMovies=Cinema.readMoviesHallFile(hallName);
            for(Movie temp:tempMovies)
            {
                if(movieType.equals(temp.getType()))
                {
                    b=true;
                    System.out.println( " { "+temp.getName() + " , " + temp.getHallName()  + " , " + temp.getDate() + " , " + temp.getAvailableSeats() + " }");
                    System.out.println("The Price of any Ticket: 20000 S.P");
                    System.out.println();
                    
                }
            }
           
        }
        
        if(!b)
          {
            System.out.println("No Movies!");
          }
    }
    
    
    
   
    
    
    
    
    
    
    
    
    public double bill( int numberOfTickets)
    {
        return (20000*numberOfTickets);

    }
    
    
    
    
    
    
    
    
    public void printAvailableSeatsNumber(String hallName , String movieName , String movieDate)
    {
        boolean b=false;
        ArrayList<Movie> tempMovies=new ArrayList<>();
        tempMovies=Cinema.readMoviesHallFile(hallName);
        for(Movie temp: tempMovies)
        {
            if(movieName.equals(temp.getName()) && movieDate.equals(temp.getDate()) )
            {
                if(temp.getAvailableSeats()>0)
                {
                    b=true;
                    int count=1;
                    int size=1;
                    for(int number:temp.getSeats())
                    {
                        if(temp.seats.size()==size)
                        {
                            System.out.println(number);
                            return;
                        }
                    
                    
                        else if(count==10){
                            System.out.println(number);
                            count++;
                        }
                    
         
                        else if(count<10){
                            System.out.print(number + " , ");
                            count++;
                        }
       
                        else
                        {
                            count=2;
                            System.out.println();
                            System.out.print(number + " , ");
                        }
                        size++;
                    }
                }
                
                else
                {
                    System.out.println("No Available Seats!");
                    return;
                }
            }
        }
        
        if(!b)
        {
            System.out.println("Error!");
        }
    }
    
    
    
    
    
    
    
    public static boolean writeMoviesHallFileForThread(String hallName,ArrayList<Movie> tempMovies)
    {
        boolean b=true;
        String moviesHallPath=Cinema.hallsPath.concat(hallName.concat(Cinema.moviesFilePath));
        File f=new File(moviesHallPath);
            try
            {
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos =new ObjectOutputStream(fos);
                
                
                for(Movie temp:tempMovies)
                {
                    oos.writeObject(temp);
                }
                
                oos.flush();
                oos.close();
                fos.close();
            }
            
            catch(IOException e)
            {
                System.out.println(e);
            }
            
        
        return b;
            
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public  static boolean bookMovieUser(String hallName,String movieName,String movieDate,String password,ArrayList<Ticket> tickets)
    {   
       
       boolean c=false;
       ArrayList<User> tempUsers=new ArrayList<>(); 
       tempUsers=Cinema.readUsersFile();
       for(User tempUser:tempUsers)
            {
               if(password.equals(tempUser.getPassword()))
               {
                boolean b = false;
                if(tempUser.hm!=null)
                {
                    for(Map.Entry<Movie,ArrayList<Ticket>> entry:tempUser.hm.entrySet())
                    {
                  
                        if(entry.getKey().getName().equals(movieName) &&entry.getKey().getHallName().equals(hallName) && entry.getKey().getDate().equals(movieDate) )
                        {
              
                            ArrayList<Ticket>temp=new ArrayList<>();
               
                            for(Ticket t:entry.getValue())
                            {
                            temp.add(t);
                   
                            }
               
                            for(Ticket t: tickets)
                            {
                            temp.add(t);
                            }
               
                            entry.setValue(temp);
               
                            b=true;
                            c=b;
                            break;
               
                        }
             
                    }
                
                
                }
            
            
                if(!b)
                {
        
                    ArrayList<Ticket>temp=new ArrayList<>();
                    for(Ticket t:tickets)
                    {
                        temp.add(t);
             
                    }
   
                    Movie m1=new Movie(hallName,movieName,movieDate);
                    tempUser.hm.put(m1, temp);
                    c=true;
                }
      
     
    
                break;
 
 
 
            }
       

       
            }
            if(c)
            {
                Cinema.writeUsersFile(tempUsers);
            }
              
              
            return c;
    }
   
   
    
    
    
    
    
    public synchronized boolean addTickets(String hallName ,String movieName ,String movieDate , int numberOfTickets , String password)
    {
       boolean b=false;
       if(numberOfTickets>0 && numberOfTickets<=100)
       {
       ArrayList<Movie> tempMovies=new ArrayList<>();
       tempMovies=Cinema.readMoviesHallFile(hallName);
       for(Movie temp: tempMovies)
       {
           if(temp.getName().equals(movieName) && temp.getDate().equals(movieDate))
           {
               ArrayList<Ticket>tickets=new ArrayList<>();
               
               
               if(temp.getAvailableSeats()>=numberOfTickets)
               {
                    
                    
                    for(int i=0;i<numberOfTickets;i++)
                    {
                        tickets.add(new Ticket(hallName,movieName,movieDate,temp.getSeats().get(i)));
                         
                    }
                    for(int count=0;count<numberOfTickets;count++)
                    {
                        temp.seats.remove(0);
                    }
                    temp.setAvailableSeats(temp.getSeats().size());
                    Book_Ticket_Hall_Thread th1 =new Book_Ticket_Hall_Thread(hallName,tempMovies);
                    Book_Ticket_User_Thread th2 =new Book_Ticket_User_Thread(hallName , movieName , movieDate , password , tickets);
               
               
                    th1.start();
                    th2.start();
               
               
                    try
                    {
                        th1.join();
                        th2.join();
                    }
               
                    catch(InterruptedException e)
                    {
                        System.out.println(e);
                    }
                    b=Cinema.bookTicketHall & Cinema.bookTicketUser;
                    return b;
                }
               
                else
               {
                   break;
               }
               
                   
               
              
           }
           
       }
       }
       
       return b;
    }
    
    
    
 
    public synchronized boolean addTicketVIP(String hallName, String movieName , String movieDate , int seatNumber , String password)
 {
     boolean b=false;
     if(seatNumber>0 && seatNumber<= 100)
     {
         ArrayList<Movie> tempMovies=new ArrayList<>();
         tempMovies=Cinema.readMoviesHallFile(hallName);
        
         for(Movie t:tempMovies){
           if(hallName.equals(t.getHallName()) && movieName.equals(t.getName()) && movieDate.equals(t.getDate()))
           {
               int d=0;
            
              
            if(t.seats.size()==1 && seatNumber==t.seats.get(0))
            {
                d++;
                b=true;
                 ArrayList<Ticket> ticketVIP=new ArrayList<>();
                 ticketVIP.add(new Ticket(hallName, movieName,movieDate,seatNumber));
                 t.seats.clear();
                 t.setAvailableSeats(0);
                 Book_Ticket_Hall_Thread th1 =new Book_Ticket_Hall_Thread (hallName , tempMovies);
                 Book_Ticket_User_Thread th2 = new Book_Ticket_User_Thread(hallName , movieName , movieDate , password , ticketVIP);
      
      
                  th1.start();
                  th2.start();
      
                  try{
                  th1.join();
                  th2.join();
      
                  }
                 catch(InterruptedException e)
                 {
                   System.out.println(e);
                 }
                  finally
                  {
                      b=(Cinema.bookTicketHall & Cinema.bookTicketUser);
                  }
                 break;
            }
            else{
            for(int i:t.seats)
             {
               if(i==seatNumber )
                {
                 d++;
                 b=true;
                 ArrayList<Ticket> ticketVIP=new ArrayList<>();
                 ticketVIP.add(new Ticket(hallName, movieName,movieDate,seatNumber));
                 t.seats.remove((Integer)seatNumber);
                 t.setAvailableSeats(t.seats.size());
                 
                 
                 Book_Ticket_Hall_Thread th1 = new Book_Ticket_Hall_Thread (hallName ,tempMovies);
                 Book_Ticket_User_Thread th2 = new Book_Ticket_User_Thread (hallName ,movieName ,movieDate , password , ticketVIP);
      
      
                  th1.start();
                  th2.start();
      
                  try{
                  th1.join();
                  th2.join();
      
                  }
                 catch(InterruptedException e)
                 {
                   System.out.println(e);
                 }
                  
                 finally
                 {
                     b= (Cinema.bookTicketHall & Cinema.bookTicketUser);
                 }
                 
                 break;
                
                }   
             }
           }
            if(d==0)
            {
                b=false;
                return b;
            }
            
            break;
           }
     }
     }
     return b;
 }
    
    
    
    
    
 


 public static boolean cancelTicketUser(int id,int seatNumber ,String password)
    {
        boolean b=false;
        ArrayList<User>tempUsers=new ArrayList<>();
        tempUsers=Cinema.readUsersFile();
        
        for(User temp:tempUsers)
        {
            if(temp.getPassword().equals(password))
            {
               if(temp.hm!=null)
               {
                  for(Map.Entry<Movie,ArrayList<Ticket>> entry:temp.hm.entrySet())
                  {
                      if(entry.getKey().getID()==id)
                      {
                         if(entry.getValue().size()>1)
                         {
                            for(Ticket t:entry.getValue())
                            {
                                if(t.getSeatNumber()==seatNumber)
                                {
                                   b=true;
                                   entry.getValue().remove(t);
                                   break;
                                }
                            }
                            break;
                          }
                         
                         
                         else
                         {
                             if(entry.getValue().get(0).getSeatNumber()==seatNumber)
                             {
                                 b=true;
                                 temp.hm.clear();
                                 break;
                             }
                         }
                         break;
                      }
                  }
                  break;
               }
               break;
            }
            
        }
        
        if(b)
        Cinema.writeUsersFile(tempUsers);
        
        return b;
    }
 
 
 
 
 
 
 
 
 
 public static boolean AddSeat(int id,int seatNumber)
    {
        boolean b=false;
        boolean c=true;
        String idString=Integer.toString(id);
        String hallID="Hall".concat(Character.toString(idString.charAt(0)));
        ArrayList<Movie>tempMovies=new ArrayList<Movie>();
        tempMovies=Cinema.readMoviesHallFile(hallID);
        for(Movie temp:tempMovies)
        {
            if(id==temp.getID())
            {
                for(int number:temp.seats)
                {
                    if(number==seatNumber)
                    {
                        return b;
                    }
                }
                if(c)
                {
                    b=true;
                    temp.seats.add((Integer)seatNumber);
                    Collections.sort(temp.seats);
                    temp.setAvailableSeats(temp.seats.size());
                    Cinema.writeMoviesHallFile(hallID, tempMovies);
                    return b;
                }
                
            }
        }
       
        
        return b;
    } 
 
 













    
    
    
    
public boolean cancelTicket(int id,int seatNumber,String password)
 {
     boolean b=false;
     if(seatNumber>0 && seatNumber<=100)
     {
         
         Cancel_Ticket_User_Thread th1=new Cancel_Ticket_User_Thread(id,seatNumber,password);
         Cancel_Ticket_Hall_Thread th2=new Cancel_Ticket_Hall_Thread(id,seatNumber);
         
         
         th1.start();
         th2.start();
         try{
             th1.join();
             th2.join();
         }
         catch(InterruptedException e)
         {
             System.out.println(e);
         }
         finally{
             b=(Cinema.cancelTicketHall & Cinema.cancelTicketUser);
         }
     }
     return b;
     
 }    
    
       
        
}
    
