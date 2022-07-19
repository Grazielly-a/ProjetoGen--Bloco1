package Bloco1;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaComunitaria {

	public static void main(String[] args) {
		int l;
		Scanner leia = new Scanner(System.in);
		Biblioteca b = new Biblioteca ("nome","autor", "editora", "genero", 0);
		
		
		ArrayList<String> estoque = new ArrayList<String>();
		
		ArrayList<String> estoquel = new ArrayList<String>();
		
		
		estoquel.add("\n ====ROMANCES====");		
		estoquel.add("\nUm dia (David Nicholls)");
		estoquel.add("\nSimplesmente acontece (Cecelia Ahern)");
		estoquel.add("\nComo Eu Era Antes de Você (Jojo Moyes)");
		estoquel.add("\nPs: Eu Te Amo (Cecelia Ahern)");
		
		estoquel.add("\n ====SUSPENSE====");
		estoquel.add("\nMorte no Nilo (Agatha Christie)");
		estoquel.add("\nOs Homens Que Não Amavam As Mulheres (Stieg Larsson)");
		estoquel.add("\nIlha do Medo (Dennis Lehane)");
		
		estoquel.add ("\n====LITERATURA====");
		estoquel.add("\nDom Casmurro ( Machado de Assis)");
		estoquel.add("\nO Cortiço ( Aluísio Azevedo)");
		estoquel.add("\nMemórias Póstumas de Brás Cubas(Machado de Assis)");
		estoquel.add("\nA moreninha (Joaquim Manuel de Macedo)");
		
		//Iniciando o Sistema da Biblioteca Comunitaria
		
		System.out.println("=======BIBLIOTECA COMUNITÁRIA=======");
		System.out.println();
		System.out.println("Bem-vinde(s) ao nosso sistema.");
		System.out.println();
   
		System.out.println("Digite seu nome: ");
		String usuario = leia.nextLine();
		System.out.println("Digite seu e-mail: ");
		String Email = leia.nextLine();
		
		//Menu
		
		do 
		{
						
			System.out.println();
			System.out.println("=======MENU=======");

			System.out.println("\n 1 - Deseja doar livro \n 2 - Deseja retirar um livro \n 3 - Deseja trocar um livro \n 4 - Deseja ver nosso estoque \n 0 - Deseja encerrar o programa ");
			System.out.println("\n Digite a sua opção: ");
			l = leia.nextInt();
			
			switch(l)

			{
			case 1: //DOAÇÃO

				leia.nextLine(); //NEXTLINE - USOU PARA LIMPAR
				System.out.println("\n Digite o nome do livro que deseja doar: ");
				String livros = leia.nextLine();// NEXTLINE - PARA LER UMA COISA TIPO STRING
				System.out.println("\n Qual o gênero do seu livro?");
				String genero = leia.nextLine();
				System.out.println("\n Qual o autor do seu livro?");
				String autor = leia.nextLine();
				System.out.println("\n Qual a editora do seu livro?");
				String editora = leia.nextLine();
				System.out.println("\n Escreva um código para o seu livro: ");
				int codigoDoLivro = leia.nextInt();
				estoquel.add(livros); //USUARIO VAI ESCREVER E AQ VAI ADICIONAR AO ESTOQUE

				leia.nextLine(); //NEXTLINE - USOU PARA LIMPAR

				//Mensagem ao usuário
				
				System.out.println("\n PARABÉNS, "+usuario+"."+" Você acabou de doar um livro para nossa Biblioteca. \n O livro: " + livros +"\n Autor:" + autor+"\n Gênero: "+genero+"\n Editora: "+editora+"\n Código do Livro: "+codigoDoLivro);   
				System.out.println("\n Enviamos um comprovante para o seu e-mail: "+ Email+"!");
				
				break;
				
			case 2 : //RETIRAR
				
				System.out.println(estoquel); //MOSTRAR O ACERVO DE LIVROS PARA VISUALIZAÇÃO
				leia.nextLine(); 

				System.out.println("\n Digite o nome do livro que deseja retirar. ");
				String livro = leia.nextLine();

				/*if(estoquel.contains(livro)) // VER SE EXISTE DETERMINADO LIVRO PARA REMOVER
				{
					estoquel.remove(livro);
				}*/
				
			// ----- MENSAGEM	
				System.out.println("\n "+ usuario+ ","+ " Produto removido com sucesso!!"+ "\n Você retirou o livro :" + livro + "\n *****Boa Leitura****");
				System.out.println("\n Enviamos um comprovante para o seu e-mail:" + Email+"!");
				
				break;

				
			case 3: //TROCAR
				//QUAL PRODUTO VAI TIRAR E QUAL VAI COLOCAR

				leia.nextLine();
				System.out.println(estoquel); //MOSTRAR O ESTOQUE DE LIVROS PARA VISUALIZAÇÃO
				leia.nextLine(); 
				System.out.println("\n Digite o nome do livro que você deseja do estoque. ");
				String verifica = leia.nextLine();
				System.out.println("\n Digite o nome do livro que você deseja trocar.  ");
				String novo = leia.nextLine();
				estoquel.add(novo);

				//VERIFICA SE TEM O PRODUTO 

				/*if(estoquel.contains(verifica)) //CONTAINS - VER SE EXISTE DETERMINADO PRODUTO PARA REMOVER
				{
					estoquel.remove(verifica);
					
				}
				else//SE NÃO TIVER
				{
					System.out.println("\n Produto Indisponivel no momento!!");
				}*/
				
				// MENSAGEM AO USUARIO
				
				System.out.println("\n "+ usuario +","+ "sua troca foi realizada!!! \n Você realizou a troca do livro:" + novo + "\n Pelo livro :" + verifica);
                System.out.println("\n Enviamos um comprovante para o seu e-mail:" + Email);
                
                //MOSTRAR A LISTA DNV PARA VER SE ATUALIZOU
                System.out.println(estoquel); 
                
				break;
				
				case 4: //MOSTRAR

				System.out.println("\n Os livros no estoque são: ");
				
				System.out.print(estoquel); //MOSTRAR ESTOQUE
				
				
				
				break;

				case 0: 
				System.out.println("\n Programa Finalizado!!");
				System.out.println();
				System.out.println("\n Volte sempre!");
				break;

				default : //EXEÇÃO
					System.out.println("Erro! Opção Indisponivel");
			}
		}
		while(l!=0); //ENQUANTO DIFERENTE DE 0 VAI SAIR
	}		

}
