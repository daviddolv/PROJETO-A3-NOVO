@echo off
:: Script para automatizar git add, commit e push

:: Solicita a mensagem de commit ao usuário
set /p commitMsg=Digite a mensagem do commit: 

:: Adiciona todas as mudanças
git add .

:: Faz o commit com a mensagem inserida
git commit -m "%commitMsg%"

:: Envia para o repositório remoto (ramo padrão: main)
git push origin main

pause