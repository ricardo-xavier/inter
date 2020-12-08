package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador282")
public class Somador282 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
