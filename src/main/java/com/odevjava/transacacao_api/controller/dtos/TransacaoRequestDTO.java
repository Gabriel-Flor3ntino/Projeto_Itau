package com.odevjava.transacacao_api.controller.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.time.OffsetDateTime;

public record TransacaoRequestDTO(
        @NotNull(message = "O valor não pode ser nulo")
        @PositiveOrZero(message = "O valor não pode ser negativo")
        Double valor,

        @NotNull(message = "A data e hora não podem ser nulas")
        OffsetDateTime dataHora
) {
}
