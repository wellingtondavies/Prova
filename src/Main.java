import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static Scanner scan = new Scanner(System.in);
        public static List <Usuario> ListaUsuarios = new ArrayList<Usuario>();
        public static List <Integer> ListaOrdenada = new ArrayList<Integer>();
    public static void main(String[] args) {

        //EXERCICIO 01
        boolean rodar = true;
        while (rodar) {
            System.out.println(" vamos adicionar um usuario");
            System.out.println("1. Adicionar um usuario");
            System.out.println("2. Remover um usuario");
            System.out.println("3. Listar usuarios");
            System.out.println("4. Qualquer outra opção fecha o programa e mostra a lista ordenada");
            System.out.println("escolha uma opção ");
            int opcao = scan.nextInt();
            switch (opcao) {
                case 1:{
                    System.out.println("Adicionar um usuario");
                    cadastrarUsuario();
                    break;
                }
                case 2:{
                    System.out.println("Remover um usuario");
                    RemoverUsuario();
                    break;
                }
                case 3:{
                    System.out.println("Listar usuarios");
                    listarUsuarios();
                    break;
                }
                default:{
                    System.out.println("opção invalida, tente novamente");
                    rodar = false;
                    break;
                }
            }
        }

        System.out.println(" lista de idade ordenada");
        OrdenarPorIdade();
    }

    public static void cadastrarUsuario () {
        System.out.println("Digite o nome do usuario");
        String nome = scan.next();
        System.out.println("Digite a idade do usuario");
        int idade = scan.nextInt();

        Usuario usuario = new Usuario(nome, idade);
        ListaUsuarios.add(usuario);
    }
    public static void listarUsuarios() {
        System.out.println("listando usuarios");
        for (Usuario usuario : ListaUsuarios) {
            System.out.println(usuario.toString());
        }

    }
    public static void RemoverUsuario() {
        System.out.println("Remover um usuario");
        System.out.println(" digite o nome do usuario que deseja remover ");
        String nome = scan.next();

        for (Usuario iterador : ListaUsuarios) {
            if (iterador.equals(nome)) {
                ListaUsuarios.remove(iterador);
            }
        }

    }
    public static void OrdenarPorIdade(){
        int idade2;
        int idade;

        //for para copiar a idade de um usuario para uma lista de idades;
        System.out.println(" ordenando por idade ");
        for (Usuario iterador : ListaUsuarios) {
            ListaOrdenada.add(iterador.getIdade());
        }

        //for para ordenar em ordem cresente
        for(Usuario iterador : ListaUsuarios){
            Collections.sort(ListaOrdenada);
        }

        //for para printar
        for (int i = 0; i < ListaOrdenada.size(); i++) {
            System.out.println(ListaOrdenada.get(i));
        }
    }

}