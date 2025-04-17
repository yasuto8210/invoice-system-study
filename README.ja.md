# Invoice System (学習・実践用プロジェクト)

このプロジェクトは、Java / Spring Boot / PostgreSQL を使用して請求書作成システムを構築する**学習兼実践用プロジェクト**です。

---

## 📦 技術スタック

- Java 21
- Spring Boot
- Gradle
- PostgreSQL（Docker）
- Test：JUnit, Mockito
- CI/CD：GitHub Actions（導入予定）
- その他：Testcontainers, RestAssured（予定）

---

## 🚀 機能予定

- [ ] クライアント情報の登録・一覧取得
- [ ] 商品マスタの登録・取得
- [ ] 注文登録、請求書出力
- [ ] REST API + OpenAPIドキュメント
- [ ] 単体テスト、結合テストの整備
- [ ] GitHub Actions によるCI導入

---

## 🐳 ローカル起動方法（Docker Compose）

```bash
cd tools/docker
docker-compose up --build
```
起動後、以下でアクセスできます：

アプリ：http://localhost:8080

DB：PostgreSQL（db:5432）

---

### テスト実行
```bash
./gradlew test
```

---

## 今後のブランチ運用（予定）
main: 安定した最新状態

feature/*: 機能追加単位のブランチ

fix/*: バグ修正

ci/*: CI/CD関連

---

## 📝 ライセンス

このリポジトリは学習目的で公開されています。  
無断転載・商用利用はご遠慮ください。
