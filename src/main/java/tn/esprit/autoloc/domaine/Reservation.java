package tn.esprit.autoloc.domaine;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDate dateDebut;
    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;
    @OneToOne(mappedBy = "reservation")
    Contrat contrat;
    @ManyToOne
    Vehicule vhs;
    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations;
}