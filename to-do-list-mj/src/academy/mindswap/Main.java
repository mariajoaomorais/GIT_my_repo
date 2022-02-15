package academy.mindswap;

public class Main {

    public static void main(String[] args) {
	// write your code here


        TodoList todoList = new TodoList();

        todoList.add(ImportanceType.HIGH, 1,"wash dishes");
        todoList.add(ImportanceType.MEDIUM, 2,"buy clothes");
        todoList.add(ImportanceType.LOW, 1,"PAY Mindswap");
        todoList.add(ImportanceType.HIGH, 3,"wash pants");
        todoList.add(ImportanceType.LOW, 1,"Run");
        todoList.add(ImportanceType.MEDIUM, 3,"SING");


        while (!todoList.isEmpty()){
            System.out.println(todoList.remove());
        }


    }
}
