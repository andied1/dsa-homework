import java.util.*;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
    }
    //Create linked list

class LinkedList{
    Node head;
    LinkedList() {
        this.head = null;
    }

    //Add elements to list
    //1. old node points to the new node
    //2. New node becomes the null
    void addFirst(int value) {
        Node newNode = new Node(value);

        if(this.head == null) {
            this.head = newNode;
            return;
        }

        newNode.next = this.head; //New node points to old head
        this.head = newNode; //Head moves to new node
    }

void addLast(int value) { //Adds node to last of the linkedlist
        Node newNode = new Node(value);

        if(this.head == null) {
            this.head = newNode;
            return;
        }

        Node current = this.head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

Integer removeHead() {
    if(this.head == null) {
        return null;
    }

    int removed = this.head.value;
    this.head = this.head.next;
    return removed;
}

Node removeTail() { //Removes last node
    if(this.head == null) {
        return null;
    }

    Node current = this.head;
        while(current.next.next != null) {
            current = current.next;
        }
    Node removed = current.next;
    current.next = null;
    return removed;
}

void printList() {
    Node current = this.head;
    while(current != null) {
        System.out.println(current.value);
            current = current.next;
        }
    }
}

class Playlist{

    LinkedList list;
    Playlist(){
        this.list = new LinkedList();
    }

    void addSong(String song) {
        this.list.addFirst(song.hashCode());
    }
    void showPlaylist() {
        this.list.printList();
    }
}

class Stack {
    private LinkedList list;
    
    Stack() {
        this.list = new LinkedList();
    }
    
    void push(int value) {
        this.list.addFirst(value);
    }
    
    Integer pop() {
        return this.list.removeHead();
    }
    
    Integer peek() {
        return this.list.head != null ? this.list.head.value : null;
    }
    
    boolean isEmpty() {
        return this.list.head == null;
    }
}


    


class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Song1");    
        playlist.addSong("Song2");
        playlist.addSong("Song3");
        playlist.showPlaylist();
    }
}