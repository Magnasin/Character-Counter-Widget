/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingcharacters;
import java.io.*;


/**
 *
 * @author abeld
 */
public class CountingCharacters {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) throws IOException {

int upperCaseLetters=0;
int lowerCaseLetters=0;
int marksAndPunct=0;
int emptySpaces=0;
int otherChars=0;

try {

BufferedReader goThrough=new BufferedReader(
new FileReader("Alice's Adventures in Wonderland.txt"));//Open's file
int data;
while((data=goThrough.read())!=-1){ //Scans the book

if(Character.isLowerCase(data)) {
   
lowerCaseLetters++;//Takes down all lowercase letters
    
}

else if(Character.isUpperCase(data)){ 
   
upperCaseLetters++; //Notes Upper Letters

}

else if(data == '!' || data == ',' || data == ';' || data == '.' ||        data == '?' || data == '-' ||  
data == '\'' || data == '\"' || data == ':'){ 
    
marksAndPunct++; //For punctuations

}

else if(data==' ' || data=='\t' || data=='\n'){

emptySpaces++;//Scans empty spaces

}

else{ 

otherChars++; //For other characters

}
}
goThrough.close();
} 
    
catch (IOException e) {
System.out.println("An error occurred.");//Catch for errors, should they occur
e.printStackTrace();

}

try {

FileWriter insert = new FileWriter("result2.txt");//Open file for writing
        
insert.write("The amount of upper case letters equates to: " + upperCaseLetters +"\n");//Writes in the result file
insert.write("The amount of lower case letters is: " + lowerCaseLetters +"\n");//Writes in the result file
insert.write("The amount of marks & puncuations in the story are: "+ marksAndPunct +"\n");//Writes in the result file
insert.write("This story has " + emptySpaces +" of whitespaces\n");//Writes in the result file
insert.write("Number of other characters: " + otherChars + "\n");//Writes in the result file
        
insert.close();//Closes the result file
} 

catch (IOException e) { //Catch for errors, should they occur

System.out.println("An error occurred.");
e.printStackTrace(); //Stops run

}
}
}