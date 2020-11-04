package intromethods;

public class TodoListMain {

    public static void main(String[] args) {

        TodoList todoList = new TodoList();
        /*Todo todo1 = new Todo("todo1");
        Todo todo2 = new Todo("todo2");
        Todo todo3 = new Todo("todo3");
        Todo todo4 = new Todo("todo4");*/

        todoList.addTodo("todo1");
        todoList.addTodo("todo2");
        todoList.addTodo("todo3");
        todoList.addTodo("todo4");
        todoList.addTodo("todo5");

        System.out.println("Finished: " + todoList.numberOfFinishedTodos());
        todoList.finishTodos("todo3");
        System.out.println("Finished: " + todoList.numberOfFinishedTodos());
        System.out.println("Not yet finish: " + todoList.todosToFinish());

        todoList.finishAllTodos(todoList.todosToFinish());
        System.out.println("Finished: " + todoList.numberOfFinishedTodos());
        System.out.println("Not yet finish: " + todoList.todosToFinish());


    }


}
