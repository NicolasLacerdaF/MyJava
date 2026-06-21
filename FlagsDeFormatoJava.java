/**
 * GUIA COMPLETO DAS FLAGS DO printf() EM JAVA
 * 
 * Estrutura: %[flags][width][.precision]specifier
 * 
 * FLAGS DISPONÍVEIS:
 * -   = Alinhamento à esquerda
 * 0   = Preenchimento com zeros
 * +   = Mostrar sinal para números positivos
 * ' ' = Espaço para números positivos
 * #   = Formato alternativo
 * ,   = Separador de milhares
 * (   = Números negativos entre parênteses
 */
public class FlagsDeFormatoJava{

    public static void main(String[] args) {
        
        // =====================================================================
        // 1. FLAG '-' - ALINHAMENTO À ESQUERDA
        // =====================================================================
        System.out.println("=== 1. FLAG '-' (Alinhamento à Esquerda) ===");
        
        // Sem flag: alinhamento à direita (padrão)
        System.out.printf("'%10s'%n", "Java");    // '      Java'
        
        // Com flag: alinhamento à esquerda
        System.out.printf("'%-10s'%n", "Java");   // 'Java      '
        
        // Com números
        System.out.printf("'%-5d'%n", 42);        // '42   '
        System.out.printf("'%-8.2f'%n", 3.14);    // '3.14    '
        
        // CASO DE USO: Tabelas
        System.out.println("\nTabela com alinhamento à esquerda:");
        System.out.printf("%-10s | %-5s | %-8s%n", "Produto", "Qtd", "Preço");
        System.out.printf("%-10s | %-5d | %-8.2f%n", "Arroz", 10, 25.99);
        System.out.printf("%-10s | %-5d | %-8.2f%n", "Feijão", 5, 12.50);
        System.out.println();
        
        // =====================================================================
        // 2. FLAG '0' - PREENCHIMENTO COM ZEROS
        // =====================================================================
        System.out.println("=== 2. FLAG '0' (Preenchimento com Zeros) ===");
        
        // Sem flag: preenche com espaços
        System.out.printf("'%5d'%n", 42);         // '   42'
        
        // Com flag: preenche com zeros
        System.out.printf("'%05d'%n", 42);        // '00042'
        System.out.printf("'%08d'%n", 123);       // '00000123'
        System.out.printf("'%010.2f'%n", 3.14);   // '0000003.14'
        
        // Aviso: não funciona com alinhamento à esquerda
        System.out.printf("'%-05d'%n", 42);       // '42   ' (ignora o zero)
        
        // CASO DE USO: Códigos com zeros à esquerda
        System.out.printf("\nCódigo: %05d%n", 7);       // Código: 00007
        System.out.printf("Número: %010d%n", 1234);    // Número: 0000001234
        System.out.println();
        
        // =====================================================================
        // 3. FLAG '+' - MOSTRA SINAL PARA NÚMEROS POSITIVOS
        // =====================================================================
        System.out.println("=== 3. FLAG '+' (Mostrar Sinal) ===");
        
        // Sem flag
        System.out.printf("'%d'%n", 42);           // '42'
        System.out.printf("'%d'%n", -42);          // '-42'
        
        // Com flag
        System.out.printf("'%+d'%n", 42);          // '+42'
        System.out.printf("'%+d'%n", -42);         // '-42'
        System.out.printf("'%+.2f'%n", 3.14);      // '+3.14'
        System.out.printf("'%+.2f'%n", -3.14);     // '-3.14'
        
        // CASO DE USO: Dados financeiros
        System.out.printf("\nLucro: %+d%n", 1000);    // Lucro: +1000
        System.out.printf("Perda: %+d%n", -500);     // Perda: -500
        System.out.printf("Saldo: %+.2f%n", 45.67);  // Saldo: +45.67
        System.out.println();
        
        // =====================================================================
        // 4. FLAG ' ' (ESPAÇO) - INSERE ESPAÇO PARA NÚMEROS POSITIVOS
        // =====================================================================
        System.out.println("=== 4. FLAG ' ' (Espaço para Positivos) ===");
        
        // Sem flag
        System.out.printf("'%d'%n", 42);           // '42'
        System.out.printf("'%d'%n", -42);          // '-42'
        
        // Com flag
        System.out.printf("'% d'%n", 42);          // ' 42' (espaço antes)
        System.out.printf("'% d'%n", -42);         // '-42' (negativo normal)
        System.out.printf("'% d'%n", 5);           // '  5'
        
        // CASO DE USO: Colunas alinhadas
        System.out.println("\nColunas alinhadas:");
        System.out.printf("'% d'%n", 100);         // ' 100'
        System.out.printf("'% d'%n", -25);         // '-25'
        System.out.printf("'% d'%n", 7);           // '  7'
        System.out.println();
        
        // =====================================================================
        // 5. FLAG '#' - FORMATO ALTERNATIVO
        // =====================================================================
        System.out.println("=== 5. FLAG '#' (Formato Alternativo) ===");
        
        // Para hexadecimal
        System.out.printf("'%x'%n", 255);          // 'ff'
        System.out.printf("'%X'%n", 255);          // 'FF'
        System.out.printf("'%#x'%n", 255);         // '0xff'
        System.out.printf("'%#X'%n", 255);         // '0XFF'
        
        // Para octal
        System.out.printf("'%o'%n", 255);          // '377'
        System.out.printf("'%#o'%n", 255);         // '0377'
        
        // Para float (mostra ponto decimal mesmo sem casas)
        System.out.printf("'%f'%n", 3.0);          // '3.000000'
        System.out.printf("'%.0f'%n", 3.0);        // '3'
        System.out.printf("'%#.0f'%n", 3.0);       // '3.'
        
        // CASO DE USO: Programação de baixo nível
        System.out.printf("\nHexadecimal: %#x%n", 255);  // Hexadecimal: 0xff
        System.out.printf("Octal: %#o%n", 255);          // Octal: 0377
        System.out.printf("Maiúsculo: %#X%n", 255);      // Maiúsculo: 0XFF
        System.out.println();
        
        // =====================================================================
        // 6. FLAG ',' - SEPARADOR DE MILHARES
        // =====================================================================
        System.out.println("=== 6. FLAG ',' (Separador de Milhares) ===");
        
        // Sem flag
        System.out.printf("'%d'%n", 1000000);       // '1000000'
        System.out.printf("'%f'%n", 1234567.89);    // '1234567.890000'
        
        // Com flag
        System.out.printf("'%,d'%n", 1000000);      // '1,000,000'
        System.out.printf("'%,.2f'%n", 1234567.89); // '1,234,567.89'
        System.out.printf("'%,d'%n", 1000000000);   // '1,000,000,000'
        System.out.printf("'%,d'%n", 98765);        // '98,765'
        
        // CASO DE USO: Valores monetários
        System.out.printf("\nSalário: R$ %,d.00%n", 5000000);  // R$ 5,000,000.00
        System.out.printf("Vendas: %,d%n", 1250000);          // Vendas: 1,250,000
        System.out.printf("Total: %,.2f%n", 123456.789);      // Total: 123,456.79
        System.out.println();
        
        // =====================================================================
        // 7. FLAG '(' - NÚMEROS NEGATIVOS ENTRE PARÊNTESES
        // =====================================================================
        System.out.println("=== 7. FLAG '(' (Negativos entre Parênteses) ===");
        
        // Sem flag
        System.out.printf("'%d'%n", 42);           // '42'
        System.out.printf("'%d'%n", -42);          // '-42'
        
        // Com flag
        System.out.printf("'%(d'%n", 42);          // '42'
        System.out.printf("'%(d'%n", -42);         // '(42)'
        System.out.printf("'%(.2f'%n", 3.14);      // '3.14'
        System.out.printf("'%(.2f'%n", -3.14);     // '(3.14)'
        
        // CASO DE USO: Relatórios financeiros (estilo contábil)
        System.out.printf("\nLucro: %(,.2f%n", 1000.50);   // Lucro: 1,000.50
        System.out.printf("Perda: %(,.2f%n", -500.75);    // Perda: (500.75)
        System.out.printf("Saldo: %(,.2f%n", 0.00);       // Saldo: 0.00
        System.out.println();
        
        // =====================================================================
        // 8. COMBINAÇÃO DE FLAGS
        // =====================================================================
        System.out.println("=== 8. Combinação de Flags ===");
        
        // Combinações possíveis
        
        // 1. Sinal + largura + zeros
        System.out.printf("%+05d%n", 42);          // +0042
        System.out.printf("%+05d%n", -42);         // -0042
        
        // 2. Alinhamento esquerdo + sinal + largura
        System.out.printf("%-+8d%n", 42);          // +42     
        System.out.printf("%-+8d%n", -42);         // -42     
        
        // 3. Milhares + 2 casas decimais + sinal
        System.out.printf("%+,.2f%n", 1234567.89); // +1,234,567.89
        
        // 4. Parênteses + milhares + 2 casas
        System.out.printf("%(,.2f%n", 1000.50);    // 1,000.50
        System.out.printf("%(,.2f%n", -1000.50);   // (1,000.50)
        
        // 5. Hex maiúsculo com 0X + alinhamento
        System.out.printf("%-#10X%n", 255);        // 0XFF      
        System.out.printf("%-10#X%n", 255);        // 0XFF      (mesmo resultado)
        
        // 6. Espaço + largura (para alinhar positivos e negativos)
        System.out.printf("% 5d%n", 42);           // "   42"
        System.out.printf("% 5d%n", -42);          // "  -42"
        
        // =====================================================================
        // 9. RESUMO - TODAS AS FLAGS EM UM ÚNICO EXEMPLO
        // =====================================================================
        System.out.println("\n=== 9. RESUMO - Todas as Flags ===");
        
        int numero = 42;
        int numeroNegativo = -42;
        double decimal = 3.14159;
        double grande = 1234567.89;
        String texto = "Java";
        int hex = 255;
        
        System.out.printf("'%10s' - Sem flag (direita)%n", texto);
        System.out.printf("'%-10s' - Flag '-' (esquerda)%n", texto);
        System.out.printf("'%05d' - Flag '0' (zeros)%n", numero);
        System.out.printf("'%+d' - Flag '+' (sinal)%n", numero);
        System.out.printf("'% d' - Flag ' ' (espaço)%n", numero);
        System.out.printf("'%#x' - Flag '#' (hex formato alternativo)%n", hex);
        System.out.printf("'%,d' - Flag ',' (milhares)%n", 1000000);
        System.out.printf("'%(d' - Flag '(' (negativo entre parênteses)%n", numeroNegativo);
        
        System.out.println("\nCombinações:");
        System.out.printf("'%+05d' - sinal + zeros%n", numero);
        System.out.printf("'%-+8.2f' - esquerda + sinal + 2 decimais%n", decimal);
        System.out.printf("'%,.2f' - milhares + 2 decimais%n", grande);
        System.out.printf("'%(,.2f' - parênteses + milhares%n", -grande);
        
        // =====================================================================
        // 10. MATRIZ DE COMPATIBILIDADE DAS FLAGS
        // =====================================================================
        System.out.println("\n=== 10. MATRIZ DE COMPATIBILIDADE ===");
        System.out.println("Flag | d/i | f  | s  | x/X | o  | h  | b  | c  | n  |");
        System.out.println("-----|-----|----|----|-----|----|----|----|----|----|");
        System.out.println("  -  |  ✓  | ✓  | ✓  |  ✓  | ✓  | ✓  |    |    |    |");
        System.out.println("  0  |  ✓  | ✓  |    |  ✓  | ✓  |    |    |    |    |");
        System.out.println("  +  |  ✓  | ✓  |    |     |    |    |    |    |    |");
        System.out.println(" ' ' |  ✓  | ✓  |    |     |    |    |    |    |    |");
        System.out.println("  #  |     | ✓  |    |  ✓  | ✓  |    |    |    |    |");
        System.out.println("  ,  |  ✓  | ✓  |    |     |    |    |    |    |    |");
        System.out.println("  (  |  ✓  | ✓  |    |     |    |    |    |    |    |");
        System.out.println("\n✓ = Compatível, vazio = Não compatível");
    }
}