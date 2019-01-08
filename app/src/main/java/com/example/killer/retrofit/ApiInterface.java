package com.example.killer.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("/todos")
    Call<List<Todo>> getTodos();

    @GET("/todos/{id}")
    Call<Todo> getTodo(@Path("id") int id);

    @GET("/todos")
    Call<List<Todo>> getTodosUsingQuery(@Query("userId") int userId, @Query("completed") boolean completed);

    @POST("/todos")
    Call<Todo> postTodo(@Body  Todo todo);

}
