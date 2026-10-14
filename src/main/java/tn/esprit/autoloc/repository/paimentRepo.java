package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domaine.Paiment;

@Repository
public interface paimentRepo extends JpaRepository<Paiment,Long> {
}
