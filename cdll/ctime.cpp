// ctime.cpp : 定义静态库的函数。
// 使用vs2019 新建一个dll工程,自行添加

#include "pch.h"
#include "framework.h"
#include "stdio.h"


void runCall(const char* data) {
	printf("%s", data);
}

typedef void (*CallbackFunc) (const char* data);

extern "C" __declspec(dllexport)int hello(int a, char* b);
extern "C" __declspec(dllexport) int helloCallback(int a, char* b, CallbackFunc func);
extern "C" __declspec(dllexport) void printHello();
extern "C" __declspec(dllexport) void testCallback();
extern "C" __declspec(dllexport) void  testGetVal(char** data);


void registHeightCallback(CallbackFunc callback,const char* data)
{
	callback(data);
}


int hello(int a, char* b)
{
	printf("hello:  int=%d  char=%s\n", a, b);
	return 0;
}

int helloCallback(int a, char* b, CallbackFunc func)
{
	printf("hello:  int=%d  char=%s\n", a, b);
	(*func)("call");
	return 0;
}

void testCallback() {
	registHeightCallback(runCall, "dddddddddd");
}
void printHello() {
	printf("hello jna");
}
void testGetVal(char **data) {
	*data = "aaaaaaaaaaaaaaaaaaaaaa";
}