import java.util.Scanner;
public class IT24104312Lab5Q2{
 public static void main(String[] args){
  Scanner scanner=new Scanner(System.in);

  System.out.print("Enter the number of new members introduced:");
  int newMembers=scanner.nextInt();

  while(newMembers<0){
   System.out.print("Input must be a number 0 or greater");
   newMembers=scanner.nextInt();
  }

  String prize;
  switch(newMembers){
   case 0:
    prize="No prize";
    break;
   case 1:
    prize="Pen";
    break;
   case 2:
    prize="Umbrella";
    break;
   case 3:
    prize="Bag";
    break;
   case 4:
    prize="Travelling Chair";
    break;
   default:
    prize="Headphone";
    break;
  }
  System.out.println("Prize is a:"+prize);
 }
}


  