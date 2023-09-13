package com.example.tpDDS;

import com.example.tpDDS.Entidades.*;
import com.example.tpDDS.Repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class TpDdsApplication {

	@Autowired
	ClienteRepositorio clienteRepositorio;
	@Autowired
	DetallePedidoRepositorio detallePedido;
	@Autowired
	DomicilioRepositorio domicilioRepositorio;
	@Autowired
	FacturaRepositorio facturaRepositorio;
	@Autowired
	PedidoRepositorio pedidoRepositorio;
	@Autowired
	ProductoRepositorio productoRepositorio;
	@Autowired
	RubroRepositorio rubroRepositorio;
	@Autowired
	private DetallePedidoRepositorio detallePedidoRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(TpDdsApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ClienteRepositorio clienteRepo) {
		return args -> {
			System.out.println("FUNCIONANDO");
			Cliente cliente = Cliente.builder()
					.nombre("Pedro")
					.apellido("Donnarumma")
					.telefono("2615937874")
					.email("pedrodonnarumma@gmail.com")
					.build();

			Domicilio domicilio = Domicilio.builder()
					.calle("Los peralitos")
					.numero("2226")
					.localidad("Vistalba")
					.build();

			DetallePedido detallePedido = DetallePedido.builder()
					.cantidad(1)
					.subtotal(1750)
					.build();

			Producto producto= Producto.builder()
					.tipoProducto("Bebida")
					.tiempoEstimadoCocina(0)
					.denominacion("Cocacola")
					.precioVenta(700)
					.precioCompra(350)
					.stockActual(100)
					.stockMinimo(0)
					.unidadMedida("Unidad")
					.receta(null)
					.build();

			productoRepositorio.save(producto);

			detallePedido.setProducto(producto);

			Pedido pedido = Pedido.builder()
					.estado("Entregado")
					.fecha(new Date(2023,Calendar.SEPTEMBER,12))
					.tipoEnvio("Take away")
					.total(3200)
					.build();

			pedido.agregarDetalle(detallePedido);

			Factura factura = Factura.builder()
					.numero(1123)
					.fecha(new Date(2023, Calendar.SEPTEMBER,12))
					.descuento(5)
					.formaDePago("Efectivo")
					.total(3000)
					.build();

			pedido.setFactura(factura);


			Rubro rubro =  Rubro.builder()
					.denominacion("Comida rápida")
					.build();

			rubro.agregarProducto(producto);

			cliente.agregarDomicilio(domicilio);
			cliente.agregarPedido(pedido);

			clienteRepositorio.save(cliente);

		};
	}

}