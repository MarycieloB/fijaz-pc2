package pe.edu.upc.pc202610pc02.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 import pe.edu.upc.pc202610pc02.dtos.TechnicalIssueDTO;
 import pe.edu.upc.pc202610pc02.entities.TechnicalIssue;
 import pe.edu.upc.pc202610pc02.servicesinterfaces.ITechnicalIssueService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api-issues")
public class TechnicalIssueController {
    @Autowired
    private ITechnicalIssueService tS;

    @GetMapping("/lista")
    public ResponseEntity<List<TechnicalIssueDTO>> listar() {
        ModelMapper m = new ModelMapper();

        List<TechnicalIssueDTO> lista = tS.list()
                .stream()
                .map(y -> m.map(y, TechnicalIssueDTO.class))
                .collect(Collectors.toList());

        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(lista);
    }
    @PostMapping("/nuevo")
    public ResponseEntity<?> registrar(@RequestBody TechnicalIssueDTO dto){

        ModelMapper m=new ModelMapper();
        TechnicalIssue t=m.map(dto, TechnicalIssue.class);
        TechnicalIssue iss= tS.insert(t);
        TechnicalIssueDTO responseDTO=m.map(iss,TechnicalIssueDTO.class);
        return  ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable int id) {
        ModelMapper m = new ModelMapper();
        Optional<TechnicalIssue> ts = tS.listId(id);

        if (ts.isPresent()) {
            TechnicalIssueDTO dto = m.map(ts.get(), TechnicalIssueDTO.class);
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No encontrado");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable int id) {
        Optional<TechnicalIssue> ti = tS.listId(id);

        if (ti.isPresent()) {
            tS.delete(id);
            return ResponseEntity.ok("Eliminado correctamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No encontrado");
        }
    }


}
