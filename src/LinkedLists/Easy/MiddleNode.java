package LinkedLists.Easy;

import java.util.LinkedList;

public class MiddleNode {

    /* You are given a Linked List with at least one node. Write a function that returns the middle node of Linked List.
    * If there are two middle nodes ( i.e. an even length list), your function should return the second of these nodes.
    *
    * Each LinkedList node has an integer value as well as a next node pointing to the next node in the list or to
    * None / null if it's the tail of the list*/



    public static void main(String[] args) {

        Program.LinkedList linkedList = new Program.LinkedList(0);
        linkedList.next = new Program.LinkedList(1);
        Program.LinkedList expected = new Program.LinkedList(2);
        linkedList.next.next = expected;
        expected.next = new Program.LinkedList(3);


        // Getting the middle node using first solution
        var actual = new Program().middleNode(linkedList);
        System.out.println(actual.value);

        // Getting the middle node using first solution
        var actual2 = new Program().middleNode2(linkedList);
        System.out.println(actual2.value);


    }


static class Program {
    static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value){
            this.value = value;
            this.next = null;
        }
    }
    // Code of a solution
    public LinkedList middleNode(LinkedList linkedList){
        int count = 0;
        LinkedList currentNode = linkedList;
        while(currentNode != null){
            count++;
            currentNode = currentNode.next;
        }
        LinkedList middleNode = linkedList;
        for(int i= 0; i < count /2; i++){
            middleNode = middleNode.next;
        }
        return middleNode;
    }

    // Second solution
    public LinkedList middleNode2(LinkedList linkedList){
        LinkedList slowNode = linkedList;
        LinkedList fastNode = linkedList;

        while(fastNode != null && fastNode.next !=null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }

}
}
