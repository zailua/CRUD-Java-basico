package Curso;



import java.util.Date;
import java.util.Scanner;

import Curso.Pessoa.Aluno;


public class main {

	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		Scanner sString = new Scanner(System.in);
		
		
		
		Pessoa objPessoa;
		Aluno objAluno;
		String nome, telefone, dataNasc;
		Date dataCad = null, dataAlt = null;
		
		int notaFinal;
		
		Boolean run = true;
		
		while (run) {
		System.out.println("+---------------------------------------------------------------+");
		System.out.println("|                         Bem Vindo                             |");
		System.out.println("+===============================================================+");
		System.out.println("|[1] Cadastrar Pessoa ou Aluno                                  |");
		System.out.println("+===============================================================+");
		System.out.println("|[2] Mostrar todas Pessoas cadastradas                          |");
		System.out.println("+===============================================================+");
		System.out.println("|[3] Mostrar todos Alunos cadastrados                           |");
		System.out.println("+===============================================================+");
		System.out.println("|[4] Excluir Pessoa                                             |");
		System.out.println("+===============================================================+");
		System.out.println("|[5] Excluir Aluno                                              |");
		System.out.println("+===============================================================+");
		System.out.println("|[6] Atualizar Dados de Pessoa                                  |");
		System.out.println("+===============================================================+");
		System.out.println("|[7] Atualizar Dados de Aluno                                   |");
		System.out.println("+===============================================================+");
		System.out.println("|[8] SAIR                                                       |");
		System.out.println("+===============================================================+");
		System.out.println("|                    Digite a Opção numérica                    |");
		System.out.println("+---------------------------------------------------------------+");
		int op = s.nextInt();
		
		switch (op) {
			case 1: {
				System.out.println("Digite o Nome: ");
				nome = sString.nextLine();
				System.out.println("Digite o Telefone: \"(xx) xxxx-xxxx\"");
				telefone = sString.nextLine();
				System.out.println("Digite a Data de Nascimento: \"xx/xx/xxxx\"");
				dataNasc = sString.nextLine();
				System.out.println("Digite a Nota final em caso de Aluno, caso não for Aluno digite -1 para cadastrar Pessoa");
				notaFinal = s.nextInt();
				dataCad = new Date();
				dataAlt = dataCad;
				if(!(notaFinal == -1)) {
					objAluno = new Pessoa(nome,telefone,dataNasc,dataCad,dataAlt).new Aluno(nome,telefone,dataNasc,dataCad,dataAlt,notaFinal);
					BancoPessoas.addAluno(objAluno);
					
				}else {
				
				objPessoa = new Pessoa(nome,telefone,dataNasc,dataCad,dataAlt);
				
				BancoPessoas.addPessoa(objPessoa);}
			
				break;
				
			}
			case 2: {
				System.out.println("+===============================================================+");
				System.out.println("|                                                               |");		
				System.out.println("|                    Listar Pessoas cadastradas                 |");
				System.out.println("|                                                               |");
				System.out.println("+===============================================================+");
				System.out.println(BancoPessoas.listarpessoas());
				 break;
			}
				
				
				
							
			
			case 3: {
				System.out.println("+===============================================================+");
				System.out.println("|                                                               |");		
				System.out.println("|                    Listar Alunos cadastrados                  |");
				System.out.println("|                                                               |");
				System.out.println("+===============================================================+");
				System.out.println(BancoPessoas.listaralunos());
				
				break;
			}
			case 4: {
				System.out.println("+===============================================================+");
				System.out.println("|                                                               |");		
				System.out.println("|                         Excluir Pessoa                        |");
				System.out.println("|                                                               |");
				System.out.println("+===============================================================+");

				
				System.out.println("Digite o Nome Completo da Pessoa: ");
				nome = s.next();
				if (!(BancoPessoas.getListapessoas().isEmpty())) {
					if(BancoPessoas.removerPessoa(nome)) {
						System.out.println("+===============================================================+");
						System.out.println("|                                                               |");		
						System.out.println("|                   Pessoa removida com Sucesso!                |");
						System.out.println("|                                                               |");		
						System.out.println("+===============================================================+");
						
					}else {
						System.out.println("+===============================================================+");
						System.out.println("|                                                               |");		
						System.out.println("|                   Pessoa não encontrada!                      |");
						System.out.println("|                                                               |");		
						System.out.println("+===============================================================+");
					}
					
				}else {
					
					System.out.println("+===============================================================+");
					System.out.println("|                                                               |");		
					System.out.println("|                 O banco de Pessoas está vázio!                |");
					System.out.println("|                                                               |");		
					System.out.println("+===============================================================+");
				}
				
				
				
				break;
			}
			case 5: {
				System.out.println("+===============================================================+");
				System.out.println("|                                                               |");		
				System.out.println("|                         Excluir Aluno                         |");
				System.out.println("|                                                               |");
				System.out.println("+===============================================================+");
				System.out.println("Digite o Nome Completo do Aluno: ");
				nome = sString.nextLine();
				if (!(BancoPessoas.getListaalunos().isEmpty())) {
					if(BancoPessoas.removerAluno(nome)) {
						System.out.println("+===============================================================+");
						System.out.println("|                                                               |");		
						System.out.println("|                   Aluno removido com Sucesso!                 |");
						System.out.println("|                                                               |");		
						System.out.println("+===============================================================+");
						
					}else {
						System.out.println("+===============================================================+");
						System.out.println("|                                                               |");		
						System.out.println("|                   Aluno não encontrado!                       |");
						System.out.println("|                                                               |");		
						System.out.println("+===============================================================+");
					}
					
				}else {
					System.out.println("+===============================================================+");
					System.out.println("|                                                               |");		
					System.out.println("|                 O banco de Alunos está vázio!                 |");
					System.out.println("|                                                               |");		
					System.out.println("+===============================================================+");
				}
			
				break;
			}
			case 6: {
				System.out.println("+===============================================================+");
				System.out.println("|                                                               |");		
				System.out.println("|                 Atualizar Dados de Pessoas                    |");
				System.out.println("|                                                               |");		
				System.out.println("+===============================================================+");
				System.out.println("Digite o Nome Completo da Pessoa: ");
				nome = sString.nextLine();
				if (!(BancoPessoas.getListapessoas().isEmpty())) {
					if(BancoPessoas.removerPessoa(nome)) {
						System.out.println("Digite o novo Nome: ");
						nome = sString.nextLine();
						System.out.println("Digite o Novo Telefone: \"(xx) xxxx-xxxx\"");
						telefone = sString.nextLine();
						System.out.println("Digite a nova Data de Nascimento: \"xx/xx/xxxx/\"");
						dataNasc = sString.nextLine();
						dataAlt = new Date();
						
						objPessoa = new Pessoa(nome,telefone,dataNasc,dataCad,dataAlt);
						
						BancoPessoas.addPessoa(objPessoa);
						System.out.println("+===============================================================+");
						System.out.println("|                                                               |");		
						System.out.println("|                 Dados Atualizados com Sucesso!                |");
						System.out.println("|                                                               |");
						System.out.println("+===============================================================+");
						
						
					}else {
						System.out.println("+===============================================================+");
						System.out.println("|                                                               |");		
						System.out.println("|                   Pessoa não encontrada!                      |");
						System.out.println("|                                                               |");		
						System.out.println("+===============================================================+");
					}
					
				}else {
					System.out.println("+===============================================================+");
					System.out.println("|                                                               |");		
					System.out.println("|                 O banco de Pessoas está vázio!                |");
					System.out.println("|                                                               |");		
					System.out.println("+===============================================================+");
				}
				break;
			}
			case 7: {
				System.out.println("+===============================================================+");
				System.out.println("|                                                               |");		
				System.out.println("|                 Atualizar Dados de Alunos                     |");
				System.out.println("|                                                               |");		
				System.out.println("+===============================================================+");
				System.out.println("Digite o Nome Completo do Aluno: ");
				nome = sString.nextLine();
				if (!(BancoPessoas.getListaalunos().isEmpty())) {
					if(BancoPessoas.removerAluno(nome)) {
						System.out.println("Digite o novo Nome: ");
						nome = sString.nextLine();
						System.out.println("Digite o novo Telefone: \"(xx) xxxx-xxxx\"");
						telefone = sString.nextLine();
						System.out.println("Digite a nova Data de Nascimento: \"xx/xx/xxxx/\"");
						dataNasc = sString.nextLine();
						System.out.println("Digite a nova Nota Final do Aluno: ");
						notaFinal = s.nextInt();
						dataAlt = new Date();
						
						objAluno = new Pessoa(nome,telefone,dataNasc,dataCad,dataAlt).new Aluno(nome,telefone,dataNasc,dataCad,dataAlt,notaFinal);
						
						BancoPessoas.addAluno(objAluno);
						System.out.println("+===============================================================+");
						System.out.println("|                                                               |");		
						System.out.println("|                 Dados Atualizados com Sucesso!                |");
						System.out.println("|                                                               |");
						System.out.println("+===============================================================+");
						
						
					}else {
						System.out.println("+===============================================================+");
						System.out.println("|                                                               |");		
						System.out.println("|                   Aluno não encontrado!                       |");
						System.out.println("|                                                               |");		
						System.out.println("+===============================================================+");
					}
					
				}else {
					System.out.println("+===============================================================+");
					System.out.println("|                                                               |");		
					System.out.println("|                 O banco de Alunos está vázio!                 |");
					System.out.println("|                                                               |");		
					System.out.println("+===============================================================+");
				}
				break;
			}
			
			case 8: {
				System.out.println("+===============================================================+");
				System.out.println("|                                                               |");		
				System.out.println("|               Programa Encerrado, volte sempre :3             |");
				System.out.println("|                                                               |");		
				System.out.println("+===============================================================+");
				run = false;
				break;
			}
			default: {
				System.out.println("+===============================================================+");
				System.out.println("|                                                               |");		
				System.out.println("|            [ERRO] Digite uma opção NÚMERICA válida.           |");
				System.out.println("|                                                               |");		
				System.out.println("+===============================================================+");
				
				}
				
			}
			
		}
	} 
}

		
	
		
		
		
	


