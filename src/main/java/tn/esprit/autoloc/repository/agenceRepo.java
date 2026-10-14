package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domaine.Agence;
@Repository
public interface agenceRepo extends JpaRepository<Agence,Long> {
}
