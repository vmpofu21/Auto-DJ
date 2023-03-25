package edu.ithaca.dragon.datastructures.node;

public interface Library {  
    /** 
    *@post  
    *This is used to add to our data structure that holds all songs in the library 
     */
    void add(Song song); 


    /**
    @post  
        This is used to empty our library data strucuture that stores our songs so that we can repopulate 
     * it with another files data
     */
    void empty();
    
}
