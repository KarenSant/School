package br.com.alura.school.matricula;

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
public class Matricula {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Size(max=20)
	    @NotBlank
	    @Column(nullable = false, unique = true)
	    private String username;
	    
	    public Matricula () {
	    	
	    }
	    Matricula(String username){
	    	this.username = username;
	    }
	    
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}
		
		
		@Override
		public int hashCode() {
			return Objects.hash(id, username);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Matricula other = (Matricula) obj;
			return Objects.equals(id, other.id) && Objects.equals(username, other.username);
		}

		@Override
		public String toString() {
			return "Matricula [id=" + id + ", username=" + username + "]";
		}
	    
	    

}
