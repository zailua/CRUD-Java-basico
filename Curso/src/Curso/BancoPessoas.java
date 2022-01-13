package Curso;

import java.util.ArrayList;

import Curso.Pessoa.Aluno;

public class BancoPessoas {
	
	
		private static ArrayList<Pessoa> listapessoas = new ArrayList<>();
		private static ArrayList<Aluno> listaalunos = new ArrayList<>();

		public static ArrayList<Pessoa> getListapessoas() {
			return listapessoas;
		}

		static public void addPessoa (Pessoa p) {
			listapessoas.add(p);
		}

		static public String listarpessoas () {
			String saida = " ";
			int i = 1;
			
			for (Pessoa p : listapessoas) {
				saida +="\n+_______________________________________________________________+"+ 
						"\n                           Pessoa Nº "+(i++)+"                  "+
						"\n+_______________________________________________________________+";
				saida += p.mostrarPessoa();
				
			}
			
			return saida;
		}
		
		static public boolean removerPessoa(String nome) {
			for (Pessoa p : listapessoas) {
				if (p.getNome().equalsIgnoreCase(nome)) {
					listapessoas.remove(p);
					return true;
				}
			}
			return false;
			
		}
		
		//Alunos
		
		public static ArrayList<Aluno> getListaalunos() {
			return listaalunos;
		}
		
		static public void addAluno (Aluno a) {
			listaalunos.add(a);
		}
		
		static public String listaralunos () {
			String saida = " ";
			int i = 1;
			
			for (Aluno a : listaalunos) {
				saida +="\n+_______________________________________________________________+"+ 
						"\n                           Aluno Nº "+(i++)+"                    "+
						"\n+_______________________________________________________________+";
				saida += a.mostrarAluno();
				
			}
			
			return saida;
		}
		static public boolean removerAluno(String nome) {
			for (Aluno a : listaalunos) {
				if (a.getNome().equalsIgnoreCase(nome)) {
					listaalunos.remove(a);
					return true;
				}
			}
			return false;
			
		}
		
}
