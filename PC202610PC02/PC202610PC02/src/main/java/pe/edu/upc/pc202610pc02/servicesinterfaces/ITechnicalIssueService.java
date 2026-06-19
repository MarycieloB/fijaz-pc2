package pe.edu.upc.pc202610pc02.servicesinterfaces;

import pe.edu.upc.pc202610pc02.entities.TechnicalIssue;

import java.util.List;
import java.util.Optional;

public interface ITechnicalIssueService {
    public List<TechnicalIssue> list();
    public TechnicalIssue insert(TechnicalIssue t);
    public Optional<TechnicalIssue> listId(int id);
    public void update(TechnicalIssue t);
    public void delete(int id);
}
