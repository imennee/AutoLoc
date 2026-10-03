package tn.esprit.autoloc.domaine;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private LocalDate dateSignature;
    private Double montantTotal;
    private Boolean valide;
    @OneToOne
    Reservation reservation;
    @OneToMany(mappedBy ="contrat",cascade = CascadeType.ALL)
    List<Paiment> plist= new ArrayList<>();
}