/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Model.Cliente;
import Model.Empresa;
import Model.Funcionario;
import Model.Impressao;
import java.util.*;

/**
 *
 * @author Gabriel Mattos
 */
public class Sistema
{
    public static List<Funcionario> listaFunci = new ArrayList<>();
    
    static
    {
        listaFunci.add(new Funcionario("Gabas"));
        listaFunci.add(new Funcionario("Maras"));
        listaFunci.add(new Funcionario("Lulu"));
        listaFunci.add(new Funcionario("Ugas"));
    }
    public static void imprimeFuncionarios()
    {
        for(Funcionario func : listaFunci)
        {
            System.out.println(func);
        }
    }
    
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        Cliente emp = new Empresa("opa");
        System.out.println(emp.getClass().getName());
        
        String acao;
        
        do
        {
            System.out.println("A-Cadastrar funcionário.\n" +
                            "B-Selecionar funcionário.\n" +
                            "C-Lista de impressão.\n" +
                            "D-Sair.");
                    
            acao=teclado.nextLine().toLowerCase();
            
            switch(acao)
            {
                case "a":
                    System.out.println("Digite o nome do novo funcionario:");
                    
                    listaFunci.add(new Funcionario(teclado.nextLine()));
                    break;

                case "b":
                    imprimeFuncionarios();
                    System.out.println("Identificacao do funcionario:");
                    int ident = teclado.nextInt();
                    
                    for(Funcionario func : listaFunci)
                    {
                        if(func.getNumIndentificacao()==ident)
                        {
                            new TelaFuncionario(func);
                        }
                    }
                    
                    break;

                case "c":
                    Impressao.imprimeImpressoes();
                    break;

                case "d":
                    break;
                    
                default:
                    System.out.println("Acao inválida. Digite novamente.");
                    break;
            }
        }
        while(acao!="d");
        
        
    }
    
    
}
