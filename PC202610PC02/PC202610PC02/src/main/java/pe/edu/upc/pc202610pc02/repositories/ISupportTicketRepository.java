package pe.edu.upc.pc202610pc02.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pc202610pc02.entities.SupportTicket;

@Repository
public interface ISupportTicketRepository extends JpaRepository<SupportTicket,Integer> {
}
