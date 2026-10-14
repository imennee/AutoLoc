package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domaine.Vehicule;
@Repository
public interface vehiculerepository extends JpaRepository<Vehicule,Long> {



}
