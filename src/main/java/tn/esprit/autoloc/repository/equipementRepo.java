package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domaine.Equipement;
@Repository
public interface equipementRepo extends JpaRepository<Equipement,Long> {

}
