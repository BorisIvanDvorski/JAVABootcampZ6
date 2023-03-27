public class Employee {
    Employee(){
        this("none","none",0,0);
    }
    Employee(String name, String surname, double hourlyRate, int hoursWorked){
        setName(name);
        setSurname(surname);
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }

    public double calculatePay(){
        if(hoursWorked<0 || hourlyRate<0){
            throw new IllegalArgumentException("Greška: Podaci o satnici ili broju radnih sati su neispravni.");
        }
        else{
            return hourlyRate*hoursWorked;
        }
    }

    private String name;
    private String surname;
    private double hourlyRate;
    private int hoursWorked;
}
