package Saipos.TesteCode.repositorio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Saipos.TesteCode.model.Postagem;

@Repository
public interface PostagemRepositorio extends JpaRepository<Postagem, Long>{
	
	public List<Postagem> findAllByNomeContainingIgnoreCase (String nome);
	
}