package com.eurika.msformation.doe;

import com.eurika.msformation.Entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation,Long> {
}
