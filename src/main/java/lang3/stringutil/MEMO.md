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
