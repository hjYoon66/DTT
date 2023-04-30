package carpe.dtt.repository;

import carpe.dtt.entity.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface TableRepository extends JpaRepository<Table,Long> {
    Optional<Table> findById(Long id);
}
