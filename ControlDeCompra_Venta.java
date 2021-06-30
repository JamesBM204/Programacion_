package PruebaFinal;

import java.util.Scanner;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class ControlDeCompra_Venta {

	static Scanner s=new Scanner(System.in);
	public void generarecibodeventa(String x4[],double z22[], int x22[], int a2[]) {
		System.out.println("\t");
		double total=0;
		double sumartotal[]=new double[x4.length];
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("CONTROL DE VENTAS\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("FECHA "+LocalDate.now()+"\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("Productos"+"\t"+"\t"+"\t"+"\t"+"|Precio \t"+"\t"+"|Codigo"+"\t\t"+"|Cantidad"+"|"+"IVA 15%"+"|"+"Precios total"+"|");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		for(int i=0;i<x4.length;i++) {
			
			if(z22[i]==0) {
			System.out.print("");
			} else {
				DecimalFormat df = new DecimalFormat("#.00");
			System.out.println(x4[i]+"\t"+"\t"+"\t"+"|"+z22[i]+"\t\t\t"+"|"+x22[i]+"\t\t|"+a2[i]+"\t"+"|"+df.format((z22[i]*a2[i])*0.15)+"\t|"+df.format(z22[i]*a2[i]+(z22[i]*a2[i])*0.15)+"\t\t|");
			System.out.println("-----------------------------------------------------------------------------------------------------------------");
			sumartotal[i]=z22[i]*a2[i]+(z22[i]*a2[i])*0.15;
			}
		}
		for(int i=0;i<sumartotal.length;i++) {
			total=total+sumartotal[i];
		}
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t Suma total: "+total+"\t|");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
	}	
	
	public void generarecibo(String x4[],double z22[], int x22[], int a2[], String p,String c) {
		System.out.println("\t");
		double total=0;
		double sumartotal[]=new double[x4.length];
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("RECIBO DE COMPRA\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("FECHA "+LocalDate.now()+"\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("PROVEEDOR: "+p+"\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("COMPRADOR: "+c+"\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("Productos"+"\t"+"\t"+"\t"+"\t"+"|Precio de compras"+"\t"+"|Codigo"+"\t\t"+"|Cantidad"+"|"+"IVA 15%"+"|"+"Precios total"+"|");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		for(int i=0;i<x4.length;i++) {
			
			if(z22[i]==0) {
			System.out.print("");
			} else {
				DecimalFormat df = new DecimalFormat("#.00");
			System.out.println(x4[i]+"\t"+"\t"+"\t"+"|"+z22[i]+"\t\t\t"+"|"+x22[i]+"\t\t|"+a2[i]+"\t"+"|"+df.format((z22[i]*a2[i])*0.15)+"\t|"+df.format(z22[i]*a2[i]+(z22[i]*a2[i])*0.15)+"\t\t|");
			System.out.println("-----------------------------------------------------------------------------------------------------------------");
			sumartotal[i]=z22[i]*a2[i]+(z22[i]*a2[i])*0.15;
			}
		}
		for(int i=0;i<sumartotal.length;i++) {
			total=total+sumartotal[i];
		}
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t Suma total: "+total+"\t|");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
	}	
	public void comprarproductos(String a[],int z3[], double b[], int cod[]){
		boolean comprarmas= true;
		boolean error=true;
	
		String [] pro_com=new String[a.length]; int[] cods=new int[a.length]; double[]preciosdecom=new double[a.length]; int[]cantidadacom=new int[a.length];
		System.out.println("Bien, ahora se realizara la compra de productos");
		System.out.print("Se realizara la compra a nombre de: ");
		String Comprador=s.next();
		System.out.println("");
		System.out.print("Por favor escriba el nombre de su proveedor: ");
		String proveedor=s.next();
		System.out.println("");
		do {
			System.out.println("\n");
		System.out.println("¿Que productos desea comprar?");
		System.out.println("------------------------------------");
		for(int i=0;i<a.length;i++) {
		System.out.println(i+1+"-"+a[i]);
		}
		System.out.println("------------------------------------");
		int opc=s.nextInt();
		if(opc<1||opc>a.length) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opc=s.nextInt();
		}while(opc<1||opc>a.length);
		}
		switch(opc) {
		case 1:
			do {
		System.out.println("¿Cuantas unidades va a comprar?");
		int cantidad=s.nextInt();
		if(cantidad<0) {
			do {
			System.out.println("------------------------------------");
			System.out.println("INGRESE UN VALOR CORRECTO");
			System.out.println("------------------------------------");
			cantidad=s.nextInt();
		}while(cantidad<0);
		}
		System.out.println("\n");
		System.out.println("Esta por comprar "+cantidad+" unidades de "+a[opc-1]);
		System.out.println("¿Esta seguro de realizar esta compra?");
		System.out.println("------------------------------------");
		System.out.println("1-Si");
		System.out.println("2-No");										
		System.out.println("------------------------------------");
		int opcs=s.nextInt();
		if(opcs<1||opcs>2) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opcs=s.nextInt();
		}while(opcs<1||opcs>2);
		}
		if(opcs==1) {
			System.out.println("Excelente, su compra estara reflejada en el recibo");
			z3[opc-1]=z3[opc-1]+cantidad;
			pro_com[opc-1]=a[opc-1];
			cods[opc-1]=cod[opc-1];
			preciosdecom[opc-1]=b[opc-1];
			cantidadacom[opc-1]=cantidadacom[opc-1]+cantidad;
			
			error=false;
			break;
		}else if(opcs==2) {
			error=true;
			
		}
		}while(error==true);
		break;
		
		case 2:
			do {
		System.out.println("¿Cuantas unidades va a comprar?");
		int cantidad=s.nextInt();
		if(cantidad<0) {
			do {
			System.out.println("------------------------------------");
			System.out.println("INGRESE UN VALOR CORRECTO");
			System.out.println("------------------------------------");
			cantidad=s.nextInt();
		}while(cantidad<0);
		}
		System.out.println("\n");
		System.out.println("Esta por comprar "+cantidad+" unidades de "+a[opc-1]);
		System.out.println("¿Esta seguro de realizar esta compra?");
		System.out.println("------------------------------------");
		System.out.println("1-Si");
		System.out.println("2-No");										
		System.out.println("------------------------------------");
		int opcs=s.nextInt();
		if(opcs<1||opcs>2) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opcs=s.nextInt();
		}while(opcs<1||opcs>2);
		}
		if(opcs==1) {
			System.out.println("Excelente, su compra estara reflejada en el recibo");
			z3[opc-1]=z3[opc-1]+cantidad;
			pro_com[opc-1]=a[opc-1];
			cods[opc-1]=cod[opc-1];
			preciosdecom[opc-1]=b[opc-1];
			cantidadacom[opc-1]=cantidadacom[opc-1]+cantidad;
			
			error=false;
			break;
		}else if(opcs==2) {
			error=true;
			
		}
		}while(error==true);
		
			break;	
			
		case 3:
			do {
		System.out.println("¿Cuantas unidades va a comprar?");
		int cantidad=s.nextInt();
		if(cantidad<0) {
			do {
			System.out.println("------------------------------------");
			System.out.println("INGRESE UN VALOR CORRECTO");
			System.out.println("------------------------------------");
			cantidad=s.nextInt();
		}while(cantidad<0);
		}
		System.out.println("\n");
		System.out.println("Esta por comprar "+cantidad+" unidades de "+a[opc-1]);
		System.out.println("¿Esta seguro de realizar esta compra?");
		System.out.println("------------------------------------");
		System.out.println("1-Si");
		System.out.println("2-No");										
		System.out.println("------------------------------------");
		int opcs=s.nextInt();
		if(opcs<1||opcs>2) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opcs=s.nextInt();
		}while(opcs<1||opcs>2);
		}
		if(opcs==1) {
			System.out.println("Excelente, su compra estara reflejada en el recibo");
			z3[opc-1]=z3[opc-1]+cantidad;
			pro_com[opc-1]=a[opc-1];
			cods[opc-1]=cod[opc-1];
			preciosdecom[opc-1]=b[opc-1];
			cantidadacom[opc-1]=cantidadacom[opc-1]+cantidad;
		
			error=false;
			break;
		}else if(opcs==2) {
			error=true;
			
		}
		}while(error==true);
			break;	
		case 4:
			do {
		System.out.println("¿Cuantas unidades va a comprar?");
		int cantidad=s.nextInt();
		if(cantidad<0) {
			do {
			System.out.println("------------------------------------");
			System.out.println("INGRESE UN VALOR CORRECTO");
			System.out.println("------------------------------------");
			cantidad=s.nextInt();
		}while(cantidad<0);
		}
		System.out.println("\n");
		System.out.println("Esta por comprar "+cantidad+" unidades de "+a[opc-1]);
		System.out.println("¿Esta seguro de realizar esta compra?");
		System.out.println("------------------------------------");
		System.out.println("1-Si");
		System.out.println("2-No");										
		System.out.println("------------------------------------");
		int opcs=s.nextInt();
		if(opcs<1||opcs>2) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opcs=s.nextInt();
		}while(opcs<1||opcs>2);
		}
		if(opcs==1) {
			System.out.println("Excelente, su compra estara reflejada en el recibo");
			z3[opc-1]=z3[opc-1]+cantidad;
			pro_com[opc-1]=a[opc-1];
			cods[opc-1]=cod[opc-1];
			preciosdecom[opc-1]=b[opc-1];
			cantidadacom[opc-1]=cantidadacom[opc-1]+cantidad;
		
			error=false;
			break;
		}else if(opcs==2) {
			error=true;
			
		}
		}while(error==true);
			break;
			
		case 5:
			do {
		System.out.println("¿Cuantas unidades va a comprar?");
		int cantidad=s.nextInt();
		if(cantidad<0) {
			do {
			System.out.println("------------------------------------");
			System.out.println("INGRESE UN VALOR CORRECTO");
			System.out.println("------------------------------------");
			cantidad=s.nextInt();
		}while(cantidad<0);
		}
		System.out.println("\n");
		System.out.println("Esta por comprar "+cantidad+" unidades de "+a[opc-1]);
		System.out.println("¿Esta seguro de realizar esta compra?");
		System.out.println("------------------------------------");
		System.out.println("1-Si");
		System.out.println("2-No");										
		System.out.println("------------------------------------");
		int opcs=s.nextInt();
		if(opcs<1||opcs>2) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opcs=s.nextInt();
		}while(opcs<1||opcs>2);
		}
		if(opcs==1) {
			System.out.println("Excelente, su compra estara reflejada en el recibo");
			z3[opc-1]=z3[opc-1]+cantidad;
			pro_com[opc-1]=a[opc-1];
			cods[opc-1]=cod[opc-1];
			preciosdecom[opc-1]=b[opc-1];
			cantidadacom[opc-1]=cantidadacom[opc-1]+cantidad;
		
			error=false;
			break;
		}else if(opcs==2) {
			error=true;
			
		}
		}while(error==true);
			break;	
		}
		System.out.println("¿Desea comprar algo mas?");
		System.out.println("------------------------------------");
		System.out.println("1-Si");
		System.out.println("2-No");										
		System.out.println("------------------------------------");
		int opcs2=s.nextInt();
		if(opcs2<1||opcs2>2) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opcs2=s.nextInt();
		}while(opcs2<1||opcs2>2);
		}
		if(opcs2==2) {
			comprarmas=false;
			
			System.out.println("Bien, ahora se generara un recibo que muestre sus compras realizadas");
			
			generarecibo(pro_com, preciosdecom, cods, cantidadacom, proveedor, Comprador);
			break;
		}else if(opcs2==1) {
			comprarmas=true;
		}
		}while(comprarmas=true);
		
	}
	public void mostrarstock(String x[], double z4[],double z2[], int x2[], int z3[]) {

		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\tJames_BM\t\t\t\t\t\t\t\t|");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("DIRECCION: DEL CENTRO DE SALUD ALTAGRACIA 125 VRS HACIA ARRIBA\t\t\t\t\t|");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("\t\tSTOCK AL DIA " +LocalDate.now()+"\t\t\t\t\t\t\t\t|");
		System.out.println("-------------------------------------------------------------------------------------------------");

		System.out.println("Productos"+"\t"+"\t"+"\t"+"\t"+"|Precio"+"\t"+"|Precio de compras"+"\t"+"|Codigo"+"\t"+"|Cantidad\t"+"|");
		System.out.println("-------------------------------------------------------------------------------------------------");
		for(int i=0;i<x.length;i++) {
	
		System.out.println(x[i]+"\t"+"\t"+"\t"+"|"+z4[i]+"\t"+"|"+z2[i]+"\t\t\t|"+x2[i]+"\t"+"|"+z3[i]+"\t\t"+"|");
		System.out.println("-------------------------------------------------------------------------------------------------");
	
		}
		System.out.println("¿Desea ordenar el stock por: ?");
		System.out.println("------------------------------------");
		System.out.println("1-Precio");
		System.out.println("2-Cantidad");										
		System.out.println("------------------------------------");
		int opcs=s.nextInt();
		if(opcs<1||opcs>2) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opcs=s.nextInt();
		}while(opcs<1||opcs>2);
		}
		if(opcs==1) {
			ordenarprecio(z4, 0, z4.length);
		} else if(opcs==2) {
			ordenarcantidad(z3, 0, z3.length);
		}
		
	}
	public void controldeventas(String p[],double pre[], int cod[],int ca[]) {
		String [] pro_vem=new String[p.length]; int[] cods=new int[p.length]; double[]precios=new double[p.length]; int[]cantidadaven=new int[p.length]; 
		boolean ventasmas=true;
	System.out.println("¿Cuantas ventas han sido realizadas?");
	int num=s.nextInt();
	if(num<0) {
		do {
		System.out.println("------------------------------------");
		System.out.println("INGRESE UN VALOR CORRECTO");
		System.out.println("------------------------------------");
		num=s.nextInt();
	}while(num<0);
	}
	for (int i=0;i<num;i++) {
		System.out.println("CLIENTE #"+(i+1));

		do {
			System.out.println("\n");
		System.out.println("¿Que producto compro?");
		System.out.println("------------------------------------");
		for(int o=0;o<p.length;o++) {
		System.out.println(o+1+"-"+p[o]);
		}
		System.out.println("------------------------------------");
		int opc=s.nextInt();
		if(opc<1||opc>p.length) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opc=s.nextInt();
		}while(opc<1||opc>p.length);
		}
		  if(ca[0]==0&&ca[1]==0&&ca[2]==0&&ca[3]==0&&ca[4]==0&&ca[5]==0) {
			System.out.println("Ya no hay nada en el stock, por favor haga un relleno del inventario");
			break;
		}
		switch(opc) {
		case 1:
			do {
		System.out.println("¿Cuantas unidades compró?");
		int cantidad=s.nextInt();
		if(ca[opc-1]==0) {
			
			System.out.println("Ese producto ya no esta en stock");
			break;
				
		} else if(cantidad>ca[opc-1]) {
			do {
			System.out.println("Esta cantidad no esta disponible");
			System.out.println("Intente nuevamente");
			cantidad=s.nextInt();
			}while(cantidad>ca[opc-1]);
		}
		if(cantidad<0) {
			do {
			System.out.println("------------------------------------");
			System.out.println("INGRESE UN VALOR CORRECTO");
			System.out.println("------------------------------------");
			cantidad=s.nextInt();
		}while(cantidad<0);
		}
		System.out.println("\n");
		System.out.println("El cliente compro "+cantidad+" unidades de "+p[opc-1]);
		System.out.println("¿Esto es cierto?");
		System.out.println("------------------------------------");
		System.out.println("1-Si");
		System.out.println("2-No");										
		System.out.println("------------------------------------");
		int opcs=s.nextInt();
		if(opcs<1||opcs>2) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opcs=s.nextInt();
		}while(opcs<1||opcs>2);
		}
		if(opcs==1) {
			System.out.println("Excelente, su compra estara reflejada en el recibo");
			ca[opc-1]=ca[opc-1]-cantidad;
			pro_vem[opc-1]=p[opc-1];
			cods[opc-1]=cod[opc-1];
			precios[opc-1]=pre[opc-1];
			cantidadaven[opc-1]=cantidadaven[opc-1]+cantidad;
			
			ventasmas=false;
			break;
		}else if(opcs==2) {
			ventasmas=true;
			
		}
		}while(ventasmas==true);
		break;
		
		case 2:
			do {
		System.out.println("¿Cuantas unidades compró?");
		int cantidad=s.nextInt();
if(ca[opc-1]==0) {
			
			System.out.println("Ese producto ya no esta en stock");
			break;
				
		} else if(cantidad>ca[opc-1]) {
			do {
			System.out.println("Esta cantidad no esta disponible");
			System.out.println("Intente nuevamente");
			cantidad=s.nextInt();
			}while(cantidad>ca[opc-1]);
		}
		if(cantidad<0) {
			do {
			System.out.println("------------------------------------");
			System.out.println("INGRESE UN VALOR CORRECTO");
			System.out.println("------------------------------------");
			cantidad=s.nextInt();
		}while(cantidad<0);
		}
		System.out.println("\n");
		System.out.println("El cliente compro "+cantidad+" unidades de "+p[opc-1]);
		System.out.println("¿Esto es cierto?");
		System.out.println("------------------------------------");
		System.out.println("1-Si");
		System.out.println("2-No");										
		System.out.println("------------------------------------");
		int opcs=s.nextInt();
		if(opcs<1||opcs>2) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opcs=s.nextInt();
		}while(opcs<1||opcs>2);
		}
		if(opcs==1) {
			System.out.println("Excelente, su compra estara reflejada en el recibo");
			ca[opc-1]=ca[opc-1]-cantidad;
			pro_vem[opc-1]=p[opc-1];
			cods[opc-1]=cod[opc-1];
			precios[opc-1]=pre[opc-1];
			cantidadaven[opc-1]=cantidadaven[opc-1]+cantidad;
			
			ventasmas=false;
			break;
		}else if(opcs==2) {
			ventasmas=true;
			
		}
		}while(ventasmas==true);
		break;
		
		case 3:
			do {
		System.out.println("¿Cuantas unidades compró?");
		int cantidad=s.nextInt();
if(ca[opc-1]==0) {
			
			System.out.println("Ese producto ya no esta en stock");
			break;
				
		} else if(cantidad>ca[opc-1]) {
			do {
			System.out.println("Esta cantidad no esta disponible");
			System.out.println("Intente nuevamente");
			cantidad=s.nextInt();
			}while(cantidad>ca[opc-1]);
		}
		if(cantidad<0) {
			do {
			System.out.println("------------------------------------");
			System.out.println("INGRESE UN VALOR CORRECTO");
			System.out.println("------------------------------------");
			cantidad=s.nextInt();
		}while(cantidad<0);
		}
		System.out.println("\n");
		System.out.println("El cliente compro "+cantidad+" unidades de "+p[opc-1]);
		System.out.println("¿Esto es cierto?");
		System.out.println("------------------------------------");
		System.out.println("1-Si");
		System.out.println("2-No");										
		System.out.println("------------------------------------");
		int opcs=s.nextInt();
		if(opcs<1||opcs>2) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opcs=s.nextInt();
		}while(opcs<1||opcs>2);
		}
		if(opcs==1) {
			System.out.println("Excelente, su compra estara reflejada en el recibo");
			ca[opc-1]=ca[opc-1]-cantidad;
			pro_vem[opc-1]=p[opc-1];
			cods[opc-1]=cod[opc-1];
			precios[opc-1]=pre[opc-1];
			cantidadaven[opc-1]=cantidadaven[opc-1]+cantidad;
			
			ventasmas=false;
			break;
		}else if(opcs==2) {
			ventasmas=true;
			
		}
		}while(ventasmas==true);
		break;
		
		case 4:
			do {
		System.out.println("¿Cuantas unidades compró?");
		int cantidad=s.nextInt();
if(ca[opc-1]==0) {
			
			System.out.println("Ese producto ya no esta en stock");
			break;
				
		} else if(cantidad>ca[opc-1]) {
			do {
			System.out.println("Esta cantidad no esta disponible");
			System.out.println("Intente nuevamente");
			cantidad=s.nextInt();
			}while(cantidad>ca[opc-1]);
		}
		if(cantidad<0) {
			do {
			System.out.println("------------------------------------");
			System.out.println("INGRESE UN VALOR CORRECTO");
			System.out.println("------------------------------------");
			cantidad=s.nextInt();
		}while(cantidad<0);
		}
		System.out.println("\n");
		System.out.println("El cliente compro "+cantidad+" unidades de "+p[opc-1]);
		System.out.println("¿Esto es cierto?");
		System.out.println("------------------------------------");
		System.out.println("1-Si");
		System.out.println("2-No");										
		System.out.println("------------------------------------");
		int opcs=s.nextInt();
		if(opcs<1||opcs>2) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opcs=s.nextInt();
		}while(opcs<1||opcs>2);
		}
		if(opcs==1) {
			System.out.println("Excelente, su compra estara reflejada en el recibo");
			ca[opc-1]=ca[opc-1]-cantidad;
			pro_vem[opc-1]=p[opc-1];
			cods[opc-1]=cod[opc-1];
			precios[opc-1]=pre[opc-1];
			cantidadaven[opc-1]=cantidadaven[opc-1]+cantidad;
			
			ventasmas=false;
			break;
		}else if(opcs==2) {
			ventasmas=true;
			
		}
		}while(ventasmas==true);
		break;
		
			
		case 5:
			do {
		System.out.println("¿Cuantas unidades compró?");
		int cantidad=s.nextInt();
if(ca[opc-1]==0) {
			
			System.out.println("Ese producto ya no esta en stock");
			break;
				
		} else if(cantidad>ca[opc-1]) {
			do {
			System.out.println("Esta cantidad no esta disponible");
			System.out.println("Intente nuevamente");
			cantidad=s.nextInt();
			}while(cantidad>ca[opc-1]);
		}
		if(cantidad<0) {
			do {
			System.out.println("------------------------------------");
			System.out.println("INGRESE UN VALOR CORRECTO");
			System.out.println("------------------------------------");
			cantidad=s.nextInt();
		}while(cantidad<0);
		}
		System.out.println("\n");
		System.out.println("El cliente compro "+cantidad+" unidades de "+p[opc-1]);
		System.out.println("¿Esto es cierto?");
		System.out.println("------------------------------------");
		System.out.println("1-Si");
		System.out.println("2-No");										
		System.out.println("------------------------------------");
		int opcs=s.nextInt();
		if(opcs<1||opcs>2) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opcs=s.nextInt();
		}while(opcs<1||opcs>2);
		}
		if(opcs==1) {
			System.out.println("Excelente, su compra estara reflejada en el recibo");
			ca[opc-1]=ca[opc-1]-cantidad;
			pro_vem[opc-1]=p[opc-1];
			cods[opc-1]=cod[opc-1];
			precios[opc-1]=pre[opc-1];
			cantidadaven[opc-1]=cantidadaven[opc-1]+cantidad;
			
			ventasmas=false;
			break;
		}else if(opcs==2) {
			ventasmas=true;
			
		}
		}while(ventasmas==true);
		break;
		
		}

		System.out.println("¿Se vendio algo mas?");
		System.out.println("------------------------------------");
		System.out.println("1-Si");
		System.out.println("2-No");										
		System.out.println("------------------------------------");
		int opcs2=s.nextInt();
		if(opcs2<1||opcs2>2) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opcs2=s.nextInt();
		}while(opcs2<1||opcs2>2);
		}
		if(opcs2==2) {
			ventasmas=false;
			
			System.out.println("Bien, ahora se generara un recibo que muestre sus ventas realizadas");
			
			generarecibodeventa(pro_vem, precios, cods, cantidadaven);
			break;
		}else if(opcs2==1) {
			ventasmas=true;
		}
		}while(ventasmas=true);
		
	
			
	
		
		
		
		
		}
		
		
	
}
	public static void ordenarprecio(double A[], int izq, int der) {

		  double pivote=A[izq]; 
		  int i=izq;         
		  int j=der;        
		  double aux;
		 
		  while(i < j){                                                       
		     while(A[i] <= pivote && i < j) i++; 
		     while(A[j] > pivote) j--;          
		     if (i < j) {                                        
		         aux= A[i];                    
		         A[i]=A[j];
		         A[j]=aux;
		     }
		   }
		   
		   A[izq]=A[j];                                        
		   A[j]=pivote;      
		   
		   if(izq < j-1)
		      ordenarprecio(A,izq,j-1);          
		   if(j+1 < der)
		      ordenarprecio(A,j+1,der);         
		   
		}
	
	
	public static void ordenarcantidad(int A[], int izq, int der) {

		  int pivote=A[izq]; 
		  int i=izq;         
		  int j=der;        
		  int aux;
		 
		  while(i < j){                                                       
		     while(A[i] <= pivote && i < j) i++; 
		     while(A[j] > pivote) j--;          
		     if (i < j) {                                        
		         aux= A[i];                    
		         A[i]=A[j];
		         A[j]=aux;
		     }
		   }
		   
		   A[izq]=A[j];                                        
		   A[j]=pivote;      
		   
		   if(izq < j-1)
		      ordenarcantidad(A,izq,j-1);          
		   if(j+1 < der)
		      ordenarcantidad(A,j+1,der);         
		   
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String Productos[]=new String[5]; double precios[]=new double[5]; double preciodecompra[]=new double[5];int codigo[]=new int[5]; int cantidad[]=new int[5];
		Productos[0]="JABON\t\t"; precios[0]=60; preciodecompra[0]=60;codigo[0]=1114; cantidad[0]=10;
		Productos[1]="PEGA_LOCA\t"; precios[1]=36; preciodecompra[1]=36;codigo[1]=1345; cantidad[1]=20;
		Productos[2]="SHAMPOO  \t";precios[2]=20; ;preciodecompra[2]=20;; codigo[2]=1052; cantidad[2]=25;
		Productos[3]="DESODORANTE\t"; precios[3]=60;preciodecompra[3]=60; codigo[3]=972; cantidad[3]=25;
		Productos[4]="CREMA_DE_CABELLO"; precios[4]=177; preciodecompra[4]=175;codigo[4]=1254; cantidad[4]=5;
		ControlDeCompra_Venta obj= new ControlDeCompra_Venta();
		boolean abastecerse=true;
		boolean volver=true;
		do {
		System.out.println("Bienvenido al control de compra y venta de su empresa");
		System.out.println("Para empezar a trabajr en este control de compra y venta, necesito el nombre de su empresa");
		System.out.println("El nombre de su empresa es: James_BM");
		System.out.println("Excelente, ahora que tenemos el nombre de su empresa empecemos por analizar su Stock \n");
		
		obj.mostrarstock(Productos, precios,preciodecompra, codigo, cantidad);
	//	System.out.println("------------------------------------");
	//	System.out.println("1-Si");
	//	System.out.println("2-No");										//Lineas de eleccion
	//	System.out.println("------------------------------------");
		
		System.out.println("\n");
		System.out.println("Es hora de manejar su inventario");
		System.out.println("¿Desea realizar reabastecimiento?");
		System.out.println("------------------------------------");
		System.out.println("1-Si");
		System.out.println("2-No");
		System.out.println("------------------------------------");
		int opc=s.nextInt();
		if(opc<1||opc>2) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opc=s.nextInt();
		}while(opc<1||opc>2);
		}
		if(opc==1) {
			do {
			obj.comprarproductos(Productos, cantidad, preciodecompra, codigo);
			System.out.println("");
			System.out.println("¿Desea ver su stock de nuevo?");
			System.out.println("------------------------------------");
			System.out.println("1-Si");
			System.out.println("2-No");
			System.out.println("------------------------------------");
			int opc3=s.nextInt();
			if(opc3<1||opc3>2) {
				do {
				System.out.println("----------------------------------------------------------------");
				System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
				System.out.println("----------------------------------------------------------------");
				opc3=s.nextInt();
			}while(opc3<1||opc3>2);
			}
			if(opc3==1) {
				obj.mostrarstock(Productos, precios, preciodecompra, cantidad, codigo);
				System.out.println("¿Desea abastecerse de nuevo?");
				System.out.println("------------------------------------");
				System.out.println("1-Si");
				System.out.println("2-No");
				System.out.println("------------------------------------");
				int opc4=s.nextInt();
				if(opc4<1||opc4>2) {
					do {
					System.out.println("----------------------------------------------------------------");
					System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
					System.out.println("----------------------------------------------------------------");
					opc4=s.nextInt();
				}while(opc4<1||opc4>2);
				}
				if(opc4==2) {
					abastecerse=false;
				}
			
			}else if(opc3==2) {
				System.out.println("¿Desea abastecerse de nuevo?");
				System.out.println("------------------------------------");
				System.out.println("1-Si");
				System.out.println("2-No");
				System.out.println("------------------------------------");
				int opc4=s.nextInt();
				if(opc4<1||opc4>2) {
					do {
					System.out.println("----------------------------------------------------------------");
					System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
					System.out.println("----------------------------------------------------------------");
					opc=s.nextInt();
				}while(opc4<1||opc4>2);
				}
				if(opc4==2) {
					abastecerse=false;
				}
			}
			}while(abastecerse==true);
		} 

		
		System.out.println("");
		System.out.println("Entonces nos encargaremos de las ventas");
		System.out.println("¿Quiere realizar un control de sus ventas?");
		System.out.println("------------------------------------");
		System.out.println("1-Si");
		System.out.println("2-No");
		System.out.println("------------------------------------");
		int opcc=s.nextInt();
		if(opcc<1||opcc>2) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opcc=s.nextInt();
		}while(opcc<1||opcc>2);
		}
		if(opcc==1) {
			obj.controldeventas(Productos, precios, codigo, cantidad);
		} else if (opcc==2) {
			
		}
		System.out.println("Ha llegado al final de la aplicacion");
		System.out.println("¿Desea volver a usar la aplicacion?");
		System.out.println("------------------------------------");
		System.out.println("1-Si");
		System.out.println("2-No");
		System.out.println("------------------------------------");
		int opccw=s.nextInt();
		if(opccw<1||opccw>2) {
			do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ha introducido un valor erroneo, por favor elija una opcion valida");
			System.out.println("----------------------------------------------------------------");
			opccw=s.nextInt();
		}while(opccw<1||opccw>2);
	}
		
		if(opccw==2) {
			System.out.println("Gracias por haber utilizado la aplicacion");
			volver=false;
			
		} else if(opccw==1) {
			volver=true;
			
		}
		
}while(volver=true);
	}
	
}