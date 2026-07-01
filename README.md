# 📊 Dashboard de Vendas (React + Spring) 🇧🇷

![Java](https://img.shields.io/badge/Java-11-009C3B?style=flat&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.4-FFDF00?style=flat&logo=springboot&logoColor=black)
![React](https://img.shields.io/badge/React-17-002776?style=flat&logo=react&logoColor=white)

Dashboard full-stack de vendas com graficos interativos. Projeto SDS5 (Semana DevSuperior) com melhorias.

## Visao geral

**Backend** (Spring Boot 2.4.12, Java 11): API REST com JPA, Spring Security, suporte H2/PostgreSQL/MySQL. Entidades Seller e Sale com DTOs de agregacao (SaleSumDTO, SaleSuccessDTO).

**Frontend** (React 17, TypeScript): SPA com Bootstrap 5, graficos ApexCharts (barras e rosca), DataTable, navegacao via React Router DOM. Comunicacao com backend via Axios.

Script `create.sql` inclui 178 registros de vendas de 5 vendedores (2019-2021).

## Tecnologias

- **Backend**: Java 11, Spring Boot 2.4.12, Spring Data JPA, Spring Security, H2/PostgreSQL/MySQL, Maven
- **Frontend**: React 17, TypeScript, Bootstrap 5, ApexCharts, Axios, React Router DOM 5.2, Yarn

## Como executar

```bash
# Backend
cd backend
./mvnw spring-boot:run

# Frontend
cd frontend
yarn install
yarn start
```

## Licenca

Uso interno/educacional.

---
*Feito com 💚💛💙 — cores da bandeira do Brasil 🇧🇷*
