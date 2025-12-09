# 🛒 E-commerce Cart API

API REST de carrinho de compras com Spring Boot e MySQL.
---

## 🚀 Tecnologias

- Java 17+
- Spring Boot 3.x
- MySQL 8.0
- Flyway
- Maven

---

## ⚙️ Como Rodar

**1. Clone o projeto:**
```bash
git clone https://github.com/Danttazlx/ecommerce-cart.git
cd ecommerce-cart
```

**2. Crie o banco:**
```sql
CREATE DATABASE ecommerce_cart;
```

**3. Configure a senha do MySQL em:**
```
src/main/resources/application.properties
```

**4. Rode:**
```bash
./mvnw spring-boot:run
```

**5. Acesse:** `http://localhost:8080`

---

## 📡 Endpoint

### **POST /cart/item** - Adicionar item ao carrinho

**Body (JSON):**
```json
{
  "cartId": 1,
  "productId": 1,
  "quantity": 2
}
```

**Resposta:** `201 Created`

---

## 🧪 Testar

**1. Popular o banco:**
```sql
INSERT INTO users (name, email, password) VALUES ('João', 'joao@email.com', '123');
INSERT INTO products (name, quantity, price, description) VALUES ('Mouse', 50, 89.90, 'Mouse sem fio');
INSERT INTO carts (user_id) VALUES (1);
```

**2. Testar no Postman:**
- **POST** `http://localhost:8080/cart/item`
- **Headers:** `Content-Type: application/json`
- **Body:** (JSON acima)

---

## 📂 Estrutura do Banco

- **users** - usuários
- **products** - produtos
- **carts** - carrinhos (1 por usuário)
- **items** - itens do carrinho

---

## 📝 Próximos Passos

- Listar itens do carrinho
- Remover item
- Calcular total
- Testes automatizados
- Documentação (Swagger)

---

⭐ **Se curtiu, deixa uma star!** ⭐
