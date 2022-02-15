package academy.mindswap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        NodeContainer nodeContainer = new NodeContainer();

        nodeContainer.add(1233);
       nodeContainer.add("abcd");
       nodeContainer.add("segrr");
        nodeContainer.add(111222);
        //nodeContainer.add("abcd");
        nodeContainer.remove(1233);
       // nodeContainer.remove("abcd");
        //System.out.println(nodeContainer.size());
        System.out.println(nodeContainer.indexOf(111222));

        for (int i=0; i < nodeContainer.size(); i++){
        System.out.println(nodeContainer.get(i));
        }

    }





}
