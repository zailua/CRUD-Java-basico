package Curso;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private  String telefone;
	private String dataNasc;
	private Date dataCad;
	private Date dataAlt;
	
	
	
	

	public Pessoa() {
	}

	

	
	
	
	public Pessoa(String nome, String telefone, String dataNasc, Date dataCad, Date dataAlt) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
		this.dataCad = dataCad;
		this.dataAlt = dataAlt;
	
	}






	public Date getDataCad() {
		return dataCad;
	}






	public void setDataCad(Date dataCad) {
		this.dataCad = dataCad;
	}






	public Date getDataAlt() {
		return dataAlt;
	}






	public void setDataAlt(Date dataAlt) {
		this.dataAlt = dataAlt;
	}






	public String getNome() {
		return nome;
	}






	public void setNome(String nome) {
		this.nome = nome;
	}






	public String getTelefone() {
		return telefone;
	}






	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}






	public String getDataNasc() {
		return dataNasc;
	}






	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}











	public String mostrarPessoa() {
		return  "\n+---------------------------------------------------------------+" + 
				"\n Nome: " + nome + 
			    "\n+---------------------------------------------------------------+" + 
				 "\n Telefone: "+ telefone + 
				 "\n+---------------------------------------------------------------+"+
				 "\n Data de Nascimento: " + dataNasc + 
				 "\n+---------------------------------------------------------------+"+
				 "\n Data de Cadastro: " + dataCad +
				 "\n+---------------------------------------------------------------+"+
				 "\n Data da última alteração: " + dataAlt + "         |"+
				 "\n|===============================================================|";
	}

	
	
	
	
	
	
	
	
	
public class Aluno extends Pessoa 	{
	
	public int notaFinal;


	public Aluno(String nome, String telefone, String dataNasc, Date dataCad, Date dataAlt, int notaFinal) {
		super (nome,telefone,dataNasc,dataCad,dataAlt);
		this.notaFinal = notaFinal;
		
	}
	
	
	
	public Aluno() {
		
	}



	public int getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	
	public String mostrarAluno() {
		return  "\n+---------------------------------------------------------------+" + 
				"\n Nome: " + nome + 
			    "\n+---------------------------------------------------------------+" + 
				 "\n Telefone: "+ telefone + 
				 "\n+---------------------------------------------------------------+"+
				 "\n Data de Nascimento: " + dataNasc + 
				 "\n+---------------------------------------------------------------+"+
				 "\n Nota Final: "  + notaFinal +
				 "\n+---------------------------------------------------------------+"+
				 "\n Data de Cadastro: " + dataCad +
				 "\n+---------------------------------------------------------------+"+
				 "\n Data da última alteração: " + dataAlt + "         |"+
				 "\n|===============================================================|";
		
				 
				 
				 
				 
		
	}



	
	
	
	}





}
	
	
	


