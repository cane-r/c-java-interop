#include "jni_CJavaInterop.h"

JNIEXPORT void JNICALL Java_jni_CJavaInterop_sendRequest
  (JNIEnv * env, jobject obj , jstring  url_param , jstring  body_param) {

    const char *url,*body;
    jboolean copy = JNI_TRUE;
    url = (*env)->GetStringUTFChars(env, url_param, & copy);
    body = (*env)->GetStringUTFChars(env, body_param, & copy);

    long http_status_code = call(url,body);
    //convert to jlong later..
    printf("Returned HTTP response code is = %ld\n",http_status_code);
}