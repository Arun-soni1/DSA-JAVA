import java.io.*;  
//                      BUFFER READER TO ACCESS TEXT FILE FROM PC
public class Read {  
    public static void main(String args[])throws Exception
    {    
          FileReader fr=new FileReader("F:\\ARUN SONI\\New Text Document.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          fr.close();    
          br.close();    
    }    
}                                                   