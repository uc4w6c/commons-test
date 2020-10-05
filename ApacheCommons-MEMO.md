# Apache Commonsで気になったことメモ 
## StringUtils
### countMatches
Javadocの以下表現だと引数どっちに入れても小さい方を処理の中で見極めて
いい感じに計算してくれるように見えるが、
実際には第二引数側に小さい方の文字列を入れないといけない。

```
Counts how many times the substring appears in the larger string.
```
countMatches(CharSequence str, char ch)
はいい感じの説明に見える
```
Counts how many times the char appears in the given string.
```
英語圏ではないことを伝えて、問題なければPRするという伝え方で行こう

