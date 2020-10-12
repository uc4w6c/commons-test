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
