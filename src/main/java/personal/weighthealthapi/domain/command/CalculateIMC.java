package personal.weighthealthapi.domain.command;

public record CalculateIMC(
        Integer id,
        Integer weigth,
        Integer height
) { }
