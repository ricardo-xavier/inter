package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1058")
public class Somador1058 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
