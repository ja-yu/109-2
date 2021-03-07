# 檢查Linux有沒有安裝
```
gcc --help
g++ --help
nasm -h
```
```
帳密: Ksu2021
```
# Linux C 程式的編譯與執行
```
gedit 檔名.c
```
### Unumtu 16.04 LTS(32 bits)
```
(1)編譯
   ==> gcc helloCTFer.c  ==>  產生a.out執行檔   (沒有指定執行檔名，預設產生a.out)
   ==> gcc helloCTFer.c -o helloCTFer          (-o 指定執行檔名)
   ==> gcc helloCTFer.c -o helloCTFer.exe

(2)執行
    ==> ./a.out
    ==> ./helloCTFer
    ==> ./helloCTFer.exe
    
 (3)檢查執行檔檔案格式
    ==> file ./a.out
    ==> file ./helloCTFer
    ==> file ./helloCTFer.exe
```
### 查看原始碼與執行碼大小
```
ls
ls -al 檔名.*
```
### 在Linux編譯出的執行檔
```
file helloCTFer.exe 

helloCTFer.exe: ELF 32-bit LSB executable, Intel 80386, version 1 (SYSV), dynamically linked, interpreter /lib/ld-linux.so.2, for GNU/Linux 2.6.32, BuildID[sha1]=4258888fd293dae24c8143c584f1514ddcc7db0e, not strippe
```
### 在Window用Dev C++編譯出的執行檔
```

```
