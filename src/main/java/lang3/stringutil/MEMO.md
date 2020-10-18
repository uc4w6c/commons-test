# StringUtilのメモ

## abbreviate
3点リーダー機能
StringUtils.abbreviate("abcdefg", 4)
の場合は、a... みたいになる

## capitalize
先頭のアルファベットを大文字にする

## center
文字をセンター寄せする。
第３引数に文字(char or string)をセットすることで空白部分を指定文字にすることも可能

## chomp
末尾の改行コードが削除される

## chop
末尾1文字を削除

## compare
文字列比較を行う
`compareIgnoreCase`を利用することで大文字・小文字を判別せず比較可能

## contains
第二引数に指定した文字列が第一引数に含まれている場合は trueを返却

### containsAny
第二引数に指定した文字列内の文字が1文字でも第一引数に含まれている場合は trueを返却
### containsNone
containsAnyの逆
第二引数に指定した文字列内の文字が1文字でも第一引数に含まれている場合は falseを返却
### containsOnly
第一引数に指定した文字列内の文字がのみで第二引数に構成されている場合は trueを返却
### containsWhitespace
引数に指定した文字列の中にスペースが含まれている場合は trueを返却

## countMatches
第一引数内含まれる第二引数の数を返却

## default~
### defaultIfBlank, defaultIfEmpty
第一引数に指定した値がBlank, Emptyの場合には、第二引数に指定した値を返す
そうでない場合は第一引数の値をそのまま返す

### defaultString
引数に指定した値がnullの場合は""を返す。
そうでない場合は引数の値をそのまま返す

## deleteWhitespace
引数に指定した文字列から全ての空白を削除して返却

## difference
2つの引数を先頭から比較して、異なる箇所から先の文字を出力する

## endsWith
第一引数に指定した文字列が第二引数に指定した文字列で終わっている場合は trueを返却

### endsWithAny
上記の第二引数が配列型でどれか1つでも一致すれば true
### endsWithIgnoreCase
上記の大文字小文字を区別されないパターン

## equals
第一引数と第二引数に指定した文字列を比較する。nullもチェック可能
関連メソッド: equalsAny, equalsAnyIgnoreCase, equalsIgnoreCase

## firstNonBlank, firstNonEmpty
引数に指定した文字列の中から一番最初にBalnk, Emptyではない文字を返却する

## getBytes
指定した引数のバイト配列を取得する

## getCommonPrefix
指定した引数全てで共通する先頭文字列を返却する

## getDigits
指定した引数の文字列から数値部分のみを返却する

## getIfBlank, getIfEmpty
第一引数に指定した値がBlank, Emptyの場合、第二引数に指定した関数を実行する

## indexOf
第二引数に指定した文字列が第一引数の何個目にあるかを返却する
### indexOfAnyBut
第二引数に指定した文字列配列が含まれない文字が第一引数の何番目に存在するか返却
### indexOfDifference
引数に指定した文字列配列をそれぞれ比較し、差異が発生するか文字が何番目か返却
