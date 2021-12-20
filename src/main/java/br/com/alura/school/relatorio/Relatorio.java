package br.com.alura.school.relatorio;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Relatorio {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private String email;

	    @Size(max=20)
	    @NotBlank
	    @Column(nullable = false, unique = true)
	    private String quantidade_matriculas;
	    
	    public Relatorio () {
	    	
	    }

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getQuantidade_matriculas() {
			return quantidade_matriculas;
		}

		public void setQuantidade_matriculas(@Size(max = 20) @NotBlank String quantidade_matriculas) {
			this.quantidade_matriculas = quantidade_matriculas;
		}

		@Override
		public int hashCode() {
			return Objects.hash(email, quantidade_matriculas);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Relatorio other = (Relatorio) obj;
			return Objects.equals(email, other.email)
					&& Objects.equals(quantidade_matriculas, other.quantidade_matriculas);
		}

		@Override
		public String toString() {
			return "Relatorio [email=" + email + ", quantidade_matriculas=" + quantidade_matriculas + "]";
		}
	    
	    
	    
	    

}
