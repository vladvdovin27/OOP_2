public class Phone {
    private String number;
    private String model;
    private double weight;

    Phone(){
        this.number = "zero";
        this.model = "zero";
        this.weight = 0.0;
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number) {
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void infoPhone(Phone phone){
        System.out.println("Number: " + phone.getNumber() + ", Model: " + phone.getModel() + ", Weight: " + phone.getWeight());
    }

    public void receiveCall(String nameCaller){
        System.out.println("Звонит " + nameCaller);
    }

    public void receiveCall(String  nameCaller, String callerNumber) {
        System.out.println("Звонит: " +  nameCaller + " (" + callerNumber + ")");
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Сообщение отправлено:");
        if (phoneNumbers.length == 0) {
            System.out.println("Нет такого номера.");
        } else {
            for (String number : phoneNumbers) {
                System.out.println("- " + number);
            }
        }
    }

}