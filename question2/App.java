public class App {
    public static void main(String[] args) {
        Employee ceo = new Employee("Settha", "CEO", 500000);

        Employee sale1 = new Employee("Kamphaka", "Head Sales", 300000);
        Employee sale2 = new Employee("Wiroj", "Sales", 150000);
        Employee sale3 = new Employee("Weeranan", "Sales", 100000);
        sale1.emp.add(sale2);
        sale1.emp.add(sale3);

        Employee market1 = new Employee("UngInk", "Head Marketing", 300000);
        Employee market2 = new Employee("Oak", "Marketing", 200000);
        Employee market3 = new Employee("Aem", "Marketing", 250000);
        market1.emp.add(market2);
        market1.emp.add(market3);

        ceo.emp.add(sale1);
        ceo.emp.add(market1);

        printAllEmployee(ceo);
    }
    public static void printAllEmployee(Employee ceo) {
        System.out.println(ceo);
        for (Employee child : ceo.emp) {
            printAllEmployee(child);
        }
    }
}
