package tn.esprit.autoloc.domaine;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;
    @OneToMany(mappedBy ="agence" )
    private List<Employe> pem=new ArrayList<>();
    @OneToMany(mappedBy = "agc")
    private List<Vehicule> vhs=new ArrayList<>();



}
