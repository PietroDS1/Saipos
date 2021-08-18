package Saipos.TesteCode.model;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "tb_temas")
public class Tema {
		@Id	
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotNull
		private String descrica1;
		
		@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
	
		private List<Postagem> postagem;
			
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getDescrica1() {
			return descrica1;
		}

		public void setDescrica1(String descrica1) {
			this.descrica1 = descrica1;
		}
		
		public List<Postagem> getPostagem() {
			return postagem;
		}

		public void setPostagem(List<Postagem> postagem) {
			this.postagem = postagem;
		}
}
