/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atendimentohospitalar;

/**
 * Classe do convenio
 * @author FABIO
 */
public class ConvenioMedico {
    
    private int codConvenio;
    private String nomeConvenio;
    private String plano;

    /**
     * Construtor que inicializa a classe do convenio
     *
     * @param codConvenio Codigo do convenio
     * @param nomeConvenio Nome do convenio
     * @param plano Plano do convenio
     */
    public ConvenioMedico(int codConvenio, String nomeConvenio, String plano) {
        this.codConvenio = codConvenio;
        this.nomeConvenio = nomeConvenio;
        this.plano = plano;
    }

    /**
     * Metodo toString
     * @return Retorna o nome, plano e o codigo do convenio em string
     */
    @Override
    public String toString() {
        return this.nomeConvenio + "\tPlano: " + this.plano + "\tCódigo do convenio: " + this.codConvenio;
    }
    
}
