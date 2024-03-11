/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atendimentohospitalar;

import java.util.Scanner;

public class AtendimentoHospitalar {

    /**
     * Metodo principal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ConvenioMedico convenio1 = new ConvenioMedico(1, "Convenio1", "Plano1");
        ConvenioMedico convenio2 = new ConvenioMedico(2, "Convenio2", "Plano2");
        Atendimento fila = new Atendimento();
        ListaPaciente lista = new ListaPaciente();

        lista.registraPaciente("Fabio", 1111, convenio1);
        lista.registraPaciente("Gabriela", 2222, convenio2);
        lista.registraPaciente("Beatriz", 3333, convenio1);
        lista.registraPaciente("Gabriel", 4444, convenio2);

        int opcao = 10;
        while (opcao != 0) {
            System.out.println("""
                               
                                - Sistema de atendimento médico hospitalar - 
                               
                               Opções
                               1 - Registrar paciente
                               2 - Remover registro de paciente
                               3 - Listar registro de pacientes
                               4 - Recepcionar paciente
                               5 - Atender paciente
                               6 - Mostrar pacientes na fila
                               7 - Editar registro de paciente
                               0 - Sair""");
            opcao = scan.nextInt();
            scan.nextLine();
            switch (opcao) {
                case 1 -> {
                    System.out.println("Registro de novo paciente");
                    System.out.println("Digite o nome");
                    String nome = scan.nextLine();
                    boolean e = true;
                    while (e) {
                        System.out.println("Digite o RG");
                        int rg = scan.nextInt();
                        scan.nextLine();
                        if (lista.procuraPaciente(rg) == null) {
                            e = false;
                        } else {
                            System.out.println("Esse RG ja existe");
                        }
                        if (!e) {
                            System.out.println("""
                                               Escolha o convenio
                                               1 - Convenio1
                                               2 - Convenio2""");
                            int o = scan.nextInt();
                            scan.nextLine();
                            ConvenioMedico convenio;
                            switch (o) {
                                case 1 -> {
                                    convenio = convenio1;
                                    lista.registraPaciente(nome, rg, convenio);
                                }
                                case 2 -> {
                                    convenio = convenio2;
                                    lista.registraPaciente(nome, rg, convenio);
                                }
                                default ->
                                    System.out.println("Número inválido");
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Remover registro de paciente");
                    System.out.println("Digite o RG do paciente");
                    int rg = scan.nextInt();
                    scan.nextLine();
                    if (fila.procuraNaFila(rg) == null) {
                        if (lista.procuraPaciente(rg) != null) {
                            lista.removePaciente(rg);
                        }  else {
                            System.out.println("Nenhum paciente registrado com esse RG");
                        }
                    } else {
                        System.out.println("Paciente está na fila");
                    }
                }
                case 3 -> {
                    System.out.println("\nLista de pacientes registrados");
                    lista.imprime();
                }
                case 4 -> {
                    System.out.println("Recepcionar paciente");
                    System.out.println("Digite o RG do paciente");
                    int procuraRG = scan.nextInt();
                    scan.nextLine();
                    if (lista.procuraPaciente(procuraRG) != null) {
                        if (fila.procuraNaFila(procuraRG) == null) {
                            System.out.println(lista.procuraPaciente(procuraRG).getNome() + " entrou no fim da fila");
                            fila.recepciona(lista.procuraPaciente(procuraRG));
                        } else {
                            System.out.println("Paciente ja está na fila");
                        }
                    } else {
                        System.out.println("Paciente não encontrado");
                    }
                }
                case 5 -> {
                    fila.atende();
                }
                case 6 -> {
                    fila.mostra();
                }
                case 7 -> {
                    System.out.println("Editar registro de paciente");
                    System.out.println("Digite o RG do paciente");
                    int rg = scan.nextInt();
                    scan.nextLine();
                    if (lista.procuraPaciente(rg) != null) {
                        boolean o = true;
                        while (o) {
                            
                            System.out.printf("""
                                              Escolha a opção que deseja editar
                                              1 - Editar nome: %s
                                              2 - Editar RG: %d
                                              3 - Editar convenio: %s
                                              0 - Sair
                                              """, lista.procuraPaciente(rg).getNome(), lista.procuraPaciente(rg).getRg(), lista.procuraPaciente(rg).getConvenio());
                            int b = scan.nextInt();
                            scan.nextLine();
                            switch (b) {
                                case 1 -> {
                                    System.out.println("Digite o novo nome");
                                    String novoNome = scan.nextLine();
                                    lista.procuraPaciente(rg).setNome(novoNome);
                                }
                                case 2 -> {
                                    System.out.println("Digite o novo RG");
                                    int novoRG = scan.nextInt();
                                    scan.nextLine();
                                    if (lista.procuraPaciente(novoRG) == null) {
                                        lista.procuraPaciente(rg).setRg(novoRG);
                                        rg = novoRG;
                                    } else {
                                        System.out.println("Esse RG já existe");
                                    }
                                }
                                case 3 -> {
                                    System.out.println("Escolha o novo convenio");
                                    System.out.println("""
                                                        Escolha o convenio
                                                        1 - Convenio1
                                                        2 - Convenio2""");
                                    int c = scan.nextInt();
                                    scan.nextLine();
                                    switch (c) {
                                        case 1 -> {
                                            lista.procuraPaciente(rg).setConvenio(convenio1);
                                        }
                                        case 2 -> {
                                            lista.procuraPaciente(rg).setConvenio(convenio2);
                                        }
                                        default ->
                                            System.out.println("Número inválido");
                                    }
                                }
                                case 0 -> {
                                    o = false;
                                }
                                default ->
                                    System.out.println("Número inválido");
                            }
                        }
                    } else {
                        System.out.println("Paciente não encontrado");
                    }
                }
                case 0 -> {
                    System.out.println("Saindo");
                }
                default ->
                    System.out.println("Número inválido");
            }
        }
    }
}
