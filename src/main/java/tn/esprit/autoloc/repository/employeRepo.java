package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domaine.Employe;
@Repository
public interface employeRepo extends JpaRepository<Employe,Long> {
}
