package org.elsys.serializer.main;

import org.elsys.serializer.JSONSerializer;

public class Main {
    public static void main(String[] args){
        Student student = new Student();
        student.setFirstName("Bruce");
        student.setFathersName("Thomas");
        student.setLastName("Wayne");

        JSONSerializer serializer = new JSONSerializer();
        String result = serializer.serialize(student);
        System.out.println(result);
    }
}
