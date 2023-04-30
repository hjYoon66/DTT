package carpe.dtt.service;

import carpe.dtt.entity.Table;
import carpe.dtt.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TableService {
    @Autowired
    private TableRepository tableRepository;

    public Integer getStatusById(Long id){
        Optional<Table> optionalTable = tableRepository.findById(id);
        if (optionalTable.isPresent()) {
            Table table = optionalTable.get();
            return table.getStatus();
        } else {
            throw new RuntimeException("Table not found with id " + id);
        }
    }


}
