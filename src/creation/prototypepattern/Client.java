package creation.prototypepattern;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Team firstTeam = new Team("firstTeam");
        firstTeam.addEmployee(new Employee("James"));
        firstTeam.addEmployee(new Employee("Bob"));

        Team copyTeam = (Team) firstTeam.clone();

        System.out.println("Are they the same instance? => " + (firstTeam==copyTeam));
        System.out.println("Do they have the same content? => " + (firstTeam.equals(copyTeam)));

        System.out.println("firstTeams's members? => " + firstTeam.getEmployees());
        System.out.println("copyTeams's members? => " + copyTeam.getEmployees());

        firstTeam.getEmployees().set(0, new Employee("Gale"));

        System.out.println("firstTeams's members? => " + firstTeam.getEmployees());
        System.out.println("copyTeams's members? => " + copyTeam.getEmployees());
    }
}
