import java.util.*;
/**
 * Created by Ринат on 07.03.14.
 */


public class Graph {
    public static void main(String[] args){
        Node n1 = new Node(1); // создаем вершины, приписываем им разные номера
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.addOut(n2); // записываем связи между вершинами
        n2.addOut(n3);
        n3.addOut(n1);
        n1.printLinks(); // пишем какие связи есть у данной вершины
        n2.printLinks();
    }

}
