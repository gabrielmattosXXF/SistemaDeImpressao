/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Model.*;
import java.util.*;

/**
 *
 * @author Gabriel Mattos
 */
public class TelaFuncionario
{
    private Cliente cliente;
    private Funcionario funcionario;
    private Arquivo arquivo;
    private int quantidade;
    
    
    public TelaFuncionario(Funcionario func)
    {
        this.funcionario=func;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("""
                           A-Cadastrar Empresa.
                           B-Cadastrar Parceiro.
                           C-Cadastrar Pessoa.
                           D-Voltar.""");
        
        char acao=teclado.nextLine().toLowerCase().charAt(0);
        do
        {
            String nome;
            
            switch(acao)
            {
                case 'a':
                    System.out.println("Nome da empresa:");
                    nome=teclado.nextLine();
                    cliente = new Empresa(nome);
                    break;

                case 'b':
                    System.out.println("Nome do parceiro:");
                    nome=teclado.nextLine();
                    cliente = new Parceiro(nome);
                    break;

                case 'c':
                    System.out.println("Nome da Pessoa:");
                    nome=teclado.nextLine();
                    cliente = new Pessoa(nome);
                    break;

                case 'd':
                    new Sistema();
                    break;
                    
                default:
                    acao='e';
                    System.out.println("Acao inválida. Digite novamente.");
                    break;
            }
        }
        while(acao=='e');
        
        char acao2;
        do
        {
            System.out.println("""
                           A-PDF.
                           B-WORD.
                           C-IMAGEM.
                           D-Voltar.""");
            
            acao2=teclado.nextLine().toLowerCase().charAt(0);
                    
            switch(acao2)
            {
                case 'a':
                    arquivo=new PDF();
                    break;

                case 'b':
                    arquivo=new Word();
                    break;

                case 'c':
                    arquivo=new Imagens();
                    break;

                case 'd':
                    break;

                default:
                    acao2='d';
                    System.out.println("Acao inválida. Digite novamente.");
                    break;
            }
        }
        while(acao2=='d');
        
        System.out.println("Quantidade:");
        quantidade=teclado.nextInt();
        
        Impressao imp = new Impressao(cliente, funcionario, arquivo, quantidade);
        
        System.out.println("Valor a pagar: RS"+imp.getPreco());
        
        teclado.nextLine();
    }
}
