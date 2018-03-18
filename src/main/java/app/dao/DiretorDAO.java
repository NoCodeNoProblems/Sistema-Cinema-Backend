package app.dao;

import app.entity.Diretor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("DiretorDAO")
public interface DiretorDAO extends JpaRepository<Diretor, java.lang.Long> {


}
