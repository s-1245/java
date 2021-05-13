import java.io.*;
import java.util.*;

public class abc {
    public static void main(String[] args) throws IOException {

        String Path = "D:\\work\\java_work_space\\unit\\src\\words";

        File file = new File(Path);

        File[] fs = file.listFiles();

        Map<String,Integer> map =new HashMap<>();
        String string = "";

        for (File f:fs) {
            if (!f.isDirectory()) {

                FileReader fileReader = new FileReader(f);

                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while ((string = bufferedReader.readLine()) != null) {
                    String[] fields = string.split(" ");
                    for (String field : fields) {
                        if (!map.containsKey(field)) {
                            map.put(field, 1);
                        } else {
                            int i = map.get(field);
                            map.put(field, i + 1);
                        }
                    }
                }
            }
        }

        System.out.println(map);
        List<Map.Entry<String,Integer>> lstEntry=new ArrayList<>(map.entrySet());

        Collections.sort(lstEntry,((o1, o2) -> {
            return o1.getValue().compareTo(o2.getValue());
        }));

        Collections.reverse(lstEntry);

        lstEntry.forEach(o->{
            System.out.println(o.getKey()+":"+o.getValue());
        });

    }
}