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
public class JSONdeserialize {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Taking input from json and converting to txt file
        String inputfile = args[0];

        File file2 = new File("./", inputfile);

        ArrayList<String> ss = new ArrayList<String>();
        FileInputStream fileInput = new FileInputStream(file2);
        int r;
        int ct = 0;
        String temp = "";
        while ((r = fileInput.read()) != -1) {
            char c = (char) r;
            if (c == '{') {
                ct++;
                temp = temp + c + "";
            } else if (c == '}') {
                ct--;
                temp = temp + c + "";
                if (ct == 0) {
                    ss.add(temp);
                    temp = "";
                }
            } else if (ct != 0) {
                temp = temp + c + "";
            }
        }

        ArrayList<students> sstudent = new ArrayList<>();
        double startTime = System.nanoTime();
        Gson gson = new Gson();
        for (String as : ss) {
            // System.out.println(as); 

            students tempstudent = gson.fromJson(as, students.class);
            sstudent.add(tempstudent);
        }
        fileInput.close();
        double endTime = System.nanoTime();
        double ans = endTime - startTime;
        double len = file2.length();
        ans = ans / 1e9;

        System.out.println(len / (ans * 1024.0));
        System.out.println((ans) + " milli seconds");

        File file4 = new File("./", "output_json.txt");
        PrintWriter out = new PrintWriter(file4);
        for (students nstudent : sstudent) {
            out.print(nstudent.Name + ",");
            out.print(nstudent.RollNo);
            for (pair ptemp : nstudent.CourseMarks) {
                out.print(":" + ptemp.CourseName + "," + ptemp.CourseScore);
            }
            out.println("");
        }
        out.close();

    }

}
