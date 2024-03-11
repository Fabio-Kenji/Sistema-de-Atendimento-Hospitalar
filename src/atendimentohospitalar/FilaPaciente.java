/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atendimentohospitalar;

/**
 * Celula da fila ligada
 * @author FABIO
 */
public class FilaPaciente {
    
    private String nome;
    private int rg;
    private ConvenioMedico convenio;
    private FilaPaciente proximo;

    /**
     * Construtor vazio da celula da fila ligada
     */
    public FilaPaciente() {
    }

    /**
     * Construtor da celula da fila ligada
     *
     * @param p Recebe uma celula da lista duplamente ligada
     */
    public FilaPaciente(RegistroPaciente p) { // Construtor que inicializa a celula da fila
        this.nome = p.getNome();
        this.rg = p.getRg();
        this.convenio = p.getConvenio();
        this.proximo = null;
    }

    // Métodos getters e setters

    /**
     * Metodo getNome
     * @return Retorna o nome da celula da fila ligada
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo setNome
     * @param nome Seta o nome da celula da fila ligada
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo getRg
     * @return Retorna o RG da celula da fila ligada
     */
    public int getRg() {
        return rg;
    }

    /**
     * Metodo setRg
     * @param rg Seta o RG da celula da fila ligada
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * Metodo getConvenio
     * @return Retorna o convenio da celula da fila ligada
     */
    public ConvenioMedico getConvenio() {
        return convenio;
    }

    /**
     * Metodo setConvenio
     * @param convenio Seta o convenio da celula da fila ligada
     */
    public void setConvenio(ConvenioMedico convenio) {
        this.convenio = convenio;
    }

    /**
     * Metodo getProximo
     * @return Retorna o proximo da celula da fila ligada
     */
    public FilaPaciente getProximo() {
        return proximo;
    }

    /**
     * Metodo setProximo
     * @param proximo Seta o proximo da celula da fila ligada
     */
    public void setProximo(FilaPaciente proximo) {
        this.proximo = proximo;
    }

    //toString

    /**
     * Metodo toString
     * @return Retorna o nome, RG e o convenio da celula da fila ligada em string
     */
    @Override
    public String toString() {
        return "Nome: " + nome + "   \tRG: " + rg + "\tConvenio: " + convenio;
    }
}
