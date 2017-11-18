package jni;

public class CJavaInterop {

    public native void sendRequest(String url,String body);

    static {
        System.loadLibrary("cjavainterop");
    }

    public static void main(String[] args) {
        //Node server running..
        final String URL = "http://127.0.0.1:8081/api/v1";
        final String BODY = "{ \"start\": \"2016-01-01\",\"end\": \"2017-11-05\" }";
        CJavaInterop interop = new CJavaInterop();
        interop.sendRequest(URL,BODY);
    }
}
