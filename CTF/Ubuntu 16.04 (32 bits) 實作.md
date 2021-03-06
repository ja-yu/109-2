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
# Linux查看16進位
```
hexdump -C a.out 

00000000  7f 45 4c 46 01 01 01 00  00 00 00 00 00 00 00 00  |.ELF............|
00000010  02 00 03 00 01 00 00 00  10 83 04 08 34 00 00 00  |............4...|
00000020  e4 17 00 00 00 00 00 00  34 00 20 00 09 00 28 00  |........4. ...(.|
00000030  1f 00 1c 00 06 00 00 00  34 00 00 00 34 80 04 08  |........4...4...|
00000040  34 80 04 08 20 01 00 00  20 01 00 00 05 00 00 00  |4... ... .......|
00000050  04 00 00 00 03 00 00 00  54 01 00 00 54 81 04 08  |........T...T...|
00000060  54 81 04 08 13 00 00 00  13 00 00 00 04 00 00 00  |T...............|
00000070  01 00 00 00 01 00 00 00  00 00 00 00 00 80 04 08  |................|
```
```
hexdump -C helloCTFer

00000000  7f 45 4c 46 01 01 01 00  00 00 00 00 00 00 00 00  |.ELF............|
00000010  02 00 03 00 01 00 00 00  10 83 04 08 34 00 00 00  |............4...|
00000020  e4 17 00 00 00 00 00 00  34 00 20 00 09 00 28 00  |........4. ...(.|
00000030  1f 00 1c 00 06 00 00 00  34 00 00 00 34 80 04 08  |........4...4...|
00000040  34 80 04 08 20 01 00 00  20 01 00 00 05 00 00 00  |4... ... .......|
00000050  04 00 00 00 03 00 00 00  54 01 00 00 54 81 04 08  |........T...T...|
00000060  54 81 04 08 13 00 00 00  13 00 00 00 04 00 00 00  |T...............|
00000070  01 00 00 00 01 00 00 00  00 00 00 00 00 80 04 08  |................|
```
```
hexdump -C helloCTFer.exe 

00000000  7f 45 4c 46 01 01 01 00  00 00 00 00 00 00 00 00  |.ELF............|
00000010  02 00 03 00 01 00 00 00  10 83 04 08 34 00 00 00  |............4...|
00000020  e4 17 00 00 00 00 00 00  34 00 20 00 09 00 28 00  |........4. ...(.|
00000030  1f 00 1c 00 06 00 00 00  34 00 00 00 34 80 04 08  |........4...4...|
00000040  34 80 04 08 20 01 00 00  20 01 00 00 05 00 00 00  |4... ... .......|
00000050  04 00 00 00 03 00 00 00  54 01 00 00 54 81 04 08  |........T...T...|
00000060  54 81 04 08 13 00 00 00  13 00 00 00 04 00 00 00  |T...............|
00000070  01 00 00 00 01 00 00 00  00 00 00 00 00 80 04 08  |................|
```
### 在Windows用Dev C++編譯出的執行檔
```
hexdump -C helloCTFer.exe 

00000000  4d 5a 90 00 03 00 00 00  04 00 00 00 ff ff 00 00  |MZ..............|
00000010  b8 00 00 00 00 00 00 00  40 00 00 00 00 00 00 00  |........@.......|
00000020  00 00 00 00 00 00 00 00  00 00 00 00 00 00 00 00  |................|
00000030  00 00 00 00 00 00 00 00  00 00 00 00 80 00 00 00  |................|
00000040  0e 1f ba 0e 00 b4 09 cd  21 b8 01 4c cd 21 54 68  |........!..L.!Th|
00000050  69 73 20 70 72 6f 67 72  61 6d 20 63 61 6e 6e 6f  |is program canno|
00000060  74 20 62 65 20 72 75 6e  20 69 6e 20 44 4f 53 20  |t be run in DOS |
00000070  6d 6f 64 65 2e 0d 0d 0a  24 00 00 00 00 00 00 00  |mode....$.......|
00000080  50 45 00 00 64 86 11 00  c9 f6 41 60 00 80 01 00  |PE..d.....A`....|
```
# 作業

### exe改jpg
```
file ./helloCTFer.jpg 

