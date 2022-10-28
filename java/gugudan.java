import java.util.Scanner;

public class gugudan{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  do{
    int i=0, j=0;
    System.out.print("Insert number(0:exit) : ");
		i = sc.nextInt();

    if(i==0){
      System.exit(1);
    }else if(i>1 && i<10){
      for(j=1; j<10; j++){
        System.out.println(i + " x " + j +" = " + i*j);
      }
    }else{
      System.out.println("1 혹은 10이상의 수를 입력하셨습니다");
    }
  }while(true);
}
}
