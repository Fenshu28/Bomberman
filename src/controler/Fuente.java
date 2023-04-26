/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

public class Fuente {
    private Font font = null;

    public Fuente(String url){
        String fontName = url;
        try {
            //Se carga la fuente
            InputStream is =  getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (FontFormatException | IOException ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(fontName + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);            
        }
  }

    /* Font.PLAIN = 0 , Font.BOLD = 1 , Font.ITALIC = 2
 * tamanio = float
 */
    public Font getFuente( int estilo, float tamanio)
    {
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }
}
