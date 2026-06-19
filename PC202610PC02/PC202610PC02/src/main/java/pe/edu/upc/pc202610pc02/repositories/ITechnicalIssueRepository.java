package pe.edu.upc.pc202610pc02.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pc202610pc02.entities.TechnicalIssue;
@Repository
public interface ITechnicalIssueRepository extends JpaRepository<TechnicalIssue,Integer> {
}
