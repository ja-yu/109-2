# 第1章 開始撰寫PHP程式 
```
(1).下列何者屬於伺服器端Scripts？ (複選)  A.ASP.NET  B.JavaScript  C. JSP   D.PHP
```
```
答: A、C、D

ASP.NET
https://zh.wikipedia.org/wiki/ASP.NET
ASP.NET是由微軟在.NET Framework框架中所提供，開發Web應用程式的類別庫
封裝在System.Web.dll檔案中，顯露出System.Web命名空間
並提供ASP.NET網頁處理、擴充以及HTTP通道的應用程式與通訊處理等工作，以及Web Service的基礎架構。

JSP
https://zh.wikipedia.org/wiki/JSP
JSP（全稱Jakarta Server Pages，曾稱為JavaServer Pages）是由Sun Microsystems公司主導建立的一種動態網頁技術標準。
JSP部署於網路伺服器上，可以回應客戶端傳送的請求，並根據請求內容動態地生成HTML、XML或其他格式文件的Web網頁，然後返回給請求者。
JSP技術以Java語言作為手稿語言，為使用者的HTTP請求提供服務，並能與伺服器上的其它Java程式共同處理複雜的業務需求。

PHP
https://zh.wikipedia.org/wiki/PHP
PHP（全稱：PHP：Hypertext Preprocessor，即「PHP：超文字預處理器」）是一種開源的通用電腦手稿語言，尤其適用於網路開發並可嵌入HTML中使用。
PHP的語法借鑑吸收C語言、Java和Perl等流行電腦語言的特點，易於一般程式設計師學習。
PHP的主要目標是允許網路開發人員快速編寫動態頁面，但PHP也被用於其他很多領域。
一般來說PHP大多執行在網頁伺服器上，透過執行PHP程式碼來產生使用者瀏覽的網頁。PHP可以在多數的伺服器和作業系統上執行。

JavaScript
https://zh.wikipedia.org/wiki/JavaScript
JavaScript（通常縮寫為JS）是一種進階的、直譯的程式語言。
JavaScript是一門基於原型、頭等函式的語言，
是一門多範式的語言，它支援物件導向程式設計，指令式程式設計，以及函式語言程式設計。
它提供語法來操控文字、陣列、日期以及正規表示式等，不支援I/O，比如網路、儲存和圖形等，但這些都可以由它的宿主環境提供支援。
它已經由ECMA（歐洲電腦製造商協會）透過ECMAScript實作語言的標準化。
它被世界上的絕大多數網站所使用，也被世界主流瀏覽器（Chrome、IE、Firefox、Safari、Opera）支援。
```
```
(2).關於PHP的敘述下列何者錯誤？

    A. PHP會自動忽略多餘的空白字元

    B. PHP不會區分變數名稱和常數名稱的英文字母大小寫

    C. PHP程式的每行敘述結尾要加上分號 (;)

     D. PHP屬於開放原始碼軟體
```
```
答: B

PHP會區分變數名稱和常數名稱的英文字母大小寫
```
```
(3).下列何者可用來在HTML文件中標示PHP程式碼區塊？(複選) 

      A. < 和 />        B.  <?php 和 ?>     C. <? 和 ?>      D.  <% 和 %>

  註:請舉範例證明
```
```
答: B、C、D

<?php 和 ?>
<?php
    echo("Hello, world!");
?>
輸出:
Hello, world!

<? 和 ?>
<?
    echo("Hello, world!");
?>
輸出:
Hello, world!
註:php.ini中short_open_tag=On

<% 和 %>
其實是用來標示ASP程式碼區塊，在過去為了鼓勵ASP網頁開發人員轉用PHP因而允許以<% 和 %>標示
```
# 第2章 型別、變數、常數與運算子 
```
(4). 3 ** 2的結果為何？  A.5   B.6  C.9   D.8
```
```
答: C
3*3=9
```
```
(5). 2 ** 3的結果為何？  A.5   B.6  C.9   D.8
```
```
答: D
2*2*2=8
```
# 第3章 流程控制 
```
(6)在for($i = 100; $i <= 200; $i += 3) 迴圈執行完畢時，變數i的值為何？

  A. 200         B. 202           C. 199         D. 201
```
```
答: B
199+3=202 > 200
```
# 第4章 陣列 
```
PHP規定陣列的鍵可以為下列哪種型別？(複選)

A.  布林          B.       浮點數         C.  整數         D.   字串
```
```
答: C、D

PHP規定陣列的鍵必須是整數或字串
```
# 第5章 函式 
```
下列哪個函式可以將陣列內元素的順序弄亂？  A. array_splice() B. array_slice()   C. shuffle() D. array_merge()
```
```
答: C

shuffle()
https://codertw.com/%E7%A8%8B%E5%BC%8F%E8%AA%9E%E8%A8%80/212931/
ex:
<?php
    $arr = range(1,8);
    print_r($arr);
    echo '<br />';
    shuffle($arr);
    print_r($arr);
?>
輸出:
Array ( [0] => 1 [1] => 2 [2] => 3 [3] => 4 [4] => 5 [5] => 6 [6] => 7 [7] => 8 )
Array ( [0] => 2 [1] => 4 [2] => 8 [3] => 3 [4] => 7 [5] => 6 [6] => 1 [7] => 5 )

array_splice()
根據參數指定的條件從陣列內移除一串元素

array_slice()
根據參數指定的條件從陣列內傳回一串元素

array_merge()
將陣列進行聯集，遇到相同的鍵時不做覆寫
```
