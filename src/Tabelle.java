/**
 * Created with IntelliJ IDEA.
 * User: Terence
 * Date: 13.11.13
 * Time: 14:37
 * To change this template use File | Settings | File Templates.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Tabelle {

    public List<Zeile> einlesen(){

        List<Zeile> ar=new ArrayList<Zeile>();
        String zeile="";
        String[] tokens;


        Date d=new Date();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        df.setTimeZone(TimeZone.getDefault());
        String DatumsString=df.format(d);


        String dateiName="vw.csv";

        try {
            BufferedReader br=new BufferedReader(new FileReader(new File(dateiName)));

            while (zeile!=null){
                zeile=br.readLine();
                if (zeile!=null){
                    //System.out.println("Zeile: "+zeile);
                    tokens=zeile.split(";");

                    for (String s:tokens) {

                        //data[zahler]=Double.parseDouble(tokens[1]);
                        ar.add(new Zeile(tokens[0],Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]),Double.parseDouble(tokens[4])));
                        //System.out.println(s);
                    }
                    //System.out.println("======");

                }

            }//ende while
            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return ar;
    }

 }


