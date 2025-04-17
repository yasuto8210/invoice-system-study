# Invoice System (Learning & Practice Project)

This is a **learning and practice project** for building an invoice creation system using Java, Spring Boot, and PostgreSQL.

---

## 📦 Tech Stack

- Java 21
- Spring Boot
- Gradle
- PostgreSQL (via Docker)
- Test: JUnit, Mockito
- CI/CD: GitHub Actions (planned)
- Others: Testcontainers, RestAssured (planned)

---

## 🚀 Planned Features

- [ ] Client registration and listing
- [ ] Product master registration and retrieval
- [ ] Order registration and invoice generation
- [ ] REST API + OpenAPI documentation
- [ ] Unit and integration test setup
- [ ] CI with GitHub Actions

---

## 🐳 How to Run (Docker Compose)

```bash
cd tools/docker
docker-compose up --build
```
After starting：

APP：http://localhost:8080

DB：PostgreSQL（db:5432）

---

## Run Tests
```bash
./gradlew test
```

---

## Branch Strategy (planned)
main: Stable and latest version

feature/*: Feature-specific development

fix/*: Bug fixes

ci/*: CI/CD setup

---

## 📝 License
This repository is open for learning purposes only.
Commercial use and redistribution without permission are not allowed.
