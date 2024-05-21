package at.htl.todo.model;

import javax.inject.Inject;
import javax.inject.Singleton;

import at.htl.todo.util.store.StoreBase;

/** This is our Storage area for our <a href="https://redux.js.org/understanding/thinking-in-redux/three-principles">single source of truth</a> {@link Model}. */
@Singleton
public class Store extends StoreBase<Model> {
    @Inject
    Store() {
        super(Model.class, new Model());
    }

    public void setTodos(Todo[] toDos) {
        apply(model -> model.todos = toDos);
    }
    public void selectTab(int tabIndex) {
        apply(model -> model.uiState.selectedTab = tabIndex);
    }
}