package com.algaworks.model;

import java.time.LocalDateTime;

public class Aluguel {

	private Cliente cliente;
	private Carro carro;

	private LocalDateTime dataRetirada;
	private LocalDateTime dataPrevistaDevolucao;
	private LocalDateTime dataDevolucao;

	public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataRetirada, LocalDateTime dataPrevistaDevolucao) {
		this.cliente = cliente;
		this.carro = carro;
		this.dataRetirada = dataRetirada;
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public LocalDateTime getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(LocalDateTime dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public LocalDateTime getDataPrevistaDevolucao() {
		return dataPrevistaDevolucao;
	}

	public void setDataPrevistaDevolucao(LocalDateTime dataPrevistaDevolucao) {
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}

	public LocalDateTime getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDateTime dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

}
