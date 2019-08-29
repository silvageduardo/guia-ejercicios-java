package ar.edu.unahur.obj2.ejercicio3;

import java.util.ArrayList;

class LineaTicket {
    public ArrayList<Ticket> Tickets;

    {
        Tickets = new ArrayList();
    }

    public void agregarTicket(Ticket nuevoTicket){
        this.Tickets.add(nuevoTicket);

    }
    public ArrayList<Ticket> getTickets(){
        return Tickets;
    }

}
