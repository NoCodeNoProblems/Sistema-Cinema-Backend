package app.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "diretor")
public class Diretor {


    @Id
    @Column(name = "codigo_diretor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter private Long id;

    @Column(name = "nome")
    @Getter @Setter private String nome;

}
