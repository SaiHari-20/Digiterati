/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Task1;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author Sai Hari
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> res;
        res = list.stream()
                .filter(n-> list.indexOf(n)%2==0)
                .collect(Collectors.toList());
        System.out.println(res);
    }
}