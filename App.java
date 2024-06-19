import entity.Group;
import entity.School;
import entity.User;
import src.MyArrayList;
import src.MyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//         User<Integer> user = new User<Integer>(1, "Nguyen");
//        Group group = new Group(1, "C0424G1");
//        School school = new School(1, "CG");
//        group.setSchool(school);
//        user.setGroup(group);
//
//        Group myGroup = user.group;
//        School mySchool = myGroup.school;
//        String nameSchool = mySchool.name;
//
//        System.out.println(user.group.school.name);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insertFirstNode(1);
        myLinkedList.insertFirstNode(10);
        myLinkedList.insertFirstNode(20);
        myLinkedList.insertFirstNode(30);

        System.out.println("First Node: " + myLinkedList.head.getData());
        System.out.println("Last node: " + myLinkedList.tail.getData());

    }
}
