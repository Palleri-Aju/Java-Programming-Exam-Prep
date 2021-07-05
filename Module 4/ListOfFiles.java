/*
                     Experiment- 12

You have been given the list of the names of the files in a directory. You have to select Java files from them. A file is a Java file if it’s name ends with “.java”. For e.g. File- “Names.java” is a Java file, “FileNames.java.pdf” is not.
Input: test.java, ABC.doc, Demo.pdf, add.java, factorial.java, sum.txt
Output: tset.java, add.java, factorial.java

*/

import java.io.File;
import java.io.IOException;
public class ListOfFiles {
   public static void main(String args[]) throws IOException {
      //Creating a File object for directory
      File directoryPath = new File("F:\\java lab B2");
      //List of all files and directories
      String contents[] = directoryPath.list();
      System.out.println("List of files and directories in the specified directory:");
      for(int i=0; i<contents.length; i++) {
         System.out.println(contents[i]);
      }
      System.out.println("\nThe files ending with .java extension are :");
      for(int i=0; i<contents.length; i++) {
         int x=contents[i].indexOf(".");
         if(x!=-1)
         {
            String temp=contents[i].substring(x);
            //System.out.println(temp);
            if(temp.equals(".java"))
            System.out.println(contents[i]);
         }
      }
   }
}

/*
Output:

F:\java prog>java ListOfFiles
List of files and directories in the specified directory:
New folder
test.java.pdf
Test1.class
Test1.java

The files ending with .java extension are :
Test1.java

*/