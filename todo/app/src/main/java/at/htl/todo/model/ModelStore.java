package at.htl.todo.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

/** This is our Storage area for <a href="https://redux.js.org/understanding/thinking-in-redux/three-principles">single source of truth</a> {@link Model}. */
import at.htl.todo.util.store.StoreBase;

@Singleton
public class ModelStore extends StoreBase<Model> {

    @Inject
    ModelStore() {
        super(Model.class, new Model());
    }

    public void setTodos(Todo[] todos) {
        Log.e("OMG", Integer.toString(todos.length));
        for (Todo todo : todos) {
            Log.e("OMG", todo.toString());
        }
        apply(model -> model.todos = todos);
    }
}
