package com.algaworks.exemplo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import com.algaworks.model.Cliente;

public class CadastroCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("João Silva", LocalDate.of(2002, Month.OCTOBER, 10));

		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();
		
		if (idade >= 18) {
			System.out.printf("Pode ser cadastrado com a idade %d", idade);
		} else {
			System.out.printf("Não pode ser cadastrado com a idade %d", idade);
		}
	}
}
