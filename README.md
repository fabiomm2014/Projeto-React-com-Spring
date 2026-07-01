<h1 align="center">📊 Dashboard de Vendas <sub>(React + Spring)</sub> 🇧🇷</h1>

<p align="center">
  <b>Dashboard full-stack de vendas com gráficos interativos.</b><br>
  Projeto SDS5 (Semana DevSuperior) com melhorias — visualização de vendas
  por vendedor e período, com gráficos de barras, rosca e tabela detalhada.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-11-009C3B?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 11">
  <img src="https://img.shields.io/badge/Spring%20Boot-2.4-FFDF00?style=for-the-badge&logo=springboot&logoColor=black" alt="Spring Boot">
  <img src="https://img.shields.io/badge/React-17-002776?style=for-the-badge&logo=react&logoColor=white" alt="React">
  <img src="https://img.shields.io/badge/TypeScript-4.1-009C3B?style=for-the-badge&logo=typescript&logoColor=white" alt="TypeScript">
  <img src="https://img.shields.io/badge/Bootstrap-5-FFDF00?style=for-the-badge&logo=bootstrap&logoColor=black" alt="Bootstrap">
  <img src="https://img.shields.io/badge/ApexCharts-gráficos-002776?style=for-the-badge&logoColor=white" alt="ApexCharts">
</p>

<p align="center">
  <img src="https://img.shields.io/badge/-009C3B?style=flat-square&color=009C3B" height="6" width="120" alt="">
  <img src="https://img.shields.io/badge/-FFDF00?style=flat-square&color=FFDF00" height="6" width="120" alt="">
  <img src="https://img.shields.io/badge/-002776?style=flat-square&color=002776" height="6" width="120" alt="">
</p>

---

## 📑 Sumário

- [🔎 Visão geral](#-visão-geral)
- [✨ Funcionalidades](#-funcionalidades)
- [🛠️ Tecnologias](#️-tecnologias)
- [🗂️ Estrutura do projeto](#️-estrutura-do-projeto)
- [🚀 Como executar](#-como-executar)
- [📄 Licença](#-licença)

---

## 🔎 Visão geral

Aplicação **full-stack** composta por um backend **Spring Boot 2.4.12** (API REST) e um frontend **React 17** (SPA com TypeScript). O dashboard permite visualizar dados de vendas por vendedor e período com gráficos interativos. O script `create.sql` inclui **178 registros** de vendas de 5 vendedores (2019–2021).

---

## ✨ Funcionalidades

| Módulo | Descrição |
| :----- | :-------- |
| 📊 **Gráfico de barras** | Taxa de sucesso de vendas por vendedor |
| 🍩 **Gráfico de rosca** | Proporção de vendas por vendedor |
| 📋 **DataTable** | Listagem detalhada de vendas (data, vendedor, visitas, negócios, valor) |
| 🔒 **Segurança** | Spring Security configurado |
| 🗄️ **Multi-banco** | Suporte H2 (dev), PostgreSQL e MySQL |

---

## 🛠️ Tecnologias

| Camada | Tecnologia |
| :----- | :--------- |
| ☕ **Backend** | Java 11, Spring Boot 2.4.12 |
| 📦 **Persistência** | Spring Data JPA, Hibernate |
| 🗄️ **Banco de dados** | H2 (dev) / PostgreSQL / MySQL |
| 🔒 **Segurança** | Spring Security |
| ⚛️ **Frontend** | React 17, TypeScript |
| 🎨 **UI** | Bootstrap 5 |
| 📊 **Gráficos** | ApexCharts + react-apexcharts |
| 🔗 **HTTP** | Axios |
| 🧭 **Navegação** | React Router DOM 5.2 |
| 🔧 **Build** | Maven (backend) / Yarn (frontend) |

---

## 🗂️ Estrutura do projeto

```text
Projeto-React-com-Spring/
├── backend/
│   ├── pom.xml
│   ├── create.sql              # Dados de exemplo (178 registros)
│   └── src/
│       └── main/java/.../
│           ├── controllers/    # SaleController
│           ├── entities/       # Sale, Seller, Product, Order
│           ├── dto/            # SaleDTO, SaleSumDTO, SaleSuccessDTO
│           ├── repositories/   # SaleRepository, SellerRepository
│           ├── services/       # SaleService, SellerService
│           └── config/         # SecurityConfig
└── frontend/
    ├── package.json
    └── src/
        ├── components/         # BarChart, DonutChart, DataTable, NavBar, Footer
        ├── pages/              # Home, Dashboard
        ├── types/              # sale.ts
        └── utils/              # requests.ts
```

---

## 🚀 Como executar

<details open>
<summary><b>☕ Backend</b></summary>

```bash
cd backend
./mvnw spring-boot:run
```

API disponível em `http://localhost:8080`.

</details>

<details open>
<summary><b>⚛️ Frontend</b></summary>

```bash
cd frontend
yarn install
yarn start
```

App disponível em `http://localhost:3000`.

</details>

---

## 📄 Licença

Projeto de uso interno/educacional.

<p align="center">
  <img src="https://img.shields.io/badge/-009C3B?style=flat-square&color=009C3B" height="6" width="120" alt="">
  <img src="https://img.shields.io/badge/-FFDF00?style=flat-square&color=FFDF00" height="6" width="120" alt="">
  <img src="https://img.shields.io/badge/-002776?style=flat-square&color=002776" height="6" width="120" alt="">
</p>

<p align="center"><sub>Feito com 💚💛💙 — cores da bandeira do Brasil 🇧🇷</sub></p>
