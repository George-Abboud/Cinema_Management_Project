/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming3;

public class Cancel_Ticket_User_Thread extends Thread implements java.io.Serializable{
    
    private int id;
    private int seatNumber;
    private String password;

    
    
    
    
    public Cancel_Ticket_User_Thread(int id, int seatNumber, String password) 
    {
        this.id = id;
        this.seatNumber = seatNumber;
        this.password = password;
    }
    
    
    
    
    
    
    @Override
    public void run()
    {
        Cinema.cancelTicketUser=Cinema.cancelTicketUser(id, seatNumber, password);
    }
    
}
