package at.htl.todo.model;

import java.util.List;

public class Model {
    public static class UiState {
        public int selectedTab = 0;
    }

    public Todo[] todos = new Todo[0];
    public UiState uiState = new UiState();
}
