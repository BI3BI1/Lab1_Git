/**
 * 
 */
package Lab1_git;

/**
 * @author 51301
 */

public class Utente {
	private String nome;
	private String genero;
	private int idade;
	private int peso;
	private float altura;
	
	/**
	 * @param nome
	 * @param genero
	 * @param idade
	 * @param peso
	 * @param altura
	 */
	
	public Utente(int idade, int peso, float altura) {
		super();
		this.setIdade(idade);
		this.setPeso(peso);
		this.setAltura(altura);
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", genero=" + genero + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + "]";
	}

	public void calcularIMC(int peso, int altura, int imc) {
		imc = peso/(altura*altura);
		System.out.print(imc);
	}
	
}
