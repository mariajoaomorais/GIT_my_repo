package academy.mindswap;

import java.util.PriorityQueue;
import java.util.Queue;

public class TodoList {
    private Queue <TodoItem> todoList;

    public TodoList() {
        todoList = new PriorityQueue<>();
    }

    public void add(ImportanceType importanceType, int priority, String item){
        todoList.add(new TodoItem(importanceType, priority, item));
    }

    public TodoItem remove(){
        return todoList.remove();
    }

    public boolean isEmpty(){
        return todoList.isEmpty();
    }

    private class TodoItem implements Comparable <TodoItem>{


        private Enum ImportanceType;
        private int priority;
        private String itemName;

        public TodoItem(Enum importanceType, int priority, String itemName) {
            ImportanceType = importanceType;
            this.priority = priority;
            this.itemName = itemName;
        }

        public Enum getImportanceType() {
            return ImportanceType;
        }


        public int getPriority() {
            return priority;
        }


        public String getItemName() {
            return itemName;
        }

        @Override
        public String toString() {
            return itemName;

        }

        @Override
        public int compareTo(TodoItem item) {
            int result = this.ImportanceType.compareTo(item.getImportanceType());

            if(result == 0) {
                result = Integer.compare(this.priority, item.getPriority());
            }

            return result;
        }
    }

}





