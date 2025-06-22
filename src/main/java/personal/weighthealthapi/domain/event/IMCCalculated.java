package personal.weighthealthapi.domain.event;

public record IMCCalculated(
        Integer id,
        Double imcValue
) {
}
