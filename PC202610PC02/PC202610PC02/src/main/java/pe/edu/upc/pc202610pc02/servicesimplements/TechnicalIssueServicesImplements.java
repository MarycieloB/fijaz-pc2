package pe.edu.upc.pc202610pc02.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pc202610pc02.entities.TechnicalIssue;
import pe.edu.upc.pc202610pc02.repositories.ITechnicalIssueRepository;
import pe.edu.upc.pc202610pc02.servicesinterfaces.ITechnicalIssueService;

import java.util.List;
import java.util.Optional;

@Service
public class TechnicalIssueServicesImplements implements ITechnicalIssueService {
    @Autowired
    private ITechnicalIssueRepository tR;

    @Override
    public List<TechnicalIssue> list() {
        return tR.findAll();
    }

    @Override
    public TechnicalIssue insert(TechnicalIssue t) {
        return tR.save(t);
    }

    @Override
    public Optional<TechnicalIssue> listId(int id) {
        return tR.findById(id);
    }

    @Override
    public void update(TechnicalIssue t) {
        tR.save(t);
    }

    @Override
    public void delete(int id) {
        tR.deleteById(id);
    }
}
