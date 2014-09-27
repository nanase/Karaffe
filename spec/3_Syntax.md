#トークン
---
この章では、トークンについて定義します。  
Karaffeでは空白文字及び型名に限り`:`でトークンが区切られますが、空白文字はいくつでも挿入可能です。  

##識別子
次の名前が予約されており、識別子として使用できません。  

| 予約語 | 使用箇所 |
|:---|:---|
|case|match case文|
|check|型、オブジェクト検査|
|else|条件分岐|
|false|論理型の偽|
|func|関数宣言|
|global|ファイル内スコープ宣言|
|seffect| 再代入を許す変数宣言| 
|if|条件分岐|
|match|match case文| 
|type|Alias Type,構造体の宣言|
|to|引数の型と戻り値の型の連結|
|true|論理型の真|
|_|将来のための予約語|

厳密な識別子の定義は決定していませんが、次の形式が識別子となる予定です。

* a
* a1
* hoge
* hoge_
* hoge_1
* _hoge
* \_foo\_ 
* F
* FOO_BAR

##スコープ
`newline`のみによってスコープが区切られます。

```
a = 1
b = 2
println a + b //3

a = 2 //コンパイルエラーにはなりません。1行目のaは既に破棄されています。

b = 2
println a + b //これはコンパイルエラーになります。コンパイラはaを見つけられません。

```