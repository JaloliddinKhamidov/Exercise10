package vistula50182;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Task5 {
    public static void main(String []args) throws IOException {
        System.out.println("Please input the first three digits of your bank account:");
        BufferedReader tf = new BufferedReader(new InputStreamReader(System.in));
        String digits= tf.readLine();
        URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))){
            String line;
            System.out.println("Searching ...");
            while((line= br.readLine())!=null){
//                System.out.println(line);
                // Putting Data into an array
                String[] words=line.split("\\t+");
                String bankNumberNimeshGangani50182=words[0].trim();
                String bankNameNimeshGangani50182=words[1].trim();
                if(bankNumberNimeshGangani50182.equals(digits)){
                    System.out.println("Done ");
                    System.out.println("Bank Digits : " +bankNumberNimeshGangani50182 + "\nBank Name : " +bankNameNimeshGangani50182);
                    break;
                }
            }
        }
        catch (IOException e){
            System.out.println("Information Loading Failed");
        }

    }
}
