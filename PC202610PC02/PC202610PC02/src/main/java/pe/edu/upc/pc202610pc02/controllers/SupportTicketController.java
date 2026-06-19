package pe.edu.upc.pc202610pc02.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pc202610pc02.dtos.SupportTicketDTO;
import pe.edu.upc.pc202610pc02.entities.SupportTicket;
import pe.edu.upc.pc202610pc02.servicesinterfaces.ISupportTicketService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api-tickets")
public class SupportTicketController {
    @Autowired
    private ISupportTicketService aS;

    @GetMapping("/lista")
    public ResponseEntity<List<SupportTicketDTO>> listar() {
        ModelMapper m = new ModelMapper();

        List<SupportTicketDTO> lista = aS.list()
                .stream()
                .map(y -> m.map(y, SupportTicketDTO.class))
                .collect(Collectors.toList());

        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(lista);
    }
    @PostMapping("/nuevo")
    public ResponseEntity<?> registrar(@RequestBody SupportTicketDTO dto){

        ModelMapper m=new ModelMapper();
        SupportTicket t=m.map(dto, SupportTicket.class);
        SupportTicket tic= aS.insert(t);
        SupportTicketDTO responseDTO=m.map(tic,SupportTicketDTO.class);
        return  ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable int id) {
        ModelMapper m = new ModelMapper();
        Optional<SupportTicket> ti = aS.listId(id);

        if (ti.isPresent()) {
            SupportTicketDTO dto = m.map(ti.get(), SupportTicketDTO.class);
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No encontrado");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable int id) {
        Optional<SupportTicket> ticket = aS.listId(id);

        if (ticket.isPresent()) {
            aS.delete(id);
            return ResponseEntity.ok("Eliminado correctamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No encontrado");
        }
    }


}
