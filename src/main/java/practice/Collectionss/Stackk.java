package practice.Collectionss;

import java.util.Stack;

public class Stackk {
    static void main(String[] args) {

        //QUEUE:-FIFO
        //STACK:- last in first out LIFO
        //Stack is class in java which implements list interface and extends vector class also

        Stack<String> st = new Stack<>();
        st.add("books");
        st.add("red");
        st.add("green");
        st.add("blue");
        st.add("orange");
        st.add("yellow");

        //PUSH-add
        st.push("orange");
        st.push("yellow");
        st.push("green");
        st.push("blue");
        st.push(null);
        st.push("red");
        st.push("orange");

        //PEEK -GET(LAST ELEMENT)
        System.out.println(st.peek());

        //POP -REMOVE(last element)
        System.out.println(st.pop());

        //SEARCH( it search from top amd return its position)
        System.out.println(st.search("orange"));

        //EMPTY (ISEMPTY) Checks it size

        st.remove("orange"); //DELETE
        st.add(0, "yellows"); //ADD
        st.set(1, "purple"); //UPDATE
        System.out.println(st.get(1)); //GET
        st.contains("blue");





    }
}
