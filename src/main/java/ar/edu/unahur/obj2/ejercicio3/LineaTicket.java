package ar.edu.unahur.obj2.ejercicio3;

import java.util.ArrayList;

public class LineaTicket {
    public ArrayList<Ticket> Tickets = new ArrayList();

    public void agregarTicket(Ticket nuevoTicket){
        this.Tickets.add(nuevoTicket);

    }
    public ArrayList<Ticket> getTickets(){
        return Tickets;
    }

}
