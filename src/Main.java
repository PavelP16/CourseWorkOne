public class Main {


    public static void main(String[] args) {

        DataBaseCompany dataBaseCompany = new DataBaseCompany();
        dataBaseCompany.addEmployee("Сергеев Сергей Сергеевич",1,80_000 );
        dataBaseCompany.addEmployee("Алексеев Алексей Алексеевич", 1, 40_000);
        dataBaseCompany.addEmployee("Антонов Антон Антонович", 1, 41_000);
        dataBaseCompany.addEmployee("Егоров Егор Егорович", 3, 28_500);
        dataBaseCompany.addEmployee("Васильев Василий Васильевич", 2, 142_000);
        dataBaseCompany.addEmployee("Анатольев Анатолий Анатольевич", 2, 100_000);
        dataBaseCompany.addEmployee("Захаров Захар Захарович", 5, 88_500);



        dataBaseCompany.printAllInformation();

        dataBaseCompany.calculateSalary();

        dataBaseCompany.findMinimalSalaryWorker();

        dataBaseCompany.findHighestSalaryWorker();

        dataBaseCompany.findAverageSalary();



        dataBaseCompany.printAllEmployeesFullNames();

        dataBaseCompany.calculateSalaryOfDepartment(1);

        dataBaseCompany.findAverageSalaryOfDepartment(2);

        dataBaseCompany.indexSalary();
        dataBaseCompany.printAllInformation(); // проверка индексации

        dataBaseCompany.findMinimalSalaryWorkerOfDepartment(3);

        dataBaseCompany.findHighestSalaryWorkerOfDepartment(4);


        dataBaseCompany.indexSalaryOfDepartment(10, 5);
        dataBaseCompany.printAllInformation(); // проверка индексации

        dataBaseCompany.printAllInformationOfDepartment(1);


        dataBaseCompany.findWorkersWithSalaryBelowParameter(60_000);

        dataBaseCompany.findWorkersWithSalaryHigherParameter(45_000);

    }

}
