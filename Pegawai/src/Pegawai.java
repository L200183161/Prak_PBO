
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

class Pegawai {
        public Pegawai(){
            System.out.println("####Hey you have done this before?$$$$$$$$ ");
        }
        public Pegawai(int choice){
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
        System.out.println("For detailed salary, input your position number :\n"
                + "1. Manager Senior \n2. Manager Junior\n");
        double Kurs = 14500;
        if (choice == 1){
            double salary = 2000;
            int overtime = 500;
            System.out.println("Your Salary : $" + salary + "\nAnd Overtime "
                    +overtime + " minutes\n");
            System.out.println("If the Kurs dollar to Rupiah : Rp" +Kurs);
        }
        else 
            if(choice == 2){
            double salary = 4000;
            int overtime = 25;
            System.out.println("Your Salary : $"+ salary + "\nAnd your Overtime "+
                    overtime + " minutes\n");
            System.out.println("If the Kurs dollar to Rupiah : Rp" +Kurs);
            System.out.println("So the salary in Rupiah :Rp" +(double) Kurs*salary);
        }
        else{
            System.out.println("Please enter the correct number\n");
        }
    }
}

