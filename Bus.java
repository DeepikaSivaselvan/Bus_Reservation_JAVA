package BusResv;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    // Constructor
    Bus(int no, boolean ac, int cap) {
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    // Accessor methods
    public int getBusNo() {
        return busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public int getCapacity() {
        return capacity;
    }

    // Mutator methods
    public void setAc(boolean val) {
        ac = val;
    }

    public void setCapacity(int cap) {
        capacity = cap;
    }

    // Method to display bus information
    public void displayBusInfo() {
        System.out.println("BusNo: " + busNo + " | AC: " + ac + " | Total Capacity: " + capacity);
    }
}
