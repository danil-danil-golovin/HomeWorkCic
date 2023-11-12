public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }


        for (int I = 10; I >= 1; I--) {
            System.out.println(I);
        }


        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);}



        for (int с = -10; с <= 10; с++){
            System.out.println(-с);}



        for (int year = 1904; year <=2096; year = year +4){
            System.out.println(year + " год является високосным");}



        for (int p = 7; p <= 98; p = p +7){
            System.out.println(p);}



        for (int i = 1; i <=512; i = i * 2){
            System.out.println(i);}



        int salary = 29000;
        int total = 0;
        for (int i  = 0; i < 12; i++){
            total = total  + salary;
            System.out.println("Месяц " + salary + " сумма накоплений равна " + total + " рублей");}


        int Salary = 29000;
        int Total = 0;
        for (int i = 0; i < 12; i++){
            Total = Total + Total/100;
            Total = Total + Salary;
            System.out.println("Месяц  " + Salary + " сумма накоплений равна " + Total + "  рублей");}



        int now = 2;
        for (int i = 1; i <= 10; i ++){
            System.out.println("2 * " +  i + " = " + now * i);
        }
    }
}