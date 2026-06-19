package pe.edu.upc.pc202610pc02.servicesinterfaces;

import pe.edu.upc.pc202610pc02.entities.SupportTicket;
import pe.edu.upc.pc202610pc02.entities.TechnicalIssue;

import java.util.List;
import java.util.Optional;

public interface ISupportTicketService {
    public List<SupportTicket> list();
    public SupportTicket insert(SupportTicket s);
    public Optional<SupportTicket> listId(int id);
    public void update(SupportTicket s);
    public void delete(int id);
}
