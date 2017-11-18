import java.io.File;
import java.util.Arrays;

public class LibTest
{
    //checks if any java library paths has linked .so file.
    public static void main(String[] args) {
        File file = null;
        String[] libs_path = System.getProperty("java.library.path").split(":");
        //Arrays.stream(libs_path).forEach(System.out::println);
        boolean isInstalled = false;
        for(String lib : libs_path) {
            file = new File(lib+"/"+"libcjavainterop.so");
            if(file.exists()) {
                isInstalled = true;
                System.out.println(file.getAbsolutePath());
                break;
            }
        }
        System.out.println(isInstalled);
        System.out.println(System.mapLibraryName("cjavainterop"));
    }
}
