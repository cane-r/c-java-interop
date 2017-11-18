Compile .c and .h lib files with

gcc -fPIC -shared jni/lib.c jni/jni_CJavaInterop.c -o jni/libcjavainterop.so -I jni/ -I /usr/lib/jvm/java-11-openjdk-amd64/include/ -I /usr/lib/jvm/java-11-openjdk-amd64/include/linux/ -lcurl && sudo cp jni/libcjavainterop.so /lib/x86_64-linux-gnu/

Compile java file

javac jni/CJavaInterop.java

Run Java file

java -XshowSettings:properties jni.CJavaInterop ( or add -Djava.library.path="" and point the lib file ")
