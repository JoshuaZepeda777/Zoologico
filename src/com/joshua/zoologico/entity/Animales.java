package com.joshua.zoologico.entity;

/**
 * @author joshu clase que representa una entidad de un objeto de tipo Zoologico
 */
public class Animales {
	/**
	 * Atributo que representa el id del tipo del zoologico
	 */
	private int Cod_Animal;
	/**
	 * atributo que representa la descripcion del cod de anumal
	 */
	private String Nom_Animal;
	/**
	 * atributo que representa el nombre del animal
	 */
	private String Especie;
	/**
	 * atributo que representa la especie del anial
	 */
	private String Habitat;
	/**
	 * atributo que representa el habitad del animal
	 */
	private String Alimento;

	/**
	 * atributo que representa el alimento del aninal
	 */
	/**
	 * @return the cod_Animal
	 */
	public int getCod_Animal() {
		return Cod_Animal;
	}

	/**
	 * @param cod_Animal the cod_Animal to set
	 */
	public void setCod_Animal(int cod_Animal) {
		Cod_Animal = cod_Animal;
	}

	/**
	 * @return the nom_Animal
	 */
	public String getNom_Animal() {
		return Nom_Animal;
	}

	/**
	 * @param nom_Animal the nom_Animal to set
	 */
	public void setNom_Animal(String nom_Animal) {
		Nom_Animal = nom_Animal;
	}

	/**
	 * @return the especie
	 */
	public String getEspecie() {
		return Especie;
	}

	/**
	 * @param especie the especie to set
	 */
	public void setEspecie(String especie) {
		Especie = especie;
	}

	/**
	 * @return the habitat
	 */
	public String getHabitat() {
		return Habitat;
	}

	/**
	 * @param habitat the habitat to set
	 */
	public void setHabitat(String habitat) {
		Habitat = habitat;
	}

	/**
	 * @return the alimento
	 */
	public String getAlimento() {
		return Alimento;
	}

	/**
	 * @param alimento the alimento to set
	 */
	public void setAlimento(String alimento) {
		Alimento = alimento;
	}

}
