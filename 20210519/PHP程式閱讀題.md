```
<!DOCTYPE HTML >

<html>

  <head>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <title>應用addcslashes()函數和stripslashes()函數分別對字串進行轉義和還原</title>

  </head>

  <body>

    <?php

      $str = "select * from tb_book where bookname = 'PHP5從入門到放棄'";

      echo $str."<br>";

      $a = addslashes($str);  //對字串中的特殊字元進行轉義

      echo $a."<br>"; //輸出轉義後的字元

      $b = stripslashes($a); //對轉義後的字元進行還原

      echo $b."<br>"; //將字元原義輸出

    ?>

  </body>

</html>

說明上述程式stripslashes()與addslashes()
```
```

```
