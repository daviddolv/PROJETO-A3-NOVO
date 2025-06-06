# 🎓 Sistema de Gerenciamento Acadêmico

## 📑 Índice

- [📌 Sobre o Projeto](#-sobre-o-projeto)  
- [🧩 Tecnologias Utilizadas](#-tecnologias-utilizadas)  
- [📥 Instalação](#-instalação)  
- [🚀 Como Usar](#-como-usar)  
- [✨ Funcionalidades](#-funcionalidades)  
- [🧪 Testes Automatizados](#-testes-automatizados)  
- [🤝 Contribuindo](#-contribuindo)  
- [📄 Licença](#-licença)
- [📚 Rodapé](#-rodapé)

---

## 📌 Sobre o Projeto

Este é um projeto acadêmico desenvolvido em **Java**, com foco em:

- **Programação orientada a objetos (POO)**  
- **Interface gráfica com Swing**  
- **Testes automatizados com JUnit 5**

> 💡 O sistema permite o gerenciamento básico de alunos: cadastro, listagem e exclusão.

---

## 🧩 Tecnologias Utilizadas

| Ferramenta        | Descrição                          |
|-------------------|------------------------------------|
| Java              | Linguagem de programação principal |
| Swing             | Biblioteca para interface gráfica  |
| JUnit 5           | Framework de testes unitários      |
| VS Code / Eclipse | Ambientes de desenvolvimento (IDE) |

---

## 📥 Instalação

### 1. Clone o repositório

```bash
git clone https://github.com/daviddolv/PROJETO-A3-NOVO.git
```

### 2. Abra o projeto em sua IDE favorita

#### Recomendado:
- **Visual Studio Code** com o *Extension Pack for Java*:
  - Language Support for Java™
  - Debugger for Java
  - Java Test Runner
  - Maven for Java

#### Alternativas:
- IntelliJ IDEA  
- Eclipse  
- NetBeans

### 3. Compile e execute

**Via IDE**: Compile e execute diretamente.  
**Via terminal**:

```bash
javac NomeDoArquivoPrincipal.java
java NomeDoArquivoPrincipal
```

---

## 🚀 Como Usar

Ao iniciar o sistema, será exibida uma interface gráfica com as opções:

- ➕ **Cadastrar** um novo aluno  
- 📃 **Visualizar** todos os alunos cadastrados  
- ❌ **Remover** um aluno informando o ID

---

## ✨ Funcionalidades

- ✅ Cadastro de alunos
- 📋 Listagem de alunos com ID, nome e login
- ❌ Exclusão de alunos por ID
- 🖥️ Interface gráfica com Swing
- 🧪 Testes automatizados com JUnit 5
- 🚧 **(Em desenvolvimento)** Gerenciamento de turmas e edição de dados

---

## 🧪 Testes Automatizados

O projeto possui cobertura de testes com **JUnit 5**, garantindo a qualidade e confiabilidade do sistema.

### Arquivos de Teste:

| Arquivo                  | Descrição                                                                 |
|--------------------------|--------------------------------------------------------------------------|
| `AlunoTest.java`         | Testa a criação de objetos `Aluno`, validações e métodos da classe       |
| `SistemaTest.java`       | Testa funcionalidades como cadastro, exclusão e listagem de alunos       |
| `SistemaTestHelper.java` | Utilitário que limpa e reseta os dados antes de cada teste               |

---

## 🤝 Contribuindo

Contribuições são bem-vindas!  
Sinta-se à vontade para:

- Sugerir melhorias  
- Corrigir bugs  
- Criar *issues*  
- Abrir *pull requests*

---


## 📚 

Desenvolvido para fins educacionais no curso de **Sistemas de Informação**, ano **2025**.