package app.entity;

import javax.persistence.*;

@Entity
@Table(name = "filme")
public class Filme {

@Id
@Column(name = "codigo_filme")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "nomeBr")
private String nome_br;

@Column(name = "nomeEng")
private String nome_eng;

@Column(name = "anoLancamento")
private int ano_lancamento;

@Column(name = "sinopse")
private String sinopse;



}
