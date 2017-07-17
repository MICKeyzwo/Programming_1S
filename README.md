# Programming_1S

プログラミング１Sの過去問（もどき）です

# 構成
- 各年のフォルダにMain.javaを格納しています。
- Main.javaが模範解答になります

# 考察

## 2014

### 概要

教科数×学生数のループで点数を入力させ、その教科の平均やトップの点数を出力するシステム

### ポイント

- 入力した数字を`Integer.parseInt()`にかける
- **入力した数字の数だけ2重ループする**
- 平均を求めるために総和を求める
- トップを求めるために、ループ毎に現時点でのトップ点数と比較

## 2015

### 概要

漸化式を用いて入力された数の平方根を求めるシステム

### ポイント

- 入力した数字を`Integer.parseInt()`にかける
- 再帰的処理をforループで実装する
- **数学的な問題を理解しプログラムに落とし込む**

## 2015

### 概要

- 2の累乗を求めるシステム
- 5の階乗を求めるシステム
- 与えられた降水確率によって出力する文章を変えるシステム

### ポイント

- **複数の問題を素早く解く**
- 入力した数字を`Integer.parseInt()`にかける
- 階乗や累乗の再帰的処理をforループで実装する
- if文による条件分岐
- `以上`,`以下`,`未満`,`より上`を間違えずに判定式に落とし込む