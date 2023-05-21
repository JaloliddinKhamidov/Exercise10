package vistula61421;

import java.io.*;

class DataManagement{
    String NameJaloliddin61421;
    void ReadDataJaloliddin() throws IOException {
        BufferedReader tv = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Please Input Your Full Name");
        NameJaloliddin61421 =tv.readLine();
    }
    void WriteDataToJaloliddin61421File(){
        try(FileWriter ts = new FileWriter("task4.txt")) {
            ts.write(NameJaloliddin61421);
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
    void readDataViaJaloliddin61421File(){
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
        obj.readDataViaJaloliddin61421File();
        obj.WriteDataToJaloliddin61421File();
        System.out.println();
        obj.ReadDataJaloliddin();
    }

}
