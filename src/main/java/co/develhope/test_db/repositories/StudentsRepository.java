package co.develhope.test_db.repositories;

import co.develhope.test_db.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Long> {
}

