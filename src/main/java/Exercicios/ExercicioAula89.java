package Exercicios;

public class ExercicioAula89 {
    private String name;
    private String email;

    public ExercicioAula89( String name, String email ) {
        this.name = name;
        this.email = email;
    }

    public ExercicioAula89(){

    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

//    ExercicioAula89[] hotel = new ExercicioAula89[10];
//        System.out.print("How many rooms will be rented? ");
//    int qtdQuartos = Integer.parseInt(scanner.nextLine());
//        for (int i = 0 ; i < qtdQuartos; i++){
//        System.out.println("Rent #" + (i+1) +": ");
//        System.out.print("Name: ");
//        String name = scanner.nextLine();
//        System.out.print("Email: ");
//        String email = scanner.nextLine();
//        System.out.print("Room: ");
//        int room = Integer.parseInt(scanner.nextLine());
//        hotel[room] = new ExercicioAula89(name, email);
//    }
//        System.out.print("Busy rooms:");
//        for (int i = 0; i < hotel.length ; i++){
//        if (hotel[i] != null){
//            System.out.println(i + ": " + hotel[i].getName() + ", " + hotel[i].getEmail());
//        }
//    }
}
