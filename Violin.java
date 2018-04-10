/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentosmusicales;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author gfier
 */
public class Violin extends Instrumento
{
    public Violin()
    {
        setDescripcion("violin");
    }
    @Override
    public void reproducir()
    {
        try {            
            // Se obtiene un Clip de sonido
            Clip sonido = AudioSystem.getClip();            
            // Se carga con un fichero wav
            sonido.open(AudioSystem.getAudioInputStream(new File("violin.wav")));
            sonido.start();
            Thread.sleep(1);
            // Espera mientras se esté reproduciendo.
            while  (sonido.isRunning())
            {
                Thread.sleep(10);
            }
            System.out.println("Terminó de reproducirse el sonido "+getDescripcion());
        }
        catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
