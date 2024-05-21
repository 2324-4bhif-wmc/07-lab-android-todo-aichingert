package at.htl.todo.model;


import android.util.Log;

import java.util.concurrent.CompletableFuture;

import javax.inject.Inject;
import javax.inject.Singleton;

import at.htl.todo.util.resteasy.RestApiClientBuilder;

@Singleton
public class TodoService {
    static final String TAG = TodoService.class.getSimpleName();
    public static String JSON_PLACEHOLDER_BASE_URL = "https://jsonplaceholder.typicode.com";
    public final TodoClient todoClient;
    @Inject
    Store store;

    @Inject
    TodoService(RestApiClientBuilder builder, Store store) {
        Log.i(TAG, "Creating TodoService with base url: " + JSON_PLACEHOLDER_BASE_URL);
        todoClient = builder.build(TodoClient.class, JSON_PLACEHOLDER_BASE_URL);
        this.store = store;
    }
    public void getAll() {
        Log.i("OMG", "THIS IS BS");
        CompletableFuture
                .supplyAsync(todoClient::all)
                .thenAccept(store::setTodos);
    }
}

