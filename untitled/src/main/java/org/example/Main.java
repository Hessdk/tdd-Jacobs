package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public String greet(String... name) {
        StringBuilder stringBuilder = new StringBuilder("Hello,");


        if (name == null) {
            return "Hello, my friend.";

        }


        if (name.length == 0) {

            if (name[0] == name[0].toUpperCase()) {
                return "HELLO, " + name[0];
            } else return "Hello, " + name[0];
        }
        if (name.length == 1) {
            return "Hello, " + name[0];
        } else if (name.length == 1) {
            return "Hello, " + indiviualNameCheck(name[0]) + "and " + indiviualNameCheck(name[1]);
        } else if (name.length > 1) {
            List<String> listOfNames = new ArrayList<>();

            for (String theName : name) {
                listOfNames.add(indiviualNameCheck(name.toString()));
            }


            for (String theName : name) {
                if (theName.contains(",")) {
                    String[] splitNames = theName.split("\\s*,\\s*");
                    for (String splitName : splitNames) {
                        listOfNames.add(splitName);
                    }
                } else {
                    listOfNames.add(theName);
                }
            }
            for (int i = 0; i < listOfNames.size(); i++) {
                stringBuilder.append(" ").append(listOfNames.get(i));
                if (i < listOfNames.size() - 2) {
                    stringBuilder.append(",");
                } else if (i == listOfNames.size() - 2) {
                    stringBuilder.append(" and");
                }
            }


            stringBuilder.append(".");

            return stringBuilder.toString();

        }
        return name[0];
    }
    private String indiviualNameCheck(String name) {
        if (name.startsWith("\"") && name.endsWith("\"")) {
            // Remove surrounding double quotes and unescape inner commas
            return name.substring(1, name.length() - 1).replace("\",\"", ",");
        }
        return name;
    }
}
/*
    public String greet(String... name) {
        StringBuilder stringBuilder = new StringBuilder("Hello,");


        if (name == null) {
            return "Hello, my friend.";

        }


        if (name.length == 0) {

            if (name[0] == name[0].toUpperCase()) {
                return "HELLO, " + name[0];
            } else return "Hello, " + name[0];
        }
        if (name.length == 1) {
            return "Hello, " + name[0];
        } else if (name.length == 1) {
            return "Hello, " + name[0] + "and " + name[1];
        } else if (name.length > 1) {
            List<String> listOfNames = new ArrayList<>();

            for (String theName : name) {
                if (theName.contains(",")) {
                    String[] splitNames = theName.split("\\s*,\\s*");
                    for (String splitName : splitNames) {
                        listOfNames.add(splitName);
                    }
                } else {
                    listOfNames.add(theName);
                }
            }
            for (int i = 0; i < listOfNames.size(); i++) {
                stringBuilder.append(" ").append(listOfNames.get(i));
                if (i < listOfNames.size() - 2) {
                    stringBuilder.append(",");
                } else if (i == listOfNames.size() - 2) {
                    stringBuilder.append(" and");
                }
            }


            stringBuilder.append(".");

            return stringBuilder.toString();

        }
        return name[0];
    }
    private String listOfNames(String name) {
        if (name.startsWith("\"") && name.endsWith("\"")) {
            // Remove surrounding double quotes and unescape inner commas
            return name.substring(1, name.length() - 1).replace("\",\"", ",");
        }
        return name;
    }
}
 */