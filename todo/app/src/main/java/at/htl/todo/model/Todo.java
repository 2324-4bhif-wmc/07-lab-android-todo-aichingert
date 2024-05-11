package at.htl.todo.model;

/** A ToDo as we get it from <a href="https://jsonplaceholder.typicode.com/todos">jsonplaceholder.typicode.com</a>
 */
public class Todo {
    public Long userId;
    public Long id;
    public String title;
    public boolean completed;

    public Todo() {
    }

    public Todo(Long userId, Long id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}

/*
 * userId	1
 * id	1
 * title	"delectus aut autem"
 * completed	false
 */