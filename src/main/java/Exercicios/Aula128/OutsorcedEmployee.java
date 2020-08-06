package Exercicios.Aula128;

public class OutsorcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsorcedEmployee( String name, Integer hours, Double valuePerHour, Double additionalCharge ) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public OutsorcedEmployee() {
        super();
    }
    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge( Double additionalCharge ) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return hours * valuePerHour + (additionalCharge * 1.10);
    }

}
