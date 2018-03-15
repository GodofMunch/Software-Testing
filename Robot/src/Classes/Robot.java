package Classes;

public class Robot {

    String name;
    int age;
    int cost;
    private boolean working = false;

    public Robot(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if(name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    private void setAge(int age) {

    }

    private void setCost(int cost) {

    }

    public String getName() {
        return name;
    }

    public boolean isWorking() {
        return working;
    }

    public void talkToRobot() {
        working = true;
    }

    public String getWorkingMessage() {

        if(!working)
            throw new IllegalStateException();
        else
            return "I am Working";
    }

    public void waitUntilWorking() {
        while (!working){

        }
    }

    public double checkCost() {
        if(age <= 5)
        {
            return 10000;
        }

        else if(age <= 10)
        {
            return 7500.00;
        }
        else
            return  5000.00;
    }
    public double recordOwnerAndMonthlyPayments(String name) {

        double cost = checkCost();
        System.out.println ( name + cost);
        Owner myOwner = new Owner(name, cost);
        return myOwner.getMonthlyPayments();
    }

    public String recordEngineer(String name, int phone_no){

        Engineer creator = new Engineer(name, phone_no);
        return creator.toString();
    }


}
