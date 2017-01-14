/*;;

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

import java.util.*;
import java.math.*;
import java.io.*;
//import ds.pair;
//import ds.students;
import com.google.gson.Gson;
import com.google.protobuf.*;

/**
 *
 * @author saurabh
 */
public class sa {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        System.out.println("yo");
//        ArrayList<students> student = new ArrayList<>() ;
//        File file1 = new File("/home/saurabh/Downloads/", "input_sample");
//        FileReader FR = new FileReader(file1);
//      
//        BufferedReader BFR = new BufferedReader(FR);
//        String Line;
//    
//       int N=0;
//       while (( Line = BFR.readLine()) != null) {
//            String[] strs = Line.split(":");
//            String[] data = strs[0].split(",");
//            student.add(new students(data[0],Integer.parseInt(data[1])));
//            for(int i=1;i<strs.length;i++){
//                data = strs[i].split(",");
//                student.get(N).CourseMarks.add(new pair(Integer.parseInt(data[1]),data[0]));
//            }
//            N++;
//        }
//        for (students st:student){
//            System.out.println("Name: "+st.name+" Roll No "+st.rollno);
//            System.out.println("Marks :");
//            for(pair pp:st.records){
//                System.out.println(pp.F + " : " +pp.S);
//            }
//        }
       
        
        
        //Writing to JSON File
        
//        File file3 = new File("/home/saurabh/Downloads/", "output_sample.json");
//        PrintWriter out = new PrintWriter(file3);
//        
//        Gson gson = new Gson();
//        out.print("[");
//        System.out.print("[");
//        for(int i=0;i<student.size();i++){
//            String j = gson.toJson(student.get(i));
//            out.print(j);
//            if(i!=student.size()-1)
//                out.print(",");
//        }
//        out.print("]");
//        out.close();
        
        
        
        //Taking input from json and converting to txt file
//        File file2 = new File("/home/saurabh/Downloads/", "output_sample.json");
//        //FileReader FR = new FileReader(file2);
//        
//        ArrayList<String> ss = new ArrayList<String> () ;
//        FileInputStream fileInput = new FileInputStream(file2);
//        int r;
//        int ct=0;
//        String temp="";
//        while ((r = fileInput.read()) != -1) {
//            char c = (char) r;
//            if(c=='{'){
//                ct++;
//                temp=temp+c+"";
//            }
//            else if(c=='}'){
//                ct--;
//                temp=temp+c+"";
//                if(ct==0){                  
//                    ss.add(temp);
//                    temp="";
//          //          System.out.println("");
//                }
//            }
//            else if(ct!=0){
//                temp=temp+c+"";
//        //        System.out.print(c);
//            }
//        }
//        
//        
//        ArrayList<students> sstudent = new ArrayList<>() ;
//
//        Gson gson = new Gson();
//        for(String as:ss){
//           // System.out.println(as); 
//        
//            students tempstudent = gson.fromJson(as, students.class);
//            sstudent.add(tempstudent);
//        }
//        fileInput.close();
//        
//        
//        File file4 = new File("/home/saurabh/Downloads/", "myinput_sample.txt");
//        PrintWriter out = new PrintWriter(file4);
//        for(students nstudent: sstudent){
//            out.print(nstudent.Name+",");
//            out.print(nstudent.RollNo);
//            for(pair ptemp:nstudent.CourseMarks){
//                out.print(":"+ptemp.CourseName+","+ptemp.CourseScore);
//            }
//            out.println("");
//        }
//        out.close();
//        

        /* 
               
              pair p1 = new pair("saurabh","vashisth");
        
               System.out.println(p1.first());
        System.out.println(p1.second());
        ArrayList<pair> la = new ArrayList<>() ;
        ArrayList<pair> b=new ArrayList<>();
//        pair[] arr = new pair[67];
//        ArrayList<pair>[] brr=new ArrayList[679];
//        for(int i=0;i<brr.length;i++)
//            brr[i]=new ArrayList<>();
//        for(int i=0;i<brr.length;i++){
//            brr[i].add(new P(4,5));
//        }
//        P np=new P(1,2);
//        la.add(np);
//        P nnp=np;
//        nnp.x=5;
//        System.out.println(np.x +" "+np.y);
//        
        
                /*ArrayList<Integer> al;
        al = new ArrayList<>();
        al.add(1);
        String[] arr = new String[5];
        char[] br = new char[6];
        int e;
        int[] ar = new int[9];
        char c;
        String s = "asdfsgbsrg";
        char[] name = s.toCharArray();
        String t = "afhsf";
        s = s + t;
         */
 /* ArrayList<String>[] courses = new ArrayList<String>[100];// = null;
        ArrayList<String>[] marks = new ArrayList<String>[100];// = null;
        ArrayList<String>[] names = new ArrayList<String>[100];// = null;
        try (BufferedReader bf = new BufferedReader(fa)) {
            n = 0;

            String ss;
            while ((ss = bf.readLine()) != null) {
                String[] strarray = ss.split(":");
                //names[n] = str_array[0].split(",");
                courses[n] = new ArrayList<>();
                marks[n] = new ArrayList<>();
                for (int i = 1; i < strarray.length; i++) {
                    System.out.println(strarray[i]);
                    String[] sets = strarray[i].split(",");
                    courses[n].add(sets[0]);
                    marks[n].add(sets[1]);

                }

                n++;
            }
        }
         */
        //  System.out.println(n);
    }

}
