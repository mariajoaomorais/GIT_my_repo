package academy.mindswap;

public class Restaurant {
    private String nameRestaurant;
    private int ocupation;
    private Table[] tables;
    private Client client;

    public Restaurant(String nameRestaurant, int capacity){
        this.nameRestaurant = nameRestaurant;
        this.ocupation = 0;
        this.tables = new Table[capacity];
    }

    public int getCapacity() {
        return this.tables.length;
    }

    public void clientIn(String name){
        if (this.ocupation == this.getCapacity()){
            System.out.println("The restaurant is full.");
            return;
        }
        this.client = new Client(name);
        if (this.tables[ocupation] == null) {
            this.tables[ocupation] = new Table();
        }
        for (int i = 0; i < tables.length ; i++) {
            if (!tables[i].getTableOcupation()){
                this.tables[i].setClientIn(name);
                this.ocupation++;
                System.out.println(name + " is seated.");
                return;
            }
        }
    }

    public void clientOut(String name){
        if (ocupation == 0){
            return;
        }
        for (int i = 0; i < tables.length ; i++) {
            if (tables[i].getClientName().equals(name)){
                if (tables[i].getPayed()){
                    tables[i].setClientOut();
                    System.out.println(name + " got out of the restaurant.");
                    this.ocupation--;
                    return;
                }
                System.out.println("You got to pay first " + name + "!");
                return;
            }
        }
    }
    public void clientPay(String name){
        for (int i = 0; i < tables.length ; i++) {
            if (tables[i].getClientName().equals(name)){
                tables[i].setPayed(true);
                return;
            }
        }
        System.out.println("This person is not in the restaurant!");
    }
}

