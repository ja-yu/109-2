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
### 在Linux32位元編譯出的執行檔
```
file helloCTFer.exe 

helloCTFer.exe: ELF 32-bit LSB executable, Intel 80386, version 1 (SYSV), dynamically linked, interpreter /lib/ld-linux.so.2, for GNU/Linux 2.6.32, BuildID[sha1]=4258888fd293dae24c8143c584f1514ddcc7db0e, not strippe
```
```
ELF格式
32位元的executable執行檔
Intel語言

strippe
編譯程式時，會產生一堆資料，可以把那些都拿掉，讓執行檔變小一點
```
### 在Windows用Dev C++編譯出的執行檔
```
Dev C++底層也是用gcc

file helloCTFer.exe


PE結構
x86 代表32位元
x86-64 代表64位元
```
### Linux查看16進位
```
東西存在電腦硬碟都是16進位表達

hexdump -C helloCTFer.exe

00000000  7f 45 4c 46 01 01 01 00  00 00 00 00 00 00 00 00  |.ELF............|   <== 表頭檔(檔案特徵)ELF格式，不是exe執行檔
00000010  02 00 03 00 01 00 00 00  10 83 04 08 34 00 00 00  |............4...|
00000020  e0 17 00 00 00 00 00 00  34 00 20 00 09 00 28 00  |........4. ...(.|
00000030  1f 00 1c 00 06 00 00 00  34 00 00 00 34 80 04 08  |........4...4...|
00000040  34 80 04 08 20 01 00 00  20 01 00 00 05 00 00 00  |4... ... .......|
00000050  04 00 00 00 03 00 00 00  54 01 00 00 54 81 04 08  |........T...T...|
00000060  54 81 04 08 13 00 00 00  13 00 00 00 04 00 00 00  |T...............|
00000070  01 00 00 00 01 00 00 00  00 00 00 00 00 80 04 08  |................|
00000080  00 80 04 08 c4 05 00 00  c4 05 00 00 05 00 00 00  |................|
```
### Windows查看16進位
```

```
### 作業 找file magic
```
圖片檔
hexdump -C

mp3檔
hexdump -C

mp4檔
hexdump -C
```
