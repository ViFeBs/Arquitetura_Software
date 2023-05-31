package state;

public class Personagem {
    private String nome;
    private int vida;
    private State posicao = new Esperando(this);

	public Personagem(String nome, int vida) {
		this.nome = nome;
		this.vida = vida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public State getPosicao() {
		return posicao;
	}

	public void setPosicao(State posicao) {
		this.posicao = posicao;
	}

    //metodos de requisição
    public void Pular(){
        posicao.pulando();
    }

    public void Esperar(){
        posicao.esperando();
    }

    public void Abaixar(){
        posicao.abaixando();
    }

    public void Correr(){
        posicao.correndo();
    }

}
