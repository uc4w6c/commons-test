## addAll
第一引数に指定したCollectionに第二引数で指定したデータを全て追加する

## addIgnoreNull
第二引数で指定したデータがNullでなければ第一引数に指定したCollectionに追加する。
空白も追加する

## collate
第一引数に指定したListと第二引数に指定したListをマージしてかつ並び替えて新しいListを返却

## containsAll
第二引数に指定した値が全て第一引数に存在すればtrueを返却

## disjunction
第一引数に指定したものと第二引数に指定した値でそれぞれにしか存在しない値Listを返却

## emptyCollection
空のCollectionクラスを返却

## emptyIfNull
引数に指定したコレクションがNullなら空のコレクションを返却する

## extractSingleton
引数に指定した1つのデータリストの中から値を取り出す(Listのサイズが1ではない場合エラー)

## filter
第一引数に指定したリストから第二引数に指定した条件で検索して1つでも一致していたらtrueを返す
第一引数に指定した値はfilterされた状態になる。

