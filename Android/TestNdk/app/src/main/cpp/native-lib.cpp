#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL

Java_com_cocoa_testndk_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++qweqw";
    return env-> NewStringUTF(hello.c_str());
}
