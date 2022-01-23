package lesson21;

import homework.author.model.Author;
import homework.author.model.Gender;
import homework.author.util.DateUtil;
import homework.education.model.Student;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) throws ParseException {
//
//        Map<String, Author>studentMap=new HashMap<>();
//        Author author = new Author("poxos", "poxosyan", "poxos@mail.com", 12, Gender.MALE, DateUtil.stringToDate("21/12/1886"));
//        studentMap.put("poxos@mail.com", author);

        Map<String, Integer> map = new TreeMap<>();
        map.put("poxos@mail.com", 12);
        map.put("arto@mail.com", 44);
        map.put("zhirayr@mail.com", 23);
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
