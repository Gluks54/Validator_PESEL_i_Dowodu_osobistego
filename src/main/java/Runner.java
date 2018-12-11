import validators.PLIDvalidator;
import validators.Pesel_validate;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
                //Validate ID
        PLIDvalidator pliDvalidator =new PLIDvalidator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your ID number");
        String idNumb = scanner.nextLine();

        while (!pliDvalidator.validate(idNumb)){
            System.out.println("Uncorrect ID");
            idNumb = scanner.nextLine();
        }
        boolean idReaz =  pliDvalidator.validate(idNumb);
        System.out.println(idReaz);

                //Validate PESEL
        Pesel_validate pesel_validate = new Pesel_validate();
        System.out.println("Type your PESEL");
        String pesel = scanner.nextLine();

        while (!pesel_validate.validate(pesel)){
            System.out.println("Uncorrect Pesel try again");
             pesel = scanner.nextLine();
        }
        System.out.println( pesel_validate.validate(pesel));
    }
}
