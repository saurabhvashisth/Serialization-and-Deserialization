/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ds;


import java.util.*;
import java.math.*;
import java.io.*;

/**
 *
 * @author saurabh
 */

public class pair {

   
    int CourseScore;
    String CourseName;

    public pair(int first, String second)
    {
        CourseScore  = first;
        CourseName  = second;
    }

    public int first()   { return CourseScore; }
    public String second() { return CourseName; }

}
