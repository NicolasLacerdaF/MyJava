# Guia Completo das Flags do `printf()` em Java

## Estrutura Geral

```java
%[flags][width][.precision]specifier
```

### Flags disponíveis

| Flag  | Descrição                                |
| ----- | ---------------------------------------- |
| `-`   | Alinhamento à esquerda                   |
| `0`   | Preenchimento com zeros                  |
| `+`   | Exibe sinal para números positivos       |
| `' '` | Insere espaço antes de números positivos |
| `#`   | Formato alternativo                      |
| `,`   | Separador de milhares                    |
| `(`   | Exibe números negativos entre parênteses |

---

# 1. Flag `-` — Alinhamento à esquerda

## Exemplos

```java
System.out.printf("'%10s'%n", "Java");
// '      Java'

System.out.printf("'%-10s'%n", "Java");
// 'Java      '

System.out.printf("'%-5d'%n", 42);
// '42   '

System.out.printf("'%-8.2f'%n", 3.14);
// '3.14    '
```

### Caso de uso: tabelas

```java
System.out.printf("%-10s | %-5s | %-8s%n", "Produto", "Qtd", "Preço");
System.out.printf("%-10s | %-5d | %-8.2f%n", "Arroz", 10, 25.99);
System.out.printf("%-10s | %-5d | %-8.2f%n", "Feijão", 5, 12.50);
```

---

# 2. Flag `0` — Preenchimento com zeros

## Exemplos

```java
System.out.printf("'%5d'%n", 42);
// '   42'

System.out.printf("'%05d'%n", 42);
// '00042'

System.out.printf("'%08d'%n", 123);
// '00000123'

System.out.printf("'%010.2f'%n", 3.14);
// '0000003.14'
```

### Observação

```java
System.out.printf("'%-05d'%n", 42);
// '42   '
```

A flag `0` é ignorada quando usada juntamente com `-`.

### Caso de uso

```java
System.out.printf("Código: %05d%n", 7);
// Código: 00007
```

---

# 3. Flag `+` — Mostrar sinal

## Exemplos

```java
System.out.printf("'%+d'%n", 42);
// '+42'

System.out.printf("'%+d'%n", -42);
// '-42'

System.out.printf("'%+.2f'%n", 3.14);
// '+3.14'
```

### Caso de uso: relatórios financeiros

```java
System.out.printf("Lucro: %+d%n", 1000);
System.out.printf("Perda: %+d%n", -500);
```

---

# 4. Flag `' '` — Espaço para positivos

## Exemplos

```java
System.out.printf("'% d'%n", 42);
// ' 42'

System.out.printf("'% d'%n", -42);
// '-42'
```

### Caso de uso

```java
System.out.printf("'% d'%n", 100);
System.out.printf("'% d'%n", -25);
System.out.printf("'% d'%n", 7);
```

Facilita o alinhamento visual de colunas numéricas.

---

# 5. Flag `#` — Formato alternativo

## Hexadecimal

```java
System.out.printf("'%x'%n", 255);
// 'ff'

System.out.printf("'%#x'%n", 255);
// '0xff'
```

## Octal

```java
System.out.printf("'%o'%n", 255);
// '377'

System.out.printf("'%#o'%n", 255);
// '0377'
```

## Float

```java
System.out.printf("'%.0f'%n", 3.0);
// '3'

System.out.printf("'%#.0f'%n", 3.0);
// '3.'
```

### Caso de uso

```java
System.out.printf("Hexadecimal: %#x%n", 255);
```

---

# 6. Flag `,` — Separador de milhares

## Exemplos

```java
System.out.printf("'%,d'%n", 1000000);
// '1,000,000'

System.out.printf("'%,.2f'%n", 1234567.89);
// '1,234,567.89'
```

### Caso de uso

```java
System.out.printf("Salário: R$ %,d.00%n", 5000000);
```

---

# 7. Flag `(` — Negativos entre parênteses

## Exemplos

```java
System.out.printf("'%(d'%n", -42);
// '(42)'

System.out.printf("'%(.2f'%n", -3.14);
// '(3.14)'
```

### Caso de uso

```java
System.out.printf("Perda: %(,.2f%n", -500.75);
// (500.75)
```

Muito utilizada em contabilidade.

---

# 8. Combinação de Flags

## Sinal + zeros

```java
System.out.printf("%+05d%n", 42);
// +0042
```

## Alinhamento + sinal

```java
System.out.printf("%-+8d%n", 42);
// +42
```

## Milhares + sinal

```java
System.out.printf("%+,.2f%n", 1234567.89);
// +1,234,567.89
```

## Parênteses + milhares

```java
System.out.printf("%(,.2f%n", -1000.50);
// (1,000.50)
```

---

# 9. Resumo

| Formato | Resultado                  |
| ------- | -------------------------- |
| `%10s`  | Alinhamento à direita      |
| `%-10s` | Alinhamento à esquerda     |
| `%05d`  | Zeros à esquerda           |
| `%+d`   | Exibe sinal                |
| `% d`   | Espaço para positivos      |
| `%#x`   | Hexadecimal alternativo    |
| `%,d`   | Separador de milhares      |
| `%(d`   | Negativos entre parênteses |

---

# 10. Matriz de Compatibilidade

| Flag  | d/i | f | s | x/X | o | h | b | c | n |
| ----- | --- | - | - | --- | - | - | - | - | - |
| `-`   | ✓   | ✓ | ✓ | ✓   | ✓ | ✓ |   |   |   |
| `0`   | ✓   | ✓ |   | ✓   | ✓ |   |   |   |   |
| `+`   | ✓   | ✓ |   |     |   |   |   |   |   |
| `' '` | ✓   | ✓ |   |     |   |   |   |   |   |
| `#`   |     | ✓ |   | ✓   | ✓ |   |   |   |   |
| `,`   | ✓   | ✓ |   |     |   |   |   |   |   |
| `(`   | ✓   | ✓ |   |     |   |   |   |   |   |

**✓ = Compatível**
