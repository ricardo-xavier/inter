package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador119")
public class Somador119 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
