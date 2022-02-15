package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        Restaurant cunha = new Restaurant(2);
        Restaurant aviz = new Restaurant(4);

        //MULTIPLE CLIENTS
       // Client[] clients = new Client[5];

     //   for (int i = 0; i < ; i++) {
       //     clients[i] = new Client(); //client[0] = nem Client(); {0XFFF1,null,null,null,...}
      //                                //client[1] = nem Client(); {0XFFF1,0XFF2,null,null,...}
      //      clients[1] = new Client("John");
        }


        Client client = new Client ("Toni");
        Table table = new Table(client);
        Client client1 = new Client ("Ramos");
        Table table1 = new Table(client1);
        Client client2 = new Client ("Joana");
        Table table2 = new Table(client2);
        Client client3 = new Client ("Tatiana");
        Table table3 = new Table(client3);

        cunha.sitClient(table);
        aviz.sitClient(table);
        System.out.println("The client " + client.getClientName() + " as sit down.");
        table.pay();
        cunha.checkOutClient(table);
        cunha.sitClient(table1);
        cunha.sitClient(table2);
        cunha.sitClient(table3);

    }
}
