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
startsWithの場合は先頭から検索

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
### lastIndexOf
第二引数に指定した文字列が第一引数の後ろから検索して何個目にあるかを返却する
返却する数値は前からの数値

## isAlpha
引数に指定した文字列がアルファベットのみの場合 trueを返却
isAlphanumeric, isAlphaSpace, isAlphanumericSpace
アルファベットと数値とスペースだけの時trueを返却

## isMixedCase
引数に指定した文字列に大文字小文字が混在している場合は trueを返却

## isNumeric
引数に指定した文字列が数値型であれば trueを返却
isNumericSpace, isWhitespaceでは、spaceが入っていても trueにする。

## join
第一引数に指定した文字列を第二引数で指定した文字列で区切って連結し出力する
### joinWith
第二引数の指定した文字列を第一引数に指定した文字列で区切って連結し出力する

## left, right
第一引数に指定した文字列の左から第二引数に指定した数値まで表示する
### leftPad, rightPad
第二引数に指定した数値に第一引数に指定した文字列の長さ足りていない場合、空白を埋めて表示する
### mid
第一引数に指定した文字列の左から第二引数に指定した場所から第三引数に指定した長さまで表示する

## length
引数に指定した文字列の長さを返却。nullの場合は 0を返却

## lowerCase, upperCase
引数に指定した文字列を小文字にする(upperCaseだと大文字)

## normalizeSpace
引数に指定した文字列中の各種スペース文字を半角スペースに変換する
(例えばタブ, 改行コードなど)

## overlay
第一引数に指定した文字の中から、第三・第四引数に指定した場所を第二引数の値で上書きする

## prependIfMissing
第一引数に指定した文字列の先頭が、第二引数に指定した文字列で始まっていない場合は、
第二引数の値を付与して返却する

## remove
第一引数に指定した文字列の中から、第二引数に指定した文字列を削除する
### removeEnd
第一引数に指定した文字列の最後が、第二引数に指定した文字列の場合は削除する
### removeStart
removeEndの先頭から始まる場合の処理

## repeat
第一引数に指定した文字列を第二引数に指定した数分繰り返して表示する

## replace
第一引数に指定した文字列中から、第二引数に指定した文字列を検索し第三引数に指定した文字列に置き換えして返却

## reverse
引数に指定した文字列を逆にして返却

## split
引数に指定した文字列をデフォルト空白で区切って配列にして返却

## strip
引数に指定した文字列の先頭と末尾に存在する空白を除去して返却
第二引数に文字列を指定すると、空白ではなく文字列の1つ1つの単語を除去して返却

## substring
第一引数に指定した文字列の中から、第二引数から第三引数までを取得して返却
### substringBefore, substringAfter
第一引数に指定した文字列の中から、第二引数に指定した文字列を探しその文字の前後の値を返却する
### substringBetween
第一引数に指定した文字列の中から、第二引数に指定した文字列を2つ探しその文字の間の値を返却する

## swapCase
引数に指定した文字列の大文字・小文字を入れ替える

## trim
引数に指定した文字列の前後の空白を除去して返却
trimToEmpty, trimToNull の場合は、trimした後に空白やNullだった場合の返却値が異なる

## truncate
第一引数に指定した文字列から、第二引数に指定した数値までを返却する
第三引数に数値を指定した場合は、第二引数に指定した場所から、第三引数に指定した文字数までを返却

## uncapitalize
引数に指定した文字列の先頭一文字を小文字にして返却する

## unwrap
第一引数に指定した文字列の先頭・末尾が、第二引数に指定した文字の場合はそれを除いて返却

## upperCase
引数に指定した文字列の先頭を大文字にして返却する

## valueOf
引数に指定したchar配列をString型に変換して返却

## wrap
第一引数の最初と最後に、第二引数に指定した文字列を追加して返却
wrapIfMissing の場合は、最初と最後それぞれに第二引数で指定した値があるか確認してなければ付与して返却
