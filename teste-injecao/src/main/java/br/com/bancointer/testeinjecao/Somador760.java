package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador760")
public class Somador760 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
