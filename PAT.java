import java.util.Scanner;

class PAT {
public static void main(String[] args){
System.out.println("************how many stars you want****************");
Scanner sc = new Scanner(System.in);
int Userinput = sc.nextInt();
for(int i = 1; i<=Userinput ; i++){
for(int j = 0; j<i; j++){
System.out.print("*");
}
System.out.println();
}
for(int i = Userinput - 1; i>0; i--){
for(int j = 0; j<i; j++){
System.out.print("*");
}
System.out.println();
}
}
}