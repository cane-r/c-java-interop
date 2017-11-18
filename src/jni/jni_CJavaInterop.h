#include <jni.h>
#include <lib.h>

#ifndef _Included_jni_CJavaInterop
#define _Included_jni_CJavaInterop
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     jni_CJavaInterop
 * Method:    sendRequest
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_jni_CJavaInterop_sendRequest
  (JNIEnv *, jobject, jstring , jstring);

#ifdef __cplusplus
}
#endif
#endif