./helloCTFer.jpg: ELF 32-bit LSB executable, Intel 80386, version 1 (SYSV), dynamically linked, interpreter /lib/ld-linux.so.2, for GNU/Linux 2.6.32, BuildID[sha1]=13d33ba42c32245aa46436a2f22dfd4875c2fb45, not stripped
```
```
hexdump -C helloCTFer.jpg 

00000000  7f 45 4c 46 01 01 01 00  00 00 00 00 00 00 00 00  |.ELF............|
00000010  02 00 03 00 01 00 00 00  10 83 04 08 34 00 00 00  |............4...|
00000020  e4 17 00 00 00 00 00 00  34 00 20 00 09 00 28 00  |........4. ...(.|
00000030  1f 00 1c 00 06 00 00 00  34 00 00 00 34 80 04 08  |........4...4...|
00000040  34 80 04 08 20 01 00 00  20 01 00 00 05 00 00 00  |4... ... .......|
00000050  04 00 00 00 03 00 00 00  54 01 00 00 54 81 04 08  |........T...T...|
00000060  54 81 04 08 13 00 00 00  13 00 00 00 04 00 00 00  |T...............|
00000070  01 00 00 00 01 00 00 00  00 00 00 00 00 80 04 08  |................|
```
### 圖片檔
```
file ./picture.png 

./picture.png: PNG image data, 512 x 512, 8-bit/color RGBA, non-interlaced
```
```
hexdump -C picture.png 

00000000  89 50 4e 47 0d 0a 1a 0a  00 00 00 0d 49 48 44 52  |.PNG........IHDR|
00000010  00 00 02 00 00 00 02 00  08 06 00 00 00 f4 78 d4  |..............x.|
00000020  fa 00 00 00 04 67 41 4d  41 00 00 b1 8f 0b fc 61  |.....gAMA......a|
00000030  05 00 00 00 20 63 48 52  4d 00 00 7a 26 00 00 80  |.... cHRM..z&...|
00000040  84 00 00 fa 00 00 00 80  e8 00 00 75 30 00 00 ea  |...........u0...|
00000050  60 00 00 3a 98 00 00 17  70 9c ba 51 3c 00 00 00  |`..:....p..Q<...|
00000060  06 62 4b 47 44 00 00 00  00 00 00 f9 43 bb 7f 00  |.bKGD.......C...|
00000070  00 42 32 49 44 41 54 78  da ed dd 77 9c 65 45 99  |.B2IDATx...w.eE.|
00000080  ff f1 cf ed 09 4c 80 c9  33 30 79 86 30 20 30 43  |.....L..30y.0 0C|
```
# 編譯的各階段

### 預處理
```
gcc -E helloCTFer.c -o helloCTFer.i
```
```
ls -al helloCTFer.*

-rw-rw-r-- 1 ksu ksu    93  三  12 14:08 helloCTFer.c
-rw-rw-r-- 1 ksu ksu 17543  三  12 15:05 helloCTFer.i
```
```
cat helloCTFer.i

# 1 "helloCTFer.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "/usr/include/stdc-predef.h" 1 3 4
# 1 "<command-line>" 2
# 1 "helloCTFer.c"

# 1 "/usr/include/stdio.h" 1 3 4
# 27 "/usr/include/stdio.h" 3 4
# 1 "/usr/include/features.h" 1 3 4
# 367 "/usr/include/features.h" 3 4
# 1 "/usr/include/i386-linux-gnu/sys/cdefs.h" 1 3 4
# 410 "/usr/include/i386-linux-gnu/sys/cdefs.h" 3 4
# 1 "/usr/include/i386-linux-gnu/bits/wordsize.h" 1 3 4
# 411 "/usr/include/i386-linux-gnu/sys/cdefs.h" 2 3 4
# 368 "/usr/include/features.h" 2 3 4
# 391 "/usr/include/features.h" 3 4
# 1 "/usr/include/i386-linux-gnu/gnu/stubs.h" 1 3 4

.............
# 3 "helloCTFer.c" 2


# 4 "helloCTFer.c"
int main()
{
   printf("Hello CTFer\n ");
   return 0;
}
```
### 編譯
```
gcc -S helloCTFer.i -o helloCTFer.s
```
```
ls -al helloCTFer.*

-rw-rw-r-- 1 ksu ksu    93  三  12 14:08 helloCTFer.c
-rw-rw-r-- 1 ksu ksu 17543  三  12 15:05 helloCTFer.i
-rw-rw-r-- 1 ksu ksu   664  三  12 15:12 helloCTFer.s
```
```
cat helloCTFer.s

	.file	"helloCTFer.c"
	.section	.rodata
.LC0:
	.string	"Hello CTFer\n "
	.text
	.globl	main
	.type	main, @function
main:
.LFB0:
	.cfi_startproc
	leal	4(%esp), %ecx
	.cfi_def_cfa 1, 0
	andl	$-16, %esp
	pushl	-4(%ecx)
	pushl	%ebp
	.cfi_escape 0x10,0x5,0x2,0x75,0
	movl	%esp, %ebp
	pushl	%ecx
	.cfi_escape 0xf,0x3,0x75,0x7c,0x6
	subl	$4, %esp
	subl	$12, %esp
	pushl	$.LC0
	call	printf
	addl	$16, %esp
	movl	$0, %eax
	movl	-4(%ebp), %ecx
	.cfi_def_cfa 1, 0
	leave
	.cfi_restore 5
	leal	-4(%ecx), %esp
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
.LFE0:
	.size	main, .-main
	.ident	"GCC: (Ubuntu 5.4.0-6ubuntu1~16.04.12) 5.4.0 20160609"
	.section	.note.GNU-stack,"",@progbits

```
### 彙編
```
gcc -c helloCTFer.s -o helloCTFer.o
```
```
ls -al helloCTFer.*

-rw-rw-r-- 1 ksu ksu    93  三  12 14:08 helloCTFer.c
-rw-rw-r-- 1 ksu ksu 17543  三  12 15:05 helloCTFer.i
-rw-rw-r-- 1 ksu ksu  1080  三  12 15:21 helloCTFer.o
-rw-rw-r-- 1 ksu ksu   664  三  12 15:12 helloCTFer.s
```
```
hexdump -C helloCTFer.o

00000000  7f 45 4c 46 01 01 01 00  00 00 00 00 00 00 00 00  |.ELF............|
00000010  01 00 03 00 01 00 00 00  00 00 00 00 00 00 00 00  |................|
00000020  30 02 00 00 00 00 00 00  34 00 00 00 00 00 28 00  |0.......4.....(.|
00000030  0d 00 0a 00 8d 4c 24 04  83 e4 f0 ff 71 fc 55 89  |.....L$.....q.U.|
00000040  e5 51 83 ec 04 83 ec 0c  68 00 00 00 00 e8 fc ff  |.Q......h.......|
00000050  ff ff 83 c4 10 b8 00 00  00 00 8b 4d fc c9 8d 61  |...........M...a|
00000060  fc c3 48 65 6c 6c 6f 20  43 54 46 65 72 0a 20 00  |..Hello CTFer. .|
00000070  00 47 43 43 3a 20 28 55  62 75 6e 74 75 20 35 2e  |.GCC: (Ubuntu 5.|
00000080  34 2e 30 2d 36 75 62 75  6e 74 75 31 7e 31 36 2e  |4.0-6ubuntu1~16.|
```
```
file helloCTFer.o

helloCTFer.o: ELF 32-bit LSB relocatable, Intel 80386, version 1 (SYSV), not stripped
```
### 連結
```
gcc  helloCTFer.o -o helloCTFer 
```
```
ls -al helloCTFer*

-rwxrwxr-x 1 ksu ksu  7356  三  12 15:27 helloCTFer
-rw-rw-r-- 1 ksu ksu    93  三  12 14:08 helloCTFer.c
-rw-rw-r-- 1 ksu ksu 17543  三  12 15:05 helloCTFer.i
-rw-rw-r-- 1 ksu ksu  1080  三  12 15:21 helloCTFer.o
-rw-rw-r-- 1 ksu ksu   664  三  12 15:12 helloCTFer.s
```
