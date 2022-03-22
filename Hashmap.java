/*
HASHMAPS store key-value pairs. And these are accessed by an index of type string.

One object is used as a key (string) to another object (value). Can be key of type string and value of type string.

*/
import java.util.*;
public class Hashmap{
  
  public static void main(String[] args){
    HashMap<String, Integer> studentId = new HashMap<String, Integer>();
    studentId.put("Kyle", 201202);
    studentId.put("Tommy", 23134);
    studentId.put("Gale", 231212);
    studentId.put("Harper",12342);
  }
}

