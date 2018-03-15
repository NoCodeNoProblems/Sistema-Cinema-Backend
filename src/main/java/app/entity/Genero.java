package app.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "genero")
public class Genero {

    @Id
    @Column(name = "codigo_genero")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter private Long id;

    @Column(name = "nome")
    @Getter @Setter private String nome;

}
