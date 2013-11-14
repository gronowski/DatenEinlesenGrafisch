/**
 * Created with IntelliJ IDEA.
 * User: Terence
 * Date: 13.11.13
 * Time: 15:16
 * To change this template use File | Settings | File Templates.
 */

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Main extends JFrame {

       java.util.List<Zeile> ar = new ArrayList<Zeile>();

        private int xgmax=0;
        private int xgmin=0;
        private int ygmax=0;
        private int ygmin=0;

        private int xwmax=0;
        private int xwmin=0;
        private int ywmax=0;
        private int ywmin=0;

        private int xgt=0;
        private int ygt=0;

        private Tabelle t=null;

        void skalieren(){
            xgmin=0;
            ygmin=0;
            xgmax=800;
            ygmax=300;

            xwmin=0;
            xwmax=240;

            ywmin=0;
            ywmax=120;

            xgt=20;
            ygt=600;
        }

        int xg_berechnung(int xw){
            return xw*((xgmax-xgmin)/(xwmax-xwmin))+xgt;
        }
        int yg_berechnung(int yw){
            return ygt-yw*((ygmax-ygmin)/(ywmax-ywmin));
        }


        public void paint(Graphics g){
            //Tabelle t=new Tabelle();  darf nicht hier stehen, da dauernd bei Refresh neu eingelesen

            skalieren();
            int i=1;
            double calt=0;
            g.drawLine(0,0,100,100); //Testlinie
           // for (Zeile z:t.einlesen()) {   //Einlesen darf nicht hier sein, da bei jedem Refresh neues Einlesen
             for (Zeile z:ar) {
                //System.out.println(z.getZeit()+" "+z.getC());
                 //int ykoord=yg_berechnung((int)calt);

                 g.drawLine(xg_berechnung(i-1),yg_berechnung((int)calt),xg_berechnung(i),yg_berechnung((int)z.getC()));

                // g.drawLine((i-1),300-(int)calt,i,300-(int)z.getC());
                calt=z.getC();
                i++;
            }
        }

    public Main(){
        super("Grafik");
        setLayout(new FlowLayout());
        setSize(800,600);
        t=new Tabelle();
        ar=t.einlesen(); //Einlesen der ArrayList nur ein einziges Mal
    }


    public static void main(String... args){
        Main g=new Main();
        g.setVisible(true);
    }
}
