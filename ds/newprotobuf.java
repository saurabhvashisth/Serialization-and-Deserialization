/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

import java.util.*;
import java.math.*;
import java.io.*;
import ds.ResultProto;

/**
 *
 * @author saurabh
 */
public class newprotobuf {

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

        ResultProto.Result.Builder result = ResultProto.Result.newBuilder();
        for (int i = 0; i < student.size(); i++) {
            students tmp = student.get(i);
            ResultProto.Student.Builder SS = ResultProto.Student.newBuilder();
            SS.setName(tmp.Name);
            SS.setRollNum(tmp.RollNo);
            for (int j = 0; j < tmp.CourseMarks.size(); j++) {
                ResultProto.CourseMarks.Builder CM = ResultProto.CourseMarks.newBuilder();
                CM.setName(tmp.CourseMarks.get(j).CourseName);
                CM.setScore(tmp.CourseMarks.get(j).CourseScore);
                SS.addMarks(CM);
            }
            result.addStudent(SS);
        }
        File file2 = new File("./", "result_protobuf");
        double startTime = System.nanoTime();
        byte b[] = result.build().toByteArray();
        double endTime = System.nanoTime();

        double len = file1.length();
        double time = endTime - startTime;
        time = time / 1e9;

        System.out.println(len / (time * 1024.0));
        System.out.println(time * 1e3);
        FileOutputStream out = new FileOutputStream(file2);
        out.write(b);

    }

}
