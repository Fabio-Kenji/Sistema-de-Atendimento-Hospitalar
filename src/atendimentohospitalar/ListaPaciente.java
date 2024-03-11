/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atendimentohospitalar;

/**
 * Lista duplamente ligada
 * @author FABIO
 */
public class ListaPaciente {

    private RegistroPaciente cabeca;

    /**
     * Construtor da lista duplamente ligada
     */
    public ListaPaciente() {
        this.cabeca = null;
    }
    
    // Métodos da lista duplamente ligada

    /**
     * Metodo que adiciona uma nova celula na lista duplamente ligada
     *
     * @param nome Nome dado para o registro do novo paciente
     * @param rg RG dado para o registro do novo paciente
     * @param convenio Convenio dado para o registro do novo paciente
     */
    public void registraPaciente(String nome, int rg, ConvenioMedico convenio) {
        RegistroPaciente novo = new RegistroPaciente(nome, rg, convenio);
        if (this.cabeca == null) {
            this.cabeca = novo;
        } else {
            RegistroPaciente ultimo = this.cabeca;
            while (ultimo.getProximo() != null) {
                ultimo = ultimo.getProximo();
            }
            ultimo.setProximo(novo);
            novo.setAnterior(ultimo);
        }
    }

    /**
     * Metodo que remove uma celula da lista duplamente ligada
     *
     * @param removeRG RG do paciente que deseja remover
     */
    public void removePaciente(int removeRG) {
        for (RegistroPaciente i = this.cabeca; i != null; i = i.getProximo()) {
            if (i.getRg() == removeRG) {
                RegistroPaciente ianterior = i.getAnterior();
                RegistroPaciente iproximo = i.getProximo();
                if (this.cabeca.getProximo() == null) {
                    this.cabeca = null;
                } else if (iproximo == null) {
                    ianterior.setProximo(null);
                } else if (ianterior == null) {
                    this.cabeca = i.getProximo();
                    this.cabeca.setAnterior(null);
                } else {
                    ianterior.setProximo(iproximo);
                    iproximo.setAnterior(ianterior);
                }
                System.out.println("Paciente " + i.getNome() + " de RG: " + i.getRg() + " foi removido\n");
                break;
            }
        }
    }

    /**
     * Metodo que retorna uma celula da lista duplamente ligada
     *
     * @param rg RG do paciente que deseja procurar
     * @return Retorna o paciente do RG dado
     */
    public RegistroPaciente procuraPaciente(int rg) {
        for (RegistroPaciente p = this.cabeca; p != null; p = p.getProximo()) {
            if (rg == p.getRg()) {
                return p;
            }
        }
        return null;
    }

    /**
     * Metodo que imprime todas as celulas da lista duplamente ligada
     */
    public void imprime() {
        int i = 1;
        for (RegistroPaciente c = this.cabeca; c != null; c = c.getProximo()) {
            System.out.print(i + " " + c);
            System.out.println();
            i++;
        }
        System.out.println();
    }

}
