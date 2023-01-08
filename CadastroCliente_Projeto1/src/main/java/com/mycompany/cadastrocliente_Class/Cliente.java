/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrocliente_Class;

/**
 *
 * @author garus
 */
public class Cliente {
    
    private String nome;
    private long CPF;
    private String endereco;
    private long telefone;
    private int numero;
    private String cidade;
    private String estados;
    
    public Cliente(String nome,String cpf, String tel, String end, String num, String cidade, String estado){
    
        this.nome = nome;
        this.CPF = Long.parseLong(cpf);
        this.telefone= Long.parseLong(tel);
        this.endereco = end;
        this.numero = Integer.parseInt(num);
        this.cidade = cidade;
        this.estados = estado;        
    }            

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    public long getCPF() {
        return CPF;
    }    
    

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(long CPF) {
        this.CPF = CPF;
    }
    
    public void setCPF(String CPF) {
        this.CPF = Long.parseLong(CPF);
    }

    /**
     * @return the telefone
     */
    public long getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = Integer.parseInt(telefone) ;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setNumero(String numero) {
        this.numero = Integer.parseInt(numero) ;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estados
     */
    public String getEstados() {
        return estados;
    }

    /**
     * @param estados the estados to set
     */
    public void setEstados(String estados) {
        this.estados = estados;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
