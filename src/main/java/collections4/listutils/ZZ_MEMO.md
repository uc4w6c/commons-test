## defaultIfNull
第一引数に指定した値がNullの場合は第二引数に指定したリストを返却

## fixedSizeList
最初に指定したListの個数を維持する。
add, removeなど個数が変動するものは使用できなくなる。
setなど個数が変わらないものは利用可能

## hashCodeForList
Listのハッシュ値を取得する
ListAbstractListを継承していない場合に役に立つとのこと

## indexOf
第一引数に検索対象のListを、第二引数に検索条件のPredicateを指定
最初に検索条件に一致したデータの数値を返却。

## intersection
第一引数、第二引数どちらにも存在ものだけを抽出して返却する

## isEqualList
第一引数、第二引数に指定したListの中身が同じか確認する
順序も同じである必要がある

## lazyList
第一引数に空のListをセット、第二引数に配列内のデータ作成Factoryを指定
後ほどgetした際にセットしていない箇所へのgetだった場合、Factoryで値をセットして返却する 
