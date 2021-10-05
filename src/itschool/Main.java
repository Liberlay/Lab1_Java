package itschool;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = 0;
        System.out.println("Enter task number(1,2):");
        a = read.nextInt();
        switch (a){
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            default:
                System.out.println("You need to choose 1 or 2 tasks number!");
        }
    }
    public static void task1(){
        Scanner readint = new Scanner(System.in);
        Scanner readstring = new Scanner(System.in);
        int countworker = 0;
        int count = 0;
        System.out.println("Enter workers count:");
        countworker = readint.nextInt();
        Worker[] worker = new Worker[countworker];
        for(int i = 0; i < countworker; i++) {
            worker[i] = new Worker();
            System.out.println("Enter surname:");
            worker[i].Surname = readstring.nextLine();
            System.out.println("Enter year of birth:");
            worker[i].Year = readint.nextInt();
            System.out.println("Enter position:");
            worker[i].Position = readstring.nextLine();
            System.out.println("Enter salary:");
            worker[i].Salary = readint.nextInt();
            System.out.println("Enter education:");
            worker[i].Education = readstring.nextLine();
        }

        for (int k = 0; k < countworker; k++) {
            if (worker[k].Position.equals("Engineer")) {
                count++;
                System.out.println("Surname: " + worker[k].Surname);
                System.out.println("Year of birth: " + worker[k].Year);
                System.out.println("Position: " + worker[k].Position);
                System.out.println("Salary: " + worker[k].Salary);
                System.out.println("Education: " + worker[k].Education);
            }
        }
        System.out.println("Engineers count:" + count);
    }
    public static void task2(){
        LocalDate ld = LocalDate.now();
        Scanner readint = new Scanner(System.in);
        Scanner readstring = new Scanner(System.in);
        int countcar = 0;
        System.out.println("Enter cars count");
        countcar = readint.nextInt();
        Car[] car = new Car[countcar];
        for(int i = 0; i < countcar; i++) {
            car[i] = new Car();
            System.out.println("Enter company:");
            car[i].Company = readstring.nextLine();
            System.out.println("Enter manufacturer:");
            car[i].Manufacturer = readint.nextLine();
            System.out.println("Enter car type:");
            car[i].Type = readstring.nextLine();
            System.out.println("Enter year of assembly:");
            car[i].Yearassembly = readint.nextInt();
            System.out.println("Enter year of registration:");
            car[i].Year = readstring.nextInt();
            System.out.println("Enter month of registration:");
            car[i].Month = readstring.nextInt();
            System.out.println("Enter day of registration:");
            car[i].Day = readstring.nextInt();
        }
        for (int k = 0; k < countcar; k++) {
            if ((car[k].Yearassembly < ld.getYear() - 21) && (car[k].Year == ld.getYear()) && (car[k].Month <= ld.getMonthValue()) && (car[k].Day <= ld.getDayOfMonth())) {
                System.out.println("Company: " + car[k].Company);
                System.out.println("Manufacturer: " + car[k].Manufacturer);
                System.out.println("Car type: " + car[k].Type);
                System.out.println("Year of assembly: " + car[k].Yearassembly);
                System.out.println("Year of registration: " + car[k].Year);
                System.out.println("Mont of registration: " + car[k].Month);
                System.out.println("Day of registration: " + car[k].Day);
            } else if ((car[k].Yearassembly < ld.getYear() - 21) && (car[k].Year <= ld.getYear() - 1) && (car[k].Month >= ld.getMonthValue()) && (car[k].Day >= ld.getDayOfMonth())) {
                System.out.println("Company: " + car[k].Company);
                System.out.println("Manufacturer: " + car[k].Manufacturer);
                System.out.println("Car type: " + car[k].Type);
                System.out.println("Year of assembly: " + car[k].Yearassembly);
                System.out.println("Year of registration: " + car[k].Year);
                System.out.println("Mont of registration: " + car[k].Month);
                System.out.println("Day of registration: " + car[k].Day);
            }
        }
    }

}
