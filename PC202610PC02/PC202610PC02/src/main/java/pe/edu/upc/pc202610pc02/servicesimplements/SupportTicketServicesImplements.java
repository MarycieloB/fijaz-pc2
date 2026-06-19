package pe.edu.upc.pc202610pc02.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pc202610pc02.entities.SupportTicket;
import pe.edu.upc.pc202610pc02.entities.TechnicalIssue;
import pe.edu.upc.pc202610pc02.repositories.ISupportTicketRepository;
import pe.edu.upc.pc202610pc02.servicesinterfaces.ISupportTicketService;

import java.util.List;
import java.util.Optional;

@Service
public class SupportTicketServicesImplements implements ISupportTicketService {
    @Autowired
    private ISupportTicketRepository sR;

    @Override
    public List<SupportTicket> list() {
        return sR.findAll();
    }

    @Override
    public SupportTicket insert(SupportTicket s) {
        return sR.save(s);
    }

    @Override
    public Optional<SupportTicket> listId(int id) {
        return sR.findById(id);
    }


    @Override
    public void update(SupportTicket s) {
        sR.save(s);
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }
}
