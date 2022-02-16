package academy.mindswap;

public class Sender implements Runnable{
    private Data data;
    public Sender(Data data){
        this.data = data;
    }

    @Override
    public void run() {
        String[] packets = {"First packet", "Second packet", "third packet", "Fourth packet", "End of transmission"};

        for (String packet :: packets){
            data.send(packet);


        }
    }
}
