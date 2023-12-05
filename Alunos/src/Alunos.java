
public class Alunos implements Comparable<Alunos>{
	
	@Override
	public String toString() {
		return "Alunos [nome=" + nome + ", curso=" + curso + ", sala=" + sala + ", nota=" + nota + "]";
	}

	private String nome;
	private String curso;
	private String sala;
	private double nota;
	
	public Alunos(String nome, String curso, double nota) {
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;
	}
	
	public Alunos(String nome,String curso, double nota, String sala) {
		this(nome,curso,nota);
		this.sala = sala;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getCurso(){
		return curso;
	}
	
	public double getNota(){
		return nota;
	}
	
	public String getSala(){
		return sala;
	}
	
	public Integer compareto(Alunos aluno){
		return this.nome.compareTo(aluno.getNome());
	}

	@Override
	public int compareTo(Alunos o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
