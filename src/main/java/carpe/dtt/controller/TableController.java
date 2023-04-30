package carpe.dtt.controller;

import carpe.dtt.repository.TableRepository;
import carpe.dtt.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/table")
public class TableController {
    @Autowired
    private TableService tableService;

    @GetMapping("/{id}/status")
    public ResponseEntity<Integer> getStatusById(@PathVariable("id") long id) {
        Integer status = tableService.getStatusById(id);
        return ResponseEntity.ok(status);
    }
}
