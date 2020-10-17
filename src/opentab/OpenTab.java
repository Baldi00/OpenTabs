/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opentab;

import java.awt.Desktop;
import java.net.URI;
import java.net.URLEncoder;
import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class OpenTab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        String games = "GTA V\nThe Witcher 3";
        String gamesList [] = games.split("\n");
        
        int cont=0;
        for(String g : gamesList){
            Desktop.getDesktop().browse(new URI("https://store.steampowered.com/search/?term="+URLEncoder.encode(g, "UTF-8")));
            cont++;
            Thread.sleep(500);
            if(cont==10){
                Scanner in = new Scanner(System.in);
                in.nextLine();
                cont=0;
            }
        }
    }
    
    
}
