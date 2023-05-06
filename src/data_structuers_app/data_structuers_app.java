
package data_structuers_app;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import javax.sound.sampled.*;           
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
                                        


public class data_structuers_app
{ 
    
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException 
    {
         
       
    // File file=new File("home.wav");
     File file1=new File("Cairokee-Layla-_-كايروكي-ليلى_MP3_70K_.wav");
     //File file2=new File("Muslim-Etnaset-مسلم-اتنسيت-_الاغنية-الرسمية-لفيلم-عروستي_-_192-kbps_.wav");
     AudioInputStream audio;
     // audio = AudioSystem.getAudioInputStream(file);
     audio = AudioSystem.getAudioInputStream(file1);
     // audio = AudioSystem.getAudioInputStream(file2);
     Clip clip ;
     clip=AudioSystem.getClip();
     clip.open(audio);
     
     
     String respone=" ";
     while(!respone.equals("Q"))         
     {    
       System.out.println("P : Play,  S: Stop  ,R: Reset,  Q: Quit ");
       System.out.print("Enter youre choice :  ");
       Scanner Scanner=new Scanner(System.in);
       respone=Scanner.next();
       respone=respone.toUpperCase();
       switch(respone)
       {
           case("P"): clip.start();
           break;
           case("S"): clip.stop();
           break;
           case("R"):clip.setMicrosecondPosition(0);
           break;
           case("Q"):clip.stop();
           break;
           default:System.out.println("Not a vaild respone ");
       }
        
        }    
     String linked_list="";
          Scanner input =new Scanner(System.in);
          linked_list=input.next(); 
          linked_list=linked_list.toUpperCase();
          
         while(!linked_list.equals("Q"))
          {
            
          
          }
               
}
    
    
    
}

