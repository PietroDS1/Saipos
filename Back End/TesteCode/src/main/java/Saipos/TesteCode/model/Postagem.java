package Saipos.TesteCode.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;

		@NotNull
		@Size(min = 5, max = 100)
		private String nome;

		@NotNull
		@Size(min = 10, max = 500)
		private String texto;

		@Temporal(TemporalType.TIMESTAMP)
		private Date data = new java.sql.Date(System.currentTimeMillis());
		
		@ManyToOne
		
		private Tema tema;
			
		@ManyToOne
		
		private Usuario usuario;
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTexto() {
			return texto;
		}

		public void setTexto(String texto) {
			this.texto = texto;
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}
		
		public Tema getTema() {
			return tema;
		}

		public void setTema(Tema tema) {
			this.tema = tema;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		
}
