import java.io.*;
import java.util.Random;

public class NewMain {
    File file = new File("Text.txt");
    FileWriter fileWriter = new FileWriter(file);
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


    FileReader fileReader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    Random random = new Random();

    int[] array = new int[100];
    int i = 0;
        while (true) {
        String line = bufferedReader.readLine();
        if (line == null) {
            break;
        }
        int number = Integer.parseInt(line);
        array[i] = number;
        i++;
    }
        for (int j = 0; j < 100; j++) {
        array[i] = random.nextInt(0, 100);
        System.out.println(array[i]);
        String a = String.valueOf(array[i]);

        bufferedWriter.write();
        bufferedWriter.newLine();
        bufferedWriter.flush();

    }
