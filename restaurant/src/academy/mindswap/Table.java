package academy.mindswap;

public class Table {

    private Client clientName;
    private boolean hasClientPayed;

    public Table(Client clientName) {
        this.clientName = clientName;
    }

    public boolean isHasClientPayed() {
        return hasClientPayed;
    }

    public void pay(){
        this.hasClientPayed = true;
    }

    public Client getClientName() {
        return clientName;
    }
}
