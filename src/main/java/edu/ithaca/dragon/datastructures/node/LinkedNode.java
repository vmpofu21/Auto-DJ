package edu.ithaca.dragon.datastructures.node;

 
public class LinkedNode {
    private Song item;
    private LinkedNode next;

    public LinkedNode(Song item){
        this(item, null);
    }

    public LinkedNode(Song item, LinkedNode  next){
        this.item = item;
        this.next = next;
    }

    public LinkedNode() {
    }

    public void setNext(LinkedNode next){
        this.next = next;
    }

    public Song getItem(){
        return item;
    }

    public LinkedNode getNext(){
        return next;
    }

}
