package ru.skypro;

public class Main {

    public static void printAllEmployee (Employee array [])  { //Печатает Список всех сотрудников с данными
        System.out.println(" Список всех работников: ");
        for (int i = 0; i < Employee.getCounter() ; i++) {
            System.out.println(array[i].toString());
        }
    }
    public static int summOfSalary (Employee[]array){// Показывает сумму всех затрат на выходе дает значение переменной int
        int summ = 0;
        for (int i = 0; i < Employee.getCounter(); i++) {

            summ = summ + array[i].getSalary();
        }
         return summ;
    }
    public static String minSalaryEmployee (Employee[]array){//Показывает сотрудника с минимальной ЗП
        Employee salary = array[0];                          // На выходе дает переменную String (метод toString)
        for (int i = 0; i < Employee.getCounter(); i++) {
            if (salary.getSalary () > array[i].getSalary()){
                salary = array[i];
            }
        }
        return salary.toString();
    }
    public static String maxSalaryEmployee (Employee[]array){//Показывает сотрудника с максимальной ЗП
        Employee salary = array[0];                          // На выходе дает переменную String (метод toString)
        for (int i = 0; i < Employee.getCounter(); i++) {
            if (salary.getSalary ()<array[i].getSalary()){
                salary = array[i];
            }
        }
        return salary.toString();
    }
    public static float averageExpense (Employee[]array){ //Считает среднее значение трат
        float averageExpense = 0f;                        // на выходе дает переменную float
         averageExpense = summOfSalary(array)/Employee.getCounter();
        return averageExpense;
    }
    public static void printAllEmployeeName(Employee[]array){ // Печатает Ф.И.О всех сотрудников
        for (int i = 0; i < Employee.getCounter(); i++) {
            System.out.println(array[i].getNameOfEmployer());
        }
    }


    public static void main(String[] args) {
      Employee [] arr = new Employee[10];
      arr [0] = new Employee("Иванов Иван Иванович",1,30000);
      arr [1] = new Employee("Семенов Семен Семенович",2,35000);
      arr [2] = new Employee("Артемов Артем Артемович",3,29000);
      arr [3] = new Employee("Иванова Екатерина Ивановна",4,30000);
      arr [4] = new Employee("Семенова Александра Семеновна",5,43000);
        arr [5] = new Employee("Артемова Евгения Артемовна",4,30000);
        arr [6] = new Employee("Шапкин Рустам Альбертович",2,65300);
        arr [7] = new Employee("Кошкин Тимур Иванович",3,24500);
        arr [8] = new Employee("Трушкин Семен Аркадьевич",4,30000);
        arr [9] = new Employee("Бойко Андрей Денисович",2,45000);
        printAllEmployee(arr);// Печать всех сотрудников
        System.out.println( summOfSalary(arr));//Сумма трат
        System.out.println( minSalaryEmployee(arr));//Сотрудник с минимальной ЗП
        System.out.println(maxSalaryEmployee(arr)); //Сотрудник с максимальной ЗП
        System.out.println(averageExpense(arr)); // Среднее значение трат (ЗП)
        printAllEmployeeName(arr); //Имена всех сотрудников
    }
}
