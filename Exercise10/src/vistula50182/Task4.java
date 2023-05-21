package vistula50182;

import java.io.*;

class DataManagement{
    String NimeshGangani50182;
    void ReadDataGangani50182() throws IOException {
        BufferedReader tv = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Please Input Your Full Name");
        NimeshGangani50182 =tv.readLine();
    }
    void WriteDataToGangani50182File(){
        try(FileWriter ts = new FileWriter("task4.txt")) {
            ts.write(NimeshGangani50182);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    void readDataViaGangani50182File(){
        String result;
        try(BufferedReader br = new BufferedReader(new FileReader("task4.txt"))) {
            while((result=br.readLine()) !=null){
                System.out.println(result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}





public class Task4 {
    public static void main(String []args) throws IOException {
        DataManagement obj = new DataManagement();
        obj.readDataViaGangani50182File();
        obj.WriteDataToGangani50182File();
        System.out.println();
        obj.ReadDataGangani50182();
    }

}
