/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atendimentohospitalar;

/**
 * Fila ligada
 * @author FABIO
 */
public class Atendimento {
    
    private int quantidade;
    private FilaPaciente inicio;
    private FilaPaciente fim;

    /**
     * Construtor da fila ligada
     */
    public Atendimento() {
        this.quantidade = 0;
        this.inicio = new FilaPaciente();
        this.fim = this.inicio;
    }
    
    // Métodos da fila ligada

    /**
     * Metodo estaVazia
     * @return Retorna se a fila esta vazia ou nao
     */
    public boolean estaVazia() {
        return (this.quantidade == 0);
    }
    
    /**
     * Adiciona uma celula na fila ligada
     *
     * @param p Recebe uma celula da lista duplamente ligada
     */
    public void recepciona(RegistroPaciente p) {
        FilaPaciente recepcionado = new FilaPaciente(p);
        this.fim.setProximo(recepcionado);
        this.fim = this.fim.getProximo();
        this.fim.setProximo(null);
        this.quantidade++;
    }
    
    /**
     * Remove a celula do comeco da fila ligada
     */
    public void atende() {
        if (!estaVazia()) {
            System.out.println(this.inicio.getProximo().getNome() + ", RG: " + this.inicio.getProximo().getRg() + ", foi atendido");
            this.inicio = this.inicio.getProximo();
            this.quantidade--;
        } else {
            System.out.println("Fila vazia");
        }
    }
    
    /**
     * Imprime as celulas da fila ligada
     */
    public void mostra() {
        System.out.println("Pacientes na fila");
        if(!estaVazia()) {
            FilaPaciente p = this.inicio.getProximo();
            int i = 1;
            while (p != null) {
                System.out.println(i + " " + p.toString());
                p = p.getProximo();
                i++;
            } 
        } else {
            System.out.println("Fila vazia");
        }
    }
    
    /**
     * Metodo que procura paciente na fila
     * @param rg Recebe o RG da celula que quer procurar
     * @return Retorna a celula do RG dado
     */
    public FilaPaciente procuraNaFila(int rg) {
        if(!estaVazia()) {
            FilaPaciente p = this.inicio.getProximo();
            while (p != null) {
                if(p.getRg() == rg) {
                    return p;
                }
                p = p.getProximo();
            } 
        }
        return null;
    }
}
