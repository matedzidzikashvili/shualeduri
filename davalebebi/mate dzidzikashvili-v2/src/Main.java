import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File faili = new File("C:\\Users\\user\\Desktop\\BTU_DOCUMENTS");

        while(true) {
            String asoebi;
            asoebi = scanner.next();

            Runnable thread = new Runnable() {

                String[] filter = faili.list(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        if(name.toLowerCase().contains(asoebi.toLowerCase())) {
                        }
                        return name.contains(asoebi);
                    }
                });

                @Override
                public void run() {
                    while(true) {
                        for(String name: filter) {
                            System.out.println(name);
                        }
                        try {
                            Thread.sleep(3000);
                        }catch(InterruptedException exception) {
                            exception.printStackTrace();
                        }
                    }
                }
            };

            Thread meorenakadi = new Thread(thread);



            meorenakadi.start();

        }

    }
}
