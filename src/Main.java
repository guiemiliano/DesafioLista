import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        //TODO : Iniciar uma lista com 7 ninjas
        //TODO : Adicionar o ninja no início da lista
        //TODO : Remover o ninja no início da lista
        //TODO : Listar os ninjas
        //TODO : Procurar um ninja por índice

        //Ninjas
        Ninja ninjaNaruto = new Ninja("Naruto Uzumaki", 16, "Vila da folha");
        Ninja ninjaSasuke = new Ninja("Sasuke Uchiha", 17, "Vila da folha");
        Ninja ninjaSakura = new Ninja("Sakura Haruno", 17, "Vila da folha");
        Ninja ninjaKakashi = new Ninja("Kakashi Hatake", 37, "Vila da folha");
        Ninja ninjaHashirama = new Ninja("Hashirama Senju", 50, "Vila da folha");
        Ninja ninjaTsunade = new Ninja("Tsunade Senju", 50, "Vila da folha");
        Ninja ninjaIno = new Ninja("Ino Yamanaka", 17, "Vila da folha");


        //Linked List
        LinkedList<Ninja> ninjas = new LinkedList<>();

        //Adicionar ninja no início da lista
        ninjas.addFirst(ninjaNaruto);

        //Linked list com 7 ninjas adicionei o naruto acima como primeiro no index
        ninjas.add(ninjaSasuke);
        ninjas.add(ninjaSakura);
        ninjas.add(ninjaKakashi);
        ninjas.add(ninjaHashirama);
        ninjas.add(ninjaTsunade);
        ninjas.add(ninjaIno);

        //Listar ninjas - Todos os 7 ninjas
        for(Ninja ninja : ninjas){
            System.out.println(ninja);
        }

        //Remover ninja no início da lista
        ninjas.removeFirst();

        //Listar ninjas - Sem o primeiro ninja
        for(Ninja ninja : ninjas){
            System.out.println(ninja);
        }



    }
}
