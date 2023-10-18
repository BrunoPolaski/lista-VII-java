package application;

import java.util.Scanner;

public class Main {

//    EXEERCICIO 1
//    private static void monthIndex(int index){
//        String[] months = {"janeiro", "fevereiro", "marco",
//                "abril", "maio", "junho",
//                "julho", "agosto",
//                "setembro", "outubro",
//                "novembro", "dezembro"};
//        System.out.println(months[index - 1]);
//    }

//    EXERCICIO 2
//    private static void studentStatus(double gradeAverage){
//        if (gradeAverage > 6){
//            System.out.println("Aprovado");
//        } else if (gradeAverage <= 6 && gradeAverage >= 4) {
//            System.out.println("Exame");
//        } else {
//            System.out.println("Reprovado");
//        }
//    }

//    EXERCICIO 3
    private static void geometricForms(String form){
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        double lado1 = 0;
        double lado2 = 0;
        double lado3 = 0;
        if(form.equals("Circunferencia")){
                System.out.println("Qual o raio da circunferencia?");
                double raio = sc.nextDouble();
                double perimetro = 2 * pi * raio;
                double areaCirc = pi * Math.pow(raio, 2);
                System.out.println("Area: " + areaCirc + "\nPerimetro: " + perimetro);
            } else if (form.equals("Triangulo")) {
                System.out.println("Digite os lados do triangulo: ");

                lado1 = sc.nextDouble();
                lado2 = sc.nextDouble();
                lado3 = sc.nextDouble();
                double semiperimetro = (lado1 + lado2 + lado3) / 2;
                double areaTriangulo = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
                System.out.println("Area: " + areaTriangulo + "\nPerimetro: " + semiperimetro * 2);
            } else {
                System.out.println("Digite os lados do retangulo: ");
                double ladoAret = sc.nextDouble();
                double ladoBret = sc.nextDouble();
                double areaRet = ladoBret * ladoAret;
                double perimetroRet = (ladoAret * 2) + (ladoBret * 2);
                System.out.println("Area: " + areaRet + "\nPerimetro: " + perimetroRet);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        EXERCICIO 1
//        System.out.println("Escolha um mes, de 1 (janeiro) a 12 (dezembro): ");
//        int index = sc.nextInt();
//
//        monthIndex(index);

//        EXERCICIO 2
//        System.out.println("Informe sua media: ");
//        double media = sc.nextDouble();
//
//        studentStatus(media);

//        EXERCICIO 3
        System.out.println("Qual a forma geometrica?");
        String forma = sc.nextLine();
        geometricForms(forma);
    }
}