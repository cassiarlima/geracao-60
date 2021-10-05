package br.com.gen60plus.gen.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Nome_Usuario nao pode estar vazio")
	@Size(min = 5, max = 20, message = "Minimo 5 caracteres maximo 20")
	@Column(name = "Nome_Usuario")
	private String username;
	
	@NotNull(message = "Senha nao pode estar vazio")
	@Size(min = 4, max = 8, message = "Minimo 4 caracteres maximo 8")
	@Column(name = "Senha")
	private String password;
	
	@NotNull(message = "Email nao pode estar vazio")
	@Size(min = 30, max = 200, message = "Minimo 30 caracteres maximo 200")
	@Column(name = "Email")
	private String email;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}