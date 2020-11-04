package intromethods;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todos;

    public TodoList() {
        todos = new ArrayList<>();
    }

    public void addTodo(String caption) {
        todos.add(new Todo(caption));
    }

    public void finishTodos(String caption) {
        for (Todo todo: todos) {
            if (todo.getCaption() == caption) {
                todo.finish();
            }
        }
    }

    public void finishAllTodos(List<String> todosToFinish) {
        for (Todo todo: todos) {
            todo.finish();
        }
    }

    public List<String> todosToFinish() {
        List<String> list = new ArrayList<>();
        for (Todo todo: todos) {
            if (todo.isFinished() == false) {
                list.add(todo.getCaption());
            }
        }
        return list;
    }

    public int numberOfFinishedTodos() {
        int finishedTodos = 0;
        for (Todo todo: todos) {
            if (todo.isFinished()) {
                finishedTodos++;
            }
        }
        return finishedTodos;
    }

    public String toString() {
        return todos.toString();
    }
}
