# 📘 Desenvolvendo uma API em Java

Este repositório contém um tutorial completo de como desenvolver uma API REST em Java utilizando boas práticas, validações, documentação e ferramentas modernas.

---

## 🚀 Tecnologias Utilizadas

- ✅ **Java 21**
- ✅ **Spring Boot**
- ✅ **Banco de dados H2** (para testes) e **PostgreSQL**
- ✅ **Docker** (para subir o banco PostgreSQL)
- ✅ **Lombok**
- ✅ **Bean Validation (Jakarta Validation)**
- ✅ **Swagger / Springdoc OpenAPI**
- ✅ **Postman** (para testes)
- ✅ **IntelliJ IDEA** (como IDE)

---

## 🎯 O que você irá aprender

- 🔁 **CRUD completo** (Create, Read, Update, Delete)
- 📥 **DTOs (Data Transfer Objects)**
- ✅ **Validações de entrada** usando anotações como `@NotBlank`, etc.
- ⚠️ **Tratamento de exceções personalizadas** com `@ControllerAdvice` e classes de erro
- 📬 Uso da classe **`ResponseEntity`** para retorno adequado com códigos HTTP corretos
- 🧪 Testes de endpoints com **Postman**
- 📄 Documentação automática com **Swagger**

---

📲 Documentação Swagger
Após subir a aplicação, acesse:
http://localhost:8080/swagger-ui/index.html#/
⚠️ No projeto, o Swagger está liberado sem autenticação para facilitar os testes.

📬 Testando com Postman
Coleções de testes estão disponíveis (ou você pode criar as suas). Os principais endpoints são:


GET     /entidade
POST    /entidade
PUT     /entidade/{id}
DELETE  /entidade/{id}



