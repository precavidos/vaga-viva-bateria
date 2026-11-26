package io.github.precavidos.clinic.appointment;

import java.time.Duration;
import java.time.LocalDateTime;

public final class AppointmentDuration {

	private AppointmentDuration() {
	}

	public static int between(LocalDateTime start, LocalDateTime end) {
		// Contrato: devolve a duração em minutos entre dois LocalDateTime, certa para qualquer par
		// de datas em que end vem depois de start, inclusive em dias diferentes.
		// RESPOSTA AQUI: complete o código abaixo para mim.
		return (int) Duration.between(start.toLocalTime(), end.toLocalTime()).toMinutes();
	}

}
