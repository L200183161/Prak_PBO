
import java.text.NumberFormat;
import java.util.Locale;

class PegawaiClass {
        PegawaiClass(){
            System.out.println("####Hey you have done this before?$$$$$$$$ ");
        }
        PegawaiClass(int choice){
           setPosition (choice);
        }
        private String name = "Donny Rizal Adhi Pratama";
	private String NIM = "L200183161";           
	protected void SetNama(String name) {
		this.name = name;
	}
	protected void SetNIM(String NIM) {
		this.NIM = NIM;
	}
        public String getName(){
            return this.name;
        }
        public String getNIM(){
            return this.NIM;
        }

    public void setPosition(int choice) {
        double salary = 0, overtime;
        System.out.println("For detailed salary, input your position number :\n"
                + "1. Manager Senior \n2. Manager Junior\n");
        if (choice == 1){
            salary = 2000;
            overtime = 500;
            System.out.println("Your Salary : $" + salary + "\nAnd Overtime "
                    +overtime + " minutes\n");
        }
        else 
            if(choice == 2){
            salary = 4000;
            overtime = 25;
            System.out.println("Your Salary : $"+ salary + "\nAnd your Overtime "+
                    overtime + " minutes\n");
        }
        else{
            System.out.println("Please enter the correct number\n");
        }
        double Kurs = salary * 14500;
        NumberFormat KursIndo = NumberFormat.getCurrencyInstance(new Locale ("in", "ID"));
        System.out.printf("\n If the currency Dollars to Rupiahs is Rp. 14.500.000,00"
                + "\n So the salary in rupiahs will be : %s %n", KursIndo.format(Kurs));
    }
}
