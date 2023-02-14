import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true){
            int com=0;
            System.out.println("What type do you want to work with(enter number)\n1)Complex number\n2)Matrix\nPress 3 if you want exit");
            try {
                com = console.nextInt();
            }catch (InputMismatchException e){
                System.out.println("You have entered a wrong field value.\n");
                System.exit(-1);
            }
            if (com==1){
                boolean isNumbSaved=false;
                ComplexNumb mNumb=new ComplexNumb();
                while (true){
                    com=0;
                    System.out.println("Do you want:\n1)Add\n2)Multiply\n3)Print in trigonometric form\n4)Back to previous menu");
                    com=console.nextInt();
                    if (com==1){
                        com=0;
                        if (isNumbSaved==true){
                            System.out.println("Do you want work with saved number or new one?\n1)Saved\n2)New");
                            com=console.nextInt();
                        }
                        if (com==1){
                            System.out.print("Second: ");
                            ComplexNumb n2 = new ComplexNumb();
                            n2.setComlexNumber();
                            mNumb = mNumb.add(n2);
                            System.out.print("Result is saved.\nResult: ");
                            mNumb.Print();
                            System.out.println();
                            com = 0;
                        }
                        else if (com==2 || isNumbSaved==false) {
                            System.out.print("First: ");
                            mNumb.setComlexNumber();
                            System.out.print("Second: ");
                            ComplexNumb n2 = new ComplexNumb();
                            n2.setComlexNumber();
                            mNumb = mNumb.add(n2);
                            isNumbSaved = true;
                            System.out.print("Result is saved.\nResult: ");
                            mNumb.Print();
                            System.out.println();
                            com = 0;
                        }
                    }
                    else if (com==2){
                        com=0;
                        if (isNumbSaved==true){
                            System.out.println("Do you want work with saved number or new one?\n1)Saved\n2)New");
                            com=console.nextInt();
                        }
                        if (com==1){
                            System.out.print("Second: ");
                            ComplexNumb n2 = new ComplexNumb();
                            n2.setComlexNumber();
                            mNumb = mNumb.multiply(n2);
                            System.out.print("Result is saved.\nResult: ");
                            mNumb.Print();
                            System.out.println();
                            com = 0;
                        }
                        else if (com==2 || isNumbSaved==false) {
                            System.out.print("First: ");
                            mNumb.setComlexNumber();
                            System.out.print("Second: ");
                            ComplexNumb n2 = new ComplexNumb();
                            n2.setComlexNumber();
                            mNumb = mNumb.multiply(n2);
                            isNumbSaved = true;
                            System.out.print("Result is saved.\nResult: ");
                            mNumb.Print();
                            System.out.println();
                            com = 0;
                        }
                    }
                    else if (com==3){
                        com=0;
                        if (isNumbSaved==true){
                            System.out.println("Do you want work with saved number or new one?\n1)Saved\n2)New");
                            com=console.nextInt();
                        }
                        if (com==1){
                            mNumb.PrintTrig();
                            System.out.println();
                            com = 0;
                        }
                        else if (com==2 || isNumbSaved==false) {
                            System.out.print("New: ");
                            ComplexNumb n2=new ComplexNumb();
                            n2.setComlexNumber();
                            n2.PrintTrig();
                            System.out.println();
                            com = 0;
                        }
                    }
                    else if (com==4){
                        com=0;
                        break;
                    }
                    else{
                    System.out.println("Wrong command number");
                    com=0;
                    break;
                }
            }
            }
            else if (com==2){
                Matrix mMatrix=new Matrix(1);
                boolean isMatrixSaved=false;
                while (true) {
                    try {
                        com = 0;
                        System.out.println("Do you want:\n1)Add\n2)Multiply\n3)Transpose\n4)Print\n5)Back to previous menu");
                        com = console.nextInt();
                        if (com == 1) {
                            com = 0;
                            if (isMatrixSaved == true) {
                                System.out.println("Do you want work with saved number or new one?\n1)Saved\n2)New");
                                com = console.nextInt();
                            }
                            if (com == 1) {
                                System.out.print("Enter sizes (rows:columns): ");
                                int n = console.nextInt();
                                int m = console.nextInt();
                                Matrix m2 = new Matrix(n, m);
                                m2.setMatrix();
                                mMatrix = mMatrix.addMatrix(m2);
                                System.out.print("Result is saved.\nResult: ");
                                mMatrix.PrintMatrix();
                                System.out.println();
                                com = 0;
                            } else if (com == 2 || isMatrixSaved == false) {
                                System.out.print("Enter sizes of first matrix(rows:columns): ");
                                int n = console.nextInt();
                                int m = console.nextInt();
                                mMatrix = new Matrix(n, m);
                                mMatrix.setMatrix();
                                System.out.print("Enter sizes of second matrix(rows:columns): ");
                                n = console.nextInt();
                                m = console.nextInt();
                                Matrix m2 = new Matrix(n, m);
                                m2.setMatrix();
                                mMatrix = mMatrix.addMatrix(m2);
                                isMatrixSaved = true;
                                System.out.print("Result is saved.\nResult: ");
                                mMatrix.PrintMatrix();
                                System.out.println();
                                com = 0;
                            }
                        } else if (com == 2) {
                            com = 0;
                            if (isMatrixSaved == true) {
                                System.out.println("Do you want work with saved number or new one?\n1)Saved\n2)New");
                                com = console.nextInt();
                            }
                            if (com == 1) {
                                System.out.print("Enter sizes (rows:columns): ");
                                int n = console.nextInt();
                                int m = console.nextInt();
                                Matrix m2 = new Matrix(n, m);
                                m2.setMatrix();
                                mMatrix = mMatrix.MultMatrix(m2);
                                System.out.println("Result is saved.\nResult: ");
                                mMatrix.PrintMatrix();
                                System.out.println();
                                com = 0;
                            } else if (com == 2 || isMatrixSaved == false) {
                                System.out.print("Enter sizes of first matrix(rows:columns): ");
                                int n = console.nextInt();
                                int m = console.nextInt();
                                mMatrix = new Matrix(n, m);
                                mMatrix.setMatrix();
                                System.out.print("Enter sizes of second matrix(rows:columns): ");
                                n = console.nextInt();
                                m = console.nextInt();
                                Matrix m2 = new Matrix(n, m);
                                m2.setMatrix();
                                mMatrix = mMatrix.MultMatrix(m2);
                                isMatrixSaved = true;
                                System.out.println("Result is saved.\nResult: ");
                                mMatrix.PrintMatrix();
                                System.out.println();
                                com = 0;
                            }
                        } else if (com == 3) {
                            com = 0;
                            if (isMatrixSaved == true) {
                                System.out.println("Do you want work with saved number or new one?\n1)Saved\n2)New");
                                com = console.nextInt();
                            }
                            if (com == 1) {
                                mMatrix = mMatrix.transpone();
                                System.out.println("Result is saved.\nResult: ");
                                mMatrix.PrintMatrix();
                                System.out.println();
                                com = 0;
                            } else if (com == 2 || isMatrixSaved == false) {
                                System.out.print("Enter sizes of new matrix(rows:columns): ");
                                int n = console.nextInt();
                                int m = console.nextInt();
                                mMatrix = new Matrix(n, m);
                                mMatrix.setMatrix();
                                mMatrix = mMatrix.transpone();
                                isMatrixSaved = true;
                                System.out.println("Result is saved.\nResult: ");
                                mMatrix.PrintMatrix();
                                System.out.println();
                                com = 0;
                            }
                        } else if (com == 4) {
                            com = 0;
                            if (isMatrixSaved == true) {
                                mMatrix.PrintMatrix();
                                System.out.println();
                            } else {
                                System.out.println("You haven't saved matrix");
                            }
                        } else if (com == 5) {
                            com = 0;
                            break;
                        } else {
                            System.out.println("Wrong command number");
                            com = 0;
                            break;
                        }
                    }catch (InputMismatchException e){
                        System.out.println("You have entered a wrong field value.\n");
                        System.exit(-2);
                    }
                }
            }
            else if (com==3){
                break;
            }
            else{
                System.out.println("Wrong command number");
                com=0;
            }
        }
    }
}

