//parametros  de nuemero s que se sumen netresi y sean llamados por la funcion main ?

//Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene?
public coche ( int puertas) {  

            this.puertas=puertas;
}
//función número de puertas que tiene el coche?
public int insertarPuertas (int puertas) 
{           // MÉTODO PARA INSERTAR UN VEHÍCULO EN EL ARRAY.

int valorDevuelto = puertas;             /

          if(BuscarNumPuertas(puertas)){
            valorDevuelto = -2;
          //si no, lo agregamos y regresamos 0
          }else
            {
             coches[numPUERTAS] = new NumPuertasVehiculo();
             coches[numCoches].setNumPuertas(puertas);
             numPUERTAS ++;
             valorDevuelto = 0;
            }
        }           // FIN DE BUCLE FOR.
    }

    

return valorDevuelto;
}  
//Buscamos el vehiculo por la matricula
public boolean BuscarVehiculo(string matricula)
{
  for (int i = 0; i < numPUERTAS; i ++) 
  { 
     if (puertas.equals(coches[i].numPUERTAS())
           return true;

     return false;
  }
}





