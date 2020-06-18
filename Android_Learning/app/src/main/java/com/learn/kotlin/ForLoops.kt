package com.learn.kotlin

fun main(args: Array<String>) {

    for(x in 1..100) {
        println(x);
    }
    println("--------------");

    for(x in 1..10_000) {
        println(x);
    }

    println("--------------");

    for(x in 1..10_00) {
        println(x);
    }
    println("--------------");
    var moviesList : MutableList<String> = mutableListOf<String>("Movie - 1", "Movie - 2", "Movie - 3");

    for(movie in moviesList) {
        println(movie);
    }
    println("--------------");

    for(movie in 0..moviesList.size-1) {
        println(moviesList[movie]);
    }
    println("--------------");

    for(movie in 0..moviesList.size-1) {
        val moviesListWithHash = "## " + moviesList[movie] + " ##";
        println(moviesListWithHash);
    }
}