package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domaine.Maintenance;
@Repository
public interface maintenanceRepo extends JpaRepository<Maintenance,Long> {
}
