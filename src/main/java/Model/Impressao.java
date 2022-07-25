/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.*;

/**
 *
 * @author Gabriel Mattos
 */
public class Impressao
{
    private static List<Impressao> listaImp = new ArrayList<>();
    
    private Cliente clienteEnv;
    private Funcionario funcEnv;
    private Arquivo arquivoEnv;
    private int quant;
    private double preco;
    
    public Impressao(Cliente cliente, Funcionario func, Arquivo arq, int quant)
    {
        this.clienteEnv=cliente;
        this.funcEnv=func;
        this.arquivoEnv=arq;
        this.quant=quant;
        
        if(cliente.getClass().getName()=="Model.Empresa")
        {
            this.preco=0.20*this.quant;
        }
        else if(cliente.getClass().getName()=="Model.Parceiro")
        {
            this.preco=0.10*this.quant;
        }
        else if(cliente.getClass().getName()=="Model.Pessoa")
        {
            this.preco=0.30*this.quant;
        }
        
        if(this.quant>500)
        {
            this.preco*=0.8;
        }
        
        listaImp.add(this);
    }
    
    public static void imprimeImpressoes()
    {
        for(Impressao imp : listaImp)
        {
            System.out.println(imp);
        }
    }
    
    public double getPreco()
    {
        return this.preco;
    }
    
    @Override
    public String toString()
    {
        return arquivoEnv.getNomeArquivo()+" para "+clienteEnv+". Quantidade: "+this.quant+" valor: R$"+this.preco;
    }
    
    
}
