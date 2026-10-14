package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domaine.Reservation;

@Repository
public interface reservationRepo extends JpaRepository<Reservation,Long> {
}
