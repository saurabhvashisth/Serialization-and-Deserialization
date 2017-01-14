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
public class deserializeproto {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String fileinput = args[0];

        File file1 = new File("./", fileinput);
        FileInputStream fin = null;
        fin = new FileInputStream(file1);

        byte b[] = new byte[(int) file1.length()];
        fin.read(b);
        File file2 = new File("./", "output_protobuf.txt");
        PrintWriter out = new PrintWriter(file2);
        double startTime = System.nanoTime();

        ResultProto.Result result = ds.ResultProto.Result.parseFrom(b);
        double endTime = System.nanoTime();
        double len = file1.length();
        double time = endTime - startTime;
        time = time / 1e9;

        System.out.println(len / (time * 1024.0));
        System.out.println(time * 1e3);

        for (ResultProto.Student student : result.getStudentList()) {
            out.print(student.getName() + "," + student.getRollNum());
            for (ResultProto.CourseMarks marks : student.getMarksList()) {
                out.print(":" + marks.getName() + "," + marks.getScore());
            }
            out.println("");
        }
        out.close();

    }
}
