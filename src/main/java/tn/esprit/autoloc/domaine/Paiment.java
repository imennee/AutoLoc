package tn.esprit.autoloc.domaine;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paiment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPaiment;
    BigDecimal montant;
    LocalDate datePaiment;
    ModePaiment modePaiment;
    @ManyToOne
    Contrat contrat;
}
