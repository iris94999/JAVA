
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
 
public class DirListing {
    private final static DateFormat FORMAT = new SimpleDateFormat(
            "yyyy-MM-dd HH:mm:ss");
    private String directory;
    private boolean isR;
    private boolean isVerbose;
 
    public DirListing() {
        super();
        directory = ".";
        isR = false;
        isVerbose = false;
    }
 
    public void setDirectory(String directory) {
        this.directory = directory;
    }
 
    public void setR(boolean isR) {
        this.isR = isR;
    }
 
    public void setVerbose(boolean isVerbose) {
        this.isVerbose = isVerbose;
    }
 
    private void list() {
        File file;
        if(directory.equals(".")){
            file = new File(System.getProperty("user.dir"));
        }
        else file = new File(directory);
        if(!file.exists()) {
            System.out.println("Not exist");
            return;
        }
        if (!file.isDirectory()) {
            System.out.println("Not a directory");
            return;
        }
        list(file, 0);
    }
 
    private void list(File file, int n) {
        try {
            show(file, n);
            if (file.isFile()) {
                return;
            }
            for (File chf : file.listFiles()) {
                if (isR) {
                    list(chf, n + 1);
                }else{
                    show(chf,n+1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    private void show(File file, int n) {
        StringBuilder sb=new StringBuilder();
        while (n-- > 0) {
            sb.append("  ");
        }
        sb.append(file.getAbsolutePath());
        if (file.isFile()) {
            if (isVerbose) {
                sb.append(" " + file.length() / 1024 + "KB");
                sb.append(" "
                        + FORMAT.format(new Date(file.lastModified())));
            }
        }
        System.out.println(sb.toString());
    }
 
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        DirListing dir = new DirListing();
        if (args.length > 3) {
            System.out.println("Invalid arguments");
            System.exit(0);
        }
        for (String s : args) {
            if (s.startsWith("-")) {
                if (s.equals("-R"))
                    dir.setR(true);
                else if (s.equals("-verbose"))
                    dir.setVerbose(true);
                else {
                    System.out.println("Invalid arguments");
                    System.exit(0);
                }
 
            } else {
                dir.setDirectory(s);
                break;
            }
        }
        dir.list();
    }
 
}