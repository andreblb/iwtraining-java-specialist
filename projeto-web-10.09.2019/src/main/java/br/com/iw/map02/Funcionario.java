package br.com.iw.map02;

import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	@ElementCollection
	private Collection<String> telefones;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(Collection<String> telefones) {
		this.telefones = telefones;
	}
	
	

}
