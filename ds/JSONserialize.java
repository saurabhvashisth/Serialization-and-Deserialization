/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

import java.util.*;
import java.math.*;
import java.io.*;
import com.google.gson.Gson;

/**
 *
 * @author saurabh
 */
public class JSONserialize {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String inputfile = args[0];
        ArrayList<students> student = new ArrayList<>();
        File file1 = new File("./", inputfile);
        FileReader FR = new FileReader(file1);
        BufferedReader BFR = new BufferedReader(FR);
        String Line;

        int N = 0;
        while ((Line = BFR.readLine()) != null) {
            String[] strs = Line.split(":");
            String[] data = strs[0].split(",");
            student.add(new students(data[0], Integer.parseInt(data[1])));
            for (int i = 1; i < strs.length; i++) {
                data = strs[i].split(",");
                student.get(N).CourseMarks.add(new pair(Integer.parseInt(data[1]), data[0]));
            }
            N++;
        }
        BFR.close();
        //Writing to JSON File

        File file2 = new File("./", "result.json");
        PrintWriter out = new PrintWriter(file2);

        Gson gson = new Gson();
        double startTime = System.nanoTime();
        out.print("[");
        for (int i = 0; i < student.size(); i++) {
            String j = gson.toJson(student.get(i));
            out.print(j);
            if (i != student.size() - 1) {
                out.print(",");
            }
        }
        out.print("]");
        out.close();
        double endTime = System.nanoTime();
        double ans = endTime - startTime;
        double len = file1.length();
        ans = ans / 1e9;
        System.out.println(len / (ans * 1024));
        System.out.println((ans * 1e3) + " milli seconds");
        //     System.out.println("hello");
    }

}
