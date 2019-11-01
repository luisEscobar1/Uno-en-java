package baraja;

import enumerados.Color;

/**
 * 
 *
 * @author User
 */
public class BarajaUno extends Baraja {



    public BarajaUno() {
        super();

        
            numCartas = 40;
            cartasPorColor = 10;
        

        crearBaraja(); 
        super.barajar(); 
    }

    @Override
    public void crearBaraja() {

        this.cartas = (Carta<Color>[]) new Carta[numCartas];

        Color[] colores = Color.values();

        
        for (int i = 0; i < colores.length; i++) {

           
            for (int j = 0; j < cartasPorColor; j++) {

                
                cartas[((i * cartasPorColor) + j)] = new Carta(j + 1, colores[i]);

            }

        }

    }

}
