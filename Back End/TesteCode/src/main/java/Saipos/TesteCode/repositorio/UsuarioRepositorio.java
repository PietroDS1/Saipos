package Saipos.TesteCode.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Saipos.TesteCode.model.Usuario;
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
	
	public Optional <Usuario> findByUsuario(String usuario);	
	public List<Usuario> findAllByNomeContainingIgnoreCase (String nome);
	public Usuario findByNome(String nome);

}