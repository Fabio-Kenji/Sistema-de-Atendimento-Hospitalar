/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atendimentohospitalar;

/**
 * Celula da lista duplamente ligada
 * @author FABIO
 */
public class RegistroPaciente {
    
    private String nome;
    private int rg;
    private ConvenioMedico convenio;
    private RegistroPaciente proximo;
    private RegistroPaciente anterior;

    /**
     * Construtor vazio do registro de paciente
     */
    public RegistroPaciente() {
    }

    /**
     * Construtor que inicializa a celula da lista
     *
     * @param nome Nome dado para o registro do novo paciente
     * @param rg RG dado para o registro do novo paciente
     * @param convenio Convenio dado para o registro do novo paciente
     */
    public RegistroPaciente(String nome, int rg, ConvenioMedico convenio) { //
        this.nome = nome;
        this.rg = rg;
        this.convenio = convenio;
        this.proximo = null;
    }
    
    // Métodos getters e setters

    /**
     * Metodo getNome
     * @return Retorna o nome da celula da lista duplamente ligada
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo setNome
     * @param nome Seta o nome da celula da lista duplamente ligada
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo getRg
     * @return Retorna o RG da celula da lista duplamente ligada
     */
    public int getRg() {
        return rg;
    }

    /**
     * Metodo setRg
     * @param rg Seta o RG da celula da lista duplamente ligada
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * Metodo getConvenio
     * @return Retorna o convenio da celula da lista duplamente ligada
     */
    public ConvenioMedico getConvenio() {
        return convenio;
    }

    /**
     * Metodo setConvenio
     * @param convenio Seta o convenio da celula da lista duplamente ligada
     */
    public void setConvenio(ConvenioMedico convenio) {
        this.convenio = convenio;
    }

    /**
     * Metodo getProximo
     * @return Retorna o proximo da celula da lista duplamente ligada
     */
    public RegistroPaciente getProximo() {
        return proximo;
    }

    /**
     * Metodo setProximo
     * @param proximo Seta o proximo da celula da lista duplamente ligada
     */
    public void setProximo(RegistroPaciente proximo) {
        this.proximo = proximo;
    }

    /**
     * Metodo getAnterior
     * @return Retorna o anterior da celula da lista duplamente ligada
     */
    public RegistroPaciente getAnterior() {
        return anterior;
    }

    /**
     * Metodo setAnterior
     * @param anterior Seta o anterior da celula da lista duplamente ligada
     */
    public void setAnterior(RegistroPaciente anterior) {
        this.anterior = anterior;
    }
    
    // toString

    /**
     * Metodo toString
     * @return Retorna o nome, RG, e o convenio da celula da lista duplamente ligada em string
     */
    @Override
    public String toString() {
        return "Nome: " + nome + "\tRG: " + rg + "\tConvenio: " + convenio;
    }
}
