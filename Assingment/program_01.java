import java.util.Scanner;

class program_01{

    int swapVariable(int fnum,int snum){
        int temp = fnum;
        fnum = snum;
        snum = temp;
        System.out.println("first number is "+ fnum + " second number is "+snum);
        return 0;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("first value ");
        int fnum = scanner.nextInt();

        System.out.print("Second Value ");
        int snum = scanner.nextInt();
        swapVariable(fnum,snum);
    }
}