

import java.util.Scanner;

public class main{
public static void main(String args[]){
float distance;
int hr,min,sec;

System.out.println("Enter The Distance");
Scanner s = new Scanner(System.in);
distance =s.nextFloat();

System.out.println("Enter The time");
hr =s.nextInt();
min = s.nextInt();
sec = s.nextInt();


float time = (hr*3600)+(min*60)+(sec);

float speed = distance/time;


System.out.println("Your speed is"+speed);

}}