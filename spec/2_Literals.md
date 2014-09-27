#リテラル

##論理型(Boolean)
```
論理型 ::= True | False | true | false
```
論理型は真と偽を表現するリテラルとしてよく知られています。Karaffeではこの論理型は`Boolean`型のオブジェクトとして宣言されています。

##整数
数値リテラルの例を以下に示します。厳密な定義は未確定です。  

 * `1`
 * `-1`
 * `7895789231`
 * `0x9043`
 * `0X38943`

`Int`が整数を格納出来る型のひとつです。
 
##実数
実数リテラルの例を以下に示します。厳密な定義は未確定です。  

 * `1.0`
 * `0.3`
 * `5E10`
 * `1.7e14`

`Float`が実数を格納できる型のひとつです。

##文字列
文字列リテラルの例を以下に示します。厳密な定義は未確定です。  

 * `"string"`
 * `"string\nwith \"escape sequence\""`
 * `"string with \(variableName)"`

 `String`が文字列を格納できる型のひとつです。

#####利用可能なエスケープシーケンス

| エスケープシーケンス | 説明 |
|---|---|
| `\"` | "
| `\\` | \
| `\/` | /
| `\n` | 改行
| `\r` | 復帰
| `\t` | タブ
| `\(foo)` | 変数fooに置き換え

##配列
配列リテラルの例を以下に示します。厳密な定義は未定です。

* `[]`
* `[1]`
* `[1 2 3 4 5]`
* `[1..5]`
* `[1..]`

##関数
関数リテラルの例を以下に示します。厳密な定義は未確定です。  

* `True`<sub>※</sub>
* `[] to "Hello"`
* `[a] to * a 2`
* `[a b] to + a b`

※:関数を格納する変数の型が引数を取らない場合もしくは`$0`などの暗黙宣言される変数名に別名を付与しない場合、`[]`及び`[変数名...]`を省略可能です。  

コード例
```
//型推論が働く例
a = [] to "hoge"
println typeOf a //Type[Void to String]

//型を明示的に指定する例(推奨)
b  : Void to Boolean = true
b1 : Void to Boolean = [] to true

c  : Int Int to Int = [a b] to a + b
```

##型
型リテラルの例を以下に示します。厳密な定義は未確定です。  

* `Type[1]`
* `Type[0.4]`
* `Type[1..5]`
* `Type[T]`
* `Type[Int]`
* `Type[Int to Float]`

コード例
```
intType = Type[Int]
intType1 : Type[Int] = Type[Int]

```