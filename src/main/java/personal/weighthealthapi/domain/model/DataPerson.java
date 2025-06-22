package personal.weighthealthapi.domain.model;

import personal.weighthealthapi.domain.event.IMCCalculated;

public class DataPerson {

    Integer id;
    Integer weight;
    Integer height;

    public DataPerson(Integer id, Integer weigth, Integer height) {
        this.id = id;
        this.weight = weigth;
        this.height = height;
    }

    public IMCCalculated calculateIMC() {
        Double imc = weight / Math.pow(height / 100.0, 2);
        return new IMCCalculated(id, imc);
    }
}
