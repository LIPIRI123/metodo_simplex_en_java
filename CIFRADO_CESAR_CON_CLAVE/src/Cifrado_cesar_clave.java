
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lipiri
 */
public class Cifrado_cesar_clave {
    public static void main(String[]orf){
    Scanner l=new Scanner(System.in);
    System.out.println("ingrese el mensaje");
    String pa=l.nextLine();
    System.out.println("ingrese la clave");
    String cla=l.next();
    System.out.println("ingrese posicion a recorrer");
    int re=l.nextInt();
    String abc="abcdefghijklmnopqrstuvwxyz";
    String palabra="";
    char v[]=abc.toCharArray();
    for(int i=abc.length()-re;i<abc.length();i++){
    palabra+=v[i];
    }
    palabra+=cla;
    for(int i=0;i<abc.length()-re;i++){
    palabra+=v[i];
    }String palabra1="";
    char v1[]=palabra.toCharArray();
    for(int i=0;i<palabra.length();i++){
        int c=0;
        for(int j=i+1;j<palabra.length()-1;j++){
            if(v1[i]==v1[j]&&v1[i]!='0'){
                c++;
                v1[j]='0';
            }
        }
        if(c>=1){
            palabra1+=v1[i];
        } else if(v1[i]!='0'){
            palabra1+=v1[i];
        }
    }
    String cifrado="";
   // System.out.println(palabra+" \n"+abc+ "\n"+palabra1);
    char v3[]=pa.toCharArray();
    
    char v4[]=palabra1.toCharArray();
    for(int i=0;i<pa.length();i++){
        if(v3[i]!=' '){
        for(int j=0;j<abc.length();j++){
            if(v3[i]==v[j]){
                cifrado+=v4[j];
                
                break;
            }
        }
        }else{
        cifrado+=" ";
        }
        }    
    System.out.println("la palabra cifrada es: "+cifrado);
   }
}
