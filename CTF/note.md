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
   ==> gcc helloCTFer.c  ==>  產生a.out執行檔   
   ==> gcc helloCTFer.c -o helloCTFer
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
```
查看原始碼與執行碼大小
ls -al 檔名.*
```
