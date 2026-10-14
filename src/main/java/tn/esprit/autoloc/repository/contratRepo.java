package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domaine.Contrat;
@Repository
public interface contratRepo extends JpaRepository<Contrat,Long> {
}
