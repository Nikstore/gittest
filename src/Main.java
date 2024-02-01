import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int i=0;
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        while (i<10){
            System.out.println(name+" идет тестирование GIT");
            i++;
        }
        System.out.println();
        System.out.println("всё отлично!");
    }
}