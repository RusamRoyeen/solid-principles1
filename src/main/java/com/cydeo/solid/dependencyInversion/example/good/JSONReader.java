package com.cydeo.solid.dependencyInversion.example.good;

public class JSONReader implements Reader{

    /*

        Example JSON:
        {
            "username" : "mikesmith"
        }

     */
    @Override
    public String getUsername() {
        return "{\n" +
                "            \"username\" : \"mikesmith\"\n" +
                "        }";
    }
}
