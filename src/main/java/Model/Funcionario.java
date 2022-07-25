/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Gabriel Mattos
 */
public class Funcionario
{
    private static int numIdentificacaoS=0;
    private  int numIdentificacao;
    private String nome;
    
    public Funcionario(String nome)
    {
        this.nome=nome;
        this.numIdentificacao=Funcionario.numIdentificacaoS;
        Funcionario.numIdentificacaoS++;
    }
    
    public int getNumIndentificacao()
    {
        return this.numIdentificacao;
    }
    
    @Override
    public String toString()
    {
        return "Funcionario{identificacao = "+numIdentificacao+", nome = "+nome+"}";
    }
    
}
