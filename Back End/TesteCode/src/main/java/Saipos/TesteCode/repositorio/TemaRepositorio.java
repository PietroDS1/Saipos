package Saipos.TesteCode.repositorio;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Saipos.TesteCode.model.Tema;
@Repository
public interface TemaRepositorio extends JpaRepository<Tema, Long>{
	
	public List<Tema> findAllByDescrica1ContainingIgnoreCase(String descrica1);
	
	public Optional<Tema> findByDescrica1ContainingIgnoreCase (String descrica1);
    
    public Tema findByDescrica1(String descrica1);
	
}