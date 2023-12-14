
package iphone.main;

import iphone.Iphone;
import iphone.aparelhotelefonico.AparelhoTelefonico;
import iphone.navegador.NavegadorInternet;
import iphone.reprodutormusical.ReprodutorMusica;


public class IPhone {
    public static void main(String[] args) {
        Iphone celular = new Iphone();
        AparelhoTelefonico tel = celular;
        ReprodutorMusica mus = celular;
        NavegadorInternet net = celular;
        
        tel.atender();
        mus.selecionarMusica();
        net.atualizarPagina();
    }
    
}
