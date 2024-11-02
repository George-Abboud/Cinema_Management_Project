/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming3;

public class Cancel_Ticket_Hall_Thread extends Thread implements java.io.Serializable{
    
    private int id;
    private int seatNumber;
    

    
    
    public Cancel_Ticket_Hall_Thread(int id, int seatNumber) {
        this.id = id;
        this.seatNumber = seatNumber;
        
    }
    
    
    @Override
    public void run()
    {
        Cinema.cancelTicketHall=Cinema.AddSeat(id, seatNumber);
    }
    
}
