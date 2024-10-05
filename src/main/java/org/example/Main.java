package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(5051,"Tayfun","Şentürk"));
        employees.add(new Employee(11,"Samet","Severler"));
        employees.add(new Employee(434,"Mete","Çekok"));
        employees.add(new Employee(25,"Umut","Aksoy"));
        employees.add(new Employee(99,"Recep","Yeşilova"));
        employees.add(new Employee(11,"Samet","Severler"));
        employees.add(new Employee(434,"Mete","Çekok"));
        //findDuplicates(employees);
        findUniques(employees);
        //removeDuplicates(employees);
        //WordCounter.calculatedWord();
    }

    public static List<Employee> findDuplicates(List<Employee> notUnique){
        List<Employee> Errors = new LinkedList<>();
        for(int i=0;i<notUnique.size();i++){
            for(int x=i+1;x<notUnique.size();x++){
                if(notUnique.get(i).equals(notUnique.get(x))){
                    Errors.add(notUnique.get(i));
                }
            }
        }
        //System.out.println(Errors.toString());
        return Errors;

    }

    public static Map<Integer,Employee> findUniques(List<Employee> Uniques){
        Map<Integer,Employee> map = new HashMap<>();
        List<Employee> duplicates= new LinkedList<>(findDuplicates(Uniques));
        Uniques.removeAll(duplicates);
        Uniques.addAll(duplicates);
        Uniques.remove(null);
        for(Employee emp:Uniques){
            map.put(emp.getId(),emp);

        }
        System.out.println(map.toString());
        return map;
    }
    public static List<Employee> removeDuplicates(List<Employee> employees){
        List<Employee> duplicates= new LinkedList<>(findDuplicates(employees));
        employees.removeAll(duplicates);
        employees.remove(null);
        //System.out.println(employees.toString());
        return employees;
    }

}