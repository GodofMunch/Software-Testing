public class Robot {

    String name;
    private boolean working = false;

    public Robot(String name) {
        setName(name);
    }

    private void setName(String name) {
        if(name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
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
}
