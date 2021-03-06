package app.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "genero")
public class Genero implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codigo_genero")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter private Long id;

    @Column(name = "nome")
    @Getter @Setter private String nome;

}
