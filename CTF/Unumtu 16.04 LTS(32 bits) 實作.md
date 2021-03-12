# 原始碼與執行碼大小
```
-rw-rw-r--  1 ksu  ksu    93  三  12 14:08 helloCTFer.c
-rwxrwxr-x  1 ksu  ksu  7356  三  12 14:09 a.out
-rwxrwxr-x  1 ksu  ksu  7356  三  12 14:16 helloCTFer
-rwxrwxr-x  1 ksu  ksu  7356  三  12 14:18 helloCTFer.exe
```
 # 編譯出的執行檔
```
file ./a.out 

./a.out: ELF 32-bit LSB executable, Intel 80386, version 1 (SYSV), dynamically linked, interpreter /lib/ld-linux.so.2, for GNU/Linux 2.6.32, BuildID[sha1]=13d33ba42c32245aa46436a2f22dfd4875c2fb45, not stripped
```
```
file ./helloCTFer

./helloCTFer: ELF 32-bit LSB executable, Intel 80386, version 1 (SYSV), dynamically linked, interpreter /lib/ld-linux.so.2, for GNU/Linux 2.6.32, BuildID[sha1]=13d33ba42c32245aa46436a2f22dfd4875c2fb45, not stripped
```
```
file ./helloCTFer.exe 
./helloCTFer.exe: ELF 32-bit LSB executable, Intel 80386, version 1 (SYSV), dynamically linked, interpreter /lib/ld-linux.so.2, for GNU/Linux 2.6.32, BuildID[sha1]=13d33ba42c32245aa46436a2f22dfd4875c2fb45, not stripped
```
# 在Windows用Dev C++編譯出的執行檔
```
file helloCTFer.exe 

helloCTFer.exe: PE32+ executable (console) x86-64, for MS Windows
```
