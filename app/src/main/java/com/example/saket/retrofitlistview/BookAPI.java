package com.example.saket.retrofitlistview;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by saket on 21-Oct-16.
 */

interface BooksAPI {

    /*Retrofit get annotation with our URL
       And our method that will return us the list ob Book
    */
    @GET("/RetrofitExample/books.json")
    public void getBooks(Callback<List<Book>> response);
}
