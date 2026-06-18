# Especificadores de Formato do `printf()` em Java

Em métodos como `printf()` e `String.format()` em Java, os **especificadores de formato** indicam qual tipo de dado será inserido naquela posição da string.

## Principais especificadores

| Especificador | Tipo esperado                                       | Exemplo                                |
| ------------- | --------------------------------------------------- | -------------------------------------- |
| `%d`          | Inteiro decimal (`byte`, `short`, `int`, `long`)    | `42`                                   |
| `%f`          | Número de ponto flutuante (`float`, `double`)       | `3.14159`                              |
| `%e`          | Notação científica                                  | `1.234567e+02`                         |
| `%E`          | Notação científica com `E` maiúsculo                | `1.234567E+02`                         |
| `%g`          | Usa `%f` ou `%e`, escolhendo a forma mais compacta  | `3.14`                                 |
| `%G`          | Igual ao `%g`, mas com `E` maiúsculo                | `3.14`                                 |
| `%c`          | Caractere (`char`)                                  | `A`                                    |
| `%s`          | String (`String`)                                   | `"Olá"`                                |
| `%b`          | Valor booleano (`boolean`)                          | `true`                                 |
| `%B`          | Booleano em maiúsculas                              | `TRUE`                                 |
| `%x`          | Inteiro em hexadecimal (letras minúsculas)          | `ff`                                   |
| `%X`          | Inteiro em hexadecimal (letras maiúsculas)          | `FF`                                   |
| `%o`          | Inteiro em octal                                    | `377`                                  |
| `%h`          | Código hash em hexadecimal                          | `7ea987ac`                             |
| `%H`          | Código hash em hexadecimal maiúsculo                | `7EA987AC`                             |
| `%n`          | Quebra de linha independente do sistema operacional | `\n` no Linux/macOS, `\r\n` no Windows |
| `%%`          | Imprime o caractere `%`                             | `%`                                    |

## Especificadores de data e hora

Os especificadores de data e hora começam com `%t` ou `%T`.

| Especificador | Significado                     | Exemplo      |
| ------------- | ------------------------------- | ------------ |
| `%tH`         | Hora (00–23)                    | `14`         |
| `%tM`         | Minutos                         | `35`         |
| `%tS`         | Segundos                        | `08`         |
| `%td`         | Dia do mês                      | `09`         |
| `%tm`         | Mês                             | `06`         |
| `%tY`         | Ano com 4 dígitos               | `2026`       |
| `%ty`         | Ano com 2 dígitos               | `26`         |
| `%tB`         | Nome completo do mês            | `June`       |
| `%tb`         | Nome abreviado do mês           | `Jun`        |
| `%tA`         | Nome completo do dia da semana  | `Tuesday`    |
| `%ta`         | Nome abreviado do dia da semana | `Tue`        |
| `%tF`         | Data no formato `yyyy-MM-dd`    | `2026-06-09` |
| `%tT`         | Hora no formato `HH:mm:ss`      | `14:35:08`   |

## Modificadores úteis

Também é possível combinar largura e precisão nos especificadores de formato.

### Precisão para números decimais

```java
System.out.printf("%.2f", 3.14159);   // 3.14
```

### Largura mínima para inteiros

```java
System.out.printf("%10d", 42);        // "        42"
```

### Alinhamento à esquerda

```java
System.out.printf("%-10s", "Java");   // "Java      "
```

### Preenchimento com zeros

```java
System.out.printf("%05d", 42);        // 00042
```

## Resumo para memorizar

* `%d` → inteiro
* `%f` → decimal (`float`/`double`)
* `%s` → string
* `%c` → caractere
* `%b` → booleano
* `%x` → hexadecimal
* `%o` → octal
* `%n` → nova linha
* `%%` → símbolo `%`

Esses são os especificadores mais utilizados em `printf()` e `String.format()` em Java.
