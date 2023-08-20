package com.example2.Semanafinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final ProductoRepository repositoryP;
     private final VentaRepository repositoryV;
       private final VentaDetalleRepository repositoryD;

    @Autowired
	public DatabaseLoader(ProductoRepository repositoryP,VentaRepository repositoryV,VentaDetalleRepository repositoryD) {
		this.repositoryP = repositoryP;
        this.repositoryV = repositoryV;
        this.repositoryD= repositoryD;
		
	}

    
	@Override
	public void run(String... strings ) throws Exception {

        this.repositoryP.save(new Producto("Arroz", 10.50));
         this.repositoryP.save(new Producto("Aceite", 10.45));
          this.repositoryP.save(new Producto("Mermelada", 2.60));
           this.repositoryP.save(new Producto("Mantequilla", 5.00));
		
		Producto parroz = new Producto("Arroz",10.50);
		this.repositoryP.save(parroz );
		Producto paceite = new Producto("Aceite",10.45);
		this.repositoryP.save(paceite);
		this.repositoryP.save(new Producto("Azucar",5.50));


        Venta vQueen = new Venta(20.90);
		this.repositoryV.save(vQueen);


        this.repositoryD.save(new VentaDetalle(parroz,vQueen,2));
		this.repositoryD.save(new VentaDetalle(paceite,vQueen ,2));
    
}

}