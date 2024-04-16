package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        String name = "Roman";
        String lastName = "Herashchenko";

        Gson gson = new Gson();
        String json = gson.toJson(new Name(name, lastName));
        System.out.println(json);
    }

    static class Name {
        String name;
        String lastName;

        public Name(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }
    }
}